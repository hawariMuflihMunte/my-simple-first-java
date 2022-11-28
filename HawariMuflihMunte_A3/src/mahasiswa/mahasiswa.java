package mahasiswa;

public class mahasiswa {
    private String nama;
    private String nim;
    private int usia;

    protected String jurusan;
    public String universitas;

    public mahasiswa(String nama, String nim, int usia) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getUsia() {
        return this.usia;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("Hawari Muflih Munte", "200170120", 20);
        
        System.out.println(mhs1.jurusan);
    }
}
