package co.edu.uniquindio;

import java.util.ArrayList;

public class EntidadBancaria {

    private String nombre;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    EntidadBancaria(String nombre, ArrayList<Usuario> usuarios, ArrayList<Cuenta> cuentas ){

        this.nombre = nombre;
        this.cuentas = cuentas;
        this.usuarios = usuarios;

    }
    

   
}
