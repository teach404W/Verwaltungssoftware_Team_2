import java.io.Serializable;

public class DataStore implements Serializable {
    String name;
    int password;
    boolean angemeldet;
    boolean ver;


    String temp_KarteName;
    String temp_KarteSeltenheit;
    String temp_KarteDamage;
    String temp_KarteHP;
    String temp_KarteAgility;
    String temp_KarteElement;
    String temp_KarteID;
    String temp_KarteAbility;    


    Karte[] karten = new Karte[10]; 

    

    public DataStore(){
        karten[0] = new Karte();
        karten[1] = new Karte();
        karten[2] = new Karte();
        karten[3] = new Karte();
        karten[4] = new Karte();
        karten[5] = new Karte();
        karten[6] = new Karte();
        karten[7] = new Karte();
        karten[8] = new Karte();
        karten[9] = new Karte();

    }


    public void clearSavedTempCard(){
        temp_KarteName = null;
        temp_KarteSeltenheit = null;
        temp_KarteDamage = null;
        temp_KarteHP = null;
        temp_KarteAgility = null;
        temp_KarteElement = null;
        temp_KarteID = null;
        temp_KarteAbility = null;
    }



    
}
