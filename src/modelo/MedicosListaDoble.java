/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class MedicosListaDoble {

    private MedicosNodoDoble inicio;
    private MedicosNodoDoble fin;
    private int cantidad;

    public MedicosListaDoble() {
        inicio = fin = null;
    }

    public MedicosNodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(MedicosNodoDoble inicio) {
        this.inicio = inicio;
    }

    public MedicosNodoDoble getFin() {
        return fin;
    }

    public void setFin(MedicosNodoDoble fin) {
        this.fin = fin;
    }

    public boolean estVacio() {
        return inicio == null;
    }

    public void agregarAlFinal(Medico elementoPa) {
        if (!estVacio()) {
            fin = new MedicosNodoDoble(elementoPa, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new MedicosNodoDoble(elementoPa);
        }
        cantidad++;
    }

    public void agregarAlInicio(Medico elementoPa) {
        if (!estVacio()) {
            inicio = new MedicosNodoDoble(elementoPa, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new MedicosNodoDoble(elementoPa);
        }
        cantidad++;
    }

    public void agregarDelanteDeUnNodo(MedicosNodoDoble anterior, Medico elemento) {
        MedicosNodoDoble nuevo = new MedicosNodoDoble(elemento);

        if (anterior != null) {
            MedicosNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente = siguiente;
            anterior.siguiente = nuevo;

        }
        cantidad++;
    }

    public void agregarDelanteDeUnaPosicion(int pos, Medico elemento) {
        MedicosNodoDoble nuevo = new MedicosNodoDoble(elemento);
        MedicosNodoDoble anterior = ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            MedicosNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente = siguiente;
            anterior.siguiente = nuevo;

        }
        cantidad++;
    }

    public void RemplazarEnUnaPosicion(int pos, Medico elemento) {
        MedicosNodoDoble nodoenlapos = ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            nodoenlapos.elemento = elemento;

        }
    }

    public void mostrarListaInicioFin() {
        if (!estVacio()) {
            MedicosNodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.siguiente;
            }
        }
    }

    public void mostrarListaFinInicio() {
        if (!estVacio()) {
            MedicosNodoDoble auxiliar = fin;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.anterior;
            }
        }
    }

    public void EliminarNodoConCodigoInicioFin(int codigoPa) {
        MedicosNodoDoble primero = inicio;
        boolean encontrado = false;
        while (primero != null && !encontrado) {
            encontrado = (Integer.valueOf(primero.elemento.getCodigomedico()) == codigoPa);
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

    public void EliminarNodoConPosInicioFin(int posicionPa) {
        MedicosNodoDoble primero = inicio;
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

    public MedicosNodoDoble BuscarUltNodo(MedicosNodoDoble node) {
        while (node.siguiente != null) {
            node = node.siguiente;
        }
        return node;
    }

    private MedicosNodoDoble partirQSCodigo(MedicosNodoDoble l, MedicosNodoDoble h) {

        int x = Integer.valueOf(h.elemento.getCodigomedico());

        MedicosNodoDoble i = l.anterior;

        for (MedicosNodoDoble j = l; j != h; j = j.siguiente) {
            if (Integer.valueOf(j.elemento.getCodigomedico()) <= x) {
                // Similar to i++ for array
                i = (i == null) ? l : i.siguiente;
                Medico temp = i.elemento;
                i.elemento = j.elemento;
                j.elemento = temp;
            }
        }
        i = (i == null) ? l : i.siguiente;  // Similar to i++
        Medico temp = i.elemento;
        i.elemento = h.elemento;
        h.elemento = temp;
        return i;
    }

    private void QuickSortRecursivoCodigo(MedicosNodoDoble l, MedicosNodoDoble h) {
        if (h != null && l != h && l != h.siguiente) {
            MedicosNodoDoble temp = partirQSCodigo(l, h);
            QuickSortRecursivoCodigo(l, temp.anterior);
            QuickSortRecursivoCodigo(temp.siguiente, h);
        }
    }

    public void IniciarQuickSortCodigo(MedicosNodoDoble node) {

        MedicosNodoDoble head = BuscarUltNodo(node);
        QuickSortRecursivoCodigo(node, head);
    }
    
    
    
    private MedicosNodoDoble partirQSEspecilidad(MedicosNodoDoble l, MedicosNodoDoble h) {
//AlumnoA[j].getApellidos().compareToIgnoreCase(AlumnoA[j + 1].getApellidos())
        String x = h.elemento.getEspecialidad();

        MedicosNodoDoble i = l.anterior;

        for (MedicosNodoDoble j = l; j != h; j = j.siguiente) {
            if (j.elemento.getEspecialidad().compareToIgnoreCase(x) < 0) {
                // Similar to i++ for array
                i = (i == null) ? l : i.siguiente;
                Medico temp = i.elemento;
                i.elemento = j.elemento;
                j.elemento = temp;
            }
        }
        i = (i == null) ? l : i.siguiente;  // Similar to i++
        Medico temp = i.elemento;
        i.elemento = h.elemento;
        h.elemento = temp;
        return i;
    }

    private void QuickSortRecursivoEspecialidad(MedicosNodoDoble l, MedicosNodoDoble h) {
        if (h != null && l != h && l != h.siguiente) {
            MedicosNodoDoble temp = partirQSEspecilidad(l, h);
            QuickSortRecursivoEspecialidad(l, temp.anterior);
            QuickSortRecursivoEspecialidad(temp.siguiente, h);
        }
    }

    public void IniciarQuickSortEspecialidad(MedicosNodoDoble node) {

        MedicosNodoDoble head = BuscarUltNodo(node);
        QuickSortRecursivoEspecialidad(node, head);
    }

    public int BuscarPosicionCodigo(MedicosNodoDoble nodoreferencia, int codigoPa) {

        MedicosNodoDoble temp = nodoreferencia;

        int pos = 0;

        while (Integer.valueOf(temp.elemento.getCodigomedico()) != codigoPa && temp.siguiente != null) {
            // Update pos
            pos++;

            // Update temp
            temp = temp.siguiente;
        }

        // Si no se encuentra, devuelve -1
        if (Integer.valueOf(temp.elemento.getCodigomedico()) != codigoPa) {
            return -1;
        }
        // Si lo encuentra lo devuelve el valor 
        return (pos);
    }
    
    public int BuscarPosicionEspyNumero(MedicosNodoDoble nodoreferencia, String esp,String numero) {
        MedicosNodoDoble temp = nodoreferencia;

        int pos = 0;
        
        
        if(!(temp.elemento.getEspecialidad().equals(esp)&&temp.elemento.getNumeroesp().equals(numero)) && temp.siguiente != null){
        }
        while (!(temp.elemento.getEspecialidad().equals(esp)&&temp.elemento.getNumeroesp().equals(numero)) && temp.siguiente != null) {
            // Update pos
            pos++;
            
            // Update temp
            temp = temp.siguiente;
        }

        // Si no se encuentra, devuelve -1
        if (!(temp.elemento.getEspecialidad().equals(esp)&&temp.elemento.getNumeroesp().equals(numero))) {
            return -1;
        }
        // Si lo encuentra lo devuelve el valor 
        return (pos);
    }

    public MedicosNodoDoble ObtenerNodoConPosInicioFin(int posicion) {
        MedicosNodoDoble temp = inicio;
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

    public MedicosNodoDoble ObtenerNodoConCodigo(String codigo) {
        int posicion = BuscarPosicionCodigo(inicio, Integer.valueOf(codigo));
        return ObtenerNodoConPosInicioFin(posicion);
    }
    
    public MedicosNodoDoble ObtenerNodoConEspyNumero(String espe,String numero) {
        int posicion = BuscarPosicionEspyNumero(inicio, espe,numero);
        return ObtenerNodoConPosInicioFin(posicion);
    }

    public boolean VerificarSiExsiteConCodigo(String codigo) {
        if (BuscarPosicionCodigo(inicio, Integer.valueOf(codigo)) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean VerificarSiExisteConNombreyContra(String nombre, String contra) {
        MedicosNodoDoble auxiliar = inicio;
        if (inicio == fin) {
            if (auxiliar.elemento.getCuentacontra().equals(contra) && auxiliar.elemento.getCuentanombre().equals(nombre)) {
                return true;
            }
        }

        if (!estVacio()) {

            while (auxiliar != null) {


                if (auxiliar.elemento.getCuentacontra().equals(contra) && auxiliar.elemento.getCuentanombre().equals(nombre)) {
                    return true;
                }
                auxiliar = auxiliar.siguiente;
            }
        }
        return false;

    }

    public MedicosNodoDoble ObtenerNodoConNombreyContra(String nombre, String contra) {
        MedicosNodoDoble auxiliar = inicio;
        if (inicio == fin) {
            if (auxiliar.elemento.getCuentacontra().equals(contra) && auxiliar.elemento.getCuentanombre().equals(nombre)) {
                return auxiliar;
            }
        }

        if (!estVacio()) {

            while (auxiliar != null) {

                

                if (auxiliar.elemento.getCuentacontra().equals(contra) && auxiliar.elemento.getCuentanombre().equals(nombre)) {
                    return auxiliar;
                }
                auxiliar = auxiliar.siguiente;
            }
        }
        return null;

    }

    //METODOS PARA LA TABLA  
    public boolean asignarCitaAunMedico(String codigomedico, String dia, Paciente codigopaciente) {
        return ObtenerNodoConCodigo(codigomedico).elemento.asignarMedicoCita(dia, codigopaciente);

    }

    public String[] getCabeceraCita() {
        String[] cabecera = {"Código", "Nombres",  "Especialidad","Numero"};
        return cabecera;
    }

    public Object[][] getDatosCitaInicioFinal() {

        Object resultado[][] = new Object[this.cantidad][4];
        if (!estVacio()) {
            MedicosNodoDoble aux = inicio;
            for (int indice = 0; indice < this.cantidad; indice++) {
                
                resultado[indice][0] = aux.elemento.getCodigomedico();
                resultado[indice][1] = aux.elemento.getNombres();
                resultado[indice][2] = aux.elemento.getEspecialidad();
                resultado[indice][3] = aux.elemento.getNumeroesp();

                aux = aux.siguiente;

            }
        }
        return resultado;
        
    }

    public String[] getCabeceraUsSis() {
        String[] cabecera = {"Código", "Nombres", "Apellidos", "N°Documento", "Especialidad"};
        return cabecera;
    }

    public Object[][] getDatosUsSisInicioFinal() {

        Object resultado[][] = new Object[this.cantidad][5];
        if (!estVacio()) {
            MedicosNodoDoble aux = inicio;
            for (int indice = 0; indice < this.cantidad; indice++) {
                /*if ( aux.elemento == -1) {
                    resultado[indice][0] = aux;
                } else {
                    resultado[indice][0] = aux.elemento;
    
                }*/
                resultado[indice][0] = aux.elemento.getCodigomedico();
                resultado[indice][1] = aux.elemento.getNombres();
                resultado[indice][2] = aux.elemento.getApellidos();
                resultado[indice][3] = aux.elemento.getNumdocument();
                resultado[indice][4] = aux.elemento.getEspecialidad();

                aux = aux.siguiente;

            }
        }
        return resultado;

    }
    
        
}
