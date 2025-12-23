package SOLID_PRINCIPLES.DIP.corrigé;

public class MySQLDatabase implements Database{
    @Override
    public void save(String data){
        System.out.println("Saving to MySQL: " + data);
    }
}
