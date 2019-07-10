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
        Student student = new Student("Josip", "Broz");
        Student studentJelena = new Student("Jelena", "Smith");
        Student studentCarli = new Student("Carli", "Caplin");
        System.out.println("Student: " + student);
        student.setFirstName("//////");
        
        Pisac.ispisi();
    }

}
