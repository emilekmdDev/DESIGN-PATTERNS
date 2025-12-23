package SOLID_PRINCIPLES.ISP.erroné;

public class Main {
    public static void main(String[] args) {
        HumanWorker humanWorker = new HumanWorker();
        humanWorker.eat();
        humanWorker.work();

        RobotWorker robotWorker = new RobotWorker();
        robotWorker.eat();
        robotWorker.work();
    }
}
