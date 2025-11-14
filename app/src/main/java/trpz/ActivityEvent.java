package trpz;
import java.util.Date;

public abstract class ActivityEvent {
    public Date timestamp;
    public ActivityEvent() {
        this.timestamp = new Date();
    }
    public abstract void accept(IReportVisitor visitor);
}