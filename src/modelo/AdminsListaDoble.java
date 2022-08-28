/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class AdminsListaDoble {
    private AdminsNodoDoble inicio;
    private AdminsNodoDoble fin;
    private int cantidad;

    public AdminsListaDoble() {
        
        inicio = fin = null;
    
    }
    
    public AdminsNodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(AdminsNodoDoble inicio) {
        this.inicio = inicio;
    }

    public AdminsNodoDoble getFin() {
        return fin;
    }

    public void setFin(AdminsNodoDoble fin) {
        this.fin = fin;
    }

    public boolean estVacio() {
        return inicio == null;
    }

    public void agregarAlFinal(Administrador  elementoPa) {
        if (!estVacio()) {
            fin = new AdminsNodoDoble(elementoPa, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new AdminsNodoDoble(elementoPa);
        }
        cantidad++;
    }

    public void agregarAlInicio(Administrador  elementoPa) {
        if (!estVacio()) {
            inicio = new AdminsNodoDoble(elementoPa, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new AdminsNodoDoble(elementoPa);
        }
        cantidad++;
    }

    public void agregarDelanteDeUnNodo(AdminsNodoDoble anterior, Administrador  elemento) {
        AdminsNodoDoble nuevo = new AdminsNodoDoble(elemento);

        if (anterior != null) {
            AdminsNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente = siguiente;
            anterior.siguiente = nuevo;

        }
        cantidad++;
    }

    public void agregarDelanteDeUnaPosicion(int pos, Administrador  elemento) {
        AdminsNodoDoble nuevo = new AdminsNodoDoble (elemento);
        AdminsNodoDoble anterior =  ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            AdminsNodoDoble siguiente;
            siguiente = anterior.siguiente;
            nuevo.siguiente=siguiente;
            anterior.siguiente=nuevo;
            
        }
        cantidad++;
    }
    public void RemplazarEnUnaPosicion(int pos, Administrador elemento) {
        AdminsNodoDoble nodoenlapos =  ObtenerNodoConPosInicioFin(pos);
        if (pos != -1) {
            nodoenlapos.elemento=elemento;
            
        }
    }
    public void mostrarListaInicioFin() {
        if (!estVacio()) {
            AdminsNodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.siguiente;
            }
        }
    }

    public void mostrarListaFinInicio() {
        if (!estVacio()) {
            AdminsNodoDoble auxiliar = fin;
            while (auxiliar != null) {
                System.out.println(auxiliar.elemento);
                auxiliar = auxiliar.anterior;
            }
        }
    }
    
    public void eliminarNodoConCodigoInicioFin(int  codigoPa) {
        AdminsNodoDoble primero = inicio;
        boolean encontrado = false;
        while (primero != null && !encontrado) {
            encontrado = (Integer.valueOf(primero.elemento.getCodigo()) == codigoPa);
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
    
    public void eliminarNodoConPosInicioFin(int  posicionPa) {
        AdminsNodoDoble primero = inicio;
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
    
    
    public AdminsNodoDoble BuscarUltNodo(AdminsNodoDoble node) {
        while (node.siguiente != null) {
            node = node.siguiente;
        }
        return node;
    }

    private AdminsNodoDoble partirQSCodigo(AdminsNodoDoble l, AdminsNodoDoble h) {

        int x = Integer.valueOf(h.elemento.getCodigo());

        AdminsNodoDoble i = l.anterior;

        for (AdminsNodoDoble j = l; j != h; j = j.siguiente) {
            if (Integer.valueOf(j.elemento.getCodigo()) <= x) {
                // Similar to i++ for array
                i = (i == null) ? l : i.siguiente;
                Administrador temp = i.elemento;
                i.elemento = j.elemento;
                j.elemento = temp;
            }
        }
        i = (i == null) ? l : i.siguiente;  // Similar to i++
        Administrador temp = i.elemento;
        i.elemento = h.elemento;
        h.elemento = temp;
        return i;
    }

    private void QuickSortRecursivoCodigo(AdminsNodoDoble l, AdminsNodoDoble h) {
        if (h != null && l != h && l != h.siguiente) {
            AdminsNodoDoble temp = partirQSCodigo(l, h);
            QuickSortRecursivoCodigo(l, temp.anterior);
            QuickSortRecursivoCodigo(temp.siguiente, h);
        }
    }

    public void IniciarQuickSortCodigo(AdminsNodoDoble node) {

        AdminsNodoDoble head = BuscarUltNodo(node);
        QuickSortRecursivoCodigo(node, head);
    }

    public int BuscarPosicionCodigo(AdminsNodoDoble nodoreferencia, int codigoPa) {

        AdminsNodoDoble temp = nodoreferencia;

        int pos = 0;

        while (Integer.valueOf(temp.elemento.getCodigo()) != codigoPa && temp.siguiente!= null) {
            // Update pos
            pos++;

            // Update temp
            temp = temp.siguiente;
        }

        // Si no se encuentra, devuelve -1
        if (Integer.valueOf(temp.elemento.getCodigo()) != codigoPa) {
            return -1;
        }
        // Si lo encuentra lo devuelve el valor 
        return (pos);
    }

    public AdminsNodoDoble ObtenerNodoConPosInicioFin(int posicion) {
        AdminsNodoDoble temp = inicio;
        int pos = 0;
        if(inicio==fin){
            return inicio;
        }else{
            while (pos!=cantidad) {
                
            if (pos == posicion) {
                return temp;
                
            }
            pos++;
            temp = temp.siguiente;
        }
        }
        
        
        return null;

    }
    
    public AdminsNodoDoble ObtenerNodoConCodigo(String codigo){
        int posicion = BuscarPosicionCodigo(inicio,Integer.valueOf(codigo));
        return ObtenerNodoConPosInicioFin(posicion);
    }
    
    public boolean VerificarSiExisteConCodigo(String codigo){
        if(BuscarPosicionCodigo(inicio,Integer.valueOf(codigo))!=-1){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean VerificarSiExisteConNombreyContra(String codigoAdm,String contra){
       
        AdminsNodoDoble temp=inicio;
        if(inicio==fin){
            if(temp.elemento.getContra().equals(contra)&&temp.elemento.getCodigo().equals(codigoAdm)){
              
                return true;
            }
        }
        while (temp != null) {
            // Update pos
            if(temp.elemento.getContra().equals(contra)&&temp.elemento.getCodigo().equals(codigoAdm)){
                
                
                return true;
            }
            temp=temp.siguiente;
            
        }
    
        return false;
        
    }
    
    public AdminsNodoDoble ObtenerNodoConNombreyContra(String nombre,String contra){
        AdminsNodoDoble temp=inicio;
        if(inicio==fin){
            if(temp.elemento.getContra().equals(contra)&&temp.elemento.getCodigo().equals(nombre)){
                return temp;
            }
        }
        while (temp != null) {
            // Update pos
            if(temp.elemento.getContra().equals(contra)&&temp.elemento.getCodigo().equals(nombre)){
                return temp;
            }
            temp = temp.siguiente;
        }
        return null;
        
    }
       //METODOS PARA LA TABLA  
    
    public String[] cabecera(){
        String[] cabecera = {"Código Administrador"};
        return cabecera;
    }
    
   public Object[][] getDatosInicioFinal() {

        Object resultado[][] = new Object[this.cantidad][1];
        if (!estVacio()) {
            AdminsNodoDoble aux = inicio;
            for (int indice = 0; indice < this.cantidad; indice++) {
                /*if ( aux.elemento == -1) {
                    resultado[indice][0] = aux;
                } else {
                    resultado[indice][0] = aux.elemento;
    
                }*/   
                    resultado[indice][0] = aux.elemento.getCodigo();
 
                    aux = aux.siguiente;
  
            }
        }
        return resultado;

    }
    
    
}
