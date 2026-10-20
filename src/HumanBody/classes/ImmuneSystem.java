package HumanBody.classes;

public class ImmuneSystem implements HumanBodyProcesses {
    private double inflammationLevel = 6;
    @Override
    public void process(double amount) {
        validateAmount(amount);
        inflammationLevel = inflammationLevel - amount / 200;
        if (inflammationLevel < 0) {
            inflammationLevel = 0;
        }
        System.out.println("Immune system reduced inflammation.");
    }
    public double getInflammationLevel() {
        return inflammationLevel;
    }
}