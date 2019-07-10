/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.app;

/**
 *
 * @author javaweb
 */
public class PredmetJovanoski {
    
    private String nazivPredmeta;
    private String sifraPredmeta;

    public PredmetJovanoski(String nazivPredmeta, String sifraPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
    }

    public PredmetJovanoski() {
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public String getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setSifraPredmeta(String sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }
    
    
    
    
    
}
