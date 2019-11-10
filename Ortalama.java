import java.util.Scanner;

public class Ortalama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
				Scanner input=new Scanner(System.in);
				
				int not1,not2,not3,not4,not5;
				double ortalama,standartSapma,varsayim;
				System.out.print("Notunuzu giriniz:");
				not1=input.nextInt();
				System.out.print("Notunuzu giriniz:");
				not2=input.nextInt();
				System.out.print("Notunuzu giriniz:");
				not3=input.nextInt();
				System.out.print("Notunuzu giriniz:");
				not4=input.nextInt();
				System.out.print("Notunuzu giriniz:");
				not5=input.nextInt();
				ortalama=(not1+not2+not3+not4+not5)/5;
				System.out.print("Ortalama=");
				System.out.println(ortalama);
				//varsayim=(Math.pow((not1-ortalama),2)+Math.pow((not2-ortalama),2)+Math.pow((not3-ortalama),2)+Math.pow((not4-ortalama),2)+Math.pow((not5-ortalama),2))/5;  
				//standartSapma=Math.pow(varsayim,2);
				double sonuc=not1-ortalama;
				double sonuc1=not2-ortalama;
				double sonuc2=not3-ortalama;
				double sonuc3=not4-ortalama;
				double sonuc4=not5-ortalama;
				varsayim=(Math.pow(sonuc, 2)+Math.pow(sonuc1, 2)+
						Math.pow(sonuc2, 2)+	Math.pow(sonuc3, 2)+	Math.pow(sonuc4, 2))/4;	
				standartSapma=Math.pow(varsayim, 0.5);
				System.out.print("Standart Sapma=");
				System.out.println(standartSapma);
				

			}

		

		
		

	}


