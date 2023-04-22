/*
 * Daniel Machic 
 * HT #9
 * 21/04/2023
 * Clase BinarySearchTree
 */

package clases;

import structure5.BinarySearchTree;
import java.util.*;

public class ArbolBinarioBusqueda<T extends Comparable<T>> implements IStructureTree<T>{
    
    private BinarySearchTree<T> miInternalTree;

    public ArbolBinarioBusqueda() {
        miInternalTree = new BinarySearchTree<T>();
    }

	public ArbolBinarioBusqueda(Comparator<T> comparador) {
        miInternalTree = new BinarySearchTree<T>(comparador);
    }

    @Override
	public void add(T value) {
		miInternalTree.add(value);
		
	}

	@Override
	public T get(T key) {
		return miInternalTree.get(key);
	}

	@Override
	public T remove(T key) {
		return miInternalTree.remove(key);
	}

	@Override
	public int count() {
		return miInternalTree.size();
	}

	@Override
	public boolean isEmpty() {
		return miInternalTree.isEmpty();
	}
	
	public BinarySearchTree<T> getInternalTree(){
		return miInternalTree;
	}

}