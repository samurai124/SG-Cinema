package dao;
import models.Ticket;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketDAO {
    Scanner input = new Scanner(System.in);
    private List<Ticket>tickets = new ArrayList<>();
    private Connection connection;
     public TicketDAO(Connection connection){
         this.connection = connection;
     }
    public void addTicket() throws SQLException {
        String addQuery = "INSERT INTO tickets(prix,spectateurId,seanceId) VALUES (?,?,?)";
      System.out.print("Enter the price :");
      float price = input.nextFloat();
        Ticket t1 = new Ticket(price,1,1);
        tickets.add(t1);
        PreparedStatement addStmt = connection.prepareStatement(addQuery);
        addStmt.setFloat(1, t1.getPrix() );
        addStmt.setInt(2, t1.getSpectateurId() );
        addStmt.setInt(3, t1.getSeanceId());
        int result = addStmt.executeUpdate();
        System.out.println(result + " records inserted");
    }

    public void getAllTickets() throws SQLException {
        String selectQuery = "SELECT * FROM tickets";
        Statement showStmt = connection.createStatement();
        ResultSet resultSet = showStmt.executeQuery(selectQuery);

        while (resultSet.next()) {
            int ticketId = resultSet.getInt("ticketId");
            float prix = resultSet.getFloat("prix");
            int spectateurId = resultSet.getInt("spectateurId");
            int seanceId = resultSet.getInt("seanceId");
            System.out.println("ID: " + ticketId + ", Prix : " + prix + ", spectateurId : " + spectateurId + ", seanceId : " + seanceId);
        }

    }
}
