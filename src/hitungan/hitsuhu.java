package hitungan;
public class hitsuhu {
    //buat variabel suhu yang nanti nya menjadi nilai masukan
    private static double suhu;
    
    //buat variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai
   public static double a=0;
   public static double b=15;
   public static double c=30;
    
    //method untuk mengakses nilai pada variabel suhu
    public static double getSuhu() {
        return suhu;
    }
    
    //buat method untuk mmeberikan nilai pada variabel suhu
    public static void setSuhu(double Nsuhu) {
        hitsuhu.suhu = Nsuhu;
    }
    //method fungsi naik
        public static double naik(){
        if (suhu>=b) return 1;  
        else if (suhu>=a && suhu<=b) return (suhu-a)/(b-a);   
        else return 0;
    }
    
    //method fungsi turun
    public static double turun(){
        if (suhu<=b) return 1;
        else if (suhu>=b && suhu<=c) return (c-suhu)/(c-b);     
        else return 0;
    }
    
}
