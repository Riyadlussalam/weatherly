                                                                            
package hitungan;
public class hitlembap {
    //buat variabel lembab yang nanti nya menjadi nilai masukan
    private static double lembab;
    
    //buat variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai
    public static double a=0;
    public static double b=50;
    public static double c=100;
    
    //buat method untuk mengakases nilai pada variabel lembab
    public static double getLembab() {
        return lembab;
    }
    //buat method untuk memberikan nilai pada variabel lembab
    public static void setLembab(double Nkelembapan) {
        hitlembap.lembab = Nkelembapan;
    }    
    //method fungsi naik
        public static double naik(){
        if (lembab>=b) return 1;  
        else if (lembab>=a && lembab<=b) return (lembab-a)/(b-a);   
        else return 0;
    } 
    //method fungsi turun
    public static double turun(){
        if (lembab<=b) return 1;
        else if (lembab>=b && lembab<=c) return (c-lembab)/(c-b);     
        else return 0;
    }
    
}