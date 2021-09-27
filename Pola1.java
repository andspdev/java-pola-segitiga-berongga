import java.util.Scanner;

public class Pola1
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
            for (int j=1; j <= i; j++)
            {
                if (j == 1 || j == i || i == baris)
                    System.out.print("#");  // Melakukan print bentuk pagar (#)
                else
                    System.out.print(" ");
            }

            // Agar bisa ke baris selanjutnya (enter)
            System.out.println();
        }
    }
}