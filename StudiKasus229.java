import java.util.Scanner;

public class StudiKasus229 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkat, statusPKM, kurang;

        System.out.print("Masukkan nama mahasiswa     : ");
        nama = sc.nextLine();
        System.out.print("Masukkan Jenis Kegiatan (BELMAWA, BAKORMA, MANDIRI, PKM, atau Lainnya): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")){

                System.out.print("Jumlah Dokumen    : ");
                jumlahDokumen = sc.nextInt();

                System.out.print("Peringkat Juara : ");
                peringkat = sc.nextInt();

                if (peringkat == 1 || peringkat == 2 || peringkat == 3 || peringkat == 4){
                    if (jumlahDokumen == 4){
                        System.out.println("Status: Anda mendapat dana penghargaan");
                    } else {
                        kurang = 4 - jumlahDokumen;
                        System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + "dokumen). Dana penghargaan tidak diberikan.");
                    }
                } else {
                    System.out.println("Juara Harapan atau peserta tidak memperoleh dana penghargaan.");
                } 
            } 
    }
}
