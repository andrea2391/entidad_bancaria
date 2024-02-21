package co.edu.uniquindio;

import java.time.LocalDate;

public class Transaccion {

    private String remitente;
    private String destinatario;
    private float valor;
    private LocalDate fecha;
    private Categoria categoria;

    public Transaccion(String remitente, String destinatario, float valor, LocalDate fecha, Categoria categoria ){

        this.remitente = remitente;
        this.destinatario = destinatario;
        this.valor = valor;
        this.fecha = fecha;
        this.categoria = categoria;
    } 

    public String getRemitente(){
        return remitente;
    }
    
    public String getDestinatario(){
        return destinatario;
    }

    public float getValor(){
        return valor;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public Categoria getCategoria(){
        return categoria;
    }

}
