import java.util.ArrayList;
import java.util.List;
public class Film {
     private int idFilm;
     private String titre ;
     private   String duree;
     private String categorie;


    public Film(int idFilm, String titre, String duree, String categorie) {
        this.idFilm = idFilm;
        this.titre = titre;
        this.duree = duree;
        this.categorie = categorie;

    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

}
