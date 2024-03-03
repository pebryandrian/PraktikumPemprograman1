package Pertemuan4;

import tugas.Node;

public class NodeMain {
public static void main(String[] args) {
		
		// Membuat 2 buah node n1 & n2
		int Nilai;
		Node n1 = new Node(Nilai:5);
		Node n2 = new Node(Nilai:7);
		Node n3 = new Node(Nilai:9);
		Node n4 = new Node(Nilai:8);
		
		// Membuat relasi Node n1 & n2
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		
		// Menampilkan Node n1 & n2 dengan pointer p
		Node p = n1;
		while (p != null ) {
			System.out.printf("%d ", p.getNilai());
			p = p.getNext();
		}
	}
}
