package trpz;
import java.util.Map;

public class TextView implements IReportView {
    @Override
    public void render(Report report) {
        System.out.println("--- " + report.title + " ---");
        for (Map.Entry<String, Object> entry : report.data.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
        System.out.println("------------------------------------");
    }
}