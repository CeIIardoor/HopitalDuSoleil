package ly.hopitaldusoleil;

import ly.hopitaldusoleil.DAO.DAOFactory;

public class Main {
    public static void main(String[] args) {
        DAOFactory.getDAOFactory(DAOFactory.MYSQL);
    }
}