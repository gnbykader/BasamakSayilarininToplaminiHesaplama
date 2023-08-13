import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int sayi,total = 0,basValue;
		Scanner inp = new Scanner(System.in);
		System.out.println("Sayi Giriniz: ");
		sayi = inp.nextInt();

		while (sayi!=0) {
				total+= sayi % 10;;
				sayi/=10;
			}
		System.out.println(total);
		}
		

	}


