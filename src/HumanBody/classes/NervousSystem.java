package HumanBody.classes;

public class NervousSystem implements HumanBodyProcesses{
    private double painLevel = 8;
    @Override
    public void process(double amount) {
        validateAmount(amount);
        painLevel = painLevel - amount / 100;
        if (painLevel < 0) {
            painLevel = 0;
        }
        System.out.println("Nervous system reduced the pain level.");
    }
    public double getPainLevel() {
        return painLevel;
    }
}