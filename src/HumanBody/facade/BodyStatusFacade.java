package HumanBody.classes;

import HumanBody.facade.HumanBodyFacade;

public class BodyStatusFacade {
    public void showStatus(HumanBodyFacade body) {
        System.out.println("\n--- Body Status ---");
        System.out.println(
                "Pain level: " + body.getNervousSystem().getPainLevel()
        );
        System.out.println(
                "Inflammation level: "
                        + body.getImmuneSystem().getInflammationLevel()
        );
        System.out.println(
                "Eliminated substance: "
                        + body.getLiverAndKidneys().getEliminatedAmount()
        );
    }
}
