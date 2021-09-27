import java.util.Scanner;

public class Pola2
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
                System.out.print(" ");  // Melakukan print spasi

            for (int j = 1; j <= i; j++)
            {
                if (i == baris || j == 1 || j == i)
                    System.out.print("#");  // Melakukan print bentuk pagar (#)
                else
                    System.out.print(" ");
            }

            // Agar bisa ke baris selanjutnya (enter)
            System.out.println();
        }
    }
}