package oop.week1;

// class 
public class Kalkulator {
	// atribut
	int bilangan1, bilangan2;

	// constructor
	public Kalkulator(int bil1, int bil2) {
		// nilai atribut bilangan1 dan bilangan2
		// akan diisi sesuai dengan nilai parameter pada constructor
		this.bilangan1 = bil1;
		this.bilangan2 = bil2;
	}

	// method untuk menjumlahkan dua bilangan
	public int jumlahkanBilangan(int bil1, int bil2) {
		int hasil = bil1 + bil2;
		return hasil;
	}

	// method main
	public static void main(String[] args) {
		// membuat objek kalkulator
		Kalkulator kalkulator = new Kalkulator(3, 4);
		System.out.println("bilangan 1 : " + kalkulator.bilangan1);
		System.out.println("bilangan 2 : " + kalkulator.bilangan2);
		
		// menjumlahkan bilangan
		int hasilPenjumlahan = kalkulator.jumlahkanBilangan(kalkulator.bilangan1, kalkulator.bilangan2);
		System.out.println(kalkulator.bilangan1 + " + " + kalkulator.bilangan2 + " = " + hasilPenjumlahan);
	}
}
