package app;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Libreria {
   
	private int cantidad;
	private int t_proceso;
    private int cantPorDia;
    private ArrayList<String> libros;
    
    public int getProceso(){
        return t_proceso;
    }
  

    public int getCantidadDia(){
        return cantPorDia;
    }

    public int getCantidad(){
        return cantidad;
    }

    public ArrayList<String> getlibros(){
        return libros;
    }

     

	public Libreria(int c, int t, int e) {
		cantidad=c;
        t_proceso=t;
        cantPorDia=e;
    }
    

    public void addLibro(String n) {
        libros.add(n);
    }

}