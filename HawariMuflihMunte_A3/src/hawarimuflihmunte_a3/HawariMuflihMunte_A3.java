package hawarimuflihmunte_a3;

import mahasiswa.mahasiswa;

public class HawariMuflihMunte_A3 {

    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("Hawari Muflih Munte", "200170120", 20);
        
        String namaMahasiswa = mhs1.getNama();
        String nimMahasiswa = mhs1.getNim();
        int umurMahasiswa = mhs1.getUsia();
        
        // Berikan nama jurusan
        mhs1.setJurusan("Teknik Informatika");
        String jurusanMahasiswa = mhs1.getJurusan();
        
        // Berikan nama universitas
        mhs1.setUniversitas("Malikussaleh");
        String universitasMahasiswa = mhs1.universitas;

        System.out.println("----------------------------");
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("NIM: " + nimMahasiswa);
        System.out.println("Umur: " + umurMahasiswa);
        System.out.println("Jurusan: " + jurusanMahasiswa);
        System.out.println("Universitas: " + universitasMahasiswa);
        System.out.println("----------------------------");
    }
    
}
