/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_123220195;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LoginPage extends JFrame implements ActionListener {
    
    JLabel headersatu = new JLabel("Selamat Datang!");
    JLabel infosatu = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JLabel jk = new JLabel("Jenis Kelamin");
    
    JTextField inputusername = new JTextField();
    JPasswordField inputpassword = new JPasswordField();
    
    JRadioButton jklaki = new JRadioButton("Laki-Laki", true);
    JRadioButton jkperempuan = new JRadioButton("Perempuan");
    
    JButton loginbutton = new JButton("Login");
    
    LoginPage(){
        
        setVisible(true);
        setSize(560, 550); 
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(null);
        
        add(headersatu);
        headersatu.setFont(new Font("arial", Font.BOLD, 19));
        headersatu.setBounds(25,25,150,35);
        
        add(infosatu);
        infosatu.setFont (new Font("arial", Font.BOLD, 13));
        infosatu.setBounds(25,50,250,35);
        
        add(username);
        username.setBounds(25,80,150,35);
        
        add(password);
        password.setBounds(25,140,150,35);
        
        add(jk);
        jk.setBounds(25,200,150,35);
        
        add(inputusername);
        inputusername.setBounds(25,110,435,25);
        
        add(inputpassword);
        inputpassword.setBounds(25,170,435,25);
        
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(jklaki);
        pilihJenisKelamin.add(jkperempuan);
        
        add(jklaki);
        jklaki.setBounds(25, 225, 100, 25);
        
        add(jkperempuan);
        jkperempuan.setBounds(200, 225, 100, 25);
        
        add(loginbutton);
        loginbutton.setBounds(15, 275, 455, 35);
        loginbutton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String user = inputusername.getText();
            String password = inputpassword.getText();
            
            String jeniskelamin = jklaki.isSelected() ? "Mr. " : "Mrs. ";
             
            if (user.isEmpty() && password.isEmpty()){
                throw new Exception("Username dan Password Tidak Boleh Kosong!");
            } else if (user.isEmpty()){
                throw new Exception("Username Tidak Boleh Kosong!");
            } else if (password.isEmpty()){
                throw new Exception("Password Tidak Boleh Kosong!");
            }
            
                        new HalamanUtama(user, jeniskelamin);
            this.dispose();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
        
    }
  
}
