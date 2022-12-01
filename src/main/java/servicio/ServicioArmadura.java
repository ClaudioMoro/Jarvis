/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Armadura;

/**
 *
 * @author cmoro1
 */
public class ServicioArmadura {
    
    public Armadura crearArmadura(){
        Armadura ar = new Armadura();
        return ar;
    }
    
    public double caminar(Armadura arm, double tiempo){
        double consumo;
        double auxConsumo = usarBota(arm, "basico", tiempo);
        consumo = 2 * auxConsumo;      //2 botas
        calcularNivelBateria(arm, consumo);
        return consumo;
    }
    
    public double correr(Armadura arm, double tiempo){
        double consumo;
        double auxConsumo = usarBota(arm, "normal", tiempo);
        consumo = 2 * auxConsumo;      //2 botas
        calcularNivelBateria(arm, consumo);
        return consumo;
    }

    public double propulsar(Armadura arm, double tiempo){
        double consumo;
        double auxConsumo = usarBota(arm, "intenso", tiempo);
        consumo = 2 * auxConsumo;      //2 botas
        calcularNivelBateria(arm, consumo);
        return consumo;
    }

    public double volar(Armadura arm, double tiempo){
        double consumo;
        double auxConsumo = usarBota(arm, "intenso", tiempo) + usarGuante(arm, "normal", tiempo);
        consumo = 2 * auxConsumo;      //2 botas y 2 guantes
        calcularNivelBateria(arm, consumo);
        return consumo;
    }

    public double escribir(Armadura arm, double tiempo){
        double consumo;
        double auxConsumo = usarConsola(arm, "basico", tiempo);
        consumo = auxConsumo;
        calcularNivelBateria(arm, consumo);
        return consumo;
    }

    public double leer(Armadura arm, double tiempo){
        double consumo;
        double auxConsumo = usarSintetizador(arm, "basico", tiempo);
        consumo = auxConsumo;
        calcularNivelBateria(arm, consumo);
        return consumo;
    }
    
    public double disparar(Armadura arm, double tiempo){
        double consumo;
        double auxConsumo = usarGuante(arm, "intenso", tiempo);
        consumo = 2 * auxConsumo;       //2 guantes
        calcularNivelBateria(arm, consumo);
        return consumo;
    }
    
    public double usarBota(Armadura arm, String nivelIntensidad, double tiempo){
        double consumo = 0;
        double auxConsumo = 0;
        switch(nivelIntensidad){
            case "basico":
                auxConsumo = 1 * arm.getConsumoEnergiaBota();
            break;
            case "normal":
                auxConsumo = 2 * arm.getConsumoEnergiaBota();
            break;
            case "intenso":
                auxConsumo = 3 * arm.getConsumoEnergiaBota();
            break;
        }
        consumo = auxConsumo * tiempo;
        return consumo;
    }
    
    public double usarGuante(Armadura arm, String nivelIntensidad, double tiempo){
        double consumo = 0;
        double auxConsumo = 0;
        switch(nivelIntensidad){
            case "basico":
                auxConsumo = 1 * arm.getConsumoEnergiaGuante();
            break;
            case "normal":
                auxConsumo = 2 * arm.getConsumoEnergiaGuante();
            break;
            case "intenso":
                auxConsumo = 3 * arm.getConsumoEnergiaGuante();
            break;
        }
        consumo = auxConsumo * tiempo;
        return consumo;
    }

    public double usarConsola(Armadura arm, String nivelIntensidad, double tiempo){
        double consumo = 0;
        double auxConsumo = 0;
        switch(nivelIntensidad){
            case "basico":
                auxConsumo = 1 * arm.getConsumoEnergiaConsola();
            break;
            case "normal":
                auxConsumo = 2 * arm.getConsumoEnergiaConsola();
            break;
            case "intenso":
                auxConsumo = 3 * arm.getConsumoEnergiaConsola();
            break;
        }
        consumo = auxConsumo * tiempo;
        return consumo;
    }

    public double usarSintetizador(Armadura arm, String nivelIntensidad, double tiempo){
        double consumo = 0;
        double auxConsumo = 0;
        switch(nivelIntensidad){
            case "basico":
                auxConsumo = 1 * arm.getConsumoEnergiaSintetizador();
            break;
            case "normal":
                auxConsumo = 2 * arm.getConsumoEnergiaSintetizador();
            break;
            case "intenso":
                auxConsumo = 3 * arm.getConsumoEnergiaSintetizador();
            break;
        }
        consumo = auxConsumo * tiempo;
        return consumo;
    }

    public void calcularNivelBateria(Armadura arm, double consumo){
        arm.setNivelBateria(arm.getNivelBateria() - (float)consumo);
    }
    
    public void mostrarEstado(){
        
    }
}
