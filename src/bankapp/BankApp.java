package bankapp;
import java.util.Scanner;
import java.util.Random;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //untuk membuat input data dari user
        Scanner s = new Scanner(System.in);
        Random rekening = new Random();
        int noreknew = rekening.nextInt(99999999);
        
        System.out.print("Masukkan nomor KTP: ");
        int ktp = s.nextInt();
        System.out.print("Masukkan nama: ");
        String nama = s.next();
        //Nasabah n = new Nasabah(ktp, nama);     //masukkan input sbg parameter
       
        System.out.println("Selamat Datang Di Bank Jago");
        int pilih,setor,tarik,transfer,norek,tabungan;
        System.out.println("Masukkan tabungan awal yang anda inginkan: ");
        tabungan = s.nextInt();
        Tabungan t3 = new Tabungan(Math.abs(noreknew), tabungan);
        do {
        	System.out.println("----------------");
            System.out.println("-Daftar Layanan-");
            System.out.println("1.Cek Saldo");
            System.out.println("2.Setor");
            System.out.println("3.Cetak Saldo");
            System.out.println("4.Tarik Saldo");
            System.out.println("5.Transfer");
            System.out.println("6.Exit");
            System.out.print("Masukkan Pilihan : ");
            pilih = s.nextInt();
            System.out.println("----------------");
            switch (pilih) {

            	case 1:
            		t3.cetakSaldo();
            		break;
            	case 2:
            		System.out.println("Masukkan uang yang ingin di setor:");
            		setor = s.nextInt();
            		t3.setor(setor);
            		break;
            	case 3:
            		t3.cetakSaldo();
            		break;
            	case 4:
            		System.out.println("Masukkan uang yang ingin di tarik:");
            		tarik = s.nextInt();
            		t3.tarik(tarik);
            		break;
            	case 5:
            		System.out.println("Masukkan nomor rekening yang ingin di transfer:");
            		norek = s.nextInt();
            		System.out.println("Masukkan jumlah uang yang ingin di transfer:");
            		transfer = s.nextInt();
            		t3.transfer(norek, transfer);
            		break;
            	case 6:
            		System.out.println("Terima kasih telah menggunakan layanan kami!");
            }
        } while(pilih != 7);
        
        //n.cetak();
        //n.tab[1].cetakSaldo();
        //n.tab[2].setor(1000000);
        //n.tab[2].cetakSaldo();
        //n.cetak();
	}

}
