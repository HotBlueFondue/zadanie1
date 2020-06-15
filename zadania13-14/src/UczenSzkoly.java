

public class UczenSzkoly extends Uczen{
    private String nazwaSzkoly;

    public String getNazwaSzkoly() {return nazwaSzkoly;}
    public void setNazwaSzkoly(String nazwaSzkoly) {this.nazwaSzkoly = nazwaSzkoly;}

    //set the school name
    public void Ustaw_Szkole() {
        System.out.println("Podaj nazwe szkoly");
        setNazwaSzkoly(scanner.nextLine());
    }
}
