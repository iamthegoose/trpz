package trpz;

public interface IReportVisitor {
    void visit(ResourceEvent event);
    void visit(WindowEvent event);
    void visit(IdleEvent event);
    Report getReport();
}