grammar Nex;

program
    : program statement
    | statement
    ;
statement
    : import_statement
    | cmd_statement
    ;
import_statement
    : 'from' Identifier 'import' '*'
    ;
cmd_statement
    : Cmd '=' Integer
    | CmdDesc '=' StringLiteral
    | CanPause '=' (True | False)
    ;
Colon : ':';
True : 'True';
False : 'False';

//TOKEN根据声明顺序决定优先级
Cmd: 'CMD';
CmdDesc: 'CMD_DESC';
CanPause: 'CAN_PAUSE';

Identifier
    : NonDigit
    ( NonDigit
    | Digit
    )*
    ;
StringLiteral
    :   'u' '"' ~["\\\r\n]+ '"'
    ;
Integer
    : Digit+;
fragment
NonDigit
    : [a-zA-Z_]
    ;

fragment
Digit
    : [0-9]
    ;


VarType
    : 'INT8'
    | 'INT32'
    | 'VARSTR'
    | 'INT16'
    ;

ArrayType
    : 'ARRAY'
    ;


Comment
    : '#' ~[\r\n]*
     -> skip
    ;
EmptyLine
    :
Whitespace
    :   [ \r\n\t] +
        -> skip
    ;


