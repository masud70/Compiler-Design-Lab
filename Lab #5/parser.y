%{
#include <bits/stdc++.h>
#include <stdio.h>
#include <stdlib.h>
#include <string>
using namespace std;

extern int yylex();
extern FILE* yyin;
extern char* yytext;

void yyerror(const char* s);
#define MAX_PARAMS 10
extern int yynrhs;

int label_count1 = 1;
int label_count2 = 1;
string label1, label2;

struct exprType{
    char* addr;
    char* code;
};
struct exprType *ret_expr;

string newLabel(){
	string newLabel = "L" + to_string(label_count1);
	label_count1++;
	return newLabel;
}

string newTemp(){
    string newTemp = "t" + to_string(label_count2);
	label_count2++;
	return newTemp;
}

struct exprType* createExpr(char* addr, char* code){
    struct exprType *newExpr = (struct exprType *)malloc(sizeof(struct exprType));
    newExpr->addr = (char*)malloc(strlen(addr));
    newExpr->code = (char*)malloc(strlen(code));
    newExpr->addr = strdup(addr);
    newExpr->code = strdup(code);
    return newExpr;
} 

%}

%union{
    int numval;
    char* strval;
    struct exprType *EXPRTYPE;
}

%type <strval> statement_list statement block
%type <strval> assignment program print_statement if_statement
%type <EXPRTYPE> expression factor comparison

%token PRINT
%token IF ELSE
%token <strval> IDENTIFIER 
%token <numval> NUMBER
%token ADD SUB MUL DIV
%token EQ NE LT LE GT GE
%token ASSIGN SEMICOLON
%token LPAREN RPAREN COMMA
%token LKARLI RKARLI

%left '+' '-'
%left '*' '/'
%left EQ NE LT LE GT GE
%right ASSIGN

%%

program:
    statement_list{
            cout << "\n\n-------Final Three Address Code-------" << endl;
            cout<<$1<<endl;
        }
    ;

statement_list:
    statement{
        string ret = (string) $1;
        cout<<"\nStatement done: \n"<<ret;
        $$ = strdup(ret.c_str());
    }
    | statement statement_list{
        string ret = (string) $1 + (string)$2;
        $$ = strdup(ret.c_str());
    }
    ;

statement:
    assignment SEMICOLON{
        string str = (string) $1;
        cout<<"Assignment Receive:\n"<<str;
        $$ = $1;
    }
    | function_call SEMICOLON{
    }
    | print_statement SEMICOLON{
        $$ = $1;
    }
    | if_statement{
        $$ = $1;
    }
    ;

assignment:
    IDENTIFIER ASSIGN expression{
        cout<<$3->addr<<" "<<$3->code<<endl;
        string ret = (string)$3->code + (string)$1 + " = " + (string)$3->addr + "\n";
        cout<<"Assignment Return:\n"<<ret;
        $$ = strdup(ret.c_str());
    }
    ;

function_call:
    IDENTIFIER LPAREN arg_list RPAREN
    ;

arg_list:
    expression
    | expression COMMA arg_list
    ;

print_statement:
    PRINT LPAREN expression RPAREN{
        string newCode = (string)$3->code != ""? (string)$3->code : "";
        newCode += "print(" + (string)$3->addr + ")\n";
        $$ = strdup(newCode.c_str());
    }
    ;

expression:
    factor{
        $$ = $1;
    }
    | expression ADD expression{
        string newAddr = newTemp();
        string newCode = (string)$1->code + (string)$3->code;
        newCode += newAddr + " = " + (string)$1->addr + " + " + (string)$3->addr + "\n";
        cout<<"New Code Plus: \n"<<newCode;
        $$ = createExpr(strdup(newAddr.c_str()), strdup(newCode.c_str()));
    }
    | expression SUB expression{
        string newAddr = newTemp();
        string newCode = (string)$1->code + (string)$3->code;
        newCode += newAddr + " = " + (string)$1->addr + " - " + (string)$3->addr + "\n";
        cout<<"New Code Sub: \n"<<newCode;
        $$ = createExpr((char*) newAddr.c_str(), (char*) newCode.c_str());
    }
    | expression MUL expression{
        string newAddr = newTemp();
        string newCode = (string)$1->code + (string)$3->code;
        newCode += newAddr + " = " + (string)$1->addr + " * " + (string)$3->addr + "\n";
        cout<<"New Code Mul: \n"<<newCode;
        $$ = createExpr(strdup(newAddr.c_str()), strdup(newCode.c_str()));
    }
    | expression DIV expression{
        string newAddr = newTemp();
        string newCode = (string)$1->code + (string)$3->code;
        newCode += newAddr + " = " + (string)$1->addr + " / " + (string)$3->addr + "\n";
        cout<<"New Code Div: \n"<<newCode;
        $$ = createExpr((char*) newAddr.c_str(), (char*) newCode.c_str());
    }
    ;

factor:
    IDENTIFIER{
        // cout<<"Identifier: "<<$1<<endl;
        $$ = createExpr((char*)$1, (char*)"");
    }
    | NUMBER{
        // cout<<"Number: "<<$1<<endl;
        $$ = createExpr((char*)to_string($1).c_str(), (char*)"");
    }
    | LPAREN expression RPAREN{
        $$ = $2;
    }
    | comparison{
        $$ = $1;
    }
    ;

comparison:
    expression EQ expression{
        string newAddr = newTemp();
        string newCode = (string)$1->code + (string)$3->code;
        newCode += newAddr + " = " + (string)$1->addr + " == " + (string)$3->addr + "\n";
        cout<<"EQ: \n"<<newCode;
        $$ = createExpr((char*) newAddr.c_str(), (char*) newCode.c_str());
    }
    | expression NE expression{
        string newAddr = newTemp();
        string newCode = (string)$1->code + (string)$3->code;
        newCode += newAddr + " = " + (string)$1->addr + " != " + (string)$3->addr + "\n";
        cout<<"EQ: \n"<<newCode;
        $$ = createExpr((char*) newAddr.c_str(), (char*) newCode.c_str());
    }
    | expression LT expression{
        string newAddr = newTemp();
        string newCode = (string)$1->code + (string)$3->code;
        newCode += newAddr + " = " + (string)$1->addr + " < " + (string)$3->addr + "\n";
        cout<<"EQ: \n"<<newCode;
        $$ = createExpr((char*) newAddr.c_str(), (char*) newCode.c_str());
    }
    | expression LE expression{
        string newAddr = newTemp();
        string newCode = (string)$1->code + (string)$3->code;
        newCode += newAddr + " = " + (string)$1->addr + " <= " + (string)$3->addr + "\n";
        cout<<"EQ: \n"<<newCode;
        $$ = createExpr((char*) newAddr.c_str(), (char*) newCode.c_str());
    }
    | expression GT expression{
        string newAddr = newTemp();
        string newCode = (string)$1->code + (string)$3->code;
        newCode += newAddr + " = " + (string)$1->addr + " > " + (string)$3->addr + "\n";
        cout<<"EQ: \n"<<newCode;
        $$ = createExpr((char*) newAddr.c_str(), (char*) newCode.c_str());
    }
    | expression GE expression{
        string newAddr = newTemp();
        string newCode = (string)$1->code + (string)$3->code;
        newCode += newAddr + " = " + (string)$1->addr + " >= " + (string)$3->addr + "\n";
        cout<<"EQ: \n"<<newCode;
        $$ = createExpr((char*) newAddr.c_str(), (char*) newCode.c_str());
    }
    ;

if_statement:
    IF LPAREN expression RPAREN block{
        string label1 = newLabel();
        string label2 = newLabel();

        string condition = (string)$3->addr != "" ? (string)$3->addr : (string)$3->code;
        string newCode = "if(" + condition + ") goto " + label1 + "\ngoto " + label2 + "\n";
        newCode += label1 + ":\n" + (string) $5 + label2 + ":\n";

        cout<<"If block: \n"<<newCode;
        $$ = strdup(newCode.c_str());
    }
    | IF LPAREN expression RPAREN block ELSE block{
        string label1 = newLabel();
        string label2 = newLabel();
        string label3 = newLabel();

        string condition = (string)$3->addr != "" ? (string)$3->addr : (string)$3->code;
        string initialCode = (string)$3->addr == "" ? "" : (string)$3->code;
        string newCode = initialCode + "if(" + condition + ") goto " + label1 + "\ngoto " + label2 + "\n";
        newCode += label1 + ":\n" + (string) $5 + "goto " + label3 + "\n" + label2 + ":\n" + (string)$7 + label3 + ":\n";

        cout<<"If block: \n"<<newCode;

        $$ = strdup(newCode.c_str());
    }
    ;

block:
    LKARLI statement_list RKARLI{
        $$ = $2;
    }
    ;

%%

int main(int argc, char* argv[]) {
    if (argc < 2) {
        fprintf(stderr, "Usage: %s <input_file>\n", argv[0]);
        return 1;
    }

    FILE* input_file = fopen(argv[1], "r");
    if (!input_file) {
        perror("Error opening input file");
        return 1;
    }

    yyin = input_file;
    if (!yyparse()) {
        cout << "Parsing successful!" << endl;
    }

    fclose(input_file);
    return 0;
}

void yyerror(const char* s) {
    fprintf(stderr, "Error: %s\n", s);
    return;
}
