package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Random;

public class EntidadBancaria {

    private String nombre;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Cuenta> cuentas = new ArrayList<>();
    
    EntidadBancaria(String nombre, ArrayList<Usuario> usuarios, ArrayList<Cuenta> cuentas ){

        this.nombre = nombre;
        this.cuentas = cuentas;
        this.usuarios = usuarios;

        
    }

    public ArrayList<Usuario> agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
        return usuarios;
    }

    public Usuario regitrarUsuario(String nombre, String direccion, String cedula, String correo, String contrasena){

        var usuario = new Usuario(nombre, direccion, cedula, correo, contrasena);
        agregarUsuario(usuario);
        return usuario;
    }

    public Usuario obtenerUsuario(ArrayList<Usuario> usuarios, String cedula){

        for (Usuario usuario : usuarios) {
            if (usuario.getCedula().equals(cedula)) {
                return usuario;
            }
        }
        return null;
    }
    

    public Usuario actualizarDatos(ArrayList<Usuario> usuarios, String cedula, String elementoActual, String elementoNuevo) {
        Usuario usuario = obtenerUsuario(usuarios, cedula);
    
        if (usuario != null) {
            if (elementoActual.equalsIgnoreCase(usuario.getNombre())) {
                usuario.setNombre(elementoNuevo);
            } else if (elementoActual.equalsIgnoreCase(usuario.getDireccion())) {
                usuario.setDireccion(elementoNuevo);
            } else if (elementoActual.equalsIgnoreCase(usuario.getCedula())) {
                usuario.setCedula(elementoNuevo);
            } else if (elementoActual.equalsIgnoreCase(usuario.getCorreo())) {
                usuario.setCorreo(elementoNuevo);
            } else if (elementoActual.equalsIgnoreCase(usuario.getContrasena())) {
                usuario.setContrasena(elementoNuevo);
            } else {
                throw new IllegalArgumentException("El elemento '" + elementoActual + "' no se puede actualizar.");
            }
            return usuario;
        } else {
            throw new IllegalArgumentException("Usuario con cédula '" + cedula + "' no encontrado.");
        }
    }
    
    public void eliminarUsuario(ArrayList<Usuario> usuarios, String cedula){
        
        for (Usuario usuario : usuarios) {
            if (usuario!= null){
                if (usuario.getCedula().equals(cedula)) {
                    usuarios.remove(usuario);
                    break;
                }
            }
            else{
                throw new IllegalArgumentException("Usuario con cédula '" + cedula + "' no encontrado.");
            }
        } 
    }

    public int crearNumCuenta() {
        Random random = new Random();
        int numCuenta = random.nextInt(1000000000);
        return numCuenta;

    }

    public void crearCuenta(Usuario usuario, float saldo){

        ArrayList<Transaccion> transacciones = new ArrayList<>();
        int numCuenta = crearNumCuenta();
        Cuenta nuevaCuenta = new Cuenta(numCuenta, saldo, usuario, transacciones);
        cuentas.add(nuevaCuenta);
    
    }

    
    public void obtenerNumeroCuentas (ArrayList<Cuenta> cuentas, int numCuenta){

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

