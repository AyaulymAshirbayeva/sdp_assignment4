package HumanBody.classes;

public class NervousSystem implements HumanBodyProcesses {
    private int painLevel = 10;
    @Override
    public void process(double amount) {
        validateAmount(amount);
        int reduction = (int) (amount / 100);
        reduction = Math.max(1, reduction);
        painLevel = Math.max(0, painLevel - reduction);
        System.out.println("Nervous system reduced the pain level.");
    }
    public int getPainLevel() {
        return painLevel;
    }
}