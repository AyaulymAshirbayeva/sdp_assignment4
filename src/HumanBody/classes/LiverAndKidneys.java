package HumanBody.classes;
public class LiverAndKidneys implements HumanBodyProcesses {
    private double eliminatedAmount;
    @Override
    public void process(double amount) {
        validateAmount(amount);
        double processedAmount = amount * 0.3;
        eliminatedAmount = processedAmount * 0.7;
        System.out.println("Liver and kidneys processed the substance.");
    }
    public double getEliminatedAmount() {
        return eliminatedAmount;
    }
}