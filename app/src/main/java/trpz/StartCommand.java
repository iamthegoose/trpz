package trpz;

public class StartCommand implements ICommand {
    private MonitoringManager manager;
    
    public StartCommand(MonitoringManager manager) {
        this.manager = manager;
    }
    
    @Override
    public void execute() {
        manager.start();
    }
}