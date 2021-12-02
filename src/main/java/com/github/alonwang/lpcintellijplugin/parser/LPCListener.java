// Generated from /Users/alonwang/IdeaProjects/lpc-intellij-plugin/src/main/java/LPC.g4 by ANTLR 4.9.2
package com.github.alonwang.lpcintellijplugin.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LPCParser}.
 */
public interface LPCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LPCParser#lpc_program}.
	 * @param ctx the parse tree
	 */
	void enterLpc_program(LPCParser.Lpc_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#lpc_program}.
	 * @param ctx the parse tree
	 */
	void exitLpc_program(LPCParser.Lpc_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LPCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LPCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#possible_semi_colon}.
	 * @param ctx the parse tree
	 */
	void enterPossible_semi_colon(LPCParser.Possible_semi_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#possible_semi_colon}.
	 * @param ctx the parse tree
	 */
	void exitPossible_semi_colon(LPCParser.Possible_semi_colonContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#defination}.
	 * @param ctx the parse tree
	 */
	void enterDefination(LPCParser.DefinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#defination}.
	 * @param ctx the parse tree
	 */
	void exitDefination(LPCParser.DefinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#function_defination}.
	 * @param ctx the parse tree
	 */
	void enterFunction_defination(LPCParser.Function_definationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#function_defination}.
	 * @param ctx the parse tree
	 */
	void exitFunction_defination(LPCParser.Function_definationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#modifier_change}.
	 * @param ctx the parse tree
	 */
	void enterModifier_change(LPCParser.Modifier_changeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#modifier_change}.
	 * @param ctx the parse tree
	 */
	void exitModifier_change(LPCParser.Modifier_changeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#type_modifier_list}.
	 * @param ctx the parse tree
	 */
	void enterType_modifier_list(LPCParser.Type_modifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#type_modifier_list}.
	 * @param ctx the parse tree
	 */
	void exitType_modifier_list(LPCParser.Type_modifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(LPCParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(LPCParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#member_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_list(LPCParser.Member_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#member_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_list(LPCParser.Member_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#member_name_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_name_list(LPCParser.Member_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#member_name_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_name_list(LPCParser.Member_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#member_name}.
	 * @param ctx the parse tree
	 */
	void enterMember_name(LPCParser.Member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#member_name}.
	 * @param ctx the parse tree
	 */
	void exitMember_name(LPCParser.Member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#name_list}.
	 * @param ctx the parse tree
	 */
	void enterName_list(LPCParser.Name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#name_list}.
	 * @param ctx the parse tree
	 */
	void exitName_list(LPCParser.Name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#new_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_name(LPCParser.New_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#new_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_name(LPCParser.New_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterExpr0(LPCParser.Expr0Context ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitExpr0(LPCParser.Expr0Context ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#time_expression}.
	 * @param ctx the parse tree
	 */
	void enterTime_expression(LPCParser.Time_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#time_expression}.
	 * @param ctx the parse tree
	 */
	void exitTime_expression(LPCParser.Time_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#expr_or_block}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_block(LPCParser.Expr_or_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#expr_or_block}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_block(LPCParser.Expr_or_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#comma_expr}.
	 * @param ctx the parse tree
	 */
	void enterComma_expr(LPCParser.Comma_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#comma_expr}.
	 * @param ctx the parse tree
	 */
	void exitComma_expr(LPCParser.Comma_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#parse_command}.
	 * @param ctx the parse tree
	 */
	void enterParse_command(LPCParser.Parse_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#parse_command}.
	 * @param ctx the parse tree
	 */
	void exitParse_command(LPCParser.Parse_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#sscanf}.
	 * @param ctx the parse tree
	 */
	void enterSscanf(LPCParser.SscanfContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#sscanf}.
	 * @param ctx the parse tree
	 */
	void exitSscanf(LPCParser.SscanfContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#lvalue_list}.
	 * @param ctx the parse tree
	 */
	void enterLvalue_list(LPCParser.Lvalue_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#lvalue_list}.
	 * @param ctx the parse tree
	 */
	void exitLvalue_list(LPCParser.Lvalue_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(LPCParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(LPCParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(LPCParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(LPCParser.Basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#atomic_type}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_type(LPCParser.Atomic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#atomic_type}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_type(LPCParser.Atomic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterExpr4(LPCParser.Expr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitExpr4(LPCParser.Expr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatch_statement(LPCParser.Catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatch_statement(LPCParser.Catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(LPCParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(LPCParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#expr_list3}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list3(LPCParser.Expr_list3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#expr_list3}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list3(LPCParser.Expr_list3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#expr_list4}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list4(LPCParser.Expr_list4Context ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#expr_list4}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list4(LPCParser.Expr_list4Context ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#assoc_pair}.
	 * @param ctx the parse tree
	 */
	void enterAssoc_pair(LPCParser.Assoc_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#assoc_pair}.
	 * @param ctx the parse tree
	 */
	void exitAssoc_pair(LPCParser.Assoc_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#expr_list2}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list2(LPCParser.Expr_list2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#expr_list2}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list2(LPCParser.Expr_list2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#expr_list_node}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_node(LPCParser.Expr_list_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#expr_list_node}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_node(LPCParser.Expr_list_nodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LPCParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LPCParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#string_con2}.
	 * @param ctx the parse tree
	 */
	void enterString_con2(LPCParser.String_con2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#string_con2}.
	 * @param ctx the parse tree
	 */
	void exitString_con2(LPCParser.String_con2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#string_con1}.
	 * @param ctx the parse tree
	 */
	void enterString_con1(LPCParser.String_con1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#string_con1}.
	 * @param ctx the parse tree
	 */
	void exitString_con1(LPCParser.String_con1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(LPCParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(LPCParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#function_name_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name_call(LPCParser.Function_name_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#function_name_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name_call(LPCParser.Function_name_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#function_arrow_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arrow_call(LPCParser.Function_arrow_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#function_arrow_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arrow_call(LPCParser.Function_arrow_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(LPCParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(LPCParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#opt_class_init}.
	 * @param ctx the parse tree
	 */
	void enterOpt_class_init(LPCParser.Opt_class_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#opt_class_init}.
	 * @param ctx the parse tree
	 */
	void exitOpt_class_init(LPCParser.Opt_class_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#class_init}.
	 * @param ctx the parse tree
	 */
	void enterClass_init(LPCParser.Class_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#class_init}.
	 * @param ctx the parse tree
	 */
	void exitClass_init(LPCParser.Class_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#efun_override}.
	 * @param ctx the parse tree
	 */
	void enterEfun_override(LPCParser.Efun_overrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#efun_override}.
	 * @param ctx the parse tree
	 */
	void exitEfun_override(LPCParser.Efun_overrideContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#block_or_semi}.
	 * @param ctx the parse tree
	 */
	void enterBlock_or_semi(LPCParser.Block_or_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#block_or_semi}.
	 * @param ctx the parse tree
	 */
	void exitBlock_or_semi(LPCParser.Block_or_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LPCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LPCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(LPCParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(LPCParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#local_declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declare_statement(LPCParser.Local_declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#local_declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declare_statement(LPCParser.Local_declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#local_name_list}.
	 * @param ctx the parse tree
	 */
	void enterLocal_name_list(LPCParser.Local_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#local_name_list}.
	 * @param ctx the parse tree
	 */
	void exitLocal_name_list(LPCParser.Local_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#new_local_def}.
	 * @param ctx the parse tree
	 */
	void enterNew_local_def(LPCParser.New_local_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#new_local_def}.
	 * @param ctx the parse tree
	 */
	void exitNew_local_def(LPCParser.New_local_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#new_local_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_local_name(LPCParser.New_local_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#new_local_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_local_name(LPCParser.New_local_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LPCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LPCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(LPCParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(LPCParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(LPCParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(LPCParser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(LPCParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(LPCParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations(LPCParser.Local_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations(LPCParser.Local_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(LPCParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(LPCParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_block(LPCParser.Switch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_block(LPCParser.Switch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(LPCParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(LPCParser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(LPCParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(LPCParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#foreach_loop}.
	 * @param ctx the parse tree
	 */
	void enterForeach_loop(LPCParser.Foreach_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#foreach_loop}.
	 * @param ctx the parse tree
	 */
	void exitForeach_loop(LPCParser.Foreach_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#foreach_vars}.
	 * @param ctx the parse tree
	 */
	void enterForeach_vars(LPCParser.Foreach_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#foreach_vars}.
	 * @param ctx the parse tree
	 */
	void exitForeach_vars(LPCParser.Foreach_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(LPCParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(LPCParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#foreach_var}.
	 * @param ctx the parse tree
	 */
	void enterForeach_var(LPCParser.Foreach_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#foreach_var}.
	 * @param ctx the parse tree
	 */
	void exitForeach_var(LPCParser.Foreach_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#first_for_expr}.
	 * @param ctx the parse tree
	 */
	void enterFirst_for_expr(LPCParser.First_for_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#first_for_expr}.
	 * @param ctx the parse tree
	 */
	void exitFirst_for_expr(LPCParser.First_for_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#single_new_local_def_with_init}.
	 * @param ctx the parse tree
	 */
	void enterSingle_new_local_def_with_init(LPCParser.Single_new_local_def_with_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#single_new_local_def_with_init}.
	 * @param ctx the parse tree
	 */
	void exitSingle_new_local_def_with_init(LPCParser.Single_new_local_def_with_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#single_new_local_def}.
	 * @param ctx the parse tree
	 */
	void enterSingle_new_local_def(LPCParser.Single_new_local_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#single_new_local_def}.
	 * @param ctx the parse tree
	 */
	void exitSingle_new_local_def(LPCParser.Single_new_local_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void enterFor_expr(LPCParser.For_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void exitFor_expr(LPCParser.For_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(LPCParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(LPCParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(LPCParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(LPCParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#optional_else_part}.
	 * @param ctx the parse tree
	 */
	void enterOptional_else_part(LPCParser.Optional_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#optional_else_part}.
	 * @param ctx the parse tree
	 */
	void exitOptional_else_part(LPCParser.Optional_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(LPCParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(LPCParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(LPCParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(LPCParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#new_arg}.
	 * @param ctx the parse tree
	 */
	void enterNew_arg(LPCParser.New_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#new_arg}.
	 * @param ctx the parse tree
	 */
	void exitNew_arg(LPCParser.New_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(LPCParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(LPCParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(LPCParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(LPCParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#opt_basic_type}.
	 * @param ctx the parse tree
	 */
	void enterOpt_basic_type(LPCParser.Opt_basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#opt_basic_type}.
	 * @param ctx the parse tree
	 */
	void exitOpt_basic_type(LPCParser.Opt_basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#optional_star}.
	 * @param ctx the parse tree
	 */
	void enterOptional_star(LPCParser.Optional_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#optional_star}.
	 * @param ctx the parse tree
	 */
	void exitOptional_star(LPCParser.Optional_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LPCParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LPCParser.IdentifierContext ctx);
}