%{
#include <string.h>
#include "parser.tab.h"
%}

%%

"print"         { return PRINT; }
"if"		    { return IF; }
"else"		    { return ELSE; }
[a-zA-Z][a-zA-Z0-9]{0,19} { yylval.strval = strdup(yytext); return IDENTIFIER; }
[0-9]+          { yylval.numval = atoi(yytext); return NUMBER; }
"+"             { return ADD; }
"-"             { return SUB; }
"*"             { return MUL; }
"/"             { return DIV; }
"=="            { return EQ; }
"!="            { return NE; }
"<"             { return LT; }
"<="            { return LE; }
">"             { return GT; }
">="            { return GE; }
"="             { return ASSIGN; }
";"             { return SEMICOLON; }
"("             { return LPAREN; }
")"             { return RPAREN; }
"{"             { return LKARLI; }
"}"             { return RKARLI; }
","             { return COMMA; }
[ \t\n]         ;  // Skip whitespace and newline characters
.               { fprintf(stderr, "Unexpected character: %s\n", yytext); }

%%

int yywrap(void) {
    return 1;
}