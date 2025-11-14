package trpz;

public class IdleEvent extends ActivityEvent {
    public enum IdleState { START, END }
    public IdleState state;
    
    public IdleEvent(IdleState state) {
        super();
        this.state = state;
    }
    
    @Override
    public void accept(IReportVisitor visitor) {
        visitor.visit(this);
    }
}