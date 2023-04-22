/*
 * Daniel Machic 
 * HT #9
 * 21/04/2023
 */

import java.util.*;
import javax.xml.parsers.FactoryConfigurationError;
import clases.IStructureTree;
import java.io.*;

public class Principal {
    
    public static void main(String[] args){
       
        ArrayList<String> lineasArchivo = new ArrayList<>();
        File file = new File("C:/Ejemplos/ejemploHDT7.txt"); 
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))){
                while(br.ready()) {
                    lineasArchivo.add(br.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("\n ¿Qué tipo de Árbol de búsqueda desea usar?\n");
        System.out.println("1. Ninary Tree   2. Splay Tree  3. RedBlack Tree");
        String type = entrada.nextLine();

        TreeFactory<Palabra> factory = new TreeFactory<>();
        IStructureTree<Palabra> arbol = factory.createTree(type);

        Association<Palabra> association = new Association<>(type);
        arbol = association.buildTree(lineasArchivo);
        System.out.println("\n El arbol de búsqueda se ha creado");

      
        System.out.println("\n Diccionario: \n");
        for(int i = 0; i < lineasArchivo.size(); i++) {
            System.out.println(lineasArchivo.get(i));
        }


        ArrayList<String> lineasTrad = new ArrayList<>();

        File file1 = new File("C:/Ejemplos/traduccion.txt"); // Poner aqui la direccion del archivo de texto a utilizar
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file1))){
                while(br.ready()) {
                    lineasTrad.add(br.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> Traduccion = new ArrayList<String>();
        for(String word : lineasTrad){
            Traduccion.add(word.toLowerCase());
        }

        System.out.println("\n>>> Texto a traducir:");
        for(int i = 0; i < Traduccion.size(); i++) {
            System.out.println(Traduccion.get(i));
        }

        System.out.println("\n La traducción de la palabra es: ");
        StringBuilder palabraN = new StringBuilder();
        String[] palabras = Traduccion.get(0).split("\\s+");

        for (String palabra : palabras) {
            Palabra p = arbol.get(new Palabra(palabra, ""));
            if (p != null) {
                palabraN .append(p.getSpanish()).append(" ");
            } else {
                palabraN .append(palabra).append(" ");
            }
        }

        System.out.println(palabraN.toString() + "\n");

    }
       
}
