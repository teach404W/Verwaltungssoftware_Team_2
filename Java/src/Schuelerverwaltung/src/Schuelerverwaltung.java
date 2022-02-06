public class Schuelerverwaltung {
    private Schueler schueler;
    private boolean angemeldet = false;

    private MenueFuehrung menueFuehrung;

    public Schuelerverwaltung(){
        menueFuehrung = new MenueFuehrung();

        schueler = menueFuehrung.erstelleUser();

        anmeldung();
        menueFuehrung.zeigeMenue(this);
    }

    private void anmeldung(){
        String pPassword = menueFuehrung.anmeldung();
        this.anmeldung(pPassword) ;
    }

    private void anmeldung(String pPassword){
        if (schueler.ueberPruefePassword(pPassword) == true){
            System.out.println("Erfolgreich angemeldet");
            angemeldet = true;
        }else {
            System.out.println("Nicht angemeldet");
            angemeldet = false;
        }
    }


    public void abmeldung(){
        this.angemeldet = false;
    }

    public boolean getAngemeldet(){
        return this.angemeldet;
    }

    public Schueler getSchueler(){
        return this.schueler;
    }
    
}
