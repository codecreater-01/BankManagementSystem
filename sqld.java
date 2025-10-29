import java.util.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class sqld {
    static int pin,bal;
    static String accno,name,DOB,add;
public static void main(String[] args) throws IOException{
Scanner sc=new Scanner(System.in);
accno=sc.nextLine();
// TODO Auto-generated method stub
try {
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shivam","root","12345");
PreparedStatement stmt=(PreparedStatement)con.prepareStatement("select * from pdetails where aacno=?");
stmt.setString(1,accno);

ResultSet rs=stmt.executeQuery();
while(rs.next()){
pin=rs.getInt(2);
name=rs.getString(3);
add=rs.getString(4);
DOB=rs.getString(5);
bal=rs.getInt(6);
login l=new login();
}
}catch(Exception e) {}
}
}
