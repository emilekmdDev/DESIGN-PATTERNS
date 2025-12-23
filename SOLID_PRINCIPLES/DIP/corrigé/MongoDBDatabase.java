package SOLID_PRINCIPLES.DIP.corrigé;

public class MongoDBDatabase implements Database{
    @Override
    public void save(String data){
        System.out.println("saving to MongoDBDatabase: "+data);
    }
}
