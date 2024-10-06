import java.util.Scanner;
public class Latihan3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String merk, kategori;
    byte ukuran;
    int harga;

    System.out.print("Masukkan merek sepatu = ");
    merk = sc.nextLine();
    System.out.print("Masukkan kategori = ");
    kategori = sc.nextLine();
    System.out.print("Masukkan ukuran = ");
    ukuran = sc.nextByte();

    if (merk.equalsIgnoreCase("converse")) {
      if (kategori.equalsIgnoreCase("slip on")) {
        if (ukuran >= 36 && ukuran <= 40) {
          harga = 800000;
          System.out.println("Harga sepatu = " + harga);
        }
        else {
          System.out.println("Ukuran tidak valid");
        }
      }
      else if (kategori.equalsIgnoreCase("high top")) {
        if (ukuran >= 40 && ukuran <= 44) {
          harga = 1200000;
          System.out.println("Harga sepatu = " + harga);
        }
        else {
          System.out.println("Ukuran tidak valid");
        }
      }
      else {
        System.out.println("Kategori tidak valid");
      }
    }
    else if (merk.equalsIgnoreCase("sketcher")) {
      if (kategori.equalsIgnoreCase("woman")) {
        if (ukuran >= 36 && ukuran <= 41) {
          harga = 1000000;
          System.out.println("Harga sepatu = " + harga);
        }
        else {
          System.out.println("Ukuran tidak valid");
        }
      }
      else if (kategori.equalsIgnoreCase("man")) {
        if (ukuran >= 41 && ukuran <= 44) {
          harga = 1800000;
          System.out.println("Harga sepatu = " + harga);
        }
        else {
          System.out.println("Ukuran tidak valid");
        }
      }
      else {
        System.out.println("Kategori tidak valid");
      }
    }
    else if (merk.equalsIgnoreCase("nike")) {
      if (kategori.equalsIgnoreCase("kids")) {
        if (ukuran >= 36 && ukuran <= 40) {
          harga = 750000;
          System.out.println("Harga sepatu = " + harga);
        }
        else {
          System.out.println("ukuran tidak valid");
        }
      }
      else if (kategori.equalsIgnoreCase("adult")) {
        if (ukuran >= 40 && ukuran <= 44) {
          harga = 1500000;
          System.out.println("Harga sepatu = " + harga);
        }
        else {
          System.out.println("ukuran tidak valid");
        }
      }
      else {
        System.out.println("kategori tidak valid");
      }
    }
    else {
      System.out.println("merk tidak valid");
    }
  
  }
}