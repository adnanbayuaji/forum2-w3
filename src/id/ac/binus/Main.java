package id.ac.binus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long nohp, modnohp, total = 0;              //variabel
        Scanner scan = new Scanner(System.in);
        System.out.print("No HP :");
        nohp = scan.nextLong();                     //inputan no HP
        while(nohp > 0)                             //loop nohp sampai dengan <= 0
        {
            modnohp = nohp % 10;                    //nohp mod 10 untuk mendapatkan sisa
            total = total + modnohp;                //sisa ditambahkan dengan sisa sebelumnya
            nohp /= 10;                             //digit nohp dikurangi dengan membagi, karena tidak decimal
        }
        System.out.println("Jumlah angka dari No HP adalah :"+ total);
    }
}
