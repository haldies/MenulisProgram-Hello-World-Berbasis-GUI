//Nama  : Haldies Gerhardien Pasya
//NIM   : 20210040120
import javax.swing.*;
public class javaswing {
    public static void main(String[] args) {
        String matkul; 
        matkul = JOptionPane.showInputDialog("Anda sedang belajar apa?");
        JOptionPane.showMessageDialog(null, "Belajar " + matkul + " sangat mudah");
    }
}