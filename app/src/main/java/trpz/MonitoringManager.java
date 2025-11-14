package trpz;
import java.util.Timer;
import java.util.TimerTask;

public class MonitoringManager {
    private ISystemCollector collector;
    private Timer timer;
    
    public MonitoringManager(IMonitorFactory factory, EventRepository repository) {
        this.collector = factory.createCollector(repository);
    }
    
    public void start() {
        System.out.println("[Manager] Запуск моніторингу...");
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                collector.collect();
            }
        }, 1000, 5000); 
    }
    
    public void stop() {
        System.out.println("[Manager] Зупинка моніторингу.");
        if (timer != null) {
            timer.cancel();
        }
    }
}