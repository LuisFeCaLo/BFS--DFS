package Grafos;
import java.util.HashMap;
/**@author LUIS-CIC*/
public class Nodos {
                                                                                int Identificador;
                                                                                String Nombre, Datos;
                                                                                HashMap<Integer, Nodos> Nodosadj = new HashMap<>();
                                                                                HashMap<Integer, Nodos> Padres = new HashMap<>();
                                                                                HashMap<Integer, Nodos> Hijos = new HashMap<>();
 
    public Nodos() 
                                                                                {/*constructor vacio*/  }
    public Nodos(int Identificador, String Nombre, String Datos)
                                                                                {
                                                                                this.Identificador = Identificador;
                                                                                this.Nombre = Nombre;
                                                                                this.Datos = Datos;
                                                                                }
    public int Dameidentificador() 
                                                                                {
                                                                                return Identificador;
                                                                                }
    public String Damenombre()
                                                                                {
                                                                                return Nombre;
                                                                                }
    public String Damedatos()
                                                                                {
                                                                                return Datos;
                                                                                }
     public void Dadatos(String Dato) 
                                                                                {
                                                                                Datos = Dato;
                                                                                }
    public void Dameadj(Nodos Nodo) 
                                                                                {
                                                                                Nodosadj.put(Nodo.Dameidentificador(), Nodo);
                                                                                }
    public HashMap<Integer, Nodos> Regresaadj() 
                                                                                {
                                                                                return Nodosadj;
                                                                                }
    public void DamePadres(Nodos Nodo) 
                                                                                {
                                                                                Padres.put(Nodo.Dameidentificador(), Nodo);
                                                                                }
    public HashMap<Integer, Nodos> RegresaPadres() 
                                                                                {
                                                                                return Padres;
                                                                                } 
    public void DameHijos(Nodos Nodo) 
                                                                                {
                                                                                Hijos.put(Nodo.Dameidentificador(), Nodo);
                                                                                }
    public HashMap<Integer, Nodos> RegresaHijos() 
                                                                                {
                                                                                return Hijos;
                                                                                }    
   
   
}
    
    
    
    

