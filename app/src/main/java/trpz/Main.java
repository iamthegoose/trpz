package trpz;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        IMonitorFactory factory = new WindowsMonitorFactory();
        
        EventRepository repository = new EventRepository();
        MonitoringManager manager = new MonitoringManager(factory, repository);
        ReportService reportService = new ReportService(repository);
        
        UserInterface ui = new UserInterface(manager, reportService);
        
        ui.pressStartButton();
        
        Thread.sleep(6000); 
        
        ui.pressStopButton();
        
        Thread.sleep(6000);
        
        ui.pressStartButton();
        Thread.sleep(6000);
        ui.pressStopButton();
        
        ui.pressShowCpuReport();
        ui.pressShowAppReport();
        
        ui.setView(new HtmlView());
        ui.pressShowCpuReport();
        
    }
}
