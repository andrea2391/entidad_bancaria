package co.edu.uniquindio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void creacionUsuarioDatosCorrectos(){
        String nombreUsuario = "andres";
        String direccion = " centro #34- 45"; 
        String cedula = "12345";
        String correo = "andres@gmail.com";
        String contrasena = "0000";

        var usuario = new Usuario(nombreUsuario, direccion, cedula, correo, contrasena);

        assertEquals(nombreUsuario, usuario.getNombre());
        assertEquals(direccion, usuario.getDireccion());
        assertEquals(cedula, usuario.getCedula());
        assertEquals(correo, usuario.getCorreo());
        assertEquals(contrasena, usuario.getContrasena());
    }
    
    
}
