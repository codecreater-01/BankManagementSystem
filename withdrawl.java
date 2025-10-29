import java.util.*;
import javax.swing.plaf.ButtonUI;
import java.awt.*;
import java.awt.event.*;
public class withdrawl implements ActionListener{
    static Scanner sc=new Scanner(System.in);
    Button b0;
    TextField tt1,tf2;
    Label ll,ll1,ll2,ll3,ll4;
     public withdrawl(){
        Frame f=new Frame("Withrawal Money");
        Font A = new Font("Arial",Font.BOLD,36);
        Font B = new Font("Arial",Font.BOLD,30);
        Font C=new Font("Arial",Font.BOLD,24);
        Font D=new Font("Arial",Font.BOLD,15);
        Label l10=new Label("WITHDRAW MONEY");
        l10.setBounds(550,0,500,100);
        l10.setFont(A);

        Button b1=new Button("SUBMIT");
        b0=new Button("MAIN MENU!!!");
        b0.setBounds(20, 45, 130, 50);
        b0.setFont(D);
        ll1=new Label("ACCOUNT NO :===>"+sqld.accno);
        ll1.setFont(B);
        ll2=new Label("AMOUNT TO BE WITHDRAWN:===>");
        tt1=new TextField();
        ll3=new Label();
        ll4=new Label();
        
        ll1.setBounds(350,150,450,100);
        
        ll2.setBounds(350,250,530,100);
        ll2.setFont(B);
        tt1.setBounds(890,270,400,50);
        tt1.setFont(B);
        ll3.setBounds(350,470,800,100);
        ll4.setBounds(350,570,800,100);
        b1.setBounds(650,370,100,50);
        b1.setFont(D);
        ll3.setFont(C);
        ll4.setFont(C);
        b1.addActionListener(this);
        b0.addActionListener(this);
        f.add(b0);
        f.add(l10);
        f.add(ll1);
        f.add(ll2);
        f.add(tt1);
        f.add(b1);
        f.add(ll3);
        f.add(ll4);
        l10.setForeground(Color.WHITE);
        ll1.setForeground(Color.WHITE);
        ll2.setForeground(Color.WHITE);
        ll3.setForeground(Color.WHITE);
        ll4.setForeground(Color.WHITE);
        b0.setForeground(Color.WHITE);
        b1.setForeground(Color.WHITE);
        b0.setBackground(Color.BLACK);
        b1.setBackground(Color.BLACK);
        f.setBackground(Color.BLACK);
        f.setSize(1500,1500);
        f.setLayout(null);
        f.setVisible(true);
        
}
public void actionPerformed(ActionEvent e){
    if(e.getSource()==b0){
        Bank back=new Bank();
    }
    String sr=tt1.getText();
    int n=Integer.parseInt(sr);
    if((sqld.bal)-n<0){
        ll3.setText("INSUFFICIENT BALANCE");
        ll4.setText("CURRENT BALANCE:Rs-"+sqld.bal);
        
        
    }
    else{
         
         ll3.setText("MONEY IS WITHDRAWN:Rs-"+n);
         int f=(sqld.bal)-n;
         ll4.setText("CURRENT BALANCE:Rs-"+f);
        f=f+n/2;
        sqld.bal=f;
         
    }
}
    public static void main(String[] args) {
        withdrawl w=new withdrawl();
    }
}