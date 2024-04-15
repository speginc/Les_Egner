import java.util.Scanner;

public class Ucitel extends Osoba{

    String hlavniPredmet;
    Scanner scanner = new Scanner(System.in);
    public void Ucitel(String hlavniPredmet){
        System.out.println("napis hlavní předmet učitele");
        this.hlavniPredmet = scanner.nextLine();
    }



    @Override
    public void vypisIntro(){ super.vypisIntro();
        System.out.println("ucitel učí "+this.hlavniPredmet);
    }
}
