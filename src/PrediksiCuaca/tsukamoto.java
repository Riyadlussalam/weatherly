package PrediksiCuaca;;
public class tsukamoto {
    public static void main(String[] args) {
        // Input: Suhu dan Kelembapan
        double suhu = 50; // contoh suhu dalam derajat Celsius
        double kelembapan = 75; // contoh kelembapan dalam persen

        // Fuzzifikasi
        double tingkatKeanggotaanSDingin = fungsiKeanggotaanSuhuDingin(suhu);
        double tingkatKeanggotaanSHangat = fungsiKeanggotaanSuhuHangat(suhu);
        double tingkatKeanggotaanSPanas = fungsiKeanggotaanSuhuPanas(suhu);

        double tingkatKeanggotaanKRendah = fungsiKeanggotaanKelembapanRendah(kelembapan);
        double tingkatKeanggotaanKNormal = fungsiKeanggotaanKelembapanNormal(kelembapan);
        double tingkatKeanggotaanKTinggi = fungsiKeanggotaanKelembapanTinggi(kelembapan);

        // Inferensi Fuzzy
        double tingkatKeanggotaanCuacaBagus = Math.min(tingkatKeanggotaanSHangat, tingkatKeanggotaanKNormal);
        double tingkatKeanggotaanCuacaMendung = Math.min(tingkatKeanggotaanSHangat, tingkatKeanggotaanKRendah);
        double tingkatKeanggotaanCuacaHujan = Math.min(tingkatKeanggotaanSPanas, tingkatKeanggotaanKTinggi);

        // Defuzzifikasi (Centroid Method)
        double nilaiCuacaBagus = defuzzifikasiCentroid(tingkatKeanggotaanCuacaBagus, 0, 100);
        double nilaiCuacaMendung = defuzzifikasiCentroid(tingkatKeanggotaanCuacaMendung, 0, 100);
        double nilaiCuacaHujan = defuzzifikasiCentroid(tingkatKeanggotaanCuacaHujan, 0, 100);

        // Penentuan Kategori Cuaca (Bagus, Mendung, Hujan)
        String kategoriCuaca = tentukanKategoriCuaca(nilaiCuacaBagus, nilaiCuacaMendung, nilaiCuacaHujan);

        System.out.println("Nilai tegas keanggotaan cuaca Bagus: " + nilaiCuacaBagus);
        System.out.println("Nilai tegas keanggotaan cuaca Mendung: " + nilaiCuacaMendung);
        System.out.println("Nilai tegas keanggotaan cuaca Hujan: " + nilaiCuacaHujan);
        System.out.println("Kategori cuaca: " + kategoriCuaca);
    }

    // Fungsi keanggotaan untuk suhu Dingin (contoh fungsi segitiga)
    private static double fungsiKeanggotaanSuhuDingin(double suhu) {
        if (suhu <= 10) return 1;
        else if (suhu > 10 && suhu < 15) return (15 - suhu) / 5;
        else return 0;
    }

    // Fungsi keanggotaan untuk suhu Hangat (contoh fungsi segitiga)
    private static double fungsiKeanggotaanSuhuHangat(double suhu) {
        if (suhu <= 15 || suhu >= 25) return 0;
        else if (suhu > 15 && suhu < 20) return (suhu - 15) / 5;
        else if (suhu >= 20 && suhu <= 25) return (25 - suhu) / 5;
        else return 0;
    }

    // Fungsi keanggotaan untuk suhu Panas (contoh fungsi segitiga)
    private static double fungsiKeanggotaanSuhuPanas(double suhu) {
        if (suhu <= 20) return 0;
        else if (suhu > 20 && suhu < 30) return (suhu - 20) / 10;
        else return 1;
    }

    // Fungsi keanggotaan untuk kelembapan Rendah (contoh fungsi segitiga)
    private static double fungsiKeanggotaanKelembapanRendah(double kelembapan) {
        if (kelembapan <= 30) return 1;
        else if (kelembapan > 30 && kelembapan < 40) return (40 - kelembapan) / 10;
        else return 0;
    }

    // Fungsi keanggotaan untuk kelembapan Normal (contoh fungsi segitiga)
    private static double fungsiKeanggotaanKelembapanNormal(double kelembapan) {
        if (kelembapan <= 30 || kelembapan >= 60) return 0;
        else if (kelembapan > 30 && kelembapan < 45) return (kelembapan - 30) / 15;
        else if (kelembapan >= 45 && kelembapan <= 60) return (60 - kelembapan) / 15;
        else return 0;
    }

    // Fungsi keanggotaan untuk kelembapan Tinggi (contoh fungsi segitiga)
    private static double fungsiKeanggotaanKelembapanTinggi(double kelembapan) {
        if (kelembapan <= 50) return 0;
        else if (kelembapan > 50 && kelembapan < 80) return (kelembapan - 50) / 30;
        else return 1;
    }

    // Defuzzifikasi (Centroid Method)
    private static double defuzzifikasiCentroid(double tingkatKeanggotaan, double rentangAwal, double rentangAkhir) {
        double pembilang = 0;
        double penyebut = 0;

        for (double x = rentangAwal; x <= rentangAkhir; x += 0.1) {
            double nilaiKeanggotaan = tingkatKeanggotaan; // Nilai tingkat keanggotaan pada rentang tertentu
            pembilang += x * nilaiKeanggotaan;
            penyebut += nilaiKeanggotaan;
        }

        return pembilang / penyebut;
    }

    // Penentuan Kategori Cuaca (Bagus, Mendung, Hujan)
    private static String tentukanKategoriCuaca(double nilaiCuacaBagus, double nilaiCuacaMendung, double nilaiCuacaHujan) {
        if (nilaiCuacaBagus >= nilaiCuacaMendung && nilaiCuacaBagus >= nilaiCuacaHujan) return "Bagus";
        else if (nilaiCuacaMendung >= nilaiCuacaBagus && nilaiCuacaMendung >= nilaiCuacaHujan) return "Mendung";
        else return "Hujan";
    } 
}
