package trpz;

public class WindowsCollector implements ISystemCollector {
    private EventRepository repository;
    public WindowsCollector(EventRepository repo) { this.repository = repo; }
    
    @Override
    public void collect() {
        repository.addEvent(new ResourceEvent(15.5, 2048));
        repository.addEvent(new WindowEvent("chrome.exe", "Google"));
    }
}