package models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticket {
    Scanner input = new Scanner(System.in);
    private static int nextId=1;
    private int ticketId;
    private float prix;
    private int spectateurId;
    private int seanceId;


    public Ticket(float prix,int spectateurId,int seanceId){
        this.ticketId = nextId++;
        this.prix = prix;
        this.spectateurId = spectateurId;
        this.seanceId = seanceId;

    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getSpectateurId() {
        return spectateurId;
    }

    public void setSpectateurId(int spectateurId) {
        this.spectateurId = spectateurId;
    }

    public int getSeanceId() {
        return seanceId;
    }

    public void setSeanceId(int seanceId) {
        this.seanceId = seanceId;
    }

}
