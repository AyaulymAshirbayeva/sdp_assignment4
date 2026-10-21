package HumanBody.facade;
import HumanBody.classes.ImmuneSystem;
import HumanBody.classes.LiverAndKidneys;
import HumanBody.classes.NervousSystem;

public class BodyStatusFacade {
    public void showStatus(HumanBodyFacade body) {
        System.out.println("\nBody Status:");
        System.out.println("Pain level: " + ((NervousSystem) body.nervous).getPainLevel());
        System.out.println("Inflammation level: " + ((ImmuneSystem) body.immune).getInflammationLevel());
        System.out.println("Eliminated substance: " + ((LiverAndKidneys) body.liverAndKidneys).getEliminatedAmount());
    }
}