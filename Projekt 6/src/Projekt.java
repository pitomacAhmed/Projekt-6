import java.util.Scanner;
public class Projekt {


	public static void main(String[] args) {
		System.out.println("Vcitaj broj na clenovi vo niza");
		int n= input.nextInt();
		int niza []= new int[n];
		System.out.println("Vcitaj clenovi vo niza: ");
		for (int i=0; i< niza.length; i++) {
			System.out.print(i + "-->");
			niza [i]= input.nextInt(); 
		}
		double p=1;
		for(int i=0;i<niza.length;i++) {
			p=p*niza[i];
		}
		System.out.println("p="+p);
				}

}

