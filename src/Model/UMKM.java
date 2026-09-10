package Model;

public class UMKM {

    public int idUMKM;
    public String namaUsaha;
    public String namaPemilik;
    public JenisUsaha jenisUsaha;
    public Event event;

    public UMKM(int idUMKM, String namaUsaha, String namaPemilik,
                JenisUsaha jenisUsaha, Event event) {

        this.idUMKM = idUMKM;
        this.namaUsaha = namaUsaha;
        this.namaPemilik = namaPemilik;
        this.jenisUsaha = jenisUsaha;
        this.event = event;
    }

    public void tampilkanInfo() {
        System.out.println("ID UMKM      : " + idUMKM);
        System.out.println("Nama Usaha   : " + namaUsaha);
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("Jenis Usaha  : " + jenisUsaha.namaJenis);
        System.out.println("Event        : " + event.namaEvent);
        System.out.println("Lokasi       : " + event.lokasi);
        System.out.println("-------------------------------");
    }
}