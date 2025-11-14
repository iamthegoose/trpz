package trpz;

public class WindowsMonitorFactory implements IMonitorFactory {
    @Override
    public ISystemCollector createCollector(EventRepository repository) {
        System.out.println("[Factory] Створено WindowsCollector");
        return new WindowsCollector(repository);
    }
}