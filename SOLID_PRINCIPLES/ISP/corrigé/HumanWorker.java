package SOLID_PRINCIPLES.ISP.corrigé;

public class HumanWorker implements Eatable{
    @Override
    public void work(){
        System.out.println("Les humains travaille");
    }

    @Override
    public void eat(){
        System.out.println("Les humains mange");
    }
}
