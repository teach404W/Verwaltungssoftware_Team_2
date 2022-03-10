
import java.awt.event.ActionListener;
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


public class SystemController extends GUI implements ActionListener {

private Random r1;
private int r2;
private int d;

Karte[] karten = new Karte[9]; 


SystemController() throws Exception{
        frame.addKeyListener(input);
        sync[0].addActionListener(this);
        sync[1].addActionListener(this);
        sync[2].addActionListener(this);
        backB.addActionListener(this);
        searchB1.addActionListener(this);
        option[0].addActionListener(this);
        option[1].addActionListener(this);
option[2].addActionListener(this);
option[3].addActionListener(this);
option[4].addActionListener(this);
option[5].addActionListener(this);
searchB2.addActionListener(this);
searchB3.addActionListener(this);
searchB4.addActionListener(this);
confirmButton.addActionListener(this);
eRandomButton.addActionListener(this);
eSaveButton.addActionListener(this);
Thread.sleep(1000);
//loading();
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
                int v = 1;
                
        
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
                /*
                search_Box.setVisible(false);
                searchB1.setVisible(false);
                searchB2.setVisible(false);
                searchB3.setVisible(false);
                searchB4.setVisible(false);
                */
        
            }
            Thread.sleep(1000);
        
            
        }
            }
        
             public void loading() throws InterruptedException{
                int t1 = 12;
                Texts texts = new Texts();
                    for (int i = 1; i<61;i++){
                        Thread.sleep(t1);
                        super.l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png").getImage().getScaledInstance(500, 300, Image.SCALE_AREA_AVERAGING)));

            
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
            infoText.setVisible(true);
        }

                public void clearBox(){
                    box2.removeAll();
                }

                public void addToBox(int i){
                    if (i == 1){
                        JLabel ei;


for (int e = 0; e < arraysList.rar.length; e++) {

    javax.swing.JButton wahlOption = new JButton();
    wahlOption.setForeground(new Color(80, 0, 255));
    wahlOption.setFont(new Font("Times new Roman", Font.PLAIN, 60));
    wahlOption.setBounds(0, 0, 0, 0);
    wahlOption.setBackground(Color.black);
    wahlOption.setVisible(true);
    wahlOption.setFocusable(false);
    wahlOption.addActionListener(this);
    wahlOption.setActionCommand(arraysList.rar[e]);
    wahlOption.setBorder(new LineBorder(Color.white));


    ei = new JLabel();
    ei.setFont(new Font("Times new Roman", Font.PLAIN, 30));
    ei.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + arraysList.rar[e] + ".png")
            .getImage().getScaledInstance(100, 95, Image.SCALE_AREA_AVERAGING)));
    ei.setSize(600, 600);
    ei.setBackground(Color.white);
    ei.setVisible(true);
    ei.setFocusable(false);
    ei.setBorder(new LineBorder(Color.white));


    box2.add(wahlOption);
    wahlOption.add(ei);


            }
        }


        if (i == 2){
            JLabel ei;


for (int e = 0; e < arraysList.elemente.length; e++) {

javax.swing.JButton wahlOption = new JButton();
wahlOption.setForeground(new Color(80, 0, 255));
wahlOption.setFont(new Font("Times new Roman", Font.PLAIN, 60));
wahlOption.setBounds(0, 0, 0, 0);
wahlOption.setBackground(Color.black);
wahlOption.setVisible(true);
wahlOption.setFocusable(false);
wahlOption.addActionListener(this);
wahlOption.setActionCommand(arraysList.elemente[e]);
wahlOption.setBorder(new LineBorder(Color.white));


ei = new JLabel();
ei.setFont(new Font("Times new Roman", Font.PLAIN, 30));
ei.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Elemente\\" + arraysList.elemente[e] + ".png")
.getImage().getScaledInstance(100, 95, Image.SCALE_AREA_AVERAGING)));
ei.setSize(600, 600);
ei.setBackground(Color.white);
ei.setVisible(true);
ei.setFocusable(false);
ei.setBorder(new LineBorder(Color.white));


box2.add(wahlOption);
wahlOption.add(ei);


}
}


if (i == 3){
    JLabel ei;


for (int e = 0; e < arraysList.skills.length; e++) {

javax.swing.JButton wahlOption = new JButton();
wahlOption.setForeground(new Color(80, 0, 255));
wahlOption.setFont(new Font("Times new Roman", Font.PLAIN, 60));
wahlOption.setBounds(0, 0, 0, 0);
wahlOption.setBackground(Color.black);
wahlOption.setVisible(true);
wahlOption.setFocusable(false);
wahlOption.addActionListener(this);
wahlOption.setActionCommand(arraysList.skills[e]);
wahlOption.setBorder(new LineBorder(Color.white));


ei = new JLabel();
ei.setFont(new Font("Times new Roman", Font.PLAIN, 30));
ei.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Fähigkeiten\\" + arraysList.skills[e] + ".png")
.getImage().getScaledInstance(100, 95, Image.SCALE_AREA_AVERAGING)));
ei.setSize(600, 600);
ei.setBackground(Color.white);
ei.setVisible(true);
ei.setFocusable(false);
ei.setBorder(new LineBorder(Color.white));


box2.add(wahlOption);
wahlOption.add(ei);


}
}

    }

                private void ret(){
                    if (confirmButton.getActionCommand().equals("ConfirmName")){
                        randomName();
                    }
                        }
                    
                    public String randomName(){
                            int x = (int) (Math.random() * 100);
                            if (x > 50){
                                 x = (int) (Math.random() * 100);
                                texarea.setText("");
                                for (int a = 1;a<4;a++){
                                    texarea.setText(texarea.getText() + texts.randomNames[x]);
                                     x = (int) (Math.random() * 100);
                    
                                }
                                return texarea.getText(); 
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
                               return texarea.getText();
                            }
                            return null;
                    }
                    
                    private void anmelden(){
                        option[5].setActionCommand("Abmelden");
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
                                    showOptions(true);
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
                                showOptions(true);
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

                    public String generateRarity(){
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
                        
                          
                            return arraysList.rar[rd2];
                    }
                    
                    public int generateNumber(int i, int v){
                        int x = i + (int) (Math.random() * (v));
                        
                        return x;
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
                        eRandomButton.setActionCommand("GenerateRarity");
                        confirmButton.setActionCommand("ConfirmCardRarity");
                        showOptions(false);
                        infoText.setText("Seltenheit Auswählen");
                        addToBox(1);  
                        box2.setVisible(true);
                        texarea.setEditable(false);
        
                    }                  
                }


                public void confirmCardRarity(){
                    if (texarea.getText().length() > 2 && texarea.getText().length() <16){
                                        dataStore.temp_KarteSeltenheit = texarea.getText();
                                        texarea.setText(null);
                                        eRandomButton.setActionCommand("GenerateDamage");
                                        confirmButton.setActionCommand("ConfirmCardDamage");
                                        infoText.setText("Damage eingeben (0-1000)");
                                        texarea.setEditable(true);
                                        l2.setVisible(false);
                                        box2.setVisible(false);
                                        clearBox();
                                }
                }

                public void confirmCardDamage(){
                    if (Integer.parseInt(texarea.getText()) > 0 && Integer.parseInt(texarea.getText()) < 1001){
                                        dataStore.temp_KarteDamage = texarea.getText();
                                        texarea.setText(null);
                                        eRandomButton.setActionCommand("GenerateDamage");
                                        confirmButton.setActionCommand("ConfirmCardHP");
                                        infoText.setText("HP eingeben (0-1000)");
                                }
                }

                public void confirmCardHP(){
                    if (Integer.parseInt(texarea.getText()) > 0 && Integer.parseInt(texarea.getText()) < 1001){
                                        dataStore.temp_KarteHP = texarea.getText();
                                        texarea.setText(null);
                                        eRandomButton.setActionCommand("GenerateAgility");
                                        confirmButton.setActionCommand("ConfirmCardAgility");
                                        infoText.setText("Agilität eingeben (0-100)");
                                }
                }

                public void confirmCardAgility(){
                    if (Integer.parseInt(texarea.getText()) > 0 && Integer.parseInt(texarea.getText()) < 101){
                                        dataStore.temp_KarteAgility = texarea.getText();
                                        texarea.setText(null);
                                        eRandomButton.setActionCommand("GenerateElement");
                                        confirmButton.setActionCommand("ConfirmCardElement");
                                        infoText.setText("Element auswählen");
                                        addToBox(2);
                                        box2.setVisible(true);
                                        texarea.setEditable(false);
                                }
                }


                public void confirmCardElement(){
                                        dataStore.temp_KarteElement = texarea.getText();
                                        texarea.setText(null);
                                        eRandomButton.setActionCommand("GenerateElement");
                                        confirmButton.setActionCommand("ConfirmCardAbility");
                                        infoText.setText("(optional) Ability auswählen");
                                        clearBox();
                                        box2.setVisible(false);
                                        addToBox(3);
                                        box2.setVisible(true);
                }

                public void confirmCardAbility(){
                                    dataStore.temp_KarteAbility = texarea.getText();
                                    texarea.setText(null);
                                    eRandomButton.setActionCommand("RandomName");
                                    confirmButton.setActionCommand("option[0]");
                                    showOptions(true);
                                    infoText.setVisible(false);
                                    backB.setVisible(false);
                                    texarea.setVisible(false);
                                    confirmButton.setVisible(false);
                                    randomButton.setVisible(false);
                                    l2.setVisible(false);
                                    clearBox();
                                    box2.setVisible(false);

                                    checkCards();

            }


            public void instanceCard(){
                for (int v = 0; v<9; v++){
                    if (v == 0){
                        if (karten[0] == null){
                            karten[0] = new Karte();
                            return;
                        }
                    }

                    if (v > 0 && karten[v] == null && karten[v-1] != null){
                        karten[v] = new Karte();
                        return;
                    }
                }

            }


            public void checkCards(){
                instanceCard();
                if (karten[0].karte_Name.equals("null")){
                    createCard(0);
                    return;
                }
                if (karten[1].karte_Name.equals("null")){
                    createCard(1);
                    return;
                }

                if (karten[2].karte_Name.equals("null")){
                    createCard(2);
                    return;
                }

                if (karten[3].karte_Name.equals("null")){
                    createCard(3);
                    return;
                }

                if (karten[4].karte_Name.equals("null")){
                    createCard(4);
                    return;
                }

                if (karten[5].karte_Name.equals("null")){
                    createCard(5);
                    return;
                }

                if (karten[6].karte_Name.equals("null")){
                    createCard(6);
                    return;
                }

                if (karten[7].karte_Name.equals("null")){
                    createCard(7);
                    return;
                }

                if (karten[8].karte_Name.equals("null")){
                    createCard(8);
                    return;
                }

                if (karten[9].karte_Name.equals("null")){
                    createCard(9);
                    return;
                }
            }



            public void createCard(int i){

                karten[i].karte_Name = dataStore.temp_KarteName;
                karten[i].karte_Seltenheit = dataStore.temp_KarteSeltenheit;
                karten[i].karte_Damage = dataStore.temp_KarteDamage;
                karten[i].karte_HP = dataStore.temp_KarteHP;
                karten[i].karte_Agility = dataStore.temp_KarteAgility;
                karten[i].karte_Element = dataStore.temp_KarteElement;
                karten[i].karte_Ability = dataStore.temp_KarteAbility;
                karten[i].karte_ID = dataStore.temp_KarteID;
                karten[i].karte_ID = "" + generateNumber(10000, 1000000);

               dataStore.clearSavedTempCard();
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
                        showOptions(false);
                        infoText.setVisible(true);
                        infoText.setText("Name eingeben (4-20 Charakter)");
                        backB.setVisible(true);
                        texarea.setText(dataStore.temp_KarteName);
                        box2.setVisible(false);
                        clearBox();

                        dataStore.clearSavedTempCard();
                        
                    }

                    public void karteBearbeiten (){

                        texarea.setVisible(true);
                        texarea.setText(null);
                        texarea.setEditable(true);

                        confirmButton.setVisible(true);
                        showOptions(false);
                        search_Box.setVisible(true);
                        searchB1.setVisible(true);

                        


                        confirmButton.setActionCommand("show edit panel");
                    }


                   


                    public void showOptions(boolean b){
                        option[0].setVisible(b);
                        optionI[0].setVisible(b);
                        option[1].setVisible(b);
                        optionI[1].setVisible(b);
                        option[2].setVisible(b);
                        optionI[2].setVisible(b);
                        option[3].setVisible(b);
                        optionI[3].setVisible(b);
                        option[4].setVisible(b);
                        optionI[4].setVisible(b);
                        option[5].setVisible(b);
                        optionI[5].setVisible(b);
                    }


                    public void viewMenu(){
                        texarea.setText(null);
                                texarea.setVisible(false);
                                confirmButton.setVisible(false);
                                randomButton.setVisible(false);
                                showOptions(true);
                                infoText.setText("Erfolgreich angemeldet");
                                confirmButton.setActionCommand("");
                                eRandomButton.setActionCommand("");
                                backB.setVisible(false);
                                box2.setVisible(false);
                                clearBox();
                               dataStore.clearSavedTempCard();
                    }


                    public void showEditPanel(){
                        System.out.println(dataStore.karten[0].karte_Name);

                    }
                    
                    

                    public void saveCards(){
                        for (int i = 0 ; i<9 ; i++){
                        if (karten[i] != null){
                            dataStore.karten[i] = new Karte();
                            dataStore.karten[i].karte_Name = karten[i].karte_Name;
                            dataStore.karten[i].karte_Seltenheit = karten[i].karte_Seltenheit;
                            dataStore.karten[i].karte_Damage = karten[i].karte_Damage;
                            dataStore.karten[i].karte_HP = karten[i].karte_HP;
                            dataStore.karten[i].karte_Agility = karten[i].karte_Agility;
                            dataStore.karten[i].karte_Element = karten[i].karte_Element;
                            dataStore.karten[i].karte_Ability = karten[i].karte_Ability;
                            dataStore.karten[i].karte_ID = karten[i].karte_ID;
                            System.out.println(dataStore.karten[i].karte_Ability);
                        }
                    }
                    }


                    public void actionPerformed(java.awt.event.ActionEvent e){

                        if (e.getSource() == eRandomButton){

                            if (e.getActionCommand().equals("RandomName")){
                               texarea.setText(randomName());                           
                            };
                            
                            if (e.getActionCommand().equals("GenerateNumber")){
                                r1 = new Random();
                                r2 = r1.nextInt(1000000);
                               texarea.setText("" + generateNumber(10000, r2));
                            }

                            if (e.getActionCommand().equals("GenerateRarity")){        
                               texarea.setText(generateRarity());      
                               try {
                                sec_Image.setVisible(true);
                                sec_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + texarea.getText() + ".png").getImage().getScaledInstance(50, 45,Image.SCALE_AREA_AVERAGING)));
                        
                            } catch(Exception x){
                                System.out.println(x.getStackTrace());
                            }                  
                            }

                            if (e.getActionCommand().equals("GenerateDamage")){        
                                r1 = new Random();
                                r2 = r1.nextInt(1000);
                               texarea.setText("" + generateNumber(r2,1));                
                            }

                            if (e.getActionCommand().equals("GenerateAgility")){        
                                r1 = new Random();
                                r2 = r1.nextInt(100);
                               texarea.setText("" + generateNumber(r2,1));                
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
                                confirmCardDamage();
                            }

                            if (e.getActionCommand().equals("ConfirmCardHP")){
                                confirmCardHP();
                            }


                            if (e.getActionCommand().equals("ConfirmCardAgility")){
                                confirmCardAgility();
                            }

                            if (e.getActionCommand().equals("ConfirmCardElement")){
                                confirmCardElement();
                            }

                            if (e.getActionCommand().equals("ConfirmCardAbility")){
                                confirmCardAbility();
                            }
                
                        }
                

                        if (e.getActionCommand().equals("Abmelden")){
                            System.out.println("Abmelden");
                            // System.out.println("Tschüs, Bis zum nächsten Mal ;)");
                            System.exit(0);
                            frame.setVisible(false);
                        }
                
                        if (e.getSource() == backB || e.getSource() == option[0]){
                            
                                if (e.getActionCommand().equals("option[0]")){
                                    option1_1();               
                                }
                
                
                        }
                            
                      
                            if (e.getActionCommand().equals("backB_0")){
                                viewMenu();
                            }


                            for (String v : arraysList.rar) {
                                if (e.getActionCommand().equals(v)) {
                                    texarea.setText(v);
                                    sec_Image.setVisible(true);
                                    sec_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + v + ".png").getImage().getScaledInstance(50, 45,Image.SCALE_AREA_AVERAGING)));
                                    break;
                                }
                            }

                            for (String v : arraysList.elemente) {
                                if (e.getActionCommand().equals(v)) {
                                    texarea.setText(v);
                                    sec_Image.setVisible(true);
                                    sec_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Elemente\\" + v + ".png").getImage().getScaledInstance(50, 45,Image.SCALE_AREA_AVERAGING)));
                                    break;                                           
                                }
                            }

                            for (String v : arraysList.skills) {
                                if (e.getActionCommand().equals(v)) {
                                    texarea.setText(v);
                                    sec_Image.setVisible(true);
                                    sec_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Fähigkeiten\\" + v + ".png").getImage().getScaledInstance(50, 45,Image.SCALE_AREA_AVERAGING)));
                                    break;                                           
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

                                    saveCards();
                
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

                                    System.out.println("Name:" + dataStore.karten[0].karte_Name);
                                    System.out.println("Seltenheit:" + dataStore.karten[0].karte_Seltenheit);
                                    System.out.println("Damage:" + dataStore.karten[0].karte_Damage);
                                    System.out.println("HP:" + dataStore.karten[0].karte_HP);
                                    System.out.println("Agility:" + dataStore.karten[0].karte_Agility);
                                    System.out.println("Element:" + dataStore.karten[0].karte_Element);
                                    System.out.println("Ability:" + dataStore.karten[0].karte_Ability);
                                    System.out.println("ID:" + dataStore.karten[0].karte_ID);


                                    obj2.close();
                
                                    System.out.println(user.name);
                                    System.out.println(user.password);
                                    System.out.println(user.angemeldet);
                
                                    sync_Box.setVisible(false);
                                    sync[0].setVisible(false);
                                    sync[1].setVisible(false);
                                    sync[2].setVisible(false);
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
                                    sync[0].setVisible(false);
                                    sync[1].setVisible(false);
                                    sync[2].setVisible(false);
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
                
                                    o.writeObject(dataStore);
                                    o.close();
                
                                    sync_Box.setVisible(false);
                                    sync[0].setVisible(false);
                                    sync[1].setVisible(false);
                                    sync[2].setVisible(false);
                                    sync_Text.setVisible(false);
                                    saveButton.setVisible(true);
                                    randomButton.setVisible(true);

                
                                } catch(IOException d) {
                                    d.printStackTrace();
                                }
                            
                            }

                            if (e.getActionCommand().equals("Karte bearbeiten")){
                                karteBearbeiten();
                            }

                            if (e.getActionCommand().equals("show edit panel")){
                                showEditPanel();
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
                                sync[0].setBounds(1020, 1170, 100, 30);
                                sync[1].setBounds(1132, 1170, 100, 30);
                                sync[2].setBounds(1020, 1210, 212, 30);
                                sync_Text.setBounds(1000, 1105, 250, 100);
                                
                                Thread.sleep(80);
                                
                                sync_Box.setVisible(true);
                                sync[0].setVisible(true);
                                sync[1].setVisible(true);
                                sync_Text.setVisible(true);
                                
                                for (int v = 0; v< 460; v++){
                                Thread.sleep(1);
                                sync_Box.setBounds(1000, 1100-v, 250, 145);
                                sync[0].setBounds(1020, 1170-v, 100, 30);
                                sync[1].setBounds(1132, 1170-v, 100, 30);
                                sync[2].setBounds(1020, 1210-v, 212, 30);
                                sync_Text.setBounds(1000, 1105-v, 250, 100);                
                                }
                                sync_Box.setVisible(true);
                                sync[0].setVisible(true);
                                sync[1].setVisible(true);
                                sync_Text.setVisible(true);
                            }
                
                
                            obj2.close();
                
                        } catch(IOException d) {
                            d.printStackTrace();
                        } catch (ClassNotFoundException d2) {
                            d2.printStackTrace();
                        }
                    }
}
