package co.edu.uniquindio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class EntidadBancariaTest {
    
    @Test
    public void creaEntidadBancariaDatosCorectos(){

        String nombre = "bancolombia";
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        var bancolombia = new EntidadBancaria(nombre, usuarios, cuentas);

        assertEquals(nombre, bancolombia.getNombre());
        assertEquals(usuarios, bancolombia.getUsuarios());
        assertEquals(cuentas, bancolombia.getCuentas());
    }

    @Test
    public void creaEntidadBancariaDatosNulos(){

        String nombre = "bancolombia";
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        var bancolombia = new EntidadBancaria(nombre, usuarios, cuentas);

        assertNotNull(bancolombia);

    }
     
}
