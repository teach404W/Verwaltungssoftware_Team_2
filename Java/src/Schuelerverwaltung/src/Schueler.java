public class Schueler extends Person{
    private String password = "null";

    private Fach[] faecher = new Fach[10];

    public Schueler(String pVorname, String pNachname, int pAlter, String pPassword){
        super(pVorname, pNachname, pAlter);
        setPassword(pPassword);
    }



    public void changePassword(String pPassword){
        if (pPassword.length() < 4){
            System.out.println("Passwort kann nicht geändert werden -- zu kurz");
        }else {
            this.password = pPassword;
            System.out.println("Passwort erfolgreich geändert");
        }
    }

    private void setPassword(String pPassword){
        if (pPassword.length() < 4){
            System.out.println("Passwort zu kurz: Die Anwendung wird beendet");
            System.exit(0);
        }else {
            this.password = pPassword;
            System.out.println("Passwort erfolgreich gesetzt");
        }
    }

    public boolean ueberPruefePassword(String pPassword){
        if (this.password.equals(pPassword)){
            return true;
        }else {
            return false;
        }
    }


    public void gebeNotenAus(){
        for (int i = 0; i < faecher.length; i++){
            if (faecher[i] != null){
                System.out.println(faecher[i]);
            }
        }
    }

    void fachAnlegen(Fach pFach){
        System.out.println("Fach Anlegen Schüler:" + pFach);
        for (int i = 0; i < faecher.length ; i++){
            if (faecher[i] == null){
                faecher[i] = pFach;
                System.out.println("Fach angelegt in Fach: " + i);
                return;
            }
        }
        System.out.println("Maximialanzahl der Fächer erreicht");
    }
   

    public void alleFaecherAusgeben(){
       // System.out.println("Alle Fächer ausgeben aus Person");
        for (int i = 0; i < faecher.length ; i++){
        //    System.out.println("Überprüfe Fachnummer: " + i );
            if (faecher[i] != null){
        //        System.out.println("Fach not null");
                System.out.println(faecher[i]);
            }
        }
    }

    public void  alleFachNamenMitNummernAusgeben(){
        for (int i = 0; i < faecher.length ; i++){
            //    System.out.println("Überprüfe Fachnummer: " + i );
                if (faecher[i] != null){
            //        System.out.println("Fach not null");
                    System.out.println("Nummer (" + i +") "+ faecher[i].getName());
                }
            }
    }


    public void noteFuerFachAnlegen(int pFachID, Note pNote){
         if (faecher[pFachID] == null){
                System.out.println("Es gibt kein Fach mit dieser ID");
                return;
            }else{
                this.faecher[pFachID].noteHinzufuegen(pNote);
            }
        }
        
    
    
    
}
