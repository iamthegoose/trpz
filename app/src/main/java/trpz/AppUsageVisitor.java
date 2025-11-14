package trpz;
import java.util.HashMap;
import java.util.Map;


public class AppUsageVisitor implements IReportVisitor {
    private Map<String, Integer> appCounts = new HashMap<>();
    
    @Override
    public void visit(WindowEvent event) {
        String app = event.processName;
        appCounts.put(app, appCounts.getOrDefault(app, 0) + 1);
    }
    
    @Override public void visit(ResourceEvent event) { }
    @Override public void visit(IdleEvent event) { }
    
    @Override
    public Report getReport() {
        Report report = new Report("Звіт по % часу в програмах");
        report.data.put("Дані (по подіях)", appCounts.toString());
        return report;
    }
}