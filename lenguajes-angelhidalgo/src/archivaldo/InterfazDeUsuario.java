/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivaldo;

/**
 *
 * @author T-107
 */
import java.io.*;

public class InterfazDeUsuario {
    public static void main(String[] args) throws Exception {
        //primero geberamos el archivo a guardar
        File file=new File("D:\\sucio.xxx");
    //iniciar si vamos a leer o guardar algo en ese archivo
        FileOutputStream fos=new FileOutputStream(file);
        //ponemos algo en archivaldo
        String mensajito="este es un mensajito muy basico";
        //ahora si guardamos este mensajito realizado
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //guardamos
        oos.writeObject(mensajito);
        System.out.println("se guardo tu mensajito");
    }
}
