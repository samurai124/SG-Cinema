import java.sql.*;




        class Main {
            static final String DB_URL = "jdbc:mysql://localhost:3306/ sg_cinema";

            static final String USER = "root";
            static final String PASS = "ASMA123@";

            public static void main(String[] args) {
                Connection conn = null;
                Statement stat = null;
                try {
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    System.out.println("connection en DB ");
                    stat = conn.createStatement();
                    String sql = "SELECT * FROM Films";
                    ResultSet rs = stat.executeQuery(sql);
                    while (rs.next()) {
                        int idFilm = rs.getInt("idFilm");
                        String titre = rs.getString("titre");
                        String duree = rs.getString("duree");
                        String categorie = rs.getString("categorie");
                        System.out.println("idFilm :     " + idFilm + ",titre :    " + titre + ",duree:    " + duree + "categorie:   " + categorie);
                    }

                    } catch(Exception e){
                        e.printStackTrace();
                    }finally{
                        try {
                            if (stat != null) stat.close();
                            if (conn != null) conn.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }



