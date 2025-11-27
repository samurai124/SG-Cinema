import java.sql.SQLException;
import java.util.Scanner;
import dao.TicketDAO;
import models.Ticket;

public class Menu {

    public Menu(){

    }
    public void afficherMenu(TicketDAO dao) throws SQLException {
        int choix;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("=== Menu tickets table ===");
            System.out.println("1. Add ticket");
            System.out.println("2. Show all tickets");
            System.out.println("3. Show ticket by id");
            System.out.println("4. Show tickets created in this session");
            System.out.println("5. Delete ticket");
            System.out.println("0. Exit");
            System.out.print("Enter you choice :");
            choix = input.nextInt();

            switch(choix){
                case 1:
                    System.out.println("Enter the price :");
                    float prix = input.nextFloat();
                    System.out.println("Enter the spectateur id :");
                    int spectateurId = input.nextInt();
                    System.out.println("Enter the seance id:");
                    int seanceId = input.nextInt();
                    Ticket t1 = new Ticket(prix,spectateurId,seanceId);
                    dao.getTickets().add(t1);
                    dao.addTicket(prix,spectateurId,seanceId);
                    break;
                case 2:
                    dao.getAllTickets();
                    break;
                case 3:
                    System.out.print("Enter the ticket id :");
                    int id = input.nextInt();
                    dao.getTicketById(id);
                    break;
                case 4:
                    dao.afficherTickets();
                    break;
                case 5:
                    System.out.println("Enter ticket id that you want to delete :");
                    id = input.nextInt();
                    dao.deleteTicket(id);
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("incorrect choice");
            }
        }while (choix != 0);

    }
}
