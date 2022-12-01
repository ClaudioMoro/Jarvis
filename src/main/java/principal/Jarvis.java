/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package principal;

import entidad.Armadura;
import servicio.ServicioArmadura;

/**
 *
 * @author cmoro1
 */
public class Jarvis {

    public static void main(String[] args) {
        ServicioArmadura sa = new ServicioArmadura();
        Armadura ar = sa.crearArmadura();
        for(int i = 1; i < 900; i ++){
            System.out.println("\nI = " + i);
            
            System.out.printf("Nivel de batería: %.1f", (ar.getNivelBateria() / Float.MAX_VALUE * 100));
            System.out.println("%");
            System.out.println("Caminar 500 segundos.");
            System.out.println(sa.caminar(ar, 500));
            System.out.printf("Nivel de batería: %.1f", (ar.getNivelBateria() / Float.MAX_VALUE * 100));
            System.out.println("%");
            System.out.println("Correr 1200 segundos.");
            System.out.println(sa.correr(ar, 1200));
            System.out.printf("Nivel de batería: %.1f", (ar.getNivelBateria() / Float.MAX_VALUE * 100));
            System.out.println("%");
            System.out.println("Propulsar 40 segundos.");
            System.out.println(sa.propulsar(ar, 40));
            System.out.printf("Nivel de batería: %.1f", (ar.getNivelBateria() / Float.MAX_VALUE * 100));
            System.out.println("%");
            System.out.println("Volar 420 segundos.");
            System.out.println(sa.volar(ar, 420));
            System.out.printf("Nivel de batería: %.1f", (ar.getNivelBateria() / Float.MAX_VALUE * 100));
            System.out.println("%");
            System.out.println("Escribir 16 segundos.");
            System.out.println(sa.escribir(ar, 16));
            System.out.printf("Nivel de batería: %.1f", (ar.getNivelBateria() / Float.MAX_VALUE * 100));
            System.out.println("%");
            System.out.println("Leer 25 segundos.");
            System.out.println(sa.leer(ar, 25));
            System.out.printf("Nivel de batería: %.1f", (ar.getNivelBateria() / Float.MAX_VALUE * 100));
            System.out.println("%");
            System.out.println("Disparar 4 segundos.");
            System.out.println(sa.disparar(ar, 4));
            System.out.printf("Nivel de batería: %.1f", (ar.getNivelBateria() / Float.MAX_VALUE * 100));
            System.out.println("%");
        }
    }
}
