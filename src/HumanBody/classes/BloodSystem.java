package HumanBody.classes;

public class BloodSystem implements HumanBodyProcesses{
    private double bloodAmount;
    @Override
    public void process(double amount) {
        validateAmount(amount);
        bloodAmount = amount * 0.9;
        System.out.println("Blood system transported the substance.");
    }
    public double getBloodAmount() {
        return bloodAmount;
    }
}