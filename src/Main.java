import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import dao.TicketDAO;
import utils.DBConnection;

public class Main {
<<<<<<< HEAD
    public void main(String[] args){
       
=======
    public void main(String[] args) throws SQLException {
        Connection con1 = DBConnection.getConnection();
        TicketDAO dao1 = new TicketDAO(con1);
        Menu menu1 = new Menu();
        menu1.afficherMenu(dao1);
>>>>>>> fa3186c (update ticketdao class)
    }
}


