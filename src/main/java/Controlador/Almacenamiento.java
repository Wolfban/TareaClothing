package Controlador;

import Modelo.Camisas;
import Modelo.Usuarios;
import Modelo.Catalogos;
import javafx.scene.control.ComboBox;

import java.util.ArrayList;

public class Almacenamiento {
    public static ArrayList<Usuarios> poolusuarios = new ArrayList<>();
    public static  ArrayList<Camisas> poolcamisas = new ArrayList<>();


    public  static  ArrayList<Catalogos> poolcatalogos = new ArrayList<>();



    public static boolean RevisarID(int id){
        boolean DobleID = false;
        for(int i = 0; i< poolusuarios.size(); i++){
            if(id == poolusuarios.get(i).getID()){
                DobleID = true;
            }
        }
        return DobleID;
    }

    public static boolean agregarCliente (String nombre, String primerApellido, String segundoApellido, String direccion, String correo, int id) {
        boolean hayError = false;
        Usuarios usuarionew = new Usuarios(nombre, primerApellido, segundoApellido, direccion, correo, id);
        if (poolusuarios.size() == 0){
            poolusuarios.add(usuarionew);

        } else if (!RevisarID(id)) {
            poolusuarios.add(usuarionew);
        }else{
            hayError = true;
        }
        return hayError;
    }
    public static void agregarCamisa (String nombre, float precios, String Descripcion) {
     Camisas nuevaCamisa = new Camisas(nombre, Descripcion, precios);
     poolcamisas.add(nuevaCamisa);
    }
    public static void agregarCatalogo () {
        Catalogos nuevoCatalogo = new Catalogos();
        poolcatalogos.add(nuevoCatalogo);
    }



}
