import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import dao.TicketDAO;
import utils.DBConnection;

public class Main {
    public void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection con1 = DBConnection.getConnection();
        TicketDAO dao1 = new TicketDAO(con1);
        Menu menu1 = new Menu();
        menu1.afficherMenu(dao1);
    }
}