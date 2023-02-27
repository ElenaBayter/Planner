public class Tasks {
    private double duration;
    private boolean complexity;

    public Tasks(double duration, boolean complexity) {
        this.duration = duration;
        this.complexity = complexity;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isComplexity() {
        return complexity;
    }

    public void setComplexity(boolean complexity) {
        this.complexity = complexity;
    }
}
