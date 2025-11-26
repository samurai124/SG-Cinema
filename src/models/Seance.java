package models;

//import Film.Film;

import dao.TicketDAO;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Seance {
    static int idgenerator = 1;
    private int seanceId ;
    private String dateSeance;
    private String horaire;
    private float prix ;
    private int capaciteMaximale;
    private String salle;
    private List<Spectateur>spectateurs = new ArrayList<>();
//    private Film film;

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Seance(String dateSeance, String horaire, float prx, int capaciteMaximale, String salle){
        this.seanceId = idgenerator++;
        this.dateSeance = dateSeance;
        this.horaire = horaire;
        this.prix = prx;
        this.capaciteMaximale = capaciteMaximale;
        this.salle = salle;
//        this.film = film;
    }
    public void addSpectateur(Spectateur spec) throws SQLException {
        if(spectateurs.size()>0){
            spectateurs.add(spec);
        } else {
            System.out.println("Tickets out of stock");
        }
        TicketDAO ticketDAO1 = new TicketDAO(DBConnection.getConnection());
//        Ticket ticket1 = new Ticket(this.seanceId,spec.getSpectateurId());
        ticketDAO1.addTicket();

    }

    public int getSeanceId() {
        return seanceId;
    }

    public void setSeanceId(int seanceId) {
        this.seanceId = seanceId;
    }

    public String getDateSeance() {
        return dateSeance;
    }

    public void setDateSeance(String dateSeance) {
        this.dateSeance = dateSeance;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public int getCapaciteMaximale() {
        return capaciteMaximale;
    }

    public void setCapaciteMaximale(int capaciteMaximale) {
        this.capaciteMaximale = capaciteMaximale;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

//    public Film getFilm() {
//        return film;
//    }
//
//    public void setFilm(Film film) {
//        this.film = film;
//    }
//    public void afficherFilm(){
//        System.out.printf("Film title : %s \nfilm duree : %s\nfilm categorie : %s\n",film.getTitre(),film.getDuree(),film.getCategorie());
    }

