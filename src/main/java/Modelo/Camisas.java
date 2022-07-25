package Modelo;

import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

import java.util.Objects;

public class Camisas {
    private String Color;

    private float Precio;

    private String Desc;

    private ComboBox Combo;

    public Camisas(String color, float precio, String desc, ObservableList list) {
        Color = color;
        Precio = precio;
        Desc = desc;
        Combo = new ComboBox(list);
    }
    public  Camisas(String color, String desc, float precios){
        Color = color;
        Desc = desc;
        Precio = precios;
        Combo = new ComboBox();
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String nombre) {
        Color = nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public ComboBox getCombo() {
        return Combo;
    }

    public void setCombo(ComboBox combo) {
        Combo = combo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Camisas)) return false;
        Camisas camisas = (Camisas) o;
        return Float.compare(camisas.getPrecio(), getPrecio()) == 0 && getColor().equals(camisas.getColor()) && getDesc().equals(camisas.getDesc());

    }

    @Override
    public String toString() {
        return "Camisas{" +
                "Nombre='" + Color + '\'' +
                ", Precio=" + Precio +
                ", Desc='" + Desc + '\'' +
                '}';
    }
}

