package SOLID_PRINCIPLES.DIP.corrigé;

public class Main {
    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        Database mongo = new MongoDBDatabase();

        OrderProcessor orderProcessorMysql = new OrderProcessor(mysql);
        OrderProcessor orderProcessorMongo = new OrderProcessor(mongo);

        orderProcessorMysql.processOrder("mysql data");
        orderProcessorMongo.processOrder("mongo data");
    }
}