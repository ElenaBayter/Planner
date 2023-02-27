public class WorkTasks extends Tasks implements doIt {

    private String name;
    private String subject;

    public WorkTasks(double duration, boolean complexity, String name, String subject) {
        super(duration, complexity);
        this.name = name;
        this.subject = subject;
    }
    @Override
    public void doIt() {
        System.out.println("It gonna be boring, but its your job");
    }
}
