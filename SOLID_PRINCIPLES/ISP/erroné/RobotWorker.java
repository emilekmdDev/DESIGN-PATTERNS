package SOLID_PRINCIPLES.ISP.erroné;

public class RobotWorker implements Worker{
    @Override
    public void work(){
        System.out.println("Les robots travaille sans fatigue");
    }

    @Override
    public void eat(){
        System.out.println("L'ont ne doit pas faire manger un robots");
        throw new UnsupportedOperationException("Les Robots ne mangent pas");
    }
}
