package co.edu.uniquindio;


public class Usuario {

    private String nombre;
    private String direccion;
    private String cedula;
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String direccion, String cedula, String correo, String contrasena){

        this.nombre = nombre;
        this.direccion = direccion;
        this.cedula = cedula;
        this.contrasena = contrasena;
        this.correo = correo;
    }






    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }

    public String getCedula(){
        return cedula;
    }

    public String getCorreo(){
        return correo;
    }

    public String getContrasena(){
        return contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
