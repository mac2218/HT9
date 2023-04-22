/*
 * Daniel Machic 
 * HT #9
 * 21/04/2023
 * Clase BinarySearchTree
 */

package clases;

import structure5.RedBlackSearchTree;

public class ArbolRedBlack<T extends Comparable<T>> implements IStructureTree<T> {

	private RedBlackSearchTree<T> myInternalTree;
	
	public ArbolRedBlack() {
		myInternalTree = new RedBlackSearchTree<T>();
	}
	
	@Override
	public void add(T value) {
		myInternalTree.add(value);
	}

	@Override
	public T get(T key) {
		return myInternalTree.get(key);
	}

	@Override
	public T remove(T key) {
		return myInternalTree.remove(key);
	}

	@Override
	public int count() {
		return myInternalTree.size();
	}

	@Override
	public boolean isEmpty() {
		return myInternalTree.isEmpty();
	}
	
	public RedBlackSearchTree<T> getInternalTree(){
		return myInternalTree;
	}

}