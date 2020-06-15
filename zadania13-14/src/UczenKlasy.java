

public class UczenKlasy extends UczenSzkoly{
    private String klasa;

    public String getKlasa() {return klasa;}
    public void setKlasa(String klasa) {this.klasa = klasa;}

    //set the class name
    public void Ustaw_Klase() {
        System.out.println("Podaj klase");
        setKlasa(scanner.nextLine());
    }

    //setting the pupils data
    public void UczenKlasy() {
        System.out.println("Witaj Uczniu.");

        //methods to create the object
        Ustaw_Imie();
        Ustaw_Nazwisko();
        Ustaw_Pesel();
        Ustaw_Szkole();
        Ustaw_Klase();

        //objects output
        System.out.println("Imie: " + getImie() + "\n"
                + "Nazwisko: " + getNazwisko() + "\n"
                + "Pesel: " + getPesel() + "\n"
                + "Szkola: " + getNazwaSzkoly() + "\n"
                + "Klasa: " + getKlasa());
    }
}
