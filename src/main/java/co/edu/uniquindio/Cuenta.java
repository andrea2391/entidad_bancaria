package co.edu.uniquindio;

import java.util.ArrayList;

public class Cuenta {

    private String numCuenta;
    private Double saldo;
    private Usuario propietario;
    private ArrayList<Transaccion> transacciones = new ArrayList<>();

    public Cuenta (String numCuenta, Double saldo, Usuario propietario, ArrayList<Transaccion> transacciones ){

        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
        this.transacciones = transacciones;
    }

    public String getNumCuenta(){
        return numCuenta;
    }
    
    public Double getSaldo(){
        return saldo;
    }

    public Usuario getPropietario(){
        return propietario;
    }

    public ArrayList<Transaccion> getTransacciones(){
        return transacciones;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

}
