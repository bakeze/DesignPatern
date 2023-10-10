package mediatheque;

public interface ItemVisitor {
	void visit(book Item)
	void visit(cd Item)
}
