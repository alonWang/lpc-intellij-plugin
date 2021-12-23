grammar Nex;

program
    : stmt*
    ;
stmt
    : meta_stmt
    | import_stmt
    |  prot_def_stmt
    ;

meta_stmt
    : Identifier  '=' value
    ;

import_stmt
    : 'from' Identifier 'import' '*'
    ;
 prot_def_stmt
    : Identifier '=' '{'  prot_stmt '}'
    ;
 prot_stmt
    :  prot_stmt (prot_meta_stmt |  prot_body_stmt)
    | (prot_meta_stmt |  prot_body_stmt)
    ;
 prot_meta_stmt
    : String ':'  value ','
    ;
  prot_body_stmt
    : '"' 'Body' '"' ':' '(' prot_field_stmt_list ')' ','
    ;

prot_field_stmt_list
    : prot_field_stmt_list prot_field_stmt
    | prot_field_stmt
    ;
// 什么时候决定TOKEN,什么时候Grammar   不用读值的就TOEKN
prot_field_stmt
    : '(' SimpleType ','  String ')' ','
    | '(' ComplexType ','   String ','  '('  prot_field_stmt_list ')' ')' ','
    ;
value
    : String
    | UString
    | Boolean
    | Integer
    ;
Boolean
    : 'True'
    | 'False'
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

SimpleType
    : 'INT8'
    | 'INT32'
    | 'VARSTR'
    | 'INT16'
    ;

ComplexType
    : 'ARRAY' | 'OPTIONAL'
    ;

Comment
    : '#' ~[\r\n]*
     -> skip
    ;
Whitespace
    :   [ \r\n\t] +
    -> skip
    ;


