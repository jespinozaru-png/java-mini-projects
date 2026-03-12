/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscador;

/**
 *
 * @author JEFERSON
 */
public class BuscadorPalabras {
    private final String[] palabrasOrdenadas;

    public BuscadorPalabras(String[] palabrasOrdenadas) {
        this.palabrasOrdenadas = palabrasOrdenadas.clone();
    }
    
    public ResultadoBusqueda busquedaLienal(String target){
        
        int comparaciones=0;
        for (int i = 0; i < palabrasOrdenadas.length; i++) {
            comparaciones++;
            if (palabrasOrdenadas[i].equalsIgnoreCase(target)) {
                return new ResultadoBusqueda(i, comparaciones, true, "Lineal");
            }
        }
        
        return new ResultadoBusqueda(-1, comparaciones, false, "Lineal");
    }
    
    public ResultadoBusqueda busquedaBinaria(String target){
        int comparaciones=0;
        int derecha = palabrasOrdenadas.length-1;
        int izquierda = 0;
        
        while (izquierda<=derecha) {
            comparaciones++;
            int medio = izquierda + (derecha-izquierda)/2;
            
            int resultado = palabrasOrdenadas[medio].compareToIgnoreCase(target);
            
            if (resultado==0) {
                return new ResultadoBusqueda(medio, comparaciones, true, "Binario");
            }else if (resultado<0) {
                izquierda=medio+1;
            }else {
               derecha=medio-1; 
            }                  
        }
        
        return new ResultadoBusqueda(-1, comparaciones, false, "Binario");
    }
    
    
}
