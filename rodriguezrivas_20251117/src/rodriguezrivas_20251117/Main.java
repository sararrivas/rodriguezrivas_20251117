/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguezrivas_20251117;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolTernarioRecursivo arbol = new ArbolTernarioRecursivo(13);
        arbol.insertar('A');//Indice 0
        arbol.insertar('B');//Indice 1
        arbol.insertar('C');//Indice 2
        arbol.insertar('D');//Indice 3
        arbol.asignarHijos(0, 1, 2, 3);
        arbol.insertar('E');//Indice 4
        arbol.insertar('F');//Indice 5
        arbol.insertar('G');//Indice 6
        arbol.asignarHijos(1, 4, 5, 6);
        arbol.insertar('H');//Indice 7
        arbol.insertar('I');//Indice 8
        arbol.insertar('J');//Indice 9
        arbol.asignarHijos(2, 7, 8, 9);
        arbol.insertar('K');//Indice 10
        arbol.insertar('L');//Indice 11
        arbol.insertar('M');//Indice 12
        arbol.asignarHijos(3, 10, 11, 12);
        
        
        System.out.println("RECORRIDO PREORDEN");
        System.out.println("--------------------");
        arbol.recorrerPreOrden(arbol.raiz);
        System.out.println();
        
        
        System.out.println("RECORRIDO IN-ORDEN");
        System.out.println("--------------------");
        arbol.recorrerInOrden(arbol.raiz);
        System.out.println();
        
        System.out.println("RECORRIDO POST-ORDEN");
        System.out.println("--------------------");
        arbol.recorrerPostOrden(arbol.raiz);
        System.out.println();
        
    }
    
}
