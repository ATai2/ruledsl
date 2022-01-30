# g4文件结构
~~~
grammar Hello;
prog: stat+;
stat: expr NEWLINE
| ID '=' expr NEWLINE
| NEWLINE
;
r  : 'hello' ID ;         // match keyword hello followed by an identifier
INT:[0-9]+;
ID : [a-zA-Z]+ ;             // match lower-case identifiers
NEWLINE: '\r'?'\n';
WS : [ \t]+ -> skip ; // skip spaces, tabs, newlines
//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
~~~

# 语法分析
语法分析器的规则以小写字母开头

词法分析器的规则以大写字母开头
