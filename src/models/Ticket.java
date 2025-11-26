package models;

import java.sql.*;
import java.util.Scanner;
import utils.DBConnection;

public class Ticket {
    Scanner input = new Scanner(System.in);
    private static int nextId=1;
    private int ticketId;
    private float prix;
    private int spectateurId;
    private int seanceId;

    public Ticket(float prix, int spectateurId ,int seanceId){
        this.ticketId = nextId++;
        this.spectateurId = spectateurId;
        this.seanceId = seanceId;
        this.prix = prix;
    }

    public int getSpectateurId() {
        return spectateurId;
    }

    public int getSeanceId() {
        return seanceId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String afficherTicket() {
        return "Ticket{" +
                "ticketId=" + this.getTicketId() +
                ", prix=" + this.getPrix() +
                '}';
    }
}
