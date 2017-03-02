/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

/**
 *
 * @author Estudiante
 */
public class Association {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        B mat = new B("Calculo");
        B fic = new B("Fisica");
        B lin = new B("Lineal");
        
        A Luis = new A();
        
        Luis.addb(mat);
        System.out.println("tienes: " + Luis.getN() + " Materias");
        Luis.get();
        Luis.addb(fic);
        System.out.println("tienes: " + Luis.getN() + " Materias");
        Luis.get();
        Luis.addb(lin);
        System.out.println("tienes: " + Luis.getN() + " Materias");
        Luis.get();
        
    }
    
}
