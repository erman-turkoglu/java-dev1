
public class Odev {
    
    
    
    
    
/* Adımlar:
    İşleminizi yazın:
    1:Bakiye
    2:Para Yatırma
    3:Para Çekme
    4:Çıkış
    
    
    bakiye sorgulama işleminde olan bakiye ekrana basılacak.
    Para yatırma işleminde olan bakiye üzerine eklenecek
    para çekme işleminde bakiyeden çıkaracak
    bakiyeden fazla para talep edildiğinde yetersiz bakiye denecek
    çıkışa basıldığında işlem bitecek
    
    */
        
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int bakiye = 2500;
        
        String islemler = "1.İslem : Bakiye Sorgula\n"
                         + "2.İslem : Para cekme\n"
                         + "3.İslem : Para yatırma\n"      
                         + "Cıkıs için q'a basın";    
                         
        System.out.println("*******************************");
        
        System.out.println("İslemler");
        
        System.out.println("*******************************");
        
        while (true) {
        
               System.out.print("İşlemi Seçiniz: ");  
               String islem = scanner.nextLine();
                       
               if (islem.equals(q))    {
                   
                   System.out.println("Programdan Çıkılıyor");
                   break;
               }   
               else if (islem.equals(1)) {
                   System.out.println("Bakiyeniz : " +bakiye);
               }     
               
               else if (islem.equals(2)) {
                   System.out.print("Çekmek İstediğiniz Tutar : ");
                   int tutar = scanner.nextInt();
                   scanner.nextLine();
                   
                   if (bakiye - tutar < 0){
                       System.out.println("Yetersiz Bakiye , BAkiyeniz : " + bakiye);
                   }
                   
                   else{
                      bakiye -= tutar;
                       System.out.println("Yeni Bakiye : " + bakiye);
               }
               
               else if (islem.equals(3)) {
                   
                   System.out.print("Yatırılacak Tutar : ");
                   int tutar = scanner.nextInt();
                   scanner.nextLine();
                   
                   bakiye += tutar;    
                   
                  System.out.print("Yeni bakiyeniz : " +bakiye);
               }
               
               else {
                   System.out.println("Geçersiz İşlem");
               }
    }
               
}

