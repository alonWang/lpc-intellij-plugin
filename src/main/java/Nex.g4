grammar Nex;

program
    : program  stmt
    |  stmt
    ;
stmt
    : meta_stmt
    | import_stmt
    |  prot_def_stmt
    ;

meta_stmt
    : Identifier  Equal (Integer| UnicodeString |StringLiteral | boolean  )
    ;
import_stmt
    : 'from' Identifier 'import' Star
    ;
 prot_def_stmt
    : Identifier Equal  L_Brace  prot_stmt R_Brace
    ;
 prot_stmt
    :  prot_stmt (prot_meta_stmt |  prot_body_stmt)
    | (prot_meta_stmt |  prot_body_stmt)
    ;
 prot_meta_stmt
    : MetaIdentifier  Colon  define_value Comma
    ;
  prot_body_stmt
    : Quota Body Quota Colon L_Bracket prot_field_stmt_list R_Bracket Comma
    ;

prot_field_stmt_list
    : prot_field_stmt_list prot_field_stmt
    | prot_field_stmt
    ;
// 什么时候决定TOKEN,什么时候Grammar   不用读值的就TOEKN
prot_field_stmt
    : L_Bracket varType Comma  Quota Identifier Quota R_Bracket Comma
    | L_Bracket complexType Comma  Quota Identifier Quota Comma  L_Bracket  prot_field_stmt_list R_Bracket R_Bracket Comma
    ;
define_value
    : Integer
    | UnicodeString
    | StringLiteral
    | (True | False)
    ;
boolean
    : True
    | False
    ;

Colon : ':';
Quota : '"';
Comma : ',';
Star : '*';
L_Bracket : '(';
R_Bracket : ')';
L_Brace: '{';
R_Brace: '}';
Equal : '=';
True : 'True';
False : 'False';

//TOKEN根据声明顺序决定优先级
//Cmd: 'CMD';
//CmdDesc: 'CMD_DESC';
//CanPause: 'CAN_PAUSE';
//Cmd_In_Mem: 'KEEP_IN_MEM';
//SubCmd: 'SUBCMD';
//Mod: 'MOD';
//Func: 'FUNC';
//Desc: 'DESC';
//Body: 'BODY';
//Priority: 'PRIORITY';
//Function_On_Enqueue : 'FUNC_ON_ENQUEUE';


Identifier
    : NonDigit
    ( NonDigit
    | Digit
    )*
    ;
MetaIdentifier
    : Quota Identifier Quota
    ;
UnicodeString
    : 'u' StringLiteral
    ;

StringLiteral
    :    Quota ~["\\\r\n]+ Quota
    ;

Integer
    : ('+'| '-')? Digit+
    ;


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

complexType
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


