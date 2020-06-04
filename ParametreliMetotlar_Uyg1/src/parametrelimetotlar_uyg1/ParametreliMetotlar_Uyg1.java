//2 Dereceli bir denklemin delta yöntemi ile köklerini bulan program.
package parametrelimetotlar_uyg1;

public class ParametreliMetotlar_Uyg1 {
    
    static double delta; //delta adında değiken tanımladık

    public static void main(String[] args) 
    {
     kokbul(1,0,-9); // Değerler atandı   
    }
    static void kokbul(int a,int b,int c) // Değişkenlere değerler atandı.
    {
     delta = b*b-4*a*c; //işlem atandı.
     
     if(delta>0)
     {
      double x1= (-b+Math.sqrt(delta))/(2*a);//İlk kök bulundu.
      double x2= (-b-Math.sqrt(delta))/(2*a);//İkinci Kök Bulundu.
      
         System.out.println("2 Kök var kökler..: "+x1+" ve "+x2); //Sonuç ekrana yazdırıldı
     }
     
     else if(delta==0)
     {
      double x1= (-b)/(2*a); //1 kök bulundu.
      
         System.out.println("1 kök bulundu..: "+x1); // Sonuç Ekrana yazdırıldı
     }
     
     else if(delta<0)
     {
         System.out.println("Kök Yok"); // Sonuç Ekrana Yazdırıldı. 
     }
    }

}
