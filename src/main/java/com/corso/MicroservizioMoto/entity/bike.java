package com.corso.MicroservizioMoto.entity;
public class bike {
    private String marca;
    private String modello;
    private int anno;

    public bike() {
    }

    public bike(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }


        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
}
