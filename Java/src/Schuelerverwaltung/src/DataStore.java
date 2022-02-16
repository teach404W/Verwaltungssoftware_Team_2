import java.io.Serializable;
import java.util.ArrayList;

public class DataStore implements Serializable {
    String name;
    int password;
    boolean angemeldet;
    boolean ver;


    String temp_KarteName;
    String temp_KarteRarity;
    String temp_KarteDamage;
    String temp_KarteHP;
    String temp_KarteAgility;
    String temp_KarteElement;
    String temp_KarteID;
    String temp_KarteAbility;    


    ArrayList<String> karte_Name = new ArrayList<>(); 

    ArrayList<String> karte_Seltenheit = new ArrayList<>(); 

    ArrayList<String> karte_Damage = new ArrayList<>(); 

    ArrayList<String> karte_HP = new ArrayList<>(); 

    ArrayList<String> karte_Agility = new ArrayList<>(); 

    ArrayList<String> karte_Element = new ArrayList<>(); 

    ArrayList<String> karte_ID = new ArrayList<>(); 
}
