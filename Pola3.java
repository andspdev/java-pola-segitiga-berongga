import java.util.Scanner;

public class Pola3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Menginputkan baris dari keyboard
        System.out.print("Masukkan jumlah baris yang diinginkan: ");
        int baris = scan.nextInt();

        // Perulangan pertama untuk menampilkan baris
        for (int i = 1; i <= baris; i++)
        {
            for (int j = i; j <= baris; j++)
            {
                if (i == 1 || j==i || j == baris)
                    System.out.print("#"); // Melakukan print bentuk pagar (#)
                else
                    System.out.print(" ");
            }

            // Agar bisa ke baris selanjutnya (enter)
            System.out.println();
        }
    }
}