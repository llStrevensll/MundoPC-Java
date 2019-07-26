package com.gm.mundopc;

public class DispositivoEntrada {

    private String tipoDeEntrada;
    private String marca;

    //constructor que inicializa las variables
    public DispositivoEntrada(String tipoDeEntrada, String marca) {
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }
    
    public String getTipoEntrada(){
        return tipoDeEntrada;
    }
    
    public void setTipoEntrada(String tipoDeEntrada){
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{ marca=" + marca + ", tipoDeEntrada=" + tipoDeEntrada + "}";
    }
}
