%{
#include <string.h>
#include "parser.tab.h"
%}

%%
"+"         {return PLUS;}
"-"         {return MINUS;}
"*"         {return MUL;}
"/"         {return DIV;}
"("         {return LP;}
")"         {return RP;}
[0-9]+      {yylval.num = atoi(yytext); return NUMBER;}
[a-zA-Z][a-zA-Z0-9]{0,19} { yylval.str = strdup(yytext); return IDENTIFIER; }
[\n\t ]+    {}
.           { fprintf(stderr, "Unexpected character: %s\n", yytext); }
%%

int yywrap(void) {
    return 1;
}