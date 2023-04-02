package ly.hopitaldusoleil.DAO;

import ly.hopitaldusoleil.DAO.DBFactories.CSVFactory;
import ly.hopitaldusoleil.DAO.DBFactories.MySQLFactory;
import ly.hopitaldusoleil.DAO.DBFactories.SQLServerFactory;

import java.sql.SQLException;

public class DAOFactory {

    public static DAOFactory getDAOFactory(String whichFactory, String url, String user, String password) {
        switch (whichFactory) {
            case "MYSQL":
                try {
                    return MySQLFactory.getInstance(url, user, password);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            case "CSV":
                return new CSVFactory();
            case "SQLSERVER":
                return new SQLServerFactory();
            default:
                return null;
        }
    }

}