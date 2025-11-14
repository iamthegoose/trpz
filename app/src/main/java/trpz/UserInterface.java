package trpz;

public class UserInterface {
    private ICommand startCmd;
    private ICommand stopCmd;
    
    private ReportService reportService;
    
    private IReportView view;
    
    public UserInterface(MonitoringManager manager, ReportService reportSvc) {
        this.startCmd = new StartCommand(manager);
        this.stopCmd = new StopCommand(manager);
        
        this.reportService = reportSvc;
        
        this.view = new TextView();
    }
    
    public void setView(IReportView view) {
        System.out.println("\n[UI] Змінено вигляд на: " + view.getClass().getSimpleName());
        this.view = view;
    }
    
    public void pressStartButton() {
        System.out.println("\n[UI] Натиснуто 'Start'");
        startCmd.execute();
    }
    
    public void pressStopButton() {
        System.out.println("\n[UI] Натиснуто 'Stop'");
        stopCmd.execute();
    }
    
    public void pressShowCpuReport() {
        System.out.println("\n[UI] Запит звіту по CPU...");
        Report report = reportService.generateReport(new CpuLoadVisitor());
        view.render(report);
    }
    
    public void pressShowAppReport() {
        System.out.println("\n[UI] Запит звіту по Програмах...");
        Report report = reportService.generateReport(new AppUsageVisitor());
        view.render(report);
    }
}
