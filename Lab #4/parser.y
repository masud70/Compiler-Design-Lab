%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

extern int yylex();
extern FILE* yyin;
extern char* yytext;

void yyerror(const char* s);

#define MAX_PARAMS 10

extern int yynrhs;

%}



%union {
    int numval;
    char* strval;
}

%token PRINT
%token IF
%token ELSE
%token IDENTIFIER
%token NUMBER
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
    statement_list
    ;

statement_list:
    statement
    | statement statement_list
    ;

statement:
    declaration_or_assignment SEMICOLON
    | function_call SEMICOLON
    | print_statement SEMICOLON
    | if_statement
    ;

declaration_or_assignment:
    IDENTIFIER ASSIGN expression
    ;

function_call:
    IDENTIFIER LPAREN arg_list RPAREN
    ;

arg_list:
    expression
    | expression COMMA arg_list
    ;

print_statement:
    PRINT LPAREN expression RPAREN
    ;

expression:
    term
    | expression ADD term
    | expression SUB term
    ;

term:
    factor
    | term MUL factor
    | term DIV factor
    ;

factor:
    IDENTIFIER
    | NUMBER
    | LPAREN expression RPAREN
    | comparison
    ;

comparison:
    expression EQ expression
    | expression NE expression
    | expression LT expression
    | expression LE expression
    | expression GT expression
    | expression GE expression
    ;

if_statement:
    IF LPAREN expression RPAREN block
    | IF LPAREN expression RPAREN block ELSE block
    ;

block:
    LKARLI statement RKARLI
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
    if(!yyparse()){
	printf("Parsing successful!\n");
    }

    fclose(input_file);
    return 0;
}


void yyerror(const char* s) {
    fprintf(stderr, "Error: %s\n", s);
    return;
}