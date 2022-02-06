import java.util.Scanner;

public class MenueFuehrung {

    Scanner sc = new Scanner(System.in);

    public Schueler erstelleUser() {
        breakLine();
        System.out.println("Gebe den Vornamen ein");
        String pVorname = sc.nextLine();

        System.out.println("Gebe den Nachnamen ein");
        String pNachname = sc.nextLine();

        System.out.println("Gebe das Alter ein");
        int pAlter = sc.nextInt();

        System.out.println("Gebe das Passwort ein");
        String pPassword = sc.next();
        

        Schueler ret = new Schueler(pVorname, pNachname, pAlter, pPassword);

        return ret;
    }

    public String anmeldung(){
        breakLine();
        System.out.println("Bitte geben Sie ihr Passwort ein!");

        String ret = sc.next();

        return ret;
    }

    public void abmeldung( Schuelerverwaltung pSchuelerverwaltung){
        breakLine();
        pSchuelerverwaltung.abmeldung();
        System.out.println("Sie werden abgemeldet");
        
    }

    public void zeigeFaecher(Schueler pSchueler){
        breakLine();
        pSchueler.alleFaecherAusgeben();
        breakLine();
    }

    public Fach fachAnlegen(){
        breakLine();
        System.out.println("Bitte Fachnamen angeben");
        String pName = sc.next();

        Fach ret = new Fach(pName);

        return ret;
    }

    public int start(){
        breakLine();
        System.out.println("Wählen Sie aus:");
        System.out.println(" (1) Fach anlegen:");
        System.out.println(" (2) Note für Fach anlegen:");
        System.out.println(" (3) Alle Fächer und Noten ausgeben");
        System.out.println(" (4) Abmelden");
        
        return sc.nextInt();
    }


    public void noteAnlegen(Schueler pSchueler){
        breakLine();
        System.out.println("Für welches Fach wollen Sie eine Note anlegen?");
        pSchueler.alleFachNamenMitNummernAusgeben();
        System.out.println("Bitte Fachnummer angeben");
        int nummer = sc.nextInt();

        pSchueler.noteFuerFachAnlegen(nummer, noteAbfragen());
    }

    private Note noteAbfragen(){
        breakLine();
        System.out.println("Wie lautet die Note:");
        int pNote = sc.nextInt();

        System.out.println("Wie lautet das Jahr:");
        int pJahr = sc.nextInt();

        Note note = new Note(pNote, pJahr);

        return note;
    }


    private void breakLine(){
        System.out.println("-----------");
    }

    public void zeigeMenue(Schuelerverwaltung pSchuelerverwaltung){
        while(pSchuelerverwaltung.getAngemeldet() == true){
            System.out.println("-----------");
            switch(start()){
                case 1: pSchuelerverwaltung.getSchueler().fachAnlegen(fachAnlegen());
                        break;
                case 2: noteAnlegen(pSchuelerverwaltung.getSchueler());
                        break;
                case 3: pSchuelerverwaltung.getSchueler().alleFaecherAusgeben();
                        break;
                case 4: abmeldung(pSchuelerverwaltung);
                        break;
                default: System.out.println("Bitte eingabe wiederholen");
            }
        }
        
    }
}
