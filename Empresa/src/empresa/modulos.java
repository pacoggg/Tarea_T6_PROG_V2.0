/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Paco G. <DAW 2016/2017 Ponferrada-Distancia>
 */
public class modulos {
   
   private String nif;
   private String nombre;
   private String telefono;
   private String direccion;
   private String deuda;
   String datos[]= {"NIF: ","NOMBRE: ","TELEFONO: ","DIRECCION: ","DEUDA: "};
   String cliente_datos[]=new String[5];
   boolean existe= false;
    public modulos() {
    }

    public modulos(String nif, String nombre, String telefono, String direccion, String deuda) {
        this.nif = nif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.deuda = deuda;
    }
    
   public void escribir() throws IOException{
    modulos probar_nif= new modulos();
    probar_nif.buscar(nif);
    if (!probar_nif.existe){
    
    try {
    File f;
    FileWriter fich;
    BufferedWriter bw;
    PrintWriter pw;
    f = new File("clientes.dat");
    fich = new FileWriter(f,true);
    bw= new BufferedWriter(fich);
    pw = new PrintWriter(bw);
    
    pw.write(nif+"-"+nombre+"-"+telefono+"-"+direccion+"-"+deuda+"\n");
    pw.close();
    bw.close();
    
    }catch(IOException e)
        {
            e.getStackTrace();
         }
    }else JOptionPane.showMessageDialog(null, "El NIF de ese cliente ya existe.");
    }
   
   public void buscar(String baliza) throws IOException{
      try {
       File f;
       FileReader fr;
       BufferedReader br;
       
       f= new File("clientes.dat");
       fr=new FileReader(f);
       br=new BufferedReader(fr);
       String linea;
       while((linea=br.readLine())!=null){
        StringTokenizer st = new StringTokenizer(linea,"-");
        int s=st.countTokens();
        for (int r=0;r<s;r++){
            cliente_datos[r]=st.nextToken();
         }
        if (cliente_datos[0].equals(baliza)) {
            existe=true;
        }
       }
       br.close();
       fr.close();
       }catch(IOException e)
        {
            e.getStackTrace();
         }
   }
      
}
