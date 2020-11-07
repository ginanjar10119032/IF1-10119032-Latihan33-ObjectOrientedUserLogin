package if1.pkg10119032.latihan33.objectorienteduserlogin;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * halaman user login ke layar
 */
public class IF110119032Latihan33ObjectOrientedUserLogin {
    private static String usName,passWord;
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Username = ");
        usName = input.next();

        System.out.print("Masukan Password = ");
        passWord = input.next();
        System.out.println();
        User login = new User();
        login.pengecekanLogin(usName, passWord);
    }
}
