package models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Spectateur {
    private static int nextId = 1;
    private final int spectateurId;
    private String nom;
    private String email;
    private List<Seance> seances;

    public Spectateur( String nom, String email) {
        this.spectateurId = nextId++;
        this.nom = nom;
        this.email = email;
        this.seances = new ArrayList<>();
    }


    public int getSpectateurId() {
        return spectateurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void reserver(Seance seance) throws SQLException {
        seances.add(seance);
        seance.addSpectateur(this);
    }
    //class Seance
    //void addSpectateur(Spectateur s){
    //  spectateurs.add(s); }

    public void ajouterSpectateurToDatabase(Spectateur spectateur) {
        String ajouter_spectateur_sql = "INSERT INTO spectateurs(spectateurId, nom, email) VALUES (?, ?, ?)";
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sg_cinema",
                    "root",
                    ""
            );
            PreparedStatement ps = con.prepareStatement(ajouter_spectateur_sql);
            ps.setInt(1, spectateur.getSpectateurId());
            ps.setString(2, spectateur.getNom());
            ps.setString(3, spectateur.getEmail());
            ps.executeUpdate();
            System.out.println("spectateur inserted successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getSpectateurFromDB() {
        String getspectateurs = "SELECT * FROM spectateurs";
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sg_cinema",
                    "root",
                    ""
            );
            PreparedStatement ps = con.prepareStatement(getspectateurs);
            ResultSet rs = ps.executeQuery();


            while (rs.next()) {
                System.out.println("Spectateur ID : " + rs.getInt("spectateurId"));
                System.out.println("Nom : " + rs.getString("nom"));
                System.out.println("Email : " + rs.getString("email"));
                System.out.println("---------------------------");
            }


            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
