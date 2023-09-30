/*lex program to recognize and count the number of identifiers in a given input*/
/*definition section*/
%option noyywrap
%{
    #include "parser.tab.h"
%}

/*rules section*/
%%
"যদি"|"যে"|"যত"|"যেমনটা"|"যারা"|"যদিও"|"যতই"|"যখন"|"যখনই" {
    return PRONOUNSTART;
}

"তবে"|"সে"|"যত"|"তত"|"তেমনটা"|"তারা"|"তথাপি"|"ততই"|"তখন"|"তখনই"|"তাকে" {
    return PRONOUNEND;
}

"বিপদ"|"দুঃখও"|"অপরাধ"|"দেশকে"|"শাস্তি"|"আলো"|"পড়াশোনা"|"গাড়িতে"|"পরিশ্রম"|"ফল" {
    return NOUN;
}
"গরিব"|"অন্ধ"|"দেশপ্রেমিক" {
    return ADJECTIVE;
}

"তুমি"|"আমি"|"আমারভাই"|"লোকটি"|"সে" {
    
    return PRONOUN;
}

"আসো"|"দাও"|"আসে"|"আসবে"|"করেছে"|"পেয়েছে"|"করবে"|"পাবে"|"চড়বে"|"ভালোবাসে"|"যাবো"|"জানবে"|"পড়বে"|"এসেছিলো"|"চেয়েছিলাম"|"পাইনি"|"খাবো" {
  
    return VERB;
}
"," {
 
    return COMMA;
}
[ \t]   ;   /* skip whitespace */



%%

