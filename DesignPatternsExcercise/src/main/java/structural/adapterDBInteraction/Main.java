package structural.adapterDBInteraction;

import structural.adapterDBInteraction.dBManagers.DBMySQLManager;
import structural.adapterDBInteraction.mySQLToMongoDBAdapter.MySQLToMongoAdapter;

public class Main {
    public static void main(String[] args) {
        //lets assume that we can work and store only to MySql
        //so eventhought its the mongo interface, it will store data to the MySql
        //when we will have the mongo coverage, we will replace the MySQLToMongoAdapter to real DBMongoManager
        IDBMongo idbMongo = new MySQLToMongoAdapter(new DBMySQLManager());
        idbMongo.storeToMongo();
    }
}
