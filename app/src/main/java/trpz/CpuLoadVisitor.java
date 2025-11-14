package trpz;


public class CpuLoadVisitor implements IReportVisitor {
    private double totalLoad = 0;
    private int samples = 0;
    
    @Override
    public void visit(ResourceEvent event) {
        totalLoad += event.cpuLoad;
        samples++;
    }
    
    @Override public void visit(WindowEvent event) { }
    @Override public void visit(IdleEvent event) { }
    
    @Override
    public Report getReport() {
        Report report = new Report("Середнє Навантаження CPU");
        double avg = (samples == 0) ? 0 : totalLoad / samples;
        report.data.put("Середнє навантаження", String.format("%.2f%%", avg));
        report.data.put("Кількість вимірів", samples);
        return report;
    }
}