public class Fach {
    private String name;

    private Note[] noten = new Note[10];

    public Fach(String pName){
        setName(pName);
    }


    public String gebeAlleNotenAus(){
        String ret = "";

       

        for (int i = 0 ; i < noten.length ; i++){
            if (noten[i] != null){
                ret = ret + "\n" + noten[i];
            }
        }
        return ret;
    }

    public void noteHinzufuegen(Note pNote){
        int i = 0;
        while (this.noten[i] != null){
            i++;
        }
        if(i < this.noten.length){
            this.noten[i] = pNote;
        }else {
            System.out.println("Kein Platz mehr für eine Note");
        }
    }

    public void setName(String pName){
        this.name = pName;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Fach: " + getName() + gebeAlleNotenAus();
    }
}
