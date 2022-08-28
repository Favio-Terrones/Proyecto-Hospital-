/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class HCapListaDoble {

    private HCapNodoDoble inicio;
    private HCapNodoDoble fin;
    private int cantidad;

    private String codigohistoriasiterativo;

    public HCapListaDoble() {
        codigohistoriasiterativo = "123450";
    }

    public HCapNodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(HCapNodoDoble inicio) {
        this.inicio = inicio;
    }

    public HCapNodoDoble getFin() {
        return fin;
    }

    public void setFin(HCapNodoDoble fin) {
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

    public String getCodigohistorias() {
        return String.valueOf(Integer.valueOf(codigohistoriasiterativo) + cantidad);
    }

    public void agregarAlFinal(HistoriaClinicaApertura elementoPa) {
      
        if (!estVacio()) {
            fin = new HCapNodoDoble(elementoPa, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new HCapNodoDoble(elementoPa);
        }
        cantidad++;
        
    }

    public void agregarAlInicio(HistoriaClinicaApertura elementoPa) {
        if (!estVacio()) {
            inicio = new HCapNodoDoble(elementoPa, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new HCapNodoDoble(elementoPa);
        }
        cantidad++;
    }

    public void agregarDelanteDeUnNodo(HCapNodoDoble anterior, HistoriaClinicaApertura elemento) {
        HCapNodoDoble nuevo = new HCapNodoDoble(elemento);

        if (anterior != null) {
            HCapNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente = siguiente;
            anterior.siguiente = nuevo;

        }
        cantidad++;
    }

    public void agregarDelanteDeUnaPosicion(int pos, HistoriaClinicaApertura elemento) {
        HCapNodoDoble nuevo = new HCapNodoDoble(elemento);
        HCapNodoDoble anterior = ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            HCapNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente = siguiente;
            anterior.siguiente = nuevo;

        }
        cantidad++;
    }

    public void RemplazarEnUnaPosicion(int pos, HistoriaClinicaApertura elemento) {
        HCapNodoDoble nodoenlapos = ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            nodoenlapos.elemento = elemento;

        }
    }

    public void mostrarListaInicioFin() {
        if (!estVacio()) {
            HCapNodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.siguiente;
            }
        }
    }

    public void mostrarListaFinInicio() {
        if (!estVacio()) {
            HCapNodoDoble auxiliar = fin;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.anterior;
            }
        }
    }

    public void eliminarNodoConCodigoInicioFin(int codigoPa) {
        HCapNodoDoble primero = inicio;
        boolean encontrado = false;
        while (primero != null && !encontrado) {
            encontrado = (Integer.valueOf(primero.elemento.getCodigohistoriaclinica()) == codigoPa);
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
        HCapNodoDoble primero = inicio;
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

    public HCapNodoDoble BuscarUltNodo(HCapNodoDoble node) {
        while (node.siguiente != null) {
            node = node.siguiente;
        }
        return node;
    }

    private HCapNodoDoble partirQSCodigo(HCapNodoDoble l, HCapNodoDoble h) {

        int x = Integer.valueOf(h.elemento.getCodigohistoriaclinica());

        HCapNodoDoble i = l.anterior;

        for (HCapNodoDoble j = l; j != h; j = j.siguiente) {
            if (Integer.valueOf(j.elemento.getCodigohistoriaclinica()) <= x) {
                // Similar to i++ for array
                i = (i == null) ? l : i.siguiente;
                HistoriaClinicaApertura temp = i.elemento;
                i.elemento = j.elemento;
                j.elemento = temp;
            }
        }
        i = (i == null) ? l : i.siguiente;  // Similar to i++
        HistoriaClinicaApertura temp = i.elemento;
        i.elemento = h.elemento;
        h.elemento = temp;
        return i;
    }

    private void QuickSortRecursivoCodigo(HCapNodoDoble l, HCapNodoDoble h) {
        if (h != null && l != h && l != h.siguiente) {
            HCapNodoDoble temp = partirQSCodigo(l, h);
            QuickSortRecursivoCodigo(l, temp.anterior);
            QuickSortRecursivoCodigo(temp.siguiente, h);
        }
    }

    public void IniciarQuickSortCodigoHistoria() {

        HCapNodoDoble head = BuscarUltNodo(inicio);
        QuickSortRecursivoCodigo(inicio, head);
    }
    
    private HCapNodoDoble partirQSCodigoPaciente(HCapNodoDoble l, HCapNodoDoble h) {

        int x = Integer.valueOf(h.elemento.getPaciente().getCodigoPaciente());

        HCapNodoDoble i = l.anterior;

        for (HCapNodoDoble j = l; j != h; j = j.siguiente) {
            if (Integer.valueOf(j.elemento.getPaciente().getCodigoPaciente()) <= x) {
                // Similar to i++ for array
                i = (i == null) ? l : i.siguiente;
                HistoriaClinicaApertura temp = i.elemento;
                i.elemento = j.elemento;
                j.elemento = temp;
            }
        }
        i = (i == null) ? l : i.siguiente;  // Similar to i++
        HistoriaClinicaApertura temp = i.elemento;
        i.elemento = h.elemento;
        h.elemento = temp;
        return i;
    }

    private void QuickSortRecursivoCodigoPaciente(HCapNodoDoble l, HCapNodoDoble h) {
        if (h != null && l != h && l != h.siguiente) {
            HCapNodoDoble temp = partirQSCodigoPaciente(l, h);
            QuickSortRecursivoCodigoPaciente(l, temp.anterior);
            QuickSortRecursivoCodigoPaciente(temp.siguiente, h);
        }
    }

    public void IniciarQuickSortCodigoPaciente() {

        HCapNodoDoble head = BuscarUltNodo(inicio);
        QuickSortRecursivoCodigoPaciente(inicio, head);
    }
    
    private HCapNodoDoble partirQSCodigoMedico(HCapNodoDoble l, HCapNodoDoble h) {

        int x = Integer.valueOf(h.elemento.getCodigomedico());

        HCapNodoDoble i = l.anterior;

        for (HCapNodoDoble j = l; j != h; j = j.siguiente) {
            if (Integer.valueOf(j.elemento.getCodigomedico()) <= x) {
                // Similar to i++ for array
                i = (i == null) ? l : i.siguiente;
                HistoriaClinicaApertura temp = i.elemento;
                i.elemento = j.elemento;
                j.elemento = temp;
            }
        }
        i = (i == null) ? l : i.siguiente;  // Similar to i++
        HistoriaClinicaApertura temp = i.elemento;
        i.elemento = h.elemento;
        h.elemento = temp;
        return i;
    }

    private void QuickSortRecursivoCodigoMedico(HCapNodoDoble l, HCapNodoDoble h) {
        if (h != null && l != h && l != h.siguiente) {
            HCapNodoDoble temp = partirQSCodigoMedico(l, h);
            QuickSortRecursivoCodigoMedico(l, temp.anterior);
            QuickSortRecursivoCodigoMedico(temp.siguiente, h);
        }
    }

    public void IniciarQuickSortCodigoMedico() {

        HCapNodoDoble head = BuscarUltNodo(inicio);
        QuickSortRecursivoCodigoMedico(inicio, head);
    }
    
    
    
    
    public int BuscarPosicionCodigoPaciente(HCapNodoDoble nodoreferencia, int codigoPaciente) {
      
        HCapNodoDoble temp = nodoreferencia;
        if (!estVacio()) {
           
            int pos = 0;
            
            while ( temp.siguiente != null && Integer.valueOf(temp.elemento.getPaciente().getCodigoPaciente()) != codigoPaciente) {
                
                pos++;
                
                
                temp = temp.siguiente;

              
            }

            // Si no se encuentra, devuelve -1
            if (Integer.valueOf(temp.elemento.getPaciente().getCodigoPaciente()) != codigoPaciente) {
                return -1;
            }
            return (pos);
        } else {
            return -1;
        }

        // Si lo encuentra lo devuelve el valor 
    }

    public int BuscarPosicionCodigoHistoria(HCapNodoDoble nodoreferencia, int codigoHistoria) {
  
        HCapNodoDoble temp = nodoreferencia;

        int pos = 0;

        while (Integer.valueOf(temp.elemento.getCodigohistoriaclinica()) != codigoHistoria && temp.siguiente != null) {
            // Update pos
            pos++;

            // Update temp
            temp = temp.siguiente;
        }

        // Si no se encuentra, devuelve -1
        if (Integer.valueOf(temp.elemento.getCodigohistoriaclinica()) != codigoHistoria) {
            return -1;
        }

        // Si lo encuentra lo devuelve el valor 
        return (pos);
    }

    public HCapNodoDoble ObtenerNodoConPosInicioFin(int posicion) {
        HCapNodoDoble temp = inicio;
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

    public HCapNodoDoble ObtenerNodoConCodigoPaciente(String codigo) {
        int posicion = BuscarPosicionCodigoPaciente(inicio, Integer.valueOf(codigo));

        return ObtenerNodoConPosInicioFin(posicion);
    }

    public HCapNodoDoble ObtenerNodoConCodigoHistoria(String codigo) {
        int posicion = BuscarPosicionCodigoHistoria(inicio, Integer.valueOf(codigo));

        return ObtenerNodoConPosInicioFin(posicion);
    }

    public boolean VerificarSiExisteConCodigoPaciente(String codigo) {
        if (BuscarPosicionCodigoPaciente(inicio, Integer.valueOf(codigo)) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public HCapListaDoble ObtenerListaDeHistoriasConCodPaciente(String codigoPaciente) {
        HCapListaDoble hcresult = new HCapListaDoble();
        
     
        HCapNodoDoble temp = inicio;

        if (inicio == fin) {
            if (temp.elemento.getPaciente().getCodigoPaciente().equals(codigoPaciente)) {
                HistoriaClinicaApertura nuevahistoriatemp = new HistoriaClinicaApertura();
                nuevahistoriatemp = temp.elemento;
                hcresult.agregarAlFinal(nuevahistoriatemp);
         
            }

        } else {
           
            while (temp != null) {

                if (temp.elemento.getPaciente().getCodigoPaciente().equals(codigoPaciente)) {
                    HistoriaClinicaApertura nuevahistoriatemp = new HistoriaClinicaApertura();
                    nuevahistoriatemp = temp.elemento;
                   
                    hcresult.agregarAlFinal(nuevahistoriatemp);
                }

                temp = temp.siguiente;

            }
        }
      
        return hcresult;
    }

    public String[] getCabeceraResumida() {
        String[] cabecera = {"Código Apertura", "Fecha", "Codigo Medico"};
        return cabecera;
    }

    public Object[][] getDatosResumidoInicioFinal() {

        Object resultado[][] = new Object[this.cantidad][3];
        if (!estVacio()) {
            HCapNodoDoble aux = inicio;
            for (int indice = 0; indice < this.cantidad; indice++) {
                resultado[indice][0] = aux.elemento.getCodigohistoriaclinica();
                resultado[indice][1] = aux.elemento.getFechaapertura();
                resultado[indice][2] = aux.elemento.getCodigomedico();

                aux = aux.siguiente;

            }
        }
        return resultado;

    }
    
    public String[] getCabeceraCompleta() {
        String[] cabecera = {"Código Apertura", "Codigo Medico","Codigo Paciente", "Fecha"};
        return cabecera;
    }

    public Object[][] getDatosCompletoInicioFinal() {

        Object resultado[][] = new Object[this.cantidad][4];
        if (!estVacio()) {
            HCapNodoDoble aux = inicio;
            for (int indice = 0; indice < this.cantidad; indice++) {
                resultado[indice][0] = aux.elemento.getCodigohistoriaclinica();
                resultado[indice][1] = aux.elemento.getCodigomedico();
                resultado[indice][2] = aux.elemento.getPaciente().getCodigoPaciente();
                resultado[indice][3] = aux.elemento.getFechaapertura();
                aux = aux.siguiente;

            }
        }
        return resultado;

    }
}
