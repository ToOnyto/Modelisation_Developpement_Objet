/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructeur;

/**
 *
 * @author tpedrero
 */
public class ContratPdf extends Contrat{
    
    @Override
    public void imprime(){
        for ( String document : documents){
            System.out.println("<PDF>"+document+"<PDF>");
        }
    }
}
