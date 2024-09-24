public class contohmethod {
    public static int hitulangLuasPersegi(int sisi){
        int luas = sisi * sisi;
        return  luas;
    }

    public  static void  main(String[] args) {
        int sisi = 5;
        int luas = hitulangLuasPersegi(sisi);
        System.out.print("Luas persegi dengan sisi " + sisi + " adalah " + luas);
    }
}
