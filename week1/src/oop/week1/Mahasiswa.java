package oop.week1;

public class Mahasiswa {
	// atribut
	String nim, nama;
	
	// constructor
	public Mahasiswa(String nim, String nama) {
		this.nim = nim;
		this.nama = nama;
	}
	
	// method
	public String getNim() {
		return nim;
	}

	// method
	public String getNama() {
		return nama;
	}

	// method
	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa("M0507001", "Budi Setiawan");
		System.out.println("NIM : "+mhs1.getNim());
		System.out.println("Nama : "+mhs1.getNama());
	}
}

