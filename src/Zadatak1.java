import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime:");
        String ime = s.nextLine();
        System.out.println("Unesite prezime:");
        String prezime = s.nextLine();

        System.out.println(ime + " " + prezime);



    }
}
