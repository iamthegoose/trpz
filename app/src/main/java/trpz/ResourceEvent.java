package trpz;

public class ResourceEvent extends ActivityEvent {
    public double cpuLoad;
    public double ramUsage;
    
    public ResourceEvent(double cpu, double ram) {
        super();
        this.cpuLoad = cpu;
        this.ramUsage = ram;
    }
    
    @Override
    public void accept(IReportVisitor visitor) {
        visitor.visit(this);
    }
}
