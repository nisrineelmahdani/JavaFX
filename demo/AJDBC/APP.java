
import java.sql.*;

public class APP {
    public static void main(String[] args) {
        try{
            //database name: DB_CATAL
            Class.forName("com.mysql.jdbc.Driver"); // le pilot
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_CATAL","root","");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from PRODUITS");
            ResultSetMetaData rsmd = rs.getMetaData();// objet tres utilise quand on ne connait pas la stricture dun dun resultset il permet de savoir le nb de colonnesdu resultset, le nom,type,taille de chaque colonne
            for(int i = 1; i<=rsmd.getColumnCount();i++  )
                System.out.print(rsmd.getColumnName(i) + "\t");
                 while(rs.next()) {//next permet de passer d une ligna a l'autre
                    for(int i = 1; i<=rsmd.getColumnCount();i++  ){
                        System.out.print(rs.getString(i)+ "\t");// pour recuperer la valeure d'une colonne de la ligne courante du resuletset on utilise getString(colonne) or getInt
                        System.out.println();
                    }
                }catch(Exception e){
                    e.printStackTrace();
                 }
            }
        }
    }

