/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_123220195;

import BangunDatar.Balok;
import BangunDatar.Persegi;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HalamanUtama extends JFrame implements ActionListener{
    
    JLabel headerdua = new JLabel();
    JLabel infodua = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasil = new JLabel("Hasil");
    JLabel Lpersegi = new JLabel("Luas Persegi");
    JLabel Kelpersegi = new JLabel("Keliling Persegi");
    JLabel Volbalok = new JLabel("Volume Balok");
    JLabel LPbalok = new JLabel("Luas Permukaan Balok");
    JLabel hasilLpersegi = new JLabel("[Hasil berupa angka]");
    JLabel hasilKelpersegi = new JLabel("[Hasil berupa angka]");
    JLabel hasilVolbalok = new JLabel("[Hasil berupa angka]");
    JLabel hasilLPbalok = new JLabel("[Hasil berupa angka]");
    
    
    JTextField Panjang = new JTextField();
    JTextField Lebar = new JTextField();
    JTextField Tinggi = new JTextField();
    
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    
    HalamanUtama(String user, String jeniskelamin){
        
        setVisible(true);
        setSize(560, 550); 
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(null);
        
        add(headerdua);
        headerdua.setFont(new Font("arial", Font.BOLD, 19));
        headerdua.setBounds(25,25,310,35);
        headerdua.setText("Welcome, " + jeniskelamin + user);
        
        add(infodua);
        infodua.setFont(new Font("arial", Font.BOLD, 13));
        infodua.setBounds(25,50,400,35);
        
        add(panjang);
        panjang.setBounds(25,100,50,15);
        
        add(lebar);
        lebar.setBounds(25,140,50,15);
        
        add(tinggi);
        tinggi.setBounds(25,180,50,15);
        
        add(hasil);
        hasil.setBounds(241,330,50,15);
        
        add(Lpersegi);
        Lpersegi.setBounds(25,360,100,15);
        
        add(hasilLpersegi);
        hasilLpersegi.setBounds(195,360,150,15);
        
        add(Kelpersegi);
        Kelpersegi.setBounds(25,385,100,15);
        
        add(hasilKelpersegi);
        hasilKelpersegi.setBounds(195,385,150,15);
        
        add(Volbalok);
        Volbalok.setBounds(25,410,100,15);
        
        add(hasilVolbalok);
        hasilVolbalok.setBounds(195,410,150,15);
        
        add(LPbalok);
        LPbalok.setBounds(25,435,150,15);
        
        add(hasilLPbalok);
        hasilLPbalok.setBounds(195,435,150,15);
        
        add(Panjang);
        Panjang.setBounds(150,95,335,30);
        
        add(Lebar);
        Lebar.setBounds(150,135,335,30);
        
        add(Tinggi);
        Tinggi.setBounds(150,175,335,30);
        
        add(hitung);
        hitung.setBounds(25,230,460,35);
        hitung.addActionListener(this);
        
        add(reset);
        reset.setBounds(25,275,460,35);
        reset.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hitung){
        double panjang = Double.parseDouble(Panjang.getText());
        double lebar = Double.parseDouble(Lebar.getText());
        double tinggi = Double.parseDouble(Tinggi.getText());
        
        Persegi bangun1 = new Persegi(panjang, lebar);
        Balok bangun2 = new Balok(panjang, lebar, tinggi);
        
        String hasilluas = String.valueOf(bangun1.luas());
        String hasilkeliling = String.valueOf(bangun1.keliling());
        String hasilvolume = String.valueOf(bangun2.volume());
        String hasilluaspermukaan = String.valueOf(bangun2.luaspermukaan());
        
        hasilLpersegi.setText(hasilluas);
        hasilKelpersegi.setText(hasilkeliling);
        hasilVolbalok.setText(hasilvolume);
        hasilLPbalok.setText(hasilluaspermukaan);
        } else if (e.getSource() == reset){
            
            Panjang.setText("");
            Lebar.setText("");
            Tinggi.setText("");
            
            hasilLpersegi.setText("[Hasil berupa angka]");
            hasilKelpersegi.setText("[Hasil berupa angka]");
            hasilVolbalok.setText("[Hasil berupa angka]");
            hasilLPbalok.setText("[Hasil berupa angka]");
        }
        
    }
    
}
