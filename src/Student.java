import java.util.Scanner;

public class Student extends Osoba {

    String sudijniObor;

    Scanner scanner = new Scanner(System.in);

    public void Student(String sudijníObor) {
        System.out.println("napis studijni obor studenta");
        this.sudijniObor = scanner.nextLine();
    }


    @Override
    public void vypisIntro() {super.vypisIntro();
        System.out.println("studinjni obor studenta je " + this.sudijniObor);
    }
}