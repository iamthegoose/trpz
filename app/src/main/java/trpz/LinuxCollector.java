package trpz;

public class LinuxCollector implements ISystemCollector {
    private EventRepository repository;
    public LinuxCollector(EventRepository repo) { this.repository = repo; }
    
    @Override
    public void collect() {
        repository.addEvent(new ResourceEvent(10.1, 1024));
        repository.addEvent(new WindowEvent("/usr/bin/firefox", "Mozilla"));
    }
}