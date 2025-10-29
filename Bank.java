import java.awt.*;
import java.awt.event.*;
public class Bank implements ActionListener{
    Label l,l1,l2,l3,l4,l5,l6,l7;
    Button b1,b2,b3,b4,b5,b6;
    Frame f=new Frame("Bank Management System");
    public Bank(){
       Font a=new Font("Arial",Font.BOLD,32);
       Font b=new Font("Arial",Font.BOLD,28);
       l=new Label("BANK MANAGEMENT SYSTEM");
       l.setBounds(440,0,500,100);
       l.setFont(a);       
       l1=new Label("MENU");
       l1.setBounds(640,80,100,100);
       l1.setFont(b);
       f.add(l1);
       l2=new Label("1.PERSONAL DETAIL:==>");
       l2.setBounds(450,150,370,100);
       l2.setFont(b);
       b1=new Button("CLICK HERE!!!");
       b1.setBounds(820, 175, 160, 45);
       l3=new Label("2.CHECK  BALANCE:==>");
       l3.setBounds(450,225,370,100);
       l3.setFont(b);
       b2=new Button("CLICK HERE!!!");
       b2.setBounds(820, 250, 160, 45);
       l4=new Label("3.WITHDRAWAL:==>");
       l4.setBounds(450,300,370,100);
       l4.setFont(b);
       b3=new Button("CLICK HERE!!!");
       b3.setBounds(820, 325, 160, 45);
        l5=new Label("4.DEPOSIT MONEY:==>");
       l5.setBounds(450,375,370,100);
       l5.setFont(b);
       b4=new Button("CLICK HERE!!!");
       b4.setBounds(820, 400, 160, 45);
       l7=new Label("5.UPDATE DETAILS:==>");
       l7.setBounds(450,450,370,100);
       l7.setFont(b);
       b6=new Button("CLICK HERE!!!");
       b6.setBounds(820, 475, 160, 45);
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b6.addActionListener(this);
       f.add(l);
       f.add(l2);
       f.add(b1);
       f.add(l3);
       f.add(b2);
       f.add(l4);
       f.add(b3);
       f.add(l5);
       f.add(b4);
       f.add(l7);
       f.add(b6);
       l.setForeground(Color.WHITE);
       l2.setForeground(Color.WHITE);
       l3.setForeground(Color.WHITE);
       l4.setForeground(Color.WHITE);
       l5.setForeground(Color.WHITE);
       l7.setForeground(Color.WHITE);
       b1.setForeground(Color.WHITE);
       b2.setForeground(Color.WHITE);
       b3.setForeground(Color.WHITE);
       b4.setForeground(Color.WHITE);
       b6.setForeground(Color.WHITE);
       b1.setBackground(Color.BLACK);
       b2.setBackground(Color.BLACK);
       b3.setBackground(Color.BLACK);
       b4.setBackground(Color.BLACK);
       b6.setBackground(Color.BLACK);
       f.setBackground(Color.BLACK);
       f.setSize(1500,1500);
       f.setLayout(null);
       f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            personal_detail pd=new personal_detail();
        }
        else if(e.getSource()==b2){
            curr_bal c=new curr_bal();
            }
        else if(e.getSource()==b3){
            withdrawl b=new withdrawl();   
        }
        else if(e.getSource()==b4){
            deposit d=new deposit();
        }

        else if(e.getSource()==b6){
            update u=new update();
        }
    }
    public static void main(String[] args) {
    Bank obj=new Bank();    
    }
}