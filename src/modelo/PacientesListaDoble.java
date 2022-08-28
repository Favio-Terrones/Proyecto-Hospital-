/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class PacientesListaDoble {

    private PacientesNodoDoble inicio;
    private PacientesNodoDoble fin;
    private int cantidad;

    public PacientesListaDoble() {
        inicio = fin = null;
    }

    public PacientesNodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(PacientesNodoDoble inicio) {
        this.inicio = inicio;
    }

    public PacientesNodoDoble getFin() {
        return fin;
    }

    public void setFin(PacientesNodoDoble fin) {
        this.fin = fin;
    }

    public boolean estVacio() {
        return inicio == null;
    }

    public void agregarAlFinal(Paciente elementoPa) {
        if (!estVacio()) {
            fin = new PacientesNodoDoble(elementoPa, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new PacientesNodoDoble(elementoPa);
        }
        cantidad++;
    }

    public void agregarAlInicio(Paciente el) {
        if (!estVacio()) {
            inicio = new PacientesNodoDoble(el, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new PacientesNodoDoble(el);
        }
        cantidad++;
    }

    public void agregarDelanteDeUnNodo(PacientesNodoDoble anterior, Paciente elemento) {
        PacientesNodoDoble nuevo = new PacientesNodoDoble(elemento);

        if (anterior != null) {
            PacientesNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente = siguiente;
            anterior.siguiente = nuevo;

        }
        cantidad++;
    }

    public void agregarDelanteDeUnaPosicion(int pos, Paciente elemento) {
        PacientesNodoDoble nuevo = new PacientesNodoDoble(elemento);
        PacientesNodoDoble anterior = ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            PacientesNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente = siguiente;
            anterior.siguiente = nuevo;

        }
        cantidad++;
    }

    public void RemplazarEnUnaPosicion(int pos, Paciente elemento) {
        PacientesNodoDoble nodoenlapos = ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            nodoenlapos.elemento = elemento;

        }
    }

    public void mostrarListaInicioFin() {
        if (!estVacio()) {
            PacientesNodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.siguiente;
            }
        }
    }

    public void mostrarListaFinInicio() {
        if (!estVacio()) {
            PacientesNodoDoble auxiliar = fin;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.anterior;
            }
        }
    }

    public void eliminarNodoConCodigo(int codigoPa) {
        PacientesNodoDoble primero = inicio;
        boolean encontrado = false;
        while (primero != null && !encontrado) {
            encontrado = (Integer.valueOf(primero.elemento.getCodigoPaciente()) == codigoPa);
            if (!encontrado) {
                primero = primero.siguiente;
            }
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

    public void eliminarNodoConPosInicioFin(int posicionPa) {
        PacientesNodoDoble primero = inicio;
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

    public PacientesNodoDoble BuscarUltNodo(PacientesNodoDoble node) {
        while (node.siguiente != null) {
            node = node.siguiente;
        }
        return node;
    }

    private PacientesNodoDoble partirQSCodigo(PacientesNodoDoble l, PacientesNodoDoble h) {

        int x = Integer.valueOf(h.elemento.getCodigoPaciente());

        PacientesNodoDoble i = l.anterior;

        for (PacientesNodoDoble j = l; j != h; j = j.siguiente) {
            if (Integer.valueOf(j.elemento.getCodigoPaciente()) <= x) {
                // Similar to i++ for array
                i = (i == null) ? l : i.siguiente;
                Paciente temp = i.elemento;
                i.elemento = j.elemento;
                j.elemento = temp;
            }
        }
        i = (i == null) ? l : i.siguiente;  // Similar to i++
        Paciente temp = i.elemento;
        i.elemento = h.elemento;
        h.elemento = temp;
        return i;
    }

    private void QuickSortRecursivoCodigo(PacientesNodoDoble l, PacientesNodoDoble h) {
        if (h != null && l != h && l != h.siguiente) {
            PacientesNodoDoble temp = partirQSCodigo(l, h);
            QuickSortRecursivoCodigo(l, temp.anterior);
            QuickSortRecursivoCodigo(temp.siguiente, h);
        }
    }

    public void IniciarQuickSortCodigo(PacientesNodoDoble node) {

        PacientesNodoDoble head = BuscarUltNodo(node);
        QuickSortRecursivoCodigo(node, head);
    }

    public int BuscarPosicionCodigo(PacientesNodoDoble nodoreferencia, int codigoPa) {

        PacientesNodoDoble temp = nodoreferencia;

        int pos = 0;

        while (Integer.valueOf(temp.elemento.getCodigoPaciente()) != codigoPa && temp.siguiente != null) {
            // Update pos
            pos++;

            // Update temp
            temp = temp.siguiente;
        }

        // Si no se encuentra, devuelve -1
        if (Integer.valueOf(temp.elemento.getCodigoPaciente()) != codigoPa) {
            return -1;
        }
        // Si lo encuentra lo devuelve el valor 
        return (pos);
    }

    public PacientesNodoDoble ObtenerNodoConPosInicioFin(int posicion) {
        PacientesNodoDoble temp = inicio;
        int pos = 0;
    
        if (inicio == fin) {
            return inicio;
        } else {
            while (pos != cantidad) {

                if (pos == posicion) {
                 
                    return temp;

                }
           
                pos++;
                temp = temp.siguiente;
            }
        }

        
        return null;
    }

    public PacientesNodoDoble ObtenerNodoConCodigo(String codigo) {
        int posicion = BuscarPosicionCodigo(inicio, Integer.valueOf(codigo));
        return ObtenerNodoConPosInicioFin(posicion);
    }

    public boolean VerificarSiExisteConCodigo(String codigo) {
        if (BuscarPosicionCodigo(inicio, Integer.valueOf(codigo)) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean VerificarSiExisteConNombreyContra(String nombre, String contra) {
        PacientesNodoDoble temp = inicio;
        if (inicio == fin) {
            if (temp.elemento.getCuentacontra().equals(contra) && temp.elemento.getCuentanombre().equals(nombre)) {
                return true;
            }
        }
        while (temp != null) {
            // Update pos
            if (temp.elemento.getCuentacontra().equals(contra) && temp.elemento.getCuentanombre().equals(nombre)) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;

    }

    public PacientesNodoDoble ObtenerNodoConNombreyContra(String nombre, String contra) {
        PacientesNodoDoble temp = inicio;
        if (inicio == fin) {
            if (temp.elemento.getCuentacontra().equals(contra) && temp.elemento.getCuentanombre().equals(nombre)) {
                return temp;
            }
        }
        while (temp != null) {
            // Update pos
            if (temp.elemento.getCuentacontra().equals(contra) && temp.elemento.getCuentanombre().equals(nombre)) {
                return temp;
            }
            temp = temp.siguiente;
        }

        return null;

    }
    //METODOS PARA LA TABLA  

    public String[] cabecera() {
        String[] cabecera = {"Código", "Apell Paterno", "Apell Materno", "Nombres", "Tip Documento", "N°Documento", "Edad"};
        return cabecera;
    }

    public Object[][] getDatosInicioFinal() {

        Object resultado[][] = new Object[this.cantidad][7];
        if (!estVacio()) {
            PacientesNodoDoble aux = inicio;
            for (int indice = 0; indice < this.cantidad; indice++) {
                /*if ( aux.elemento == -1) {
                    resultado[indice][0] = aux;
                } else {
                    resultado[indice][0] = aux.elemento;
    
                }*/
                resultado[indice][0] = aux.elemento.getCodigoPaciente();
                resultado[indice][1] = aux.elemento.getApellPat();
                resultado[indice][2] = aux.elemento.getApellMat();
                resultado[indice][3] = aux.elemento.getNombres();
                resultado[indice][4] = aux.elemento.getTipodocumento();
                resultado[indice][5] = aux.elemento.getDocumento();
                resultado[indice][6] = aux.elemento.getEdad();

                aux = aux.siguiente;

            }
        }
        return resultado;

    }

}
