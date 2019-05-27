import java.sql.*;

public class DataAccess {

    public void kifuInsert(int SenteP,String SenteK,int GoteP,String GoteK){
        // TODO Auto-generated method stuba
        Connection conn = null;
        Statement stmt = null;

        String dbURL = "jdbc:mariadb://localhost/shogi";
        String user = "root";
        String password = "root";

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            System.out.print("Connecting to DB...");
            conn = DriverManager.getConnection(
                    dbURL, user, password);
            System.out.println("done.");

            stmt = conn.createStatement();
            String sql = "INSERT INTO kifu(SenteP,SenteK,GoteP,GoteK) VALUES("
                            + SenteP + "," + SenteK + "," + GoteP + "," + GoteK + ")";

            int num = stmt.executeUpdate(sql);

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Good bye!");
    }
}


