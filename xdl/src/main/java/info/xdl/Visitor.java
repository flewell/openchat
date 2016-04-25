package info.xdl;

public interface Visitor {
	public void beginVisit();

	public void endVisit();

	public void beginVisitUnit(ASTUnit unit);

	public void visitUnit(ASTUnit unit);

	public void endVisitUnit(ASTUnit unit);

	public void visitEnum(ASTEnum enumeration);

	public void beginVisitMessage(ASTMessage message);

	public void visitMessage(ASTMessage message);

	public void endVisitMessage(ASTMessage message);

	public void visitMessageField(ASTMessageField field);

	public void beginVisitInterface(ASTInterface intf);

	public void visitInterface(ASTInterface intf);

	public void endVisitInterface(ASTInterface intf);

	public void visitFunction(ASTFunction func);
}
