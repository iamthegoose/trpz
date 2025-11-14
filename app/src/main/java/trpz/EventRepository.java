package trpz;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventRepository {
    private List<ActivityEvent> eventLog = new ArrayList<>();
    
    public void addEvent(ActivityEvent event) {
        System.out.println("[Repo] Збережено: " + event.getClass().getSimpleName());
        eventLog.add(event);
    }
    
    public List<ActivityEvent> getEvents(Date start, Date end) {
        return new ArrayList<>(eventLog); 
    }
}