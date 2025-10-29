import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class update implements ActionListener {
    Label l10,l11,l12,l13;
    Button b11,b12,b13,b0;
    public update(){
        Font A = new Font("Arial",Font.BOLD,36);
        Font B = new Font("Arial",Font.BOLD,30);
        Font C=new Font("Arial",Font.BOLD,15);
        Frame f = new Frame("Update your Details ");
        b0=new Button("MAIN MENU!!!");
        b0.setBounds(20, 45, 130, 50);
        b0.setFont(C);
        Label l10=new Label("DETAILS YOU CAN UPDATE");
        l10.setBounds(440,0,500,100);
        l10.setFont(A);
        Label l11=new Label("NAME : ");
        l11.setBounds(450,150,200,100);
        l11.setFont(B);
        b11=new Button("CLICK HERE_1");
        b11.setBounds(650,175,160,45);
        b11.setFont(C);
        Label l12=new Label("PIN : ");
        l12.setBounds(450,225,200,100);
        l12.setFont(B);
        b12=new Button("CLICK HERE_2");
        b12.setBounds(650,250,160,45);
        b12.setFont(C);
        Label l13=new Label("ADDRESS: ");
        l13.setBounds(450,300,200,100);
        l13.setFont(B);
        b13=new Button("CLICK HERE_3");
        b13.setBounds(650,325,160,45);
        b13.setFont(C);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b0.addActionListener(this);
        f.add(b0);
        f.add(l10);
        f.add(l11);
        f.add(l12);
        f.add(l13);
        f.add(b11);    
        f.add(b12);  
        f.add(b13);
        l10.setForeground(Color.WHITE);
        l11.setForeground(Color.WHITE);
        l12.setForeground(Color.WHITE);
        l13.setForeground(Color.WHITE);
        b0.setForeground(Color.WHITE);
        b11.setForeground(Color.WHITE);
        b12.setForeground(Color.WHITE);
        b13.setForeground(Color.WHITE);
        b0.setBackground(Color.BLACK);
        b11.setBackground(Color.BLACK);
        b12.setBackground(Color.BLACK);
        b13.setBackground(Color.BLACK);
        f.setBackground(Color.BLACK); 
        f.setSize(1500,1500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b0){
            Bank back=new Bank();
        }
        if(e.getSource()==b11){
            update_name obj1=new update_name();
        }
        if(e.getSource()==b12){
            update_pin obj2=new update_pin();
        }
        if(e.getSource()==b13){
            update_address obj3=new update_address();
        }
    }
    public static void main(String[] args) {
        update obj= new update();
    }    
}