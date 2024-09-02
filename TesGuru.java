package GURU;
import java.util.Scanner;
public class TesGuru {
    public static void main(String[] args) {
// Scanner Input
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("Mapel : ");
        String mapel = input.nextLine();
        System.out.println("Status : ");
        String status = input.nextLine();
        System.out.println("NIP : ");
        int NIP = input.nextInt();
        input.close();

        Guru Ana = new Guru(NIP, nama, mapel, status);
        Ana.print();

        // Constructor Parameter
        Guru Falah = new Guru(1123, "Falah", "Bahasa Indonesia", "Tetap");
        Guru Pasha = new Guru(2678, "Pasha", "Produktif RPL", "Tetap");
        Guru Guntur = new Guru(3098, "Guntur", "Sejarah", "Full-Time");
        Guru Chusnul = new Guru(5639, "Chusnul", "IPAS", "Part-Time");
        Guru Diaur = new Guru(3248, "Diaur", "PJOK", "Tetap");

        Falah.print();
        Pasha.print();
        Guntur.print();
        Chusnul.print();
        Diaur.print();

    }
}
