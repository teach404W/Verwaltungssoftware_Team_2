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


    String re_KarteName;
    String re_KarteSeltenheit;
    String re_KarteDamage;
    String re_KarteHP;
    String re_KarteAgility;
    String re_KarteElement;
    String re_KarteID;
    String re_KarteAbility;

    Karte[] karten = new Karte[9]; 


    
}
