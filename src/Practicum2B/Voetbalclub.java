package Practicum2B;

public class  Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam) {
        this.naam = naam;
        if(this.naam == null || this.naam.isEmpty()){
            this.naam = "FC";
        }
    }

    public String getNaam() {
        return this.naam;
    }
    public int aantalGespeeld() {
        return this.aantalGewonnen + this.aantalGelijk + this.aantalVerloren;
    }
    public int aantalGewonnen(){
        return this.aantalGewonnen;
    }
    public int aantalGelijk() {
        return this.aantalGelijk;
    }
    public int aantalVerloren() {
        return this.aantalVerloren;
    }
    public int aantalPunten() {
        return (this.aantalGewonnen * 3) + (this.aantalGelijk * 1) + (this.aantalVerloren * 0);
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public String toString(){
        String s = naam +" "+ aantalGespeeld() +" "+ aantalGewonnen +" "+ aantalGelijk +" "+ aantalVerloren +" "+ aantalPunten();
        return s;
    }
}
