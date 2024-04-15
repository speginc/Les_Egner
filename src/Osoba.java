import java.util.Scanner;

public class Osoba {

    String jmeno;
    int rokNarozeni;
    Scanner scanner = new Scanner(System.in);
    public void Osoba (String jmeno, int rokNarozeni){
        System.out.println("napis jmeno osoby a rok narozeni");
       this.jmeno = scanner.nextLine();
       this.rokNarozeni = scanner.nextInt();
    }

public void vypisIntro(){
        System.out.println("osoba se jmenuje "+this.jmeno);
        System.out.println("Rok narozeni osoby "+this.rokNarozeni);
}
}
