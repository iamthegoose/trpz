package trpz;

public class WindowEvent extends ActivityEvent {
    public String processName;
    public String windowTitle;
    
    public WindowEvent(String process, String title) {
        super();
        this.processName = process;
        this.windowTitle = title;
    }
    
    @Override
    public void accept(IReportVisitor visitor) {
        visitor.visit(this);
    }
}