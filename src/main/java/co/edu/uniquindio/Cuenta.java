package co.edu.uniquindio;

import java.util.ArrayList;

public class Cuenta {

    private int numCuenta;
    private float saldo;
    private Usuario propietario;
    private ArrayList<Transaccion> transacciones = new ArrayList<>();

    public Cuenta (int numCuenta, float saldo, Usuario propietario, ArrayList<Transaccion> transacciones ){

        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
        this.transacciones = transacciones;
    }
    
    public int getNumCuenta(){
        return numCuenta;
    }
    
    public float getSaldo(){
        return saldo;
    }

    public Usuario getPropietario(){
        return propietario;
    }

    public ArrayList<Transaccion> getTransacciones(){
        return transacciones;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

}
