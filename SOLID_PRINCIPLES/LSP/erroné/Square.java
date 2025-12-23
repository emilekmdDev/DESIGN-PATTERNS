package SOLID_PRINCIPLES.LSP.erroné;

public class Square extends Rectangle{

    @Override
    public void setHeight(double height){
        super.setWidth(height);
        super.setHeight(height);
    }
    
    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setHeight(width);
    }
}
