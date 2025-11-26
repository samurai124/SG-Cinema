import java.sql.SQLException;
import java.util.Scanner;
import dao.TicketDAO;
import models.Ticket;
public class Menu {
    public float prix;
    public Menu(){

    }
    public void afficherMenu(TicketDAO ticketDAO) throws SQLException {
        int choix;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("=== Menu tickets table ===");
            System.out.println("1. Add ticket");
            System.out.println("2. Show all tickets");
            System.out.println("0. Exit");
            System.out.print("Enter you choice :");
            choix = input.nextInt();

            switch(choix){
                case 1:
                    ticketDAO.addTicket();
                    break;
                case 2:
                    ticketDAO.getAllTickets();
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("incorrect choice");
            }
        }while (choix != 0);

    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
