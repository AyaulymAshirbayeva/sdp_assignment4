package HumanBody.classes;

public class DigestiveSystem implements HumanBodyProcesses {
    private double absorbedAmount;
    @Override
    public void process(double amount) {
        validateAmount(amount);
        absorbedAmount = amount * 0.8;
        System.out.println("Digestive system absorbed the pill.");
    }
    public double getAbsorbedAmount() {
        return absorbedAmount;
    }
}
