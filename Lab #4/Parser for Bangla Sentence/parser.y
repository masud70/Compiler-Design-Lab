%{
#include <stdio.h>
#include <stdlib.h>
void yyerror( char *);
int yylex(void);
%}

%union {
    char *str;
}

%token <str> PRONOUNSTART PRONOUNEND NOUN ADJECTIVE PRONOUN VERB COMMA
%start start


%%
start: statement { printf("Parsing is successfull\n"); };
statement:
    PRONOUNSTART PARTONE COMMA PRONOUNEND PARTTWO
    ;
PARTONE:np| proadj | vp | ADJECTIVE;

proadj: PRONOUN | PRONOUN ADJECTIVE;

PARTTWO:np | vp;

np:
    NOUN vp
    | PRONOUN vp
    ;
vp:
   VERB| VERB ADJECTIVE
    ;

%%
void yyerror( char *s) {
    fprintf(stderr, "%s\n", s);
}
int main() {
    freopen ("sentence.txt", "r", stdin);
    yyparse();
}

