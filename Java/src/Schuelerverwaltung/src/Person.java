public class Person {
    private int alter;

    private String vorname;
    private String nachname;



    public Person(String pVorname, String pNachname, int pAlter){
        setAlter(pAlter);
        setNachname(pNachname);
        setVorname(pVorname);
    }

  

    public String getVorname(){
        return vorname;
    }

    public String getNachname(){
        return nachname;
    }

    public int getAlter(){
        return alter;
    }

    public void setAlter(int pAlter){
        this.alter = pAlter;
    }

    public void setVorname(String pVorname){
        this.vorname = pVorname;
    }

    public void setNachname(String pNachname){
        this.nachname = pNachname;
    }
}
