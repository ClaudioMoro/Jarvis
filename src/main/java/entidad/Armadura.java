/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author cmoro1
 */
public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private int nivelResistencia = 100;
    private int nivelSalud = 100;
    private float nivelBateria = Float.MAX_VALUE;
    private double consumoEnergiaBota = 1500.0;
    private double consumoEnergiaGuante = 950.0;
    private double consumoEnergiaConsola = 380.0;
    private double consumoEnergiaSintetizador = 460.0;

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia, int nivelSalud, float nivelBateria, double consumoEnergiaBota, double consumoEnergiaGuante, double consumoEnergiaConsola, double consumoEnergiaSintetizador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
        this.nivelBateria = nivelBateria;
        this.consumoEnergiaBota = consumoEnergiaBota;
        this.consumoEnergiaGuante = consumoEnergiaGuante;
        this.consumoEnergiaConsola = consumoEnergiaConsola;
        this.consumoEnergiaSintetizador = consumoEnergiaSintetizador;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public float getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(float nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public double getConsumoEnergiaBota() {
        return consumoEnergiaBota;
    }

    public void setConsumoEnergiaBota(double consumoEnergiaBota) {
        this.consumoEnergiaBota = consumoEnergiaBota;
    }

    public double getConsumoEnergiaGuante() {
        return consumoEnergiaGuante;
    }

    public void setConsumoEnergiaGuante(double consumoEnergiaGuante) {
        this.consumoEnergiaGuante = consumoEnergiaGuante;
    }

    public double getConsumoEnergiaConsola() {
        return consumoEnergiaConsola;
    }

    public void setConsumoEnergiaConsola(double consumoEnergiaConsola) {
        this.consumoEnergiaConsola = consumoEnergiaConsola;
    }

    public double getConsumoEnergiaSintetizador() {
        return consumoEnergiaSintetizador;
    }

    public void setConsumoEnergiaSintetizador(double consumoEnergiaSintetizador) {
        this.consumoEnergiaSintetizador = consumoEnergiaSintetizador;
    }
}
