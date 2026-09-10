# Minpro-1-PBO-PendataanUMKM

## Sistem Pendataan UMKM pada Event

### Deskripsi Singkat Program

Sistem Pendataan UMKM pada Event merupakan program sederhana berbasis Java yang digunakan untuk mendata UMKM yang mengikuti suatu event.

Program ini menyimpan beberapa informasi UMKM, yaitu ID UMKM, nama usaha, nama pemilik, jenis usaha, serta event yang diikuti.

Program dibuat menggunakan konsep Pemrograman Berorientasi Objek (PBO) dan menerapkan class, object, constructor, ArrayList, percabangan, serta perulangan.

### Class yang Digunakan

Program terdiri dari beberapa class, yaitu:

- **UMKM**  
  Digunakan untuk menyimpan data UMKM seperti ID UMKM, nama usaha, nama pemilik, jenis usaha, dan event.

- **Event**  
  Digunakan untuk menyimpan informasi event yang diikuti UMKM, yaitu ID event, nama event, dan lokasi.

- **JenisUsaha**  
  Digunakan untuk menyimpan jenis usaha dari setiap UMKM.

- **Main**  
  Merupakan class entry point yang digunakan untuk menjalankan program dan menampilkan menu CRUD.

### Fitur Program

Program memiliki beberapa menu utama:

1. **Tambah Data UMKM**  
   Digunakan untuk menambahkan data UMKM baru ke dalam ArrayList.

2. **Tampilkan Data UMKM**  
   Digunakan untuk menampilkan seluruh data UMKM yang telah tersimpan.

3. **Ubah Data UMKM**  
   Digunakan untuk mengubah data UMKM berdasarkan ID UMKM.

4. **Hapus Data UMKM**  
   Digunakan untuk menghapus data UMKM berdasarkan ID UMKM.

5. **Keluar**  
   Digunakan untuk mengakhiri program.

### Alur Program

Program dimulai dengan membuat `ArrayList<UMKM>` sebagai tempat penyimpanan data UMKM.

Selanjutnya program menampilkan menu utama. Pengguna memilih menu menggunakan input angka melalui `Scanner`.

Jika pengguna memilih menu Tambah, pengguna memasukkan ID UMKM, nama usaha, nama pemilik, dan jenis usaha. Data tersebut kemudian dibuat menjadi object `UMKM` dan disimpan ke dalam ArrayList.

Jika pengguna memilih menu Tampilkan, program menggunakan perulangan untuk mengambil dan menampilkan seluruh data UMKM yang tersimpan.

Jika pengguna memilih menu Ubah, pengguna memasukkan ID UMKM yang ingin diubah. Program mencari data tersebut menggunakan perulangan, kemudian data yang ditemukan dapat diperbarui.

Jika pengguna memilih menu Hapus, pengguna memasukkan ID UMKM. Program mencari data berdasarkan ID tersebut dan menghapusnya dari ArrayList.

Program menggunakan perulangan `while` sehingga menu akan terus ditampilkan dan program tidak berhenti sampai pengguna memilih menu Keluar.

### Penerapan Ketentuan PBO

Beberapa ketentuan yang diterapkan dalam program:

- **Class** → menggunakan class `UMKM`, `Event`, dan `JenisUsaha`.
- **Properties/Atribut** → setiap class memiliki atribut yang digunakan untuk menyimpan data.
- **Constructor** → setiap class memiliki constructor untuk mengisi data object.
- **ArrayList** → digunakan untuk menyimpan kumpulan data UMKM.
- **Percabangan** → menggunakan `switch` untuk menentukan menu yang dipilih pengguna.
- **Input** → menggunakan `Scanner` untuk menerima input dari pengguna.
- **Perulangan** → menggunakan `while` untuk menjalankan program dan `for` untuk menampilkan serta mencari data.

### Nilai Tambah

Program menerapkan:

- **Access Modifier** pada class dan atribut.
- **Validasi data** dengan pengecekan apakah data UMKM ditemukan saat melakukan proses ubah dan hapus.

### Dokumentasi Program

#### Menu Utama

<img width="161" height="106" alt="Cuplikan layar 2026-09-10 223525" src="https://github.com/user-attachments/assets/78a1c4c0-e02a-4647-a2e2-c102aab38cb3" />


#### Tambah Data UMKM

Tambahkan screenshot saat melakukan proses tambah data UMKM di sini.

#### Tampilkan Data UMKM

Tambahkan screenshot hasil data UMKM yang telah ditambahkan di sini.
