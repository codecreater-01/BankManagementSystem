import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class deposit implements ActionListener{
    static Scanner sc=new Scanner(System.in);
    Button b0;
    TextField T1;
    Label ll1,l21,l23,l31,l32;
    Button b22;
    public deposit (){
       Font a1=new Font("Arial",Font.BOLD,32);
       Font b1=new Font("Arial",Font.BOLD,28);
       Font c1=new Font("Arial",Font.BOLD,20);
       Font d=new Font("Arial",Font.BOLD,15);
       Frame f=new Frame("DEPOSIT YOUR MONEY");
       b0=new Button("MAIN MENU!!!");
       b0.setBounds(20, 45, 130, 50);
       l21=new Label("DEPOSIT MONEY");
       l21.setBounds(550,0,500,100);
       l21.setFont(a1);
       ll1=new Label("ACCOUNT NO :===>"+sqld.accno);
       ll1.setBounds(300,100,800,100);
       ll1.setFont(b1);
       l23=new Label("AMOUNT TO BE DEPOSITED:===>");
       l23.setBounds(300,200,460,100);
       l23.setFont(b1);
       T1=new TextField();
       T1.setBounds(790, 225, 300, 40);
       T1.setFont(b1);
       l32=new Label();
       l32.setBounds(300,400,400,50);
       l32.setFont(c1);
       l31=new Label();
       l31.setBounds(300,450,400,100);
       l31.setFont(c1);
       b22=new Button("SUBMIT!!!");
       b22.setBounds(550, 300, 150, 45);
       //b22.setBackground(Color.green);
       b22.addActionListener(this);
       b22.setFont(d);
       b0.addActionListener(this);
       b0.setFont(d);
       f.add(b0);
       f.add(l21);
       f.add(ll1);
       f.add(l23);
       f.add(T1);
       f.add(b22);
       f.add(l32);
       f.add(l31);
       l21.setForeground(Color.WHITE);
       ll1.setForeground(Color.WHITE);
       l23.setForeground(Color.WHITE);
       l32.setForeground(Color.WHITE);
       l31.setForeground(Color.WHITE);
       b0.setForeground(Color.WHITE);
       b22.setForeground(Color.WHITE);
       b0.setBackground(Color.BLACK);
       b22.setBackground(Color.BLACK);
       f.setBackground(Color.BLACK);
       f.setSize(1500,1500);
       f.setLayout(null);
       f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b0){
            Bank back=new Bank();
        }
        if(e.getSource()==b22){
        String str=T1.getText();
        int n=Integer.parseInt(str);
        sqld.bal=sqld.bal+n;
        if(e.getSource()==b22){
        l32.setText("BALANCE UPDATED SUCCESSFULLY");
        }
        }
    }    
    public static void main(String[] args) {
    deposit obj=new deposit();    
    }
}






















