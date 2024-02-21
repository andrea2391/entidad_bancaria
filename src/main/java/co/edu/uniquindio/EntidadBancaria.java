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

    public String getNombre(){
        return nombre;
    }
    
    public  ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
   
    public  ArrayList<Cuenta> getCuentas(){
        return cuentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas){
        this.cuentas = cuentas;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios){
        this.usuarios = usuarios;
    }

}

