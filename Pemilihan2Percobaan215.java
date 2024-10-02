import java.util.Scanner;
public class Pemilihan2Percobaan215 {
  public static void main(String[] args) {
    Scanner input15 = new Scanner(System.in);
    int pilihan_menu, harga;
    String member, metodePbyrn;
    double diskon, total_bayar;

    System.out.println("-------------------------");
    System.out.println("===== MENU KAFE JTI =====");
    System.out.println("-------------------------");
    System.out.println("1. Ricebowl");
    System.out.println("2. Ice Tea");
    System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
    System.out.println("--------------------------------------");
    System.out.print("Masukkan angka dari menu yang dipilih = ");
    pilihan_menu = input15.nextInt();
    input15.nextLine();
    System.out.print("Apakah punya member (y/n) ? = ");
    member = input15.nextLine();
    System.out.print("Masukkan metode pembayaran = ");
    metodePbyrn = input15.nextLine();
    System.out.println("--------------------------------------");

    if (member.equalsIgnoreCase("y")) { // membandingkan string
      diskon = 0.10;
      System.out.println("Besar diskon = 10%");
      if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
      }
      else if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga ice tea = " + harga);
      }
      else if (pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga bundling = " + harga);
      }
      else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return; // menghentikan eksekusi lebih lanjut jika pilihan salah
      }
      // menghitung total bayar & qris
      total_bayar = harga - (harga * diskon);
      if (metodePbyrn.equalsIgnoreCase("qris")) {
        System.out.println("Total bayar setelah diskon = " + total_bayar);
        total_bayar -= 1000;
        System.out.println("Total bayar setelah potongan = " + total_bayar);
      }
      else {
        System.out.println("Total bayar setelah diskon = " + total_bayar);
      }
    }
    else if (member.equalsIgnoreCase("n")) {
      if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
      }
      else if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga ice tea = " + harga);
      }
      else if (pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga bundling = " + harga);
      }
      else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return;
      }
      // menghitung total bayar & qris
      if (metodePbyrn.equalsIgnoreCase("qris")) {
        System.out.println("Total bayar = " + harga);
        harga -= 1000;
        System.out.println("Total bayar setelah potongan = " + harga);
      }
      else {
        System.out.println("Total bayar = " + harga);
      }
    }
    else {
      System.out.println("Member tidak valid");
    }
    System.out.println("--------------------------------------");
  }
}