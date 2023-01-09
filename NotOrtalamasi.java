package NotOrtalamasi;


import java.util.Scanner;

public class NotOrtalamasi {
	public static void main(String[] args) {
	int	mat ,turkce ,fizik , kimya , tarih , muzik ;
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Matematik notunu giriniz :");
	mat=scan.nextInt() ;
	
	System.out.println("Turkce notunu giriniz :");
	turkce=scan.nextInt() ;
	
	System.out.println("Fizik notunu giriniz :");
	fizik=scan.nextInt() ;
	
	System.out.println("Kimya notunu giriniz :");
	kimya=scan.nextInt() ;
	
	System.out.println("Tarih notunu giriniz :");
	tarih=scan.nextInt() ;
	
	System.out.println("Muzik notunu giriniz :");
	muzik=scan.nextInt() ;
	
	scan.close();
	
	mat = (mat >= 0 && mat <= 100) ? mat : 0;
    fizik = (fizik >= 0 && fizik <= 100) ? fizik : 0;
    kimya = (kimya >= 0 && kimya <= 100) ?kimya : 0;
    turkce = (turkce >= 0 && turkce <= 100) ? turkce : 0;
    muzik = (muzik >= 0 && muzik <= 100) ? muzik : 0;
    
	double toplam =mat + turkce + fizik + kimya + tarih + muzik ;
	double ortalama= toplam/6.0 ;
	
	 if (ortalama <60 ) {
		 System.out.println("Kaldiniz ");
		 
	 }else {
		 System.out.println("Gectiniz ");
	 }
	 System.out.println("Ortalamaniz :"  + ortalama);
	
	 
	}
}