// Generated from /Users/alonwang/IdeaProjects/lpc-intellij-plugin/src/main/java/LPC.g4 by ANTLR 4.9.2
package com.github.alonwang.lpcintellijplugin.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LPCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LPCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LPCParser#lpc_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLpc_program(LPCParser.Lpc_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LPCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#possible_semi_colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossible_semi_colon(LPCParser.Possible_semi_colonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#defination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefination(LPCParser.DefinationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#function_defination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_defination(LPCParser.Function_definationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#modifier_change}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier_change(LPCParser.Modifier_changeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#type_modifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_modifier_list(LPCParser.Type_modifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl(LPCParser.Type_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#member_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_list(LPCParser.Member_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#member_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_name_list(LPCParser.Member_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#member_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_name(LPCParser.Member_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_list(LPCParser.Name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#new_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_name(LPCParser.New_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr0(LPCParser.Expr0Context ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#time_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_expression(LPCParser.Time_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#expr_or_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_or_block(LPCParser.Expr_or_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#comma_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_expr(LPCParser.Comma_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#parse_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_command(LPCParser.Parse_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#sscanf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSscanf(LPCParser.SscanfContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#lvalue_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue_list(LPCParser.Lvalue_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(LPCParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#basic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type(LPCParser.Basic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#atomic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic_type(LPCParser.Atomic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr4(LPCParser.Expr4Context ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_statement(LPCParser.Catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(LPCParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#expr_list3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list3(LPCParser.Expr_list3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#expr_list4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list4(LPCParser.Expr_list4Context ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#assoc_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssoc_pair(LPCParser.Assoc_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#expr_list2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list2(LPCParser.Expr_list2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#expr_list_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list_node(LPCParser.Expr_list_nodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LPCParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#string_con2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_con2(LPCParser.String_con2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#string_con1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_con1(LPCParser.String_con1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(LPCParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#function_name_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name_call(LPCParser.Function_name_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#function_arrow_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arrow_call(LPCParser.Function_arrow_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(LPCParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#opt_class_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_class_init(LPCParser.Opt_class_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#class_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_init(LPCParser.Class_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#efun_override}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEfun_override(LPCParser.Efun_overrideContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#block_or_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_or_semi(LPCParser.Block_or_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LPCParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(LPCParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#local_declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declare_statement(LPCParser.Local_declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#local_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_name_list(LPCParser.Local_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#new_local_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_local_def(LPCParser.New_local_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#new_local_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_local_name(LPCParser.New_local_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LPCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(LPCParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(LPCParser.Do_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(LPCParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#local_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declarations(LPCParser.Local_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(LPCParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#switch_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_block(LPCParser.Switch_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(LPCParser.Case_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(LPCParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#foreach_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_loop(LPCParser.Foreach_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#foreach_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_vars(LPCParser.Foreach_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(LPCParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#foreach_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_var(LPCParser.Foreach_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#first_for_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_for_expr(LPCParser.First_for_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#single_new_local_def_with_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_new_local_def_with_init(LPCParser.Single_new_local_def_with_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#single_new_local_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_new_local_def(LPCParser.Single_new_local_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#for_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_expr(LPCParser.For_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(LPCParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(LPCParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#optional_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_else_part(LPCParser.Optional_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(LPCParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(LPCParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#new_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_arg(LPCParser.New_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritance(LPCParser.InheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(LPCParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#opt_basic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_basic_type(LPCParser.Opt_basic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#optional_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_star(LPCParser.Optional_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LPCParser.IdentifierContext ctx);
}