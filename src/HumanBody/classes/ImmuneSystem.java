package HumanBody.classes;

public class ImmuneSystem implements HumanBodyProcesses{
    private int inflammationLevel = 10;
    @Override
    public void process(double amount) {
        validateAmount(amount);
        double reduction = Math.round(amount / 200.0);
        reduction = Math.max(1, reduction);
        inflammationLevel = (int) Math.max(0, inflammationLevel - reduction);
        System.out.println("Immune system managed inflammation.");
    }
    public int getInflammationLevel() {
        return inflammationLevel;
    }
}
