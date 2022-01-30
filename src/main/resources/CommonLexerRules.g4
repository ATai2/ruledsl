lexer grammar CommonLexerRules;

INT:[0-9]+;
ID : [a-zA-Z]+ ;             // match lower-case identifiers
NEWLINE: '\r'?'\n';
WS : [ \t]+ -> skip ; // skip spaces, tabs, newlines