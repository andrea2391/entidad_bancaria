package co.edu.uniquindio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class CuentaTest {

    @Test
    public void crearCuentaDatosCorrectos(){
        String nombreUsuario = "andres";
        String direccion = " centro #34- 45"; 
        String cedula = "12345";
        String correo = "andres@gmail.com";
        String contrasena = "0000";

        var propietario = new Usuario(nombreUsuario, direccion, cedula, correo, contrasena);

        int numCuenta = 1234;
        float saldo = 0;
        ArrayList<Transaccion> transacciones = new ArrayList<>();

        var cuenta = new Cuenta(numCuenta, saldo, propietario, transacciones);

        assertEquals(numCuenta, cuenta.getNumCuenta());
        assertEquals(saldo, cuenta.getSaldo());
        assertEquals(propietario, cuenta.getPropietario());
        assertEquals(transacciones, cuenta.getTransacciones());
    }
    
}
