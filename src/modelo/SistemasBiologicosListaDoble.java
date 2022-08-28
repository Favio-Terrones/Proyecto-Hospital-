/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class SistemasBiologicosListaDoble {
    private SistemasBiologicosNodoDoble inicio;
    private SistemasBiologicosNodoDoble fin;
    private int cantidad;

    public SistemasBiologicosListaDoble() {
    }

    public SistemasBiologicosNodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(SistemasBiologicosNodoDoble inicio) {
        this.inicio = inicio;
    }

    public SistemasBiologicosNodoDoble getFin() {
        return fin;
    }

    public void setFin(SistemasBiologicosNodoDoble fin) {
        this.fin = fin;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public boolean estVacio() {
        return inicio == null;
    }

    public void agregarAlFinal(SistemaBiologico  elementoPa) {
        if (!estVacio()) {
            fin = new SistemasBiologicosNodoDoble(elementoPa, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new SistemasBiologicosNodoDoble(elementoPa);
        }
        cantidad++;
    }

    public void agregarAlInicio(SistemaBiologico  el) {
        if (!estVacio()) {
            inicio = new SistemasBiologicosNodoDoble(el, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new SistemasBiologicosNodoDoble(el);
        }
        cantidad++;
    }

    public void agregarDelanteDeUnNodo(SistemasBiologicosNodoDoble anterior, SistemaBiologico  elemento) {
        SistemasBiologicosNodoDoble nuevo = new SistemasBiologicosNodoDoble(elemento);

        if (anterior != null) {
            SistemasBiologicosNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente = siguiente;
            anterior.siguiente = nuevo;

        }
        cantidad++;
    }

    public void agregarDelanteDeUnaPosicion(int pos, SistemaBiologico  elemento) {
        SistemasBiologicosNodoDoble nuevo = new SistemasBiologicosNodoDoble (elemento);
        SistemasBiologicosNodoDoble anterior =  ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            SistemasBiologicosNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente=siguiente;
            anterior.siguiente=nuevo;
            
        }
        cantidad++;
    }
    public void RemplazarEnUnaPosicion(int pos, SistemaBiologico elemento) {
        SistemasBiologicosNodoDoble nodoenlapos =  ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            nodoenlapos.elemento=elemento;
            
        }
    }
    public void mostrarListaInicioFin() {
        if (!estVacio()) {
            SistemasBiologicosNodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.siguiente;
            }
        }
    }

    public void mostrarListaFinInicio() {
        if (!estVacio()) {
            SistemasBiologicosNodoDoble auxiliar = fin;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.anterior;
            }
        }
    }
    
  
    
    public void eliminarNodoConPosInicioFin(int  posicionPa) {
        SistemasBiologicosNodoDoble primero = inicio;
        boolean encontrado = false;
        int pos = 0;
        while (primero != null && !encontrado) {
            
            encontrado = (pos == posicionPa);
            if (!encontrado) {
                primero = primero.siguiente;
            }
            pos++;
        }
        if (encontrado) {
            if (primero == inicio) {
                inicio = primero.siguiente;
            } else {
                primero.anterior.siguiente = primero.siguiente;

                if (primero.siguiente != null) {
                    primero.siguiente.anterior = primero.anterior;
                }

            }
            primero = null;
        }
        cantidad--;

    }
    
    public SistemasBiologicosNodoDoble BuscarUltNodo(SistemasBiologicosNodoDoble node) {
        while (node.siguiente != null) {
            node = node.siguiente;
        }
        return node;
    }

    
    

    public SistemasBiologicosNodoDoble ObtenerNodoConPosInicioFin(int posicion) {
        SistemasBiologicosNodoDoble temp = inicio;
        int pos = 0;
        System.out.println("La posicion que se manda es: "+posicion);
        if(inicio==fin){
            return inicio;
        }else{
            while (temp != null) {

            if (pos == posicion) {
                System.out.println("Se retorna no null");
                return temp;
                
            }
            pos++;
            temp = temp.siguiente;
        }
        }
        
        
        System.out.println("Se retorna null");
        return null;

    }
    
    
}
