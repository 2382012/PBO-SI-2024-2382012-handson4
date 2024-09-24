public class DenganMethod {

    public static void main(String[] args) {
        int gajipokok = 5000000;
        int tunjanganTransport = 5000000;
        int tunjanganMakan = 3000000;
        int bonus = 1000000;

        int totalPenghasilan = hitunglahTotalPenghasilan(gajipokok, tunjanganTransport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

        tampilkanDetailGaji(gajiPokok, int gajipokok, int tunjanganTranspotr, int tunjanganMakan, int bonus ){
            return; gajipokok + tunjanganTranspotr + tunjanganMakan + bonus;

        }
    }
}
