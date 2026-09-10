# Minpro-1-PBO-PendataanUMKM

# Sistem Pendataan UMKM pada Event

## Deskripsi Singkat

Program ini dibuat untuk mendata UMKM yang ikut dalam suatu event. Data yang dicatat seperti ID UMKM, nama usaha, nama pemilik, jenis usaha, dan event yang diikuti.

Program ini dibuat menggunakan Java dan menerapkan beberapa konsep dasar PBO seperti class, object, constructor, ArrayList, percabangan, dan perulangan.

## Class yang Digunakan

Di dalam program ini ada 3 class utama selain class Main, yaitu:

- **UMKM**  
  Class ini digunakan untuk menyimpan data UMKM seperti ID UMKM, nama usaha, nama pemilik, jenis usaha, dan event.

- **Event**  
  Class ini digunakan untuk menyimpan data event yang diikuti UMKM, seperti nama event dan lokasi.

- **JenisUsaha**  
  Class ini digunakan untuk menyimpan jenis usaha dari UMKM.

- **Main**  
  Class ini digunakan untuk menjalankan program dan menampilkan menu CRUD.

## Fitur Program

Program ini memiliki 5 menu, yaitu:

1. **Tambah Data UMKM**  
   Untuk menambahkan data UMKM baru.

2. **Tampilkan Data UMKM**  
   Untuk melihat data UMKM yang sudah dimasukkan.

3. **Ubah Data UMKM**  
   Untuk mengubah data UMKM berdasarkan ID UMKM.

4. **Hapus Data UMKM**  
   Untuk menghapus data UMKM berdasarkan ID UMKM.

5. **Keluar**  
   Untuk keluar dari program.

## Alur Program

Saat program dijalankan, program akan menampilkan menu utama.

Jika memilih menu **Tambah**, pengguna akan diminta memasukkan ID UMKM, nama usaha, nama pemilik, dan jenis usaha. Data tersebut kemudian dibuat menjadi object UMKM dan dimasukkan ke dalam ArrayList.

Jika memilih menu **Tampilkan**, program akan menampilkan semua data UMKM yang sudah tersimpan. Data ditampilkan menggunakan perulangan.

Jika memilih menu **Ubah**, pengguna memasukkan ID UMKM yang ingin diubah. Program akan mencari data tersebut, kemudian pengguna dapat memasukkan data yang baru.

Jika memilih menu **Hapus**, pengguna memasukkan ID UMKM yang ingin dihapus. Program akan mencari ID tersebut dan menghapus data UMKM dari ArrayList.

Program akan terus menampilkan menu selama pengguna belum memilih menu **Keluar**.

## Penerapan PBO

Beberapa konsep PBO yang saya gunakan dalam program ini:

- **Class dan Object** digunakan pada class UMKM, Event, dan JenisUsaha.
- **Constructor** digunakan untuk mengisi data saat object dibuat.
- **ArrayList** digunakan untuk menyimpan data UMKM.
- **Percabangan** menggunakan `switch` untuk memilih menu.
- **Perulangan** menggunakan `while` agar program terus berjalan dan `for` untuk menampilkan serta mencari data.
- **Scanner** digunakan untuk menerima input dari pengguna.

## Nilai Tambah

Untuk nilai tambah, saya menerapkan:

- **Access modifier** pada class dan atribut.
- **Validasi sederhana** untuk mengecek apakah ID UMKM yang ingin diubah atau dihapus ditemukan atau tidak.

### Dokumentasi Program

#### Menu Utama

<img width="161" height="106" alt="Cuplikan layar 2026-09-10 223525" src="https://github.com/user-attachments/assets/78a1c4c0-e02a-4647-a2e2-c102aab38cb3" />


#### Tambah Data UMKM

<img width="227" height="148" alt="Cuplikan layar 2026-09-10 223750" src="https://github.com/user-attachments/assets/0f7e471f-39aa-492d-87ef-77ad05e4f2a7" />


#### Tampilkan Data UMKM

<img width="213" height="162" alt="Cuplikan layar 2026-09-10 223812" src="https://github.com/user-attachments/assets/a5efc379-ba3a-41b1-908a-3b0bd83f9eb0" />

