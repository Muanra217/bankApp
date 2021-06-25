package bankapp;

public class Tabungan {
	 int norek;
	    double saldo;
	    Tabungan (int nr, double s){
	        norek = nr;
	        saldo = s;
	        System.out.println("Rekening "+norek+" berhasil dibuat");
	    }
	    void setor (double uang) {
	        saldo = saldo+uang;
	        System.out.println("setor sukses");
	       
	    }
	    void tarik (double uang){
	        if (saldo > uang){
	        saldo = saldo-uang;
	        System.out.println("tarik sukses");
	        }
	        else System.out.println("Tarik Gagal");
	    }
	    void transfer(int norek , double uang){
	    	if (saldo > uang) {  
	    		saldo=saldo-uang;
	    		System.out.println(" transfer "+ uang + " ke rekening " +norek+" sukses");
	    	} else System.out.println("transfer gagal");
	    }
	    void cetakSaldo (){
	        System.out.println("Nomer Rekening "+norek+" Jumlah Saldonya "+saldo);
	}
}
