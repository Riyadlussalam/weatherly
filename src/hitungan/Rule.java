package hitungan;

import hitungan.*;

public class Rule {
    private static double [] u_Hitung = new double[6];
    private static double [] z_Hitung = new double[6];
    private static double bobot;
    
    public static void hitung_u(){
        u_Hitung[0]=Math.min(hitsuhu.naik(), hitlembap.naik());   //
        u_Hitung[1]=Math.min(hitsuhu.turun(), hitlembap.turun()); //
        u_Hitung[2]=Math.min(hitsuhu.naik(), hitlembap.turun());  //
        u_Hitung[3]=Math.min(hitsuhu.turun(), hitlembap.naik());  //
    }
    public static void hitung_z(){
        z_Hitung[0]= hitsuhu.c-(u_Hitung[0]*(hitsuhu.c-hitsuhu.b)); //turun
        z_Hitung[1]= hitlembap.c-(u_Hitung[1]*(hitlembap.c-hitlembap.b)); //turun
        z_Hitung[2]= (u_Hitung[2]*(hitsuhu.c-hitsuhu.b))+hitsuhu.b; //naik
        z_Hitung[3]= (u_Hitung[3]*(hitlembap.c-hitlembap.b))+hitlembap.b; //naik
    }

public static double bobot(){
    double atas=0,bawah=0;
    hitung_u();
    hitung_z();
        System.out.println("\n"+hitsuhu.getSuhu());
        System.out.println(hitlembap.getLembab());
        System.out.println();
        System.out.println(hitsuhu.naik());
        System.out.println(hitlembap.naik());
        System.out.println(hitsuhu.turun());
        System.out.println(hitlembap.turun());
        
    for(int i=0;i<6;i++){
        System.out.println("z_ke"+i+ " : " +z_Hitung[i]);
        System.out.println("u_ke"+i+ " : " +u_Hitung[i]);
        atas+=(u_Hitung[i]*z_Hitung[i]);
        bawah+=u_Hitung[i];
    }
    System.out.println(atas/bawah);
    bobot=(atas/bawah);
    return (atas/bawah);
}
public static String getBobot() {
    return String.valueOf(bobot);
}

    public static void main(String[] args) {
        bobot();
        getBobot();
    }
}