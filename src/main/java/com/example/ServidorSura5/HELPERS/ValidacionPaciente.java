package com.example.ServidorSura5.HELPERS;

import com.example.ServidorSura5.MODELOS.Paciente;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionPaciente {

    //1 INYECTAR UN OBJETO DE LA CLASE MODELO
    //INYECTAR = TRAER UNA CLASE Y USARLA DENTRO DE OTRA

    private Paciente paciente= new Paciente();

    //2 Creamos un metodo para cada campo que quiero validar
    public boolean validarNombres(String nombres){
        //1.Se consulta una expresion regular
        // almacenando la en una variable de tipo STRING

        String expresionRegular="^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$";
        // formato correo = "^[a-zA-Z"
        //2. Activar el patron

        Pattern patron=Pattern.compile(expresionRegular);

        //3. Se busca coincidencia entre la cadena y el patron

        Matcher coincidencia= patron.matcher(nombres);

        //4. Indico si hubo o no hubo coincidencia

        if (coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarFechaNacimiento(LocalDate fecha){}

    public boolean validarCiudad(String ciudad){
        //1.Se consulta una expresion regular
        // almacenando la en una variable de tipo STRING

        String expresionRegular="^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$";
        // formato correo = "^[a-zA-Z"
        //2. Activar el patron

        Pattern patron=Pattern.compile(expresionRegular);

        //3. Se busca coincidencia entre la cadena y el patron

        Matcher coincidencia= patron.matcher(ciudad;

        //4. Indico si hubo o no hubo coincidencia

        if (coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarCorreo(String correo){
        //1.Se consulta una expresion regular
        // almacenando la en una variable de tipo STRING

        String expresionRegular="^[a-zA-Z0-9._%+-]@sura\.com$";
        // formato correo = "^[a-zA-Z"
        //2. Activar el patron

        Pattern patron=Pattern.compile(expresionRegular);

        //3. Se busca coincidencia entre la cadena y el patron

        Matcher coincidencia= patron.matcher(correo);

        //4. Indico si hubo o no hubo coincidencia

        if (coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }

    public boolean validartelefono(String telefono){
        //1.Se consulta una expresion regular
        // almacenando la en una variable de tipo STRING

        String expresionRegular="^[a-z0123456789]+$";
        // formato correo = "^[a-zA-Z"
        //2. Activar el patron

        Pattern patron=Pattern.compile(expresionRegular);

        //3. Se busca coincidencia entre la cadena y el patron

        Matcher coincidencia= patron.matcher(telefono);

        //4. Indico si hubo o no hubo coincidencia

        if (coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }

    public boolean valdarIps(String ips){}

    public boolean validarGrupoIngreso(String grupoingreso){
        //1.Se consulta una expresion regular
        // almacenando la en una variable de tipo STRING

        String expresionRegular="^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$";
        // formato correo = "^[a-zA-Z"
        //2. Activar el patron

        Pattern patron=Pattern.compile(expresionRegular);

        //3. Se busca coincidencia entre la cadena y el patron

        Matcher coincidencia= patron.matcher(grupoingreso);

        //4. Indico si hubo o no hubo coincidencia

        if (coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarFechaAfiliacion(String fechaAfiliacion){}


}
