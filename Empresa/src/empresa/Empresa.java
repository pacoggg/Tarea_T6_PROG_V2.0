/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.io.*;
/**
 *
 * @author Paco G. <DAW 2016/2017 Ponferrada-Distancia>
 */
public class Empresa implements Serializable{
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, Exception {
        JFEmpresa empresa= new JFEmpresa();
        empresa.setVisible(true);
        empresa.setLocationRelativeTo(null);
    }
       
}
