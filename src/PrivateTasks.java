public class PrivateTasks extends Tasks implements doIt {
    private String beauty;
    private boolean buyWine;

    public PrivateTasks(double duration, boolean complexity, String beauty, boolean buyWine) {
        super(duration, complexity);
        this.beauty = beauty;
        this.buyWine = buyWine;
    }
    @Override
    public void doIt(){
        System.out.println("Do it with pleasure");
    }
}
