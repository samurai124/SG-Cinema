
import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost:3306 /sg_cinema";
    static final String USER = "root";
    static final String PASS = "ASMA123@";


    public static void main(String[] args) {
       Connection conn =null;
       Statement stmt=null;
      try{
          conn=DriverManager.getConnection(DB_URL,USER,PASS);
          stmt=conn.createStatement();
          String sql="SELECT* FROM FILMS";
          ResultSet rs=stmt.executeQuery(sql);
          while (rs.next()){
              int idFilms=rs.getInt("idFilms");
          String titre=rs.getString("titre");
          String duree =rs.getString("duree");
          String categorie=rs.getString("categorie");
              System.out.println("idFilms:  "+idFilms+",titre:  "+titre+",duree:  "+duree+",categorie:   "+categorie);

          }
      }catch (Exception e){
          e.printStackTrace();
      }finally {


      try {
          if (conn!=null)conn.close();
          if (stmt!=null)stmt.close();

        }catch (Exception e){
          e.printStackTrace();
      }



            }
        }
        }
