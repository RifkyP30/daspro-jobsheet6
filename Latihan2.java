import java.util.Scanner;
public class Latihan2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double diskon;
    String jenisBuku;
    int jmlBuku;

    System.out.print("Masukkan jenis buku = ");
    jenisBuku = sc.nextLine();
    System.out.print("Masukkan jumlah buku = ");
    jmlBuku = sc.nextInt();

    if (jenisBuku.equalsIgnoreCase("kamus")) {
      if (jmlBuku > 2) {
        diskon = 0.12;
      }
      else {
        diskon = 0.1;
      }
    }
    else if (jenisBuku.equalsIgnoreCase("novel")) {
      if (jmlBuku > 3) {
        diskon = 0.09;
      }
      else {
        diskon = 0.08;
      }
    }
    else {
      if (jmlBuku > 3) {
        diskon = 0.05;
      }
      else {
        diskon = 0;
      }
    }

    System.out.println("Jenis buku = " + jenisBuku);
    System.out.println("Jumlah buku = " + jmlBuku);
    System.out.println("Jumlah diskon = " + diskon);

  }
}