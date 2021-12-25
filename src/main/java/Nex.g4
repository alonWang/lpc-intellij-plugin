grammar Nex;

program
    : stmt+
    ;
stmt
    : meta_stmt
    | import_stmt
    |  prot_def_stmt
    ;

meta_stmt
    : (MCmd | MDesc | MCanPause | Identifier)  '=' (String| UString | Boolean | Integer)
    ;

import_stmt
    : 'from' Identifier 'import' '*'
    ;
 prot_def_stmt
    :  Identifier '=' '{'  prot_stmt '}'
    ;
 prot_stmt
    :  prot_stmt (prot_meta_stmt |  prot_body_stmt)
    | (prot_meta_stmt |  prot_body_stmt)
    ;
 prot_meta_stmt
    : (PSubcmd | PMod | PFunc | PDesc | PCanPause) ':'  (String| UString | Boolean | Integer) ','
    ;
  prot_body_stmt
    : PBody ':' '(' prot_field_stmt_list ')'
    ;

prot_field_stmt_list
    :  prot_field_stmt*
    ;
// 什么时候决定TOKEN,什么时候Grammar   不用读值的就TOEKN
prot_field_stmt
    : '(' SimpleType ','  String ')' ','
    | '(' ComplexType ','   String ','  '('  prot_field_stmt_list ')' ')' ','
    ;

MCmd: 'CMD' ;
MDesc: 'CMD_DESC' ;
MCanPause: 'CAN_PAUse';
PSubcmd: '"SUBCMD"' ;
PMod: '"MOD"' ;
PFunc: '"FUNC"';
PDesc: '"DESC"' ;
PCanPause: '"CAN_PAUSE"' ;
PBody: '"BODY"' ;
Boolean
    : 'True'
    | 'False'
    ;
SimpleType
    : 'INT8'
    | 'INT16'
    | 'INT32'
    | 'VARSTR'
    ;

ComplexType
    : 'ARRAY' | 'OPTIONAL'
    ;

Identifier
    : NonDigit
    ( NonDigit
    | Digit
    )*
    ;
UString
    : 'u' String
    ;

String
    :    '"' ~["\\\r\n]* '"'
    ;

Integer
    : ('+'| '-')? Digit+
    ;
fragment
NonDigit
    : [a-zA-Z_]
    ;

fragment
Digit
    : [0-9]
    ;



Comment
    : '#' ~[\r\n]*
     -> skip
    ;
Whitespace
    :   [ \r\n\t] +
    -> skip
    ;


