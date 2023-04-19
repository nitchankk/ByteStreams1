/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows10
 */
public class LAB2 {
    public LAB2() {
    }

    public static void main(String[] args) {
        String s = "Hello World!";
        byte[] b = s.getBytes();

        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            output.write(b);
        } catch (FileNotFoundException var5) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (IOException var6) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, (String)null, var6);
        }

        try {
            FileInputStream input = new FileInputStream("data.dat");

            int ch;
            while((ch = input.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException var7) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (IOException var8) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

    }
}
