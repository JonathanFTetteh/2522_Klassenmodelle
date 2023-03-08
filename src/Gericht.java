public class Gericht {
    private String name;
    private String zutaten;
    private double preis;

    public Gericht(String name, String zutaten, double preis) {
        this.name = name;
        this.zutaten = zutaten;
        this.preis = preis;
    }

    public void zutatHinzufügen(String zutat) {
        System.out.println("Zutat " + zutat + " wurde hinzugefügt");
        zutaten = zutaten + ", " + zutat;
    }

    public void kochen() {
        System.out.println("Aus den Zutaten " + zutaten + " entsteht " + name);
    }

    public String getName() {
        return name;
    }
    public String getZutaten(){
    return zutaten;
    }
    public double getPreis(){
    return preis;
    }
    public void setPreis(double preis){
        this.preis=preis;
    }
}