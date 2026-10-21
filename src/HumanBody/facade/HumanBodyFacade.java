package HumanBody.facade;
import HumanBody.classes.*;

public class HumanBodyFacade {
    HumanBodyProcesses digestive = new DigestiveSystem();
    HumanBodyProcesses blood = new BloodSystem();
    HumanBodyProcesses nervous = new NervousSystem();
    HumanBodyProcesses immune = new ImmuneSystem();
    HumanBodyProcesses liverAndKidneys = new LiverAndKidneys();

    public void takePill(double amount) {
        System.out.println("Taking a pill...");
        digestive.process(amount);
        blood.process(((DigestiveSystem) digestive).getAbsorbedAmount());
        double bloodAmount = ((BloodSystem) blood).getBloodAmount();
        nervous.process(bloodAmount);
        immune.process(bloodAmount);
        liverAndKidneys.process(bloodAmount);
    }
}