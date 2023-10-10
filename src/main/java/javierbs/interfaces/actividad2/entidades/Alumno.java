/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javierbs.interfaces.actividad2.entidades;

import main.Principal;

/**
 *
 * @author javierbs
 */
public class Alumno {

    private String nombre;
    private String apellidos;
    private String email;
    private int edad;
    private String telefono;

    public Alumno() {
        super();
    }

    public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Alumno(String nombre, String apellidos, String email, int edad, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String setNombre(String nombre) {
        return this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String setApellidos(String apellidos) {
        return this.apellidos = apellidos;
    }

    public String getEmail() {
        return this.email;
    }

    public String setEmail(String email) {
        return this.email = email;
    }

    public int getEdad() {
        return this.edad;
    }

    public int setEdad(int edad) {
        return this.edad = edad;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String setTelefono(String telefono) {
        return this.telefono = telefono;
    }

    public boolean esMayorEdad(Alumno alumno) {
        if (alumno.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
    public static Alumno alumnoMasJoven(){
        int edad = 999;
        Alumno alumno = null;
        for(Alumno a: Principal.alumnos){
            if(a != null && a.getEdad() < edad){
                edad = a.getEdad();
                alumno = a;
            }
        }
        return alumno;
    }

}
