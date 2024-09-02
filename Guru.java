package GURU;

public class Guru {
    //variabel
    private int nip;
    private String nama;
    private String mapel;
    private String status;

    public int getNip() {
        return this.nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Constructor Parameter
    public Guru(int i, String n, String m, String s){
        nip = i;
        nama = n;
        mapel = m;
        status = s;
    }
    public void print(){
        System.out.println("NIP : "+nip);
        System.out.println("Nama : "+nama);
        System.out.println("Mata Pelajaran : "+mapel);
        System.out.println("Status : "+status);

    }
}
