package com.example.b_billing.models;

public class ultimasVentas {
    private String cliente;
    private String fechahora;
    private String total;

    public ultimasVentas(String cliente, String fechahora, String total) {
        this.cliente = cliente;
        this.fechahora = fechahora;
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFechahora() {
        return fechahora;
    }

    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
