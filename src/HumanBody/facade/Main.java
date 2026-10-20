package HumanBody.facade;
import HumanBody.classes.BodyStatusFacade;

public class Main {
    public static void main(String[] args) {
        HumanBodyFacade body = new HumanBodyFacade();
        BodyStatusFacade status = new BodyStatusFacade();
        body.takePill(500);
        status.showStatus(body);
    }
}