/*
 * Daniel Machic 
 * HT #9
 * 21/04/2023
 */

public class TreeFactory<T extends Comparable<T>>{

    public IStructureTree<T> createTree(String type) {
        
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Splay Tree")) {
            return new ArbolSplay<T>();
        }
        if (type.equalsIgnoreCase("RedBlack Tree")) {
            return new ArbolRedBlack<T>();
        }
        if (type.equalsIgnoreCase("Binary Tree")) {
            return new ArbolBinario<T>();
        }
        return null;

    }

}