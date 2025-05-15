public class ZarzadzenieZoo {
    public static void main(String[] args) {
        Ssak Lew=new Ssak("lew", 2,1);
        Ptak Orzel=new Ptak("orzel",5,"brązowy");
        Gad Waz=new Gad("wąż",1,0);

        System.out.println(Lew.wydajDzwiek());
        System.out.println(Orzel.wydajDzwiek());
        System.out.println(Waz.wydajDzwiek());

        System.out.println(Lew.poruszajSie());
        System.out.println(Orzel.poruszajSie());
        System.out.println(Waz.poruszajSie());

        System.out.println(Lew.podajWzrost());
        System.out.println(Orzel.podajKolor());
        Waz.podajLiczbaNog();

        System.out.println(Lew.srodowiskoNaturalne());
        System.out.println(Orzel.srodowiskoNaturalne());
        System.out.println(Waz.srodowiskoNaturalne());
    }
}
