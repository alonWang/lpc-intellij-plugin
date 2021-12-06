grammar Nex;

program
    : program statement
    | statement
    ;
statement
    :  meta_statement
    | import_statement
    | prot_define_statement
    ;

meta_statement
    : Cmd '=' Integer
    | CmdDesc '=' StringLiteral
    | CanPause '=' (True | False)
    ;
import_statement
    : 'from' Identifier 'import' '*'
    ;
prot_define_statement
    : Identifier    '='  '{' prot_body '}'
    ;
prot_body
    : prot_body (prot_meta_define | prot_body_define)
    | (prot_meta_define | prot_body_define)
    ;
 prot_meta_define
    : '"' defineKeyword '"'  ':' defineVal ','
    ;
 prot_body_define
    : '"' Body '"' ':' '(' prot_field_list '),'
    ;

prot_field_list
    : prot_field_list prot_field
    | prot_field
    ;
// 什么时候决定TOKEN,什么时候Grammar   不用读值的就TOEKN
prot_field
    : '(' varType ','  '"' Identifier '"' '),'
    | '(' ArrayType ','  '"' Identifier '",'  '('  prot_field_list '),'
    ;
defineVal
    : Integer
    | StringLiteral
    | '"' Identifier '"'
    | '"' IdentifierWithDot '"'
    ;

Colon : ':';
Equal : '=';
True : 'True';
False : 'False';

//TOKEN根据声明顺序决定优先级
Cmd: 'CMD';
CmdDesc: 'CMD_DESC';
CanPause: 'CAN_PAUSE';
SubCmd: 'SUBCMD';
Mod: 'MOD';
Func: 'FUNC';
Desc: 'DESC';
Body: 'BODY';
defineKeyword
    : SubCmd
    | Mod
    | Func
    | Desc
    ;

Identifier
    : NonDigit
    ( NonDigit
    | Digit
    )*
    ;
IdentifierWithDot
    :NonDigit
    ( NonDigit
     | Digit
     | '.'
      )*
  ;
StringLiteral
    :   'u' '"' ~["\\\r\n]+ '"'
    ;

Integer
    : Digit+
    ;

fragment
NonDigit
    : [a-zA-Z_]
    ;

fragment
Digit
    : [0-9]
    ;


varType
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
Whitespace
    :   [ \r\n\t] +
    -> skip
    ;


