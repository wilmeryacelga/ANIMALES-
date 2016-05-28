/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animales;

/**
 *
 * @author Pollo
 */
public class clsTipoAnimales {

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float Peso() {
        return _peso;
    }

    public void Peso(float _peso) {
        this._peso = _peso;
    }

    public Tipo Tipo() {
        return _tipo;
    }

    public void Tipo(Tipo _tipo) {
        this._tipo = _tipo;
    }

 
    
    public enum Tipo{vertebrados, invertebrados, oviparos, mamiferos};

    private int _id;
    private String _nombre;
    private float _peso;
    private Tipo _tipo;

    public clsTipoAnimales(int _id, String _nombre, float _peso, Tipo _tipo) {
        this._id = _id;
        this._nombre = _nombre;
        this._peso = _peso;
        this._tipo = _tipo;
    }

    public clsTipoAnimales() {
    }


    }

  
