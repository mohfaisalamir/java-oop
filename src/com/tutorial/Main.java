package com.tutorial;
// ini mengimpor class console/terminal
import com.terminal.console;
import com.terminal.terminal;
// sekarang mengimpur static method dari console
import static com.terminal.console.log;


//class Mainan dan Mainan2 hanya numpang lapak, jangan di hiraukan

public class Main{ // nah, misal class Main ini bisa , karena sama dengan nama file, ini bisa default maupun public
    // class yang paling lazim adalah default dan public, tidak ada class private
    //1. default hanya visible di package yang sama , contohnya seperti di "class Player"
    //2. public dapat visible di package yang beda, namun tetep di beri keyword "import" bagi pengimportnya
    public static void main(String[] args) {
        Player player = new Player("Mustoko");
        player.show();

        console.log("\nKok isoo");
        console.log("The Player Name is "+player.getName());
        //terminal.log() terminal di class console tidak bisa diakses karena dia bukan public (default) karena berada di class console
        // dan public class tidak boleh lebih dari satu dari suatu file
        // kecuali anda pindahkan si germinal menjadi kelas baru,
        // seperti berikut ..
        terminal.log("terminal log, ini dari class terminal tersendiri"); // ini selamanya tidak dapat diakses, meskipun diiport, karena bersifat default, harus di public terlebih dahulu
        log("\nini kita coba pakai/ panggil static method ,\n" +
                "ini tanpa nempel di console karena pakai static,\n" +
                "dan ini hasilnya : ==> "+player.getName());
    }
}

// penggunaan private ini tidak di perkenankan
// private class Test{
//}