
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import java.awt.event.KeyListener;


public class SystemController extends GUI implements ActionListener, KeyListener {

    
private    Random r1;
private int r2;
private int d;

Karte karte1 = null;
Karte karte2 = null;
Karte karte3 = null;
Karte karte4 = null;
Karte karte5 = null;
Karte karte6 = null;
Karte karte7 = null;
Karte karte8 = null;
Karte karte9 = null;
Karte karte10 = null;


String[] karte_Name = {
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",


};

String[] karte_Seltenheiten = {
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",


};

String[] karte_Damage = {
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",


};

String[] karte_HP = {
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",


};

String[] karte_Agility = {
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",


};

String[] karte_Element = {
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",


};

String[] karte_Ability = {
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",


};


String[] karte_ID = {
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",
    "1",


};

   // ArrayList<String> karte_Name = new ArrayList<>(); 

   // ArrayList<String> karte_Seltenheit = new ArrayList<>(); 

   // ArrayList<String> karte_Damage = new ArrayList<>(); 

   // ArrayList<String> karte_HP = new ArrayList<>(); 

   // ArrayList<String> karte_Agility = new ArrayList<>(); 

   // ArrayList<String> karte_Element = new ArrayList<>(); 

   // ArrayList<String> karte_ID = new ArrayList<>(); 

    SystemController() throws Exception{
        System.out.println(super.l.isVisible());
        frame.addKeyListener(input);
        sync_1.addActionListener(this);
        sync_2.addActionListener(this);
        sync_3.addActionListener(this);
        backB.addActionListener(this);
        searchB1.addActionListener(this);
        option_1.addActionListener(this);
        option_2.addActionListener(this);
option_3.addActionListener(this);
option_4.addActionListener(this);
option_5.addActionListener(this);
option_6.addActionListener(this);
searchB2.addActionListener(this);
searchB3.addActionListener(this);
searchB4.addActionListener(this);
confirmButton.addActionListener(this);
eRandomButton.addActionListener(this);
eSaveButton.addActionListener(this);
Thread.sleep(1000);
loading();
sync();



        while (user.angemeldet == true){
            if (confirmButton.getActionCommand() == "ConfirmCardRarity"){
                if (texarea.getText().length() < 1){
                    sec_Image.setVisible(false);
                }
                if (texarea.getText().length() > 0){
                    for (String r : arraysList.rar){
        System.out.println(r);
                            sec_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + texarea.getText().toString() + ".png").getImage().getScaledInstance(50, 45,Image.SCALE_AREA_AVERAGING)));
                            sec_Image.setVisible(true);                
                    break;
                       }
                    
                }
            }
        
            if (texarea.getText().length() >= 1 && confirmButton.getActionCommand() == "C"){
                int v = 0;
                
        
                if (searchB1.getText() == null) {
                    searchB1.setVisible(false);
                    searchB2.setVisible(false);
                    searchB3.setVisible(false);
                    searchB4.setVisible(false);
                }
        
            search_Box.setVisible(true);
            for (int a = 0; a< arraysList.search_Results.length;a++){
        
        
        
                for (int z = 0; z<arraysList.search_Results[a].length(); z++){
                    if (texarea.getText().length() > 0){
                        try {
        if (texarea.getText().charAt(v) == arraysList.search_Results[a].charAt(z)){
            searchB1.setVisible(true);
                    searchB1.setText(arraysList.search_Results[a]);
                    v++;
        
                    if (texarea.getText().charAt(v) == arraysList.search_Results[a].charAt(z +1)){
            searchB1.setVisible(true);
                    searchB1.setText(arraysList.search_Results[a]);
                    v++;
                    }
        
                    if (texarea.getText().charAt(v) == arraysList.search_Results[a].charAt(z +2)){
                        searchB1.setVisible(true);
                                searchB1.setText(arraysList.search_Results[a]);
                                v++;
        
                                }
                                
                                if (texarea.getText().charAt(v) == arraysList.search_Results[a].charAt(z +3)){
                                    searchB1.setVisible(true);
                                            searchB1.setText(arraysList.search_Results[a]);
                                            v++;
                                            }
        
                                            if (texarea.getText().charAt(v) == arraysList.search_Results[a].charAt(z +4)){
                                                searchB1.setVisible(true);
                                                        searchB1.setText(arraysList.search_Results[a]);
                                                        v++;
                                                        }
        
                    break;
        }
        
        
        } catch (Exception e) {
            //TODO: handle exception
        }
                    }
        
                    
                }
        
        
                try {
        
                if (texarea.getText().toString().equals(arraysList.search_Results[a])){
                    searchB1.setVisible(true);
                    searchB1.setText(arraysList.search_Results[a]);
                    search_Box.setBounds(800, 300, 250, 320);
                 //   searchB3.setVisible(false);
                  //  searchB4.setVisible(false);
        
                    if (searchB2.getText().toString() != searchB1.getText().toString()) searchB2.setVisible(true); 
                    if (searchB2.getText().toString() == searchB1.getText().toString()){
                        searchB2.setVisible(true);
                        search_Box.setBounds(800, 300, 250, 320);
                        d = 0;
                        for (int z = 0; z< arraysList.search_Results.length;z++){
                        if (!searchB1.getText().toString().equals(arraysList.search_Results[z])){   
                            d++;
                          if (texarea.getText().length() > 1)
                            if (texarea.getText().toString().charAt(0) == arraysList.search_Results[z].charAt(0) && texarea.getText().toString().charAt(1) == arraysList.search_Results[z].charAt(1) && !searchB1.getText().toString().equals(arraysList.search_Results[z])){   
                                if (!texarea.getText().toString().equals(arraysList.search_Results[z]))            
                                searchB2.setVisible(true);
                                searchB2.setText(arraysList.search_Results[z]);
                                search_Box.setBounds(800, 300, 250, 320);
                                break;
                            }
                        
                        }
                        }
                    }  
        
        
                    break;
                    
                }
        
            } catch (Exception e) {
                //TODO: handle exception
            }
                try {
                    if (Integer.parseInt(texarea.getText().toString()) == a && Integer.parseInt(texarea.getText().toString()) <8){
                        searchB1.setVisible(true);
                        searchB1.setText(arraysList.search_Results[a]);
                        search_Box.setBounds(800, 300, 250, 320);
                        searchB2.setVisible(false);
                        searchB3.setVisible(false);
                        searchB4.setVisible(false);
                    }
                } catch (Exception e) {
                    //TODO: handle exception
                }
                
        
        
                        
                        
                            
                            
                        
                    
        
                }
        
        
        
                
            }
        
        
        
            else{
                search_Box.setVisible(false);
                searchB1.setVisible(false);
                searchB2.setVisible(false);
                searchB3.setVisible(false);
                searchB4.setVisible(false);
        
            }
            Thread.sleep(1000);
        
            
        }
            }
        
            static public void loading() throws InterruptedException{
                int t1 = 12;
                Texts texts = new Texts();
                    for (int i = 1; i<61;i++){
                        Thread.sleep(t1);
                        l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png").getImage().getScaledInstance(500, 300, Image.SCALE_AREA_AVERAGING)));

            
                        if (i == 15){
                            t1 = 40;
                        }
            
                        if (i == 30){
                            t1 = 2;
                        }
            
                        if (i < 60){
                            l2.setText(texts.setTex(texts.loadingtex, i));

                        }
            
                        if (i > 60){
                            t1 = 0;
                        }
                        
                    }
            
                    int t2 = 0;
                    Thread.sleep(2000);
            
                    for (int c = 60; c<99;c+=2){
                        Thread.sleep(t2);
                        l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + c + ".png").getImage().getScaledInstance(500, 300, Image.SCALE_AREA_AVERAGING)));
            
                        if (c > 85){
            
                            t2 = 22;
                        }
                       
                        }
            
            
                        for (int t = 0; t <5;t++){
                            for (int i = 1; i<61;i+=3){
                                Thread.sleep(0);
                                l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png").getImage().getScaledInstance(500, 300, Image.SCALE_AREA_AVERAGING)));
                               
                            }
                        
                            for (int c = 60; c<99;c+=3){
                                Thread.sleep(0);
                                l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + c + ".png").getImage().getScaledInstance(500, 300, Image.SCALE_AREA_AVERAGING)));
                    
                               
                                }
                        }
            
            
                        l.setVisible(false);
                        l2.setVisible(false);

                        
            
            texarea.setVisible(true);
            confirmButton.setVisible(true);
            //randomButton.setVisible(false);
            infoText.setVisible(true);
            
            
                }

                public void clearBox(){
                    box2.removeAll();
                }

                public void addToBox(int i){
                    if (i == 1){
                        JLabel ei;


for (int e = 0; e < arraysList.rar.length; e++) {

    javax.swing.JButton elemB = new JButton();
    elemB.setForeground(new Color(80, 0, 255));
    elemB.setFont(new Font("Times new Roman", Font.PLAIN, 60));
    elemB.setBounds(0, 0, 0, 0);
    elemB.setBackground(Color.black);
    elemB.setVisible(true);
    elemB.setFocusable(false);
    elemB.addActionListener(this);
    elemB.setActionCommand(arraysList.rar[e]);
    elemB.setBorder(new LineBorder(Color.white));


    ei = new JLabel();
    ei.setFont(new Font("Times new Roman", Font.PLAIN, 30));
    ei.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + arraysList.rar[e] + ".png")
            .getImage().getScaledInstance(100, 95, Image.SCALE_AREA_AVERAGING)));
    ei.setSize(600, 600);
    ei.setBackground(Color.white);
    ei.setVisible(true);
    ei.setFocusable(false);
    ei.setBorder(new LineBorder(Color.white));


    box2.add(elemB);
    elemB.add(ei);


            }
        }
    }


                private void ret(){
                    if (confirmButton.getActionCommand().equals("ConfirmName")){
                        randomName();
                    }
                        }
                    
                    public void randomName(){
                            int x = (int) (Math.random() * 100);
                            if (x > 50){
                                 x = (int) (Math.random() * 100);
                                texarea.setText("");
                                for (int a = 1;a<4;a++){
                                    texarea.setText(texarea.getText() + texts.randomNames[x]);
                                     x = (int) (Math.random() * 100);
                    
                                }
                                return;
                            }
                    
                            if (x < 50){
                                x = (int) (Math.random() * 100);
                               texarea.setText("");
                               for (int a = 1;a<3;a++){
                                   texarea.setText(texarea.getText() + texts.randomNames[x]);
                                    x = (int) (Math.random() * 100);
                    
                               }
                    
                    
                               
                               x = (int) (Math.random() * 100); //  x Wird neu generiert (0-100)
                               if (x < 60) texarea.setText(texarea.getText() + x); //  60%, dass der Name eine Zufällige Zahl am Ende bekommt
                               return;
                            }
                    }
                    
                    private void anmelden(){
                        if (texarea.getText().length() > 4 && texarea.getText().length() <16){
                
                            if (texarea.getText().charAt(0) == '0' && user.password < 1){
                                infoText.setText("0 darf nicht am Anfang stehen");
                                return;
                            }
                            try{
                                if (user.password < 10000){
                                if (Integer.parseInt(texarea.getText().toString()) > 10000){
                                    dataStore.password = Integer.parseInt(texarea.getText().toString());
                                    user.password = Integer.parseInt(texarea.getText().toString());
                                    infoText.setText("Erfolgreich angemeldet");
                                    randomButton.setVisible(false);
                                    texarea.setVisible(false);
                                    confirmButton.setVisible(false);
                                    search_Box.setVisible(false);
                                    infoText.setVisible(false);
                                    dataStore.angemeldet = true;
                                    user.angemeldet = true;
                                    option_1.setVisible(true);
                                    option_1_Image.setVisible(true);
                                    option_2.setVisible(true);
                                    option_2_Image.setVisible(true);
                                    option_3.setVisible(true);
                                    option_3_Image.setVisible(true);
                                    option_4.setVisible(true);
                                    option_4_Image.setVisible(true);
                                    option_5.setVisible(true);
                                    option_5_Image.setVisible(true);
                                    option_6.setVisible(true);
                                    option_6_Image.setVisible(true);
                                }
                            }
            
            
                            if (user.password > 10000){
                               if(user.password == Integer.parseInt(texarea.getText().toString())){
                                infoText.setText("Erfolgreich angemeldet");
                                randomButton.setVisible(false);
                                texarea.setVisible(false);
                                confirmButton.setVisible(false);
                                search_Box.setVisible(false);
                                infoText.setVisible(false);
                                dataStore.angemeldet = true;
                                user.angemeldet = true;
                                option_1.setVisible(true);
                                option_1_Image.setVisible(true);
                                option_2.setVisible(true);
                                option_2_Image.setVisible(true);
                                option_3.setVisible(true);
                                option_3_Image.setVisible(true);
                                option_4.setVisible(true);
                                option_4_Image.setVisible(true);
                                option_5.setVisible(true);
                                option_5_Image.setVisible(true);
                                option_6.setVisible(true);
                                option_6_Image.setVisible(true);
                                }
            
                                if(user.password != Integer.parseInt(texarea.getText().toString())){
                                    infoText.setText("Password: Falsch");
                                    }
            
                            }
                            } catch (Exception d){
                                System.err.println("");
                            }
                            
                            
                        }
                    }

                    public void generateRarity(){
                        Random rd = new Random();
                        int rd2;
                        rd2 = rd.nextInt(10);
                        if (texarea.getText().equals(arraysList.rar[rd2])){
                            if (rd2 > 9){
                                rd2--;
                            }else{
                                rd2++;
                            }
                        }
                        
                            texarea.setText(arraysList.rar[rd2]);
                            try {
                                sec_Image.setVisible(true);
                                sec_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + texarea.getText() + ".png").getImage().getScaledInstance(50, 45,Image.SCALE_AREA_AVERAGING)));
                        
                            } catch(Exception x){
                                System.out.println(x.getStackTrace());
                            }
                    }
                    
                    public void generateNumber(int i, int v){
                        int x = i + (int) (Math.random() * (v));
                        texarea.setText("");
                            texarea.setText("" + x);
        
                    }


                private void confirmName(){
                    if (user.name != null){
                
                                    
                        if (!texarea.getText().toString().equals(user.name)){
                            infoText.setText("Name: Falsch");
                            }
        
                        if (texarea.getText().toString().equals(user.name)){
                        infoText.setText("Anmeldung: Passwort eingeben (5-10 Charakter)");
                        confirmButton.setActionCommand("ConfirmPassword");
                        eRandomButton.setActionCommand("GenerateNumber");
                        texarea.setText(null);
                        if (user.password < 10000){
                            randomButton.setVisible(true);
                        }
                    }
        
                    }
        
                    if (texarea.getText().length() > 3 && texarea.getText().length() <21){
                        if (user.name == null){
                        dataStore.name = texarea.getText().toString();
                        user.name = texarea.getText().toString();
                        infoText.setText("Anmeldung: Passwort eingeben (5-10 Charakter)");
                        confirmButton.setActionCommand("ConfirmPassword");
                        eRandomButton.setActionCommand("GenerateNumber");
                        texarea.setText(null);
                        if (user.password < 10000){
                            randomButton.setVisible(true);
                        }
                    }
        
                     
                        
        
                    }
                }



                public void confirmCardName(){
                    if (texarea.getText().length() > 3 && texarea.getText().length() <21){
                        dataStore.temp_KarteName = texarea.getText();
                        texarea.setText(null);
                        randomButton.setVisible(true);
                        eRandomButton.setActionCommand("GenerateRarity");
                        confirmButton.setActionCommand("ConfirmCardRarity");
                        option_1.setVisible(false);
                        option_1_Image.setVisible(false);
                        option_2.setVisible(false);
                        option_2_Image.setVisible(false);
                        option_3.setVisible(false);
                        option_3_Image.setVisible(false);
                        option_4.setVisible(false);
                        option_4_Image.setVisible(false);
                        option_5.setVisible(false);
                        option_5_Image.setVisible(false);
                        option_6.setVisible(false);
                        option_6_Image.setVisible(false);
                        infoText.setVisible(true);
                        infoText.setText("Seltenheit Auswählen");
                        backB.setVisible(true);
                        backB.setActionCommand("option_1");
                        addToBox(1);  
                        box2.setVisible(true);
                        texarea.setEditable(false);
        
                    }
    
                    dataStore.temp_KarteSeltenheit = null;
                    dataStore.temp_KarteDamage = null;
                    dataStore.temp_KarteHP = null;
                    dataStore.temp_KarteAgility = null;
                    dataStore.temp_KarteElement = null;
                    dataStore.temp_KarteID = null;
                    dataStore.temp_KarteAbility = null;
    
    
                    
                }


                public void confirmCardRarity(){
                    if (texarea.getText().length() > 2 && texarea.getText().length() <16){
                        sec_Image.setVisible(false);
                                        dataStore.temp_KarteSeltenheit = texarea.getText();
                                        texarea.setText(null);
                                        randomButton.setVisible(true);
                                        eRandomButton.setActionCommand("GenerateDamage");
                                        confirmButton.setActionCommand("");
                                        option_1.setVisible(false);
                                        option_1_Image.setVisible(false);
                                        option_2.setVisible(false);
                                        option_2_Image.setVisible(false);
                                        option_3.setVisible(false);
                                        option_3_Image.setVisible(false);
                                        option_4.setVisible(false);
                                        option_4_Image.setVisible(false);
                                        option_5.setVisible(false);
                                        option_5_Image.setVisible(false);
                                        option_6.setVisible(false);
                                        option_6_Image.setVisible(false);
                                        infoText.setText("Damage eingeben (0-1000)");
                                        backB.setVisible(true);
                                        backB.setActionCommand("option_2");
                                        
                                        }
                }

                    public void option1_1(){
                        texarea.setText(null);
                        texarea.setVisible(true);
                        texarea.setEditable(true);
                        confirmButton.setVisible(true);
                        randomButton.setVisible(true);
                        eRandomButton.setActionCommand("RandomName");
                        confirmButton.setActionCommand("ConfirmCardName");
                        sec_Image.setVisible(false);
                        option_1.setVisible(false);
                        option_1_Image.setVisible(false);
                        option_2.setVisible(false);
                        option_2_Image.setVisible(false);
                        option_3.setVisible(false);
                        option_3_Image.setVisible(false);
                        option_4.setVisible(false);
                        option_4_Image.setVisible(false);
                        option_5.setVisible(false);
                        option_5_Image.setVisible(false);
                        option_6.setVisible(false);
                        option_6_Image.setVisible(false);
                        infoText.setVisible(true);
                        infoText.setText("Name eingeben (4-20 Charakter)");
                        backB.setVisible(true);
                        backB.setActionCommand("backB_0");
                        texarea.setText(dataStore.temp_KarteName);
                        box2.setVisible(false);
                        clearBox();
                    
                    
                        dataStore.temp_KarteName = null;
                        dataStore.temp_KarteSeltenheit = null;
                        dataStore.temp_KarteDamage = null;
                        dataStore.temp_KarteHP = null;
                        dataStore.temp_KarteAgility = null;
                        dataStore.temp_KarteElement = null;
                        dataStore.temp_KarteID = null;
                        dataStore.temp_KarteAbility = null;
                        
                    }
                    
                    
                    public void option1_2(){
                        texarea.setText(null);
                        texarea.setVisible(true);
                        texarea.setEditable(false);
                        confirmButton.setVisible(true);
                        randomButton.setVisible(true);
                        eRandomButton.setActionCommand("GenerateRarity");
                        confirmButton.setActionCommand("ConfirmCardRarity");
                        sec_Image.setVisible(false);
                        option_1.setVisible(false);
                        option_1_Image.setVisible(false);
                        option_2.setVisible(false);
                        option_2_Image.setVisible(false);
                        option_3.setVisible(false);
                        option_3_Image.setVisible(false);
                        option_4.setVisible(false);
                        option_4_Image.setVisible(false);
                        option_5.setVisible(false);
                        option_5_Image.setVisible(false);
                        option_6.setVisible(false);
                        option_6_Image.setVisible(false);
                        infoText.setVisible(true);
                        infoText.setText("Seltenheit Auswählen");
                        backB.setVisible(true);
                        backB.setActionCommand("option_1");
                        texarea.setText(dataStore.temp_KarteSeltenheit);
                        sec_Image.setVisible(true);
                    
                    
                        //dataStore.temp_KarteName = null;
                        dataStore.temp_KarteSeltenheit = null;
                        dataStore.temp_KarteDamage = null;
                        dataStore.temp_KarteHP = null;
                        dataStore.temp_KarteAgility = null;
                        dataStore.temp_KarteElement = null;
                        dataStore.temp_KarteID = null;
                        dataStore.temp_KarteAbility = null;
                        
                    }
                    

                    public void actionPerformed(java.awt.event.ActionEvent e){




                        if (e.getSource() == eRandomButton){

                            if (e.getActionCommand().equals("RandomName")){
                                randomName();                           
                            };
                            
                            if (e.getActionCommand().equals("GenerateNumber")){
                                r1 = new Random();
                                r2 = r1.nextInt(1000000);
                                generateNumber(10000, r2);
                            }

                            if (e.getActionCommand().equals("GenerateRarity")){        
                                generateRarity();                        
                            }

                            if (e.getActionCommand().equals("GenerateDamage")){        
                                r1 = new Random();
                                r2 = r1.nextInt(1000);
                                generateNumber(r2,1);                        
                            }

                        }

                        if (e.getSource() == confirmButton){

                            if (e.getActionCommand().equals("ConfirmName")){
                                confirmName();                           
                            }
                    
                            if (e.getActionCommand().equals("ConfirmPassword")){
                                anmelden();                           
                            }

                            if (e.getActionCommand().equals("ConfirmCardName")){
                                confirmCardName(); 
                            }
                
                            if (e.getActionCommand().equals("ConfirmCardRarity")){
                                confirmCardRarity();
                            }

                            if (e.getActionCommand().equals("ConfirmCardDamage")){
                                confirmCardRarity();
                            }
                
                        }
                

                
                
                        if (e.getSource() == backB || e.getSource() == option_1){
                            
                                if (e.getActionCommand().equals("option_1")){
                                    option1_1();               
                                }
                
                                if (e.getActionCommand().equals("option_2")){
                                        option1_2();
                
                                }
                
                        }
                            
                
                
                            if (e.getActionCommand().equals("backB_0")){
                                texarea.setText(null);
                                texarea.setVisible(false);
                                confirmButton.setVisible(false);
                                randomButton.setVisible(false);
                                option_1.setVisible(true);
                                option_1_Image.setVisible(true);
                                option_2.setVisible(true);
                                option_2_Image.setVisible(true);
                                option_3.setVisible(true);
                                option_3_Image.setVisible(true);
                                option_4.setVisible(true);
                                option_4_Image.setVisible(true);
                                option_5.setVisible(true);
                                option_5_Image.setVisible(true);
                                option_6.setVisible(true);
                                option_6_Image.setVisible(true);
                                infoText.setText("Erfolgreich angemeldet");
                                confirmButton.setActionCommand("");
                                eRandomButton.setActionCommand("");
                                backB.setVisible(false);
                
                                dataStore.temp_KarteName = null;
                                dataStore.temp_KarteSeltenheit = null;
                                dataStore.temp_KarteDamage = null;
                                dataStore.temp_KarteHP = null;
                                dataStore.temp_KarteAgility = null;
                                dataStore.temp_KarteElement = null;
                                dataStore.temp_KarteID = null;
                                dataStore.temp_KarteAbility = null;
                
                            }


                            for (String v : arraysList.rar) {
                                if (e.getActionCommand().equals(v)) {
                                    texarea.setText(v);
                                    sec_Image.setVisible(true);
                                    sec_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + texarea.getText().toString() + ".png").getImage().getScaledInstance(50, 45,Image.SCALE_AREA_AVERAGING)));                                                
                                }
                            }
                
                            if (e.getActionCommand().equals("SaveData")){
                                try{
                                    saveButton.setVisible(true);
                
                
                                    FileOutputStream f = new FileOutputStream("ver.dat");
                                    BufferedOutputStream b = new BufferedOutputStream(f);
                                    ObjectOutputStream o = new ObjectOutputStream(b);
                
                                    dataStore.name = user.name;
                                    dataStore.password = user.password;
                                    dataStore.angemeldet = user.angemeldet;
                                    dataStore.ver = true;
                                    dataStore.karte_Name = karte_Name;
                
                                    o.writeObject(dataStore);
                                    o.close();
                
                
                                    System.out.println(dataStore.name);
                                    System.out.println(dataStore.password);
                                } catch(IOException d) {
                                    d.printStackTrace();
                                }
                            }
                
                            if (e.getActionCommand().equals("LoadData")){
                                try{
                
                                    FileInputStream f2 = new FileInputStream("ver.dat");
                                    BufferedInputStream b2 = new BufferedInputStream(f2);
                                    ObjectInputStream obj2 = new ObjectInputStream(b2);
                
                                    DataStore dataStore =  (DataStore)obj2.readObject();
                
                
                                    user.name = dataStore.name;
                                    user.password = dataStore.password;
                                    user.angemeldet = dataStore.angemeldet;
                                    dataStore.ver = true;
                                    karte_Name = dataStore.karte_Name;
                
                                    obj2.close();
                
                                    System.out.println(user.name);
                                    System.out.println(user.password);
                                    System.out.println(user.angemeldet);
                                    System.out.println(karte_Name);
                                    System.out.println(karte_Name[0]);
                
                                    sync_Box.setVisible(false);
                                    sync_1.setVisible(false);
                                    sync_2.setVisible(false);
                                    sync_3.setVisible(false);
                                    sync_Text.setVisible(false);
                
                                    saveButton.setVisible(true);

                
                                } catch(IOException d) {
                                    d.printStackTrace();
                                } catch (ClassNotFoundException d2) {
                                    d2.printStackTrace();
                                }
                            }
                
                            
                            if (e.getActionCommand().equals("NoData")){
                                try{
                
                                    FileInputStream f2 = new FileInputStream("ver.dat");
                                    BufferedInputStream b2 = new BufferedInputStream(f2);
                                    ObjectInputStream obj2 = new ObjectInputStream(b2);
                
                
                                    
                                    obj2.close();
                
                                    sync_Box.setVisible(false);
                                    sync_1.setVisible(false);
                                    sync_2.setVisible(false);
                                    sync_3.setVisible(false);
                                    sync_Text.setVisible(false);
                                    saveButton.setVisible(true);
                                    randomButton.setVisible(true);

                                } catch(IOException d) {
                                    d.printStackTrace();
                                } 
                            }
                
                            if (e.getActionCommand().equals("DeleteData")){
                                try{
                
                                    FileOutputStream f = new FileOutputStream("ver.dat");
                                    BufferedOutputStream b = new BufferedOutputStream(f);
                                    ObjectOutputStream o = new ObjectOutputStream(b);
                
                                    dataStore.name = null;
                                    dataStore.password = 0;
                                    dataStore.angemeldet = false;
                                    dataStore.ver = false;
                                    dataStore.karte_Name = karte_Name;
                
                                    o.writeObject(dataStore);
                                    o.close();
                
                                    sync_Box.setVisible(false);
                                    sync_1.setVisible(false);
                                    sync_2.setVisible(false);
                                    sync_3.setVisible(false);
                                    sync_Text.setVisible(false);
                                    saveButton.setVisible(true);
                                    randomButton.setVisible(true);

                
                                } catch(IOException d) {
                                    d.printStackTrace();
                                }
                            }


                           
                        }
                        
                
                
                
                    public void sync() throws Exception{
                        try{
                
                            saveButton.setVisible(true);
                
                            FileInputStream f2 = new FileInputStream("ver.dat");
                            BufferedInputStream b2 = new BufferedInputStream(f2);
                            ObjectInputStream obj2 = new ObjectInputStream(b2);
                
                            DataStore dataStore =  (DataStore)obj2.readObject();
                
                
                            if (dataStore.ver == true){
                                System.out.println("Do you want to restore the data?");
                                sync_Box.setBounds(1000, 1100, 250, 145);
                                sync_1.setBounds(1020, 1170, 100, 30);
                                sync_2.setBounds(1132, 1170, 100, 30);
                                sync_3.setBounds(1020, 1210, 212, 30);
                                sync_Text.setBounds(1000, 1105, 250, 100);
                                
                                Thread.sleep(80);
                                
                                sync_Box.setVisible(true);
                                sync_1.setVisible(true);
                                sync_2.setVisible(true);
                                sync_Text.setVisible(true);
                                
                                for (int v = 0; v< 460; v++){
                                Thread.sleep(1);
                                sync_Box.setBounds(1000, 1100-v, 250, 145);
                                sync_1.setBounds(1020, 1170-v, 100, 30);
                                sync_2.setBounds(1132, 1170-v, 100, 30);
                                sync_3.setBounds(1020, 1210-v, 212, 30);
                                sync_Text.setBounds(1000, 1105-v, 250, 100);                
                                }
                                sync_Box.setVisible(true);
                                sync_1.setVisible(true);
                                sync_2.setVisible(true);
                                sync_Text.setVisible(true);
                            }
                
                
                            obj2.close();
                
                        } catch(IOException d) {
                            d.printStackTrace();
                        } catch (ClassNotFoundException d2) {
                            d2.printStackTrace();
                        }
                    }
                
                    @Override
                    public void keyTyped(KeyEvent k) {
                        System.out.println(k.getKeyChar());
                        switch(k.getKeyChar()){
                            case 10: ret();break;
                        }
                        
                    }
                
                    @Override
                    public void keyPressed(KeyEvent e) {
                        System.out.println(e.getKeyChar());
                        
                        switch(e.getKeyChar()){
                            case 10: ret();break;
                        }
                        
                    }
                
                    @Override
                    public void keyReleased(KeyEvent e) {
                        System.out.println(e.getKeyChar());
                        switch(e.getKeyChar()){
                            case 10: ret();break;
                        }
                        
                    
                
                    }
    
}
