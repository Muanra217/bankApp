package bankapp;
import java.util.Scanner;

public class Nasabah {
	 String Nama;
	    String Alamat;
	    int noKTP;
	    int jumlahtab;
	    double totaluang;
	 
	    Tabungan tab []; //array untuk menyimpan banyak objek tabungan
	   
	Nasabah (int n, String N) {
	        noKTP = n;
	        Nama = N;
	        System.out.println("Nasabah "+Nama+" berhasil dibuat" );
	        tab = new Tabungan[5];
	    }
	    void buatTabungan(Tabungan x){
	        tab[jumlahtab]=x;
	        System.out.println("Tabungan baru sukses ditambahkan");
	        jumlahtab++;
	    }
	    void cetak(){
	       
	        System.out.println("Jumlah Tabungan tuan "+Nama+" adalah "+ jumlahtab);
	        System.out.println("Daftar Rekening");
	        for (int i = 0;i<jumlahtab;i++){
	            //System.out.println((i+1)+"\t"+tab[i].norek+"\t"+tab[i].saldo);
	            System.out.print((i+1)+". ");
	            tab[i].cetakSaldo();
	            totaluang = totaluang + tab[i].saldo;
	        }
	        System.out.println("total uang = "+ totaluang );
	    }
}
