grammar Hello;
r  : 'hello' ID ;         // match keyword hello followed by an identifier
expr : 'hello';
assign: ID '=' expr ';';
// array init
init: '{' value (',' value)* '}';
value: init | INT;
INT:[0-9]+;

ID : [a-z]+ ;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines