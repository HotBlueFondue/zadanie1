
import java.util.Scanner;

public class Uczen {
    Scanner scanner = new Scanner(System.in);

    private String imie;
    private String nazwisko;
    private String pesel;

    public void setImie(String imie) {this.imie = imie;}
    public void setNazwisko(String nazwisko) {this.nazwisko = nazwisko;}
    public void setPesel(String pesel) {this.pesel = pesel;}

    public String getImie() {return imie;}
    public String getNazwisko() {return nazwisko;}
    public String getPesel() {return pesel;}

    //set name
    public void Ustaw_Imie(){
        System.out.println("Podaj Imie");
        setImie(scanner.nextLine());
    }

    //set last name
    public void Ustaw_Nazwisko(){
        System.out.println("Podaj Nazwisko");
        setNazwisko(scanner.nextLine());
    }

    //set the PESEL number
    public void Ustaw_Pesel(){
        System.out.println("Podaj PESEL");
        setPesel(scanner.nextLine());
    }
}