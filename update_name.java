import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
public class update_name implements ActionListener{
    Label l1,l2,l3;
    TextField t1;
    Button b0,b1;
    public update_name(){
    Frame f=new Frame("Update name");
    Font a=new Font("Arial",Font.BOLD,32);
    Font b=new Font("Arial",Font.BOLD,28);
    Font c=new Font("Arial",Font.BOLD,20);
    Font d=new Font("Arial",Font.BOLD,15);
    b0=new Button("BACK!!");
    b0.setBounds(20, 45, 130, 50);
    b0.setFont(d);
    l1=new Label("UPDATE NAME");
    l1.setBounds(550, 0, 400, 100);
    l1.setFont(a);
    l2=new Label("ENTER THE NAME:===>");
    l2.setBounds(350, 200, 350, 100);
    l2.setFont(b);
    t1=new TextField();
    t1.setBounds(700,220,300,50);
    t1.setFont(b);
    b1=new Button("SUBMIT!!!");
    b1.setBounds(600,350,150,50);
    b1.setFont(d);
    l3=new Label();
    l3.setBounds(350,500,500,100);
    l3.setFont(c);
    b1.addActionListener(this);
    b0.addActionListener(this);
    f.add(b1);
    f.add(b0);
    f.add(b0);
    f.add(l1);
    f.add(l2);
    f.add(t1);
    f.add(l3);
    l1.setForeground(Color.WHITE);
    l2.setForeground(Color.WHITE);
    l3.setForeground(Color.WHITE);
    b1.setForeground(Color.WHITE);
    b0.setForeground(Color.WHITE);
    b0.setBackground(Color.BLACK);
    b1.setBackground(Color.BLACK);
    f.setBackground(Color.BLACK);
    f.setSize(1500,1500);
    f.setLayout(null);
    f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b0){
            update u=new update();
        }
        if(e.getSource()==b1){
            l3.setText("YOUR CHANGES HAS BEEN SAVED SUCCESSFULLY!!!");
            sqld.name=t1.getText();
            try {
                xyz o=new xyz();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

        }
    }    
     public static void main(String[] args)throws IOException {
        update_name obj=new update_name();
     }    
}
