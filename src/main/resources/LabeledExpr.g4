grammar LabeledExpr;
import CommonLexerRules;
prog: stat+;
stat: expr NEWLINE
 |ID '=' expr NEWLINE
 |NEWLINE;

expr: expr op=('*'|'/') expr
|expr op=('+'|'-') expr
|INT
|ID
|'(' expr ')'
;

MUL:'*';
DIV:'/';
PLUS:'+';
MIN:'-';
