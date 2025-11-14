package trpz;

public interface IMonitorFactory {
    ISystemCollector createCollector(EventRepository repository);
}