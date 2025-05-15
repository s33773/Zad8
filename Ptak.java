public class Ptak extends Zwierze{
    public String kolor;

    public Ptak(String nazwa, int wiek, String kolor) {
        super(nazwa, wiek);
        this.kolor=kolor;
    }

    @Override
    public String wydajDzwiek() {
        return "fru";
    }

    @Override
    public String poruszajSie() {
        return "lata";
    }
    public String podajKolor() {
        return kolor;
    }
    @Override
    public String srodowiskoNaturalne() {
        return "powietrze";
    }


}
