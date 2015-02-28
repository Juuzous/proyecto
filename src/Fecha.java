/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Felipe
 */
public class Fecha {
    private int dia;
    private int mes;
    private int ano;
    
    public Fecha(int pdia, int pmes, int pano){
        setDia(pdia);
        setMes(pmes);
        setAno(pano);
    }
    public int getDia() {
        return this.dia;
    }

    public void setDia(int pdia) {
        this.dia = pdia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int pmes) {
        this.mes = pmes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
