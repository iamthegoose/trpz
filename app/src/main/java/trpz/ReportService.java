package trpz;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportService {
    private EventRepository repository;
    
    public ReportService(EventRepository repository) {
        this.repository = repository;
    }
    
    public Report generateReport(IReportVisitor visitor) {
        Date now = new Date();
        Date past = new Date(System.currentTimeMillis() - 86400000); 
        
        List<ActivityEvent> events = repository.getEvents(past, now);
        
        System.out.println("[ReportService] Отримано " + events.size() + " подій для аналізу.");
        Iterator<ActivityEvent> iterator = events.iterator();
        while (iterator.hasNext()) {
            ActivityEvent event = iterator.next();
            event.accept(visitor);
        }
        
        return visitor.getReport();
    }
}
