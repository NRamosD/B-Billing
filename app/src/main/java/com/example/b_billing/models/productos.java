package com.example.b_billing.models;

public class productos {
    private String nombre;
    private String precio;
    private String foto;
    private int stock;
    private String color;
    private String fechaDeElaboracion;
    private String fechaDeVencimiento;
    private String fechaDeRegistro;
    private String fechaDeAcabado;

    public productos(String nombre, String precio, String foto, int stock, String color, String fechaDeElaboracion, String fechaDeVencimiento, String fechaDeRegistro, String fechaDeAcabado) {
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
        this.stock = stock;
        this.color = color;
        this.fechaDeElaboracion = fechaDeElaboracion;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.fechaDeRegistro = fechaDeRegistro;
        this.fechaDeAcabado = fechaDeAcabado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaDeElaboracion() {
        return fechaDeElaboracion;
    }

    public void setFechaDeElaboracion(String fechaDeElaboracion) {
        this.fechaDeElaboracion = fechaDeElaboracion;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(String fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public String getFechaDeAcabado() {
        return fechaDeAcabado;
    }

    public void setFechaDeAcabado(String fechaDeAcabado) {
        this.fechaDeAcabado = fechaDeAcabado;
    }
}
