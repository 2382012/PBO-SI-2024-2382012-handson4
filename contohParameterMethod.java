public class contohParameterMethod {

    // method dengan satu parameter
    public static  int kaliDua(int angka) {
        int hasil = angka * 2;
        return  hasil;
    }

    //method dengan beberapa parameter

    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return  0.5 * alas * tinggi;
    }

    public  static  void main(String[] args) {
        int hasilKaliDua = kaliDua(5); //memanggil method dengan argueen 5
        System.out.print("luas segitiga: " + hasilKaliDua);

        double luasSegitiga = hitungLuasSegitiga(4, 6); //memanggil method dengan argumen 4
        System.out.print("luas segitiga: " + luasSegitiga);

    }


}
