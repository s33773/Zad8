public class Ssak extends Zwierze{
    public int wzrost;

    public Ssak(String nazwa, int wiek, int wzrost) {
        super(nazwa, wiek);
        this.wzrost = wzrost;
    }


    @Override
    public String wydajDzwiek() {
        return "miau";
    }

    @Override
    public String poruszajSie() {
        return "biegnie";
    }


    public int podajWzrost() {
        return wzrost;
    }

    @Override
    public String srodowiskoNaturalne() {
        return "ląd";
    }

}
