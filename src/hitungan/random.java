package hitungan;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        // Membuat objek Random
        Random random = new Random();

        // Menghasilkan angka acak di antara 0 dan 40
        int randomNumber = random.nextInt(6)+20; // Menghasilkan nilai dari 0 hingga 40

        // Menampilkan hasil
        System.out.println("Angka acak di antara 0 dan 40: " + randomNumber);
    }
}
