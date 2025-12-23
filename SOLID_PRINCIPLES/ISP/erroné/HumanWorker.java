package SOLID_PRINCIPLES.ISP.erroné;

public class HumanWorker implements Worker {
    @Override
    public void work(){
        System.out.println("Les humains travaille");
    }

    @Override
    public void eat(){
        System.out.println("Les humains mange");
    }
}
