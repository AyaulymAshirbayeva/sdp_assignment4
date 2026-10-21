package HumanBody.classes;

public class LiverAndKidneys implements HumanBodyProcesses {
    private double eliminatedAmount;
    @Override
    public void process(double amount) {
        validateAmount(amount);
        eliminatedAmount = amount * 0.21;
        System.out.println("Liver and kidneys processed the substance.");
    }
    public double getEliminatedAmount() {
        return eliminatedAmount;
    }
}