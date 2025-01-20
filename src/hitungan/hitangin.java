package hitungan;
public class hitangin {
    //buat variabel suhu yang nanti nya menjadi nilai masukan
    private static double angin;
    
    //buat variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai
   private static double a=0;
   public static double b=15;
   public static double c=30;
    
    //method untuk mengakses nilai pada variabel suhu
    public static double getAngin() {
        return angin;
    }
    
    //buat method untuk mmeberikan nilai pada variabel suhu
    public static void setAngin(double NkecepatanA) {
        hitangin.angin = NkecepatanA;
    }
    //method fungsi naik
        public static double naik(){
        if (angin>=b) return 1;  
        else if (angin>=a && angin<=b) return (angin-a)/(b-a);   
        else return 0;
    }
    //method fungsi turun
    public static double turun(){
        if (angin<=b) return 1;
        else if (angin>=b && angin<=c) return (c-angin)/(c-b);     
        else return 0;
    }
    
}
