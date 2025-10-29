import java.io.IOException;
import java.sql.*;
public class xyz {
    public xyz()throws IOException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shivam", "root", "12345");
            PreparedStatement stmt=(PreparedStatement)con.prepareStatement("update pdetails set name=?,pin=?,address=?,bal=? where aacno=?");
            stmt.setString(5,sqld.accno);
            stmt.setInt(2,sqld.pin);
            stmt.setString(1,sqld.name);
            stmt.setString(3,sqld.add);
            stmt.setInt(4,sqld.bal);
            int j=stmt.executeUpdate();
            System.out.println(j+"\n record affected");
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)throws IOException {
        xyz obj=new xyz();
    }
    
}
