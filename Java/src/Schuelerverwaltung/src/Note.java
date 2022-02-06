public class Note {
    private int note;
    private int jahr;


    public Note (int pNote, int pJahr){
        setJahr(pJahr);
        setNote(pNote);
    }


    public void setNote(int pNote){
        this.note = pNote;
    }


    public void setJahr(int pJahr){
        this.jahr = pJahr;
    }

    public String toString(){
        return "Note: " + note + " Jahr: " + jahr;
    }
}
