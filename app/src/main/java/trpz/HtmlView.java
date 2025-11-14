package trpz;
import java.util.Map;

public class HtmlView implements IReportView {
    @Override
    public void render(Report report) {
        System.out.println("<html><body>");
        System.out.println("  <h1>" + report.title + "</h1>");
        System.out.println("  <ul>");
        for (Map.Entry<String, Object> entry : report.data.entrySet()) {
            System.out.println("    <li><b>" + entry.getKey() + ":</b> " + entry.getValue().toString() + "</li>");
        }
        System.out.println("  </ul>");
        System.out.println("</body></html>");
    }
}