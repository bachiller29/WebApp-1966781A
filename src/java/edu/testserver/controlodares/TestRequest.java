/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.testserver.controlodares;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author GAMER
 */
@ManagedBean
@Named(value = "testRequest")
@RequestScoped
public class TestRequest {
String nombreUsuario = "";
String clave = "";
 public void datosFormulario(){
     System.out.print("Su nombre es " + this.nombreUsuario + " Su clave Es : " + this.clave );
//     this.nombreUsuario-"";
 }
    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }




    /**
     * Creates a new instance of TestRequest
     */
    public TestRequest() {
    }
    
   
}
