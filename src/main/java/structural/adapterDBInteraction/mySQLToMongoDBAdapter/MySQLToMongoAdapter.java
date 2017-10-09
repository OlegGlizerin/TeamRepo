package structural.adapterDBInteraction.mySQLToMongoDBAdapter;

import structural.adapterDBInteraction.IDBMongo;
import structural.adapterDBInteraction.IDBMySQL;


/**
 * Adapter pattern used here, MySql storage now acts as Mongo, but actualy does the work from Mysql
 */
public class MySQLToMongoAdapter implements IDBMongo {
    private IDBMySQL idbMySQL = null;

    public MySQLToMongoAdapter(IDBMySQL idbMySQL) {
        this.idbMySQL = idbMySQL;
    }

    @Override
    public void storeToMongo() {
        idbMySQL.storeToMySQL();
    }

    @Override
    public void getData() {
        idbMySQL.getData();
    }
}
