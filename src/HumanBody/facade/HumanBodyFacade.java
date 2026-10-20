package HumanBody.facade;

import HumanBody.classes.*;

public class HumanBodyFacade {

    private final DigestiveSystem digestive = new DigestiveSystem();
    private final BloodSystem blood = new BloodSystem();
    private final NervousSystem nervous = new NervousSystem();
    private final ImmuneSystem immune = new ImmuneSystem();
    private final LiverAndKidneys liverAndKidneys = new LiverAndKidneys();

    public void takePill(double amount) {
        System.out.println("\n--- Body Processes ---");
        digestive.process(amount);
        blood.process(digestive.getAbsorbedAmount());

        double bloodAmount = blood.getBloodAmount();

        nervous.process(bloodAmount);
        immune.process(bloodAmount);
        liverAndKidneys.process(bloodAmount);
    }

    public NervousSystem getNervousSystem() {
        return nervous;
    }

    public ImmuneSystem getImmuneSystem() {
        return immune;
    }

    public LiverAndKidneys getLiverAndKidneys() {
        return liverAndKidneys;
    }
}