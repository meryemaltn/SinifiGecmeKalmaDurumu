import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik;
		double average;
				
		Scanner input= new Scanner(System.in);
		System.out.println("Matematik Notunuzu Giriniz: ");
		mat= input.nextInt();
		
		System.out.println("Fizik Notunuzu Giriniz: ");
		fizik= input.nextInt();
		
		System.out.println("T�rk�e Notunuzu Giriniz");
		turkce= input.nextInt();
		
		System.out.println("Kimya Notunuzu Giriniz: ");
		kimya=input.nextInt();
		
		System.out.println("M�zik Notunuzu Giriniz: ");
		muzik=input.nextInt();
		
		
		if (mat<100 && mat>0 && fizik<100 && fizik>0 && turkce<100 && turkce>0 && kimya<100 && kimya>0 && muzik<100 && muzik>0) {
			
			average=(mat+fizik+turkce+kimya+muzik)/5;
			System.out.println("Not ortalaman�z: " + average);
			if (average>55.0) {
			System.out.println("Tebrikler S�n�f� Ge�tiniz!");
			} else {
			System.out.println("Maalesef S�n�fta Kald�n�z.");
			}
		}
		else {
			System.out.println("Notlar�n en az birini yanl�� girdiniz!!");
		}
}
}