package trpz;
import java.util.HashMap;
import java.util.Map;

public class Report {
    public String title;
    public Map<String, Object> data;
    
    public Report(String title) {
        this.title = title;
        this.data = new HashMap<>();
    }
}
