package Vki;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Vki extends JFrame implements ActionListener  {
	Image img1=new ImageIcon(this.getClass().getResource("1.jpg")).getImage();
	Image img2=new ImageIcon(this.getClass().getResource("2.png")).getImage();
	Image img3=new ImageIcon(this.getClass().getResource("3.png")).getImage();
	Image img4=new ImageIcon(this.getClass().getResource("4..png")).getImage();
	Image img5=new ImageIcon(this.getClass().getResource("5.png")).getImage();
	Image img6=new ImageIcon(this.getClass().getResource("6.png")).getImage();

	Border border= BorderFactory.createLineBorder(Color.black, 3);
	JButton jb;
	JLabel jl1,jl2,jl3,jl4,jl5;
	JTextField jt1, jt2;
	
	
	Vki(){
		super("Vücut Kitle Ýndeksi");
		jb=new JButton("Hesapla");
		jb.setBounds(120, 240, 180, 70);
		this.add(jb);
		jb.addActionListener(this);
		
		jt1= new JTextField("");
		jt1.setBounds(120,50 ,180, 70);
		this.add(jt1);
		
		jt2= new JTextField("");
		jt2.setBounds(120,140 ,180, 70);
		this.add(jt2);
		
		jl1=new JLabel("Vücut Kitle Endeksi:");
		jl1.setBounds(120, 325, 180, 70);
		this.add(jl1);
		
		jl2=new JLabel("");
		jl2.setBounds(350, 50, 350, 350);
		this.add(jl2);
		jl2.setIcon(new ImageIcon(img1));
		jl2.setOpaque(true);
		jl2.setBorder(border);
		
		jl3= new JLabel("Sonuc: ");
		jl3.setBounds(120, 380, 180, 70);
		this.add(jl3);
		
		jl4=new JLabel("Kilo(kg):");
		jl4.setBounds(50, 50, 60, 70);
		this.add(jl4);
		
		jl5=new JLabel("Boy(cm):");
		jl5.setBounds(50, 140, 60, 70);
		this.add(jl5);
		
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(500, 200 , 800, 500);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		Vki obj= new Vki();
	}

	public void actionPerformed(ActionEvent e) {
		double kilo=Double.parseDouble(jt1.getText());
		double boy=Double.parseDouble(jt2.getText())/100;
		
		double sonuc= kilo/Math.pow(boy,2);
		jl1.setText("Vücut Kitle Endeksi:  " +sonuc);
		if(sonuc<=18.5) {
			jl3.setText("Sonuç: Zayýf");
			jl2.setIcon(new ImageIcon(img6));
		}
		else if(sonuc>18.5 && sonuc<=24.9) {
			jl3.setText("Sonuç: Normal");
			jl2.setIcon(new ImageIcon(img2));
		}
		else if(sonuc>24.9 && sonuc<=29.9) {
			jl3.setText("Sonuç: Kilolu");
			jl2.setIcon(new ImageIcon(img5));
		}
		else if(sonuc>29.9 && sonuc<=39.9) {
			jl3.setText("Sonuç: Aþýrý Kilolu");
			jl2.setIcon(new ImageIcon(img3));
		}
		else if(sonuc>39.9) {
			jl3.setText("Sonuç: Obez");
			jl2.setIcon(new ImageIcon(img4));
		}
	}

}
