/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strumyki;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Dark
 */
public class Strumyki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int i;
        String g=null;
        FileInputStream ndd;
        try{
        ndd = new FileInputStream("no.txt");
        } catch(FileNotFoundException e) {
         System.out.println("Nie można otworzyć pliku ");
        return;
        }
        try {
do {
i = ndd.read();
if(i != -1) System.out.print((char) i);
} while(i != -1);
} catch(IOException e) {
System.out.println("Błąd odczytu pliku ");
}
        int dupa = g.length();
    }
    
}
