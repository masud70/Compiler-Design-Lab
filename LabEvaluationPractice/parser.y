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
extern int yynrhs;

%}

%union{
    int num;
    char* str;
}

%token <str> IDENTIFIER
%token <num> NUMBER
%token <str> PLUS
%token <str> MINUS
%token <str> MUL
%token <str> DIV
%token <str> LP
%token <str> RP

%left '+' '-'
%left '*' '/'
%right '='

%%

expr: expr PLUS term | expr MINUS term | term;
term: term MUL factor | term DIV factor | factor;
factor: LP expr RP | NUMBER | IDENTIFIER;

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