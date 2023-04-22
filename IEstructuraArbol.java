/*
 * Daniel Machic 
 * HT #9
 * 21/04/2023
 * Interface palabra
 */

package clases;

public interface IStructureTree<T extends Comparable<T>>{

    void add(T value); // Insertar un valor en el árbol
    
    T get(T key); // Busca un valor en el árbol
    
    T remove(T key); // Elimina un valor del árbol
    
    int count(); // Obtiene el número de elementos en el árbol
    
    boolean isEmpty(); // Verifica si el árbol está vacío

}