package trpz;

public class StopCommand implements ICommand {
    private MonitoringManager manager;
    
    public StopCommand(MonitoringManager manager) {
        this.manager = manager;
    }
    
    @Override
    public void execute() {
        manager.stop();
    }
}