package  com.tutorial;

class Mahasiswa{
    // Member (Atribut)
    String nama  ="tambun";
    String NIM;
    String jurusan;
    // Constructor (method yang ada/devault yang terpanggil sesaat object dibuat) method yang pertama trpanggil saat objek dijalankan
    Mahasiswa(String nama, String NIM, String jurusan){
        this.nama=nama;
        this.NIM=NIM;
        this.jurusan=jurusan;
       // Main.test();
    }
    //METHOD TANPA RETURN DAN TANPA PARAMETER
    void show(){
        // method no-static, karna dia terikat class,
        // jika method anda pakai static didalam kelas  maka error,
        // static digunakan untuk membuat method inde[penden (tak terikat kelas, seperti PSVM)
        System.out.println("Nama    : "+this.nama);
        System.out.println("NIM     : "+this.NIM);
    }
    //METHOD TANPA RETURN DAN DENGAN PARAMETER
    void setNama(String nama){ // ini nanti kaitannya dengan setter
        this.nama=nama;
    }
    //METHOD DENGAN RETURN TAPI TANPA PARAMETER
    String getNama(){ // ini nanti kaitannya dengan getter
        return this.nama;
    }
    //METHOD DENGAN RETURN DAN DENGAN PARAMETER
    String sayHello(String message){
        return message +" Karo "+this.nama+ " iki lho, puancen muatane diancok, urip kok ra mbejaji blas!!! asu asu";
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", NIM='" + NIM + '\'' +
                ", jurusan='" + jurusan + '\'' +
                '}';
    }
}
class Dosen{
    String name;
    Dosen(String name){
        this.name=name;
    }
}
public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("amir","371900023","biologi");
        // nyoba method getName
        System.out.println("get name : "+mahasiswa.getNama());


        //System.out.println("ini milik main :"+mahasiswa.nama);// mahasiswa.nama ini setara dengan this.nama
        //memanggil method tanpa return dan tanpa parameter
        mahasiswa.show();
        //memanggil method tanpa return dan tanpa parameter
        mahasiswa.setNama("Usman");
        mahasiswa.show();
        //memanggil method dnegan return dan tanpa parameter
        System.out.println("get name : "+mahasiswa.getNama());
        //memanggil method dnegan return dan dengan parameter
        System.out.println(mahasiswa.sayHello("Jalal"));

        // coba manggil dosen dengan menguji keberadaan fungsiny (YANG sebenarnya gak ada sih)
        Dosen dosen = new Dosen("Alex");
        //dosen.syHello(); jika seperti ini maka akan error, karena sayHello bukan si fungsi si Dosen


        System.out.println("\n"+mahasiswa.toString());
    }
    static void test(){
        System.out.println("Jiancok asuuu! ");
    }
}