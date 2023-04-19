/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
 public class LAB3 {
    public LAB3() {
    }

    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.writeInt(30);
            output.writeDouble(65.5);
            output.writeChar(65);
        } catch (FileNotFoundException var5) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (IOException var6) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, (String)null, var6);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
        } catch (FileNotFoundException var3) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, (String)null, var3);
        } catch (IOException var4) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, (String)null, var4);
        }

    }
}

