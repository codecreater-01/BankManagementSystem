import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.util.*;
public class curr_bal implements ActionListener{
    static Scanner sc=new Scanner(System.in);
    Frame f=new Frame("CURRENT BALANCE");
    Button b0;
    Label ll,ll1,ll3;
     public curr_bal(){
        Font a=new Font("Arial",Font.BOLD,32);
        Font b=new Font("Arial",Font.BOLD,28);
        Font c=new Font("Arial",Font.BOLD,15);
        ll=new Label("CURRENT BALANCE");
        ll.setBounds(550,00,400,100);
        ll.setFont(a);
        ll1=new Label("1.ACCOUNT NUMBER:==> "+sqld.accno);
        ll1.setBounds(300,150,800,50);
        ll1.setFont(b);
        ll3=new Label("2.CURRENT BALANCE:===> "+(sqld.bal));
        ll3.setBounds(300,250,500,50);
        ll3.setFont(b);
        b0=new Button("MAIN MENU!!!");
        b0.setBounds(20, 45, 130, 50);
        b0.setFont(c);
        b0.addActionListener(this);
        f.add(b0);
        f.add(ll);
        f.add(ll1);
        f.add(ll3);
        ll.setForeground(Color.WHITE);
        ll1.setForeground(Color.WHITE);
        ll3.setForeground(Color.WHITE);
        b0.setForeground(Color.WHITE);
        b0.setBackground(Color.BLACK);
        f.setBackground(Color.BLACK);
        f.setSize(1500,1500);
        f.setLayout(null);
        f.setVisible(true);
        
}
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b0){
          Bank back=new Bank();
          try {
            xyz o=new xyz();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        }
    }

    public static void main(String[] args)throws IOException {
        curr_bal w=new curr_bal();
    }
}