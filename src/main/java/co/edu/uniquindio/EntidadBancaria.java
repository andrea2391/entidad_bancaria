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

    public ArrayList<Usuario> agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
        return usuarios;
    }

    public Usuario regitrarUsuario(String nombre, String direccion, String cedula, String correo, String contrasena){

        var usuario = new Usuario(nombre, direccion, cedula, correo, contrasena);
        agregarUsuario(usuario);
        return usuario;
    }

    public void actualizarDatosUsuario(Usuario usuario, String elementoActual, String elementoNuevo){

        String[] datosUsuario = usuario.split(",");
        int aux = 0;
        for (int i=0; i < 5; i++){

            if (datosUsuario[i].equals(elementoActual)){
                aux = i;
            }
        }
         switch (aux) {
            case 0:usuario.setNombre(elementoNuevo); break;
            case 1:usuario.setDireccion(elementoNuevo);break;
            case 2:usuario.setCedula(elementoNuevo);break;
            case 3:usuario.setCorreo(elementoNuevo);break;
            case 4:usuario.setContrasena(elementoNuevo);break;
        
            default:
                break;
         }
    }

    public void eliminarUsuario(String cedula){

        

        return;
        
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

