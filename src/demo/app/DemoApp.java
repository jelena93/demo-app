/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.app;

/**
 *
 * @author jelena
 */
public class DemoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student("Laki", "Topalovic");
        System.out.println("Student: " + student);
        student.setFirstName("//////");
        
        System.out.println("OVO JE NESTO U NOVOJ GRANI");
        
        Pisac.ispisi();
    }

}
