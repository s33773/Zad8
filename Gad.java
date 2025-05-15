public class Gad extends Zwierze{
    public int liczbaNog;

    public Gad(String nazwa, int wiek, int liczbaNog) {
        super(nazwa, wiek);
        this.liczbaNog = liczbaNog;
    }

    @Override
    public String wydajDzwiek() {
        return "szsz";
    }

    @Override
    public String poruszajSie() {
        return "sunie";
    }
    public void podajLiczbaNog() {
        System.out.println(liczbaNog);
    }
    @Override
    public String srodowiskoNaturalne() {
        return "woda";
    }

}
