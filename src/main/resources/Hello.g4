grammar Hello;
import CommonLexerRules;
prog: stat+;
stat: expr NEWLINE
| ID '=' expr NEWLINE
| NEWLINE
;
r  : 'hello' ID ;         // match keyword hello followed by an identifier

expr : expr ('*'|'/') expr
| expr ('+'|'-') expr
| INT
| ID
| '(' expr ')'
;
assign: ID '=' expr ';';
// array init
init: '{' value (',' value)* '}';
value: init | INT;

//INT:[0-9]+;
//ID : [a-zA-Z]+ ;             // match lower-case identifiers
//NEWLINE: '\r'?'\n';
//WS : [ \t]+ -> skip ; // skip spaces, tabs, newlines
//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines