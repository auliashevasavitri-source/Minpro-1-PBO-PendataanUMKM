package com.mycompany.pendataanumkm;

import Model.Event;
import Model.JenisUsaha;
import Model.UMKM;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<UMKM> daftarUMKM = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        Event event = new Event(
                1,
                "Bazar UMKM Samarinda 2026",
                "Samarinda"
        );

        boolean berjalan = true;

        while (berjalan) {

            System.out.println("=== SISTEM PENDATAAN UMKM PADA EVENT ===");
            System.out.println("Event  : " + event.namaEvent);
            System.out.println("Lokasi : " + event.lokasi);
            System.out.println("-----------------------------------------");
            System.out.println("1. Tambah Data UMKM");
            System.out.println("2. Tampilkan Data UMKM");
            System.out.println("3. Ubah Data UMKM");
            System.out.println("4. Hapus Data UMKM");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                case 1 -> {
                    System.out.println("=== TAMBAH DATA UMKM ===");

                    System.out.print("ID UMKM: ");
                    int idUMKM = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nama Usaha: ");
                    String namaUsaha = scanner.nextLine();

                    System.out.print("Nama Pemilik: ");
                    String namaPemilik = scanner.nextLine();

                    System.out.print("Jenis Usaha: ");
                    String namaJenis = scanner.nextLine();

                    JenisUsaha jenisUsaha = new JenisUsaha(namaJenis);

                    UMKM umkmBaru = new UMKM(
                            idUMKM,
                            namaUsaha,
                            namaPemilik,
                            jenisUsaha,
                            event
                    );

                    daftarUMKM.add(umkmBaru);

                    System.out.println(">> Data UMKM berhasil ditambahkan!");
                }

                case 2 -> {
                    System.out.println("=== DATA UMKM ===");

                    if (daftarUMKM.isEmpty()) {
                        System.out.println("Belum ada data UMKM.");
                    } else {

                        for (int i = 0; i < daftarUMKM.size(); i++) {

                            UMKM u = daftarUMKM.get(i);

                            u.tampilkanInfo();
                        }
                    }
                }

                case 3 -> {
                    System.out.println("\n=== UBAH DATA UMKM ===");

                    System.out.print("Masukkan ID UMKM: ");
                    int idTarget = scanner.nextInt();
                    scanner.nextLine();

                    boolean ditemukan = false;

                    for (UMKM u : daftarUMKM) {

                        if (u.idUMKM == idTarget) {

                            System.out.print("Nama Usaha Baru: ");
                            u.namaUsaha = scanner.nextLine();

                            System.out.print("Nama Pemilik Baru: ");
                            u.namaPemilik = scanner.nextLine();

                            System.out.print("Jenis Usaha Baru: ");
                            String namaJenis = scanner.nextLine();

                            u.jenisUsaha = new JenisUsaha(namaJenis);

                            System.out.println(">> Data UMKM berhasil diperbarui!");

                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println(">> Data UMKM tidak ditemukan!");
                    }
                }

                case 4 -> {
                    System.out.println("=== HAPUS DATA UMKM ===");

                    System.out.print("Masukkan ID UMKM: ");
                    int idTarget = scanner.nextInt();

                    boolean ditemukan = false;

                    for (UMKM u : daftarUMKM) {

                        if (u.idUMKM == idTarget) {

                            daftarUMKM.remove(u);

                            System.out.println(">> Data UMKM berhasil dihapus!");

                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println(">> Data UMKM tidak ditemukan!");
                    }
                }

                case 5 -> {
                    berjalan = false;

                    System.out.println(">> Program selesai.");
                }

                default -> {
                    System.out.println(">> Pilihan tidak valid!");
                }
            }
        }

        scanner.close();
    }
}