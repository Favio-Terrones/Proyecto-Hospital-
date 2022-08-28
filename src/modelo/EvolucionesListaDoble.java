/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class EvolucionesListaDoble {
    private EvolucionesNodoDoble inicio;
    private EvolucionesNodoDoble fin;
    private int cantidad;

    public EvolucionesNodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(EvolucionesNodoDoble inicio) {
        this.inicio = inicio;
    }

    public EvolucionesNodoDoble getFin() {
        return fin;
    }

    public void setFin(EvolucionesNodoDoble fin) {
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

    public void agregarAlFinal(Evolucion  elementoPa) {
        if (!estVacio()) {
            fin = new EvolucionesNodoDoble(elementoPa, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new EvolucionesNodoDoble(elementoPa);
        }
        cantidad++;
    }

    public void agregarAlInicio(Evolucion elementoPa) {
        if (!estVacio()) {
            inicio = new EvolucionesNodoDoble(elementoPa, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new EvolucionesNodoDoble(elementoPa);
        }
        cantidad++;
    }

    public void agregarDelanteDeUnNodo(EvolucionesNodoDoble anterior, Evolucion elemento) {
        EvolucionesNodoDoble nuevo = new EvolucionesNodoDoble(elemento);

        if (anterior != null) {
            EvolucionesNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente = siguiente;
            anterior.siguiente = nuevo;

        }
        cantidad++;
    }

    public void agregarDelanteDeUnaPosicion(int pos, Evolucion elemento) {
        EvolucionesNodoDoble nuevo = new EvolucionesNodoDoble (elemento);
        EvolucionesNodoDoble anterior =  ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            EvolucionesNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente=siguiente;
            anterior.siguiente=nuevo;
            
        }
        cantidad++;
    }
    public void RemplazarEnUnaPosicion(int pos, Evolucion elemento) {
        EvolucionesNodoDoble nodoenlapos =  ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            nodoenlapos.elemento=elemento;
            
        }
    }
    public void MostrarListaInicioFin() {
        if (!estVacio()) {
            EvolucionesNodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.siguiente;
            }
        }
    }

    public void MostrarListaFinInicio() {
        if (!estVacio()) {
            EvolucionesNodoDoble auxiliar = fin;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.anterior;
            }
        }
    }
    
    public void EliminarNodoConPosInicioFin(int  posicionPa) {
        EvolucionesNodoDoble primero = inicio;
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

    public EvolucionesNodoDoble BuscarUltNodo(EvolucionesNodoDoble node) {
        while (node.siguiente != null) {
            node = node.siguiente;
        }
        return node;
    }
    
    
    public EvolucionesNodoDoble ObtenerNodoConPosInicioFin(int posicion) {
        
        
        EvolucionesNodoDoble temp = inicio;
        int pos = 0;
        while (temp != null) {

            if (pos == posicion) {
                return temp;
            }
            pos++;
            temp = temp.siguiente;
        }

        return null;

    }
    
    public String[] getcabecera(){
        String[] cabecera = {"Fecha", "Hora"};
        return cabecera;
    }
    
    public Object[][] getDatosInicioFinal() {
  
        Object resultado[][] = new Object[this.cantidad][2];
        if (!estVacio()) {
            EvolucionesNodoDoble aux = inicio;
            for (int indice = 0; indice < this.cantidad; indice++) {
                
                resultado[indice][0] = aux.elemento.getFechaevo();
                resultado[indice][1] = aux.elemento.getHoraevo();
                
                
                aux = aux.siguiente;

            }
        }
        return resultado;

    }
    
}
