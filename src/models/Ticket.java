package models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticket {
    Scanner input = new Scanner(System.in);
    private int ticketId;
    private float prix;
    private int spectateurId;
    private int seanceId;


    public Ticket(int ticketId,float prix,int spectateurId,int seanceId){
        this.ticketId = ticketId;
        this.prix = prix;
        this.spectateurId = spectateurId;
        this.seanceId = seanceId;

    }

    public int getTicketId() {
        return ticketId;
    }

    public float getPrix() {
        return prix;
    }

    public int getSpectateurId() {
        return spectateurId;
    }

    public int getSeanceId() {
        return seanceId;
    }
}
