package ly.hopitaldusoleil.DAO.DBFactories;

import ly.hopitaldusoleil.DAO.DAOFactory;
import ly.hopitaldusoleil.DAO.IDAO;
import java.sql.*;


public class MySQLFactory extends DAOFactory implements IDAO {

    private static final MySQLFactory instance = null;

    public static MySQLFactory getInstance(String url,String user, String password) throws SQLException {
        if (instance == null) {
            return new MySQLFactory(user, password, url);
        }
        return instance;
    }

    private MySQLFactory(String url ,String user, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM client");
            while (rs.next()) {
                System.out.print(rs.getString("nom"));
                System.out.println(rs.getString("prenom"));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create() {

    }

    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

}