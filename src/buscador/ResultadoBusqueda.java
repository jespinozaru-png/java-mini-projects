/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscador;

/**
 *
 * @author JEFERSON
 */
public class ResultadoBusqueda {
    private int indice;
    private int comparaciones;
    private boolean encontrado;
    private String tipoBusqueda;

    public ResultadoBusqueda(int indice, int comparaciones, boolean encontrado, String tipoBusqueda) {
        this.indice = indice;
        this.comparaciones = comparaciones;
        this.encontrado = encontrado;
        this.tipoBusqueda = tipoBusqueda;
    }

    public int getIndice() {
        return indice;
    }

    public int getComparaciones() {
        return comparaciones;
    }

    public boolean isEncontrado() {
        return encontrado;
    }

    public String getTipoBusqueda() {
        return tipoBusqueda;
    }
    
    

    @Override
    public String toString() {
        if (encontrado) {
            return String.format("[%s] Encontrado en indice %d *** %d comparaciones",
                    tipoBusqueda, indice, comparaciones);
        }
        
        return String.format("[%s] No encontrado *** %d comparaciones",
                tipoBusqueda, comparaciones);
    }
    
    
    
}
