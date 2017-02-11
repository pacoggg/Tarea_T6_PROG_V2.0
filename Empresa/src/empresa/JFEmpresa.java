/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Paco G. <DAW 2016/2017 Ponferrada-Distancia>
 */
public class JFEmpresa extends javax.swing.JFrame {
String datos[]= {"NIF: ","NOMBRE: ","TELEFONO: ","DIRECCION: ","DEUDA: "};
String cliente_datos[]=new String[5];


    /**
     * Creates new form JFEmpresa
     */
    public JFEmpresa() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TAconsola = new javax.swing.JTextArea();
        BTañadir = new javax.swing.JButton();
        BTlistar = new javax.swing.JButton();
        BTbuscar = new javax.swing.JButton();
        BTborrar = new javax.swing.JButton();
        BTeliminar = new javax.swing.JButton();
        BTsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPRESA");

        TAconsola.setEditable(false);
        TAconsola.setColumns(20);
        TAconsola.setRows(5);
        jScrollPane1.setViewportView(TAconsola);

        BTañadir.setText("AÑADIR");
        BTañadir.setToolTipText("Pulsa para añadir un nuevo cliente.");
        BTañadir.setMaximumSize(new java.awt.Dimension(65, 23));
        BTañadir.setMinimumSize(new java.awt.Dimension(65, 23));
        BTañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTañadirActionPerformed(evt);
            }
        });

        BTlistar.setText("LISTAR");
        BTlistar.setMaximumSize(new java.awt.Dimension(65, 23));
        BTlistar.setMinimumSize(new java.awt.Dimension(65, 23));
        BTlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTlistarActionPerformed(evt);
            }
        });

        BTbuscar.setText("BUSCAR");
        BTbuscar.setMaximumSize(new java.awt.Dimension(65, 23));
        BTbuscar.setMinimumSize(new java.awt.Dimension(65, 23));
        BTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTbuscarActionPerformed(evt);
            }
        });

        BTborrar.setText("BORRAR");
        BTborrar.setMaximumSize(new java.awt.Dimension(65, 23));
        BTborrar.setMinimumSize(new java.awt.Dimension(65, 23));
        BTborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTborrarActionPerformed(evt);
            }
        });

        BTeliminar.setText("ELIMINAR");
        BTeliminar.setMaximumSize(new java.awt.Dimension(65, 23));
        BTeliminar.setMinimumSize(new java.awt.Dimension(65, 23));
        BTeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTeliminarActionPerformed(evt);
            }
        });

        BTsalir.setText("SALIR");
        BTsalir.setMaximumSize(new java.awt.Dimension(65, 23));
        BTsalir.setMinimumSize(new java.awt.Dimension(65, 23));
        BTsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTañadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTlistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTborrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTañadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTlistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTborrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 527, Short.MAX_VALUE)
                        .addComponent(BTsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTañadirActionPerformed
        JFNuevoCliente nuevocliente= new JFNuevoCliente();
        nuevocliente.setVisible(true);
        nuevocliente.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_BTañadirActionPerformed

    private void BTsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTsalirActionPerformed
        System.exit(0); 
        // TODO add your handling code here:
    }//GEN-LAST:event_BTsalirActionPerformed

    private void BTlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTlistarActionPerformed
       TAconsola.setText("");
        try {
       File f;
       FileReader fr;
       BufferedReader br;
       
       f= new File("clientes.dat");
       fr=new FileReader(f);
       br=new BufferedReader(fr);
       String linea;
       int reg=1;
       while((linea=br.readLine())!=null){
        TAconsola.append(" ---------------- Registro "+reg+": ------------------\n");
        StringTokenizer st = new StringTokenizer(linea,"-");
        int s=st.countTokens();
        
        for (int r=0;r<s;r++){
            String salida = datos[r]+st.nextToken()+"\n";
            //System.out.print(salida);
            TAconsola.append(salida);
            
            
            //cliente_datos[r]=st.nextToken();
        }
        reg++;
        TAconsola.append(System.getProperty("line.separator")); // Esto para el salto de línea
        }
       br.close();
       fr.close();
            // TODO add your handling code here:
        } catch (IOException ex) {
            TAconsola.setText("El archivo no ha sido creado.");
        }
    }//GEN-LAST:event_BTlistarActionPerformed

    private void BTeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTeliminarActionPerformed
                    File f1;
                    f1 = new File("clientes.dat");
                        int confirmed = JOptionPane.showConfirmDialog(null, "Eliminar archivo?","ELIMINAR ARCHIVO",JOptionPane.YES_NO_OPTION);
                        if(confirmed == JOptionPane.YES_OPTION)
                        {
                            if(f1.delete()){
                                TAconsola.setText("");
                                TAconsola.setText("Archivo borrado correctamente.");
                            }else TAconsola.setText("El archivo no se ha borrado o no existe.");
                            //dispose();
                        }
                    
        // TODO add your handling code here:
    }//GEN-LAST:event_BTeliminarActionPerformed

    private void BTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbuscarActionPerformed
        try {
            String baliza=JOptionPane.showInputDialog(null,"NIF a buscar?","Titulo",JOptionPane.INFORMATION_MESSAGE);
            TAconsola.setText("");
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
        for (int r1=0;r1<s;r1++){
        String salida1=(datos[r1]+cliente_datos[r1]+"\n");
        TAconsola.append(salida1);
        }
        }
        //TAconsola.append(System.getProperty("line.separator")); // Esto para el salto de línea
       }
       br.close();
       fr.close();
       }catch(IOException e)
        {
            e.getStackTrace();
         }
    }//GEN-LAST:event_BTbuscarActionPerformed

    private void BTborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTborrarActionPerformed
        try {
            String bal1=JOptionPane.showInputDialog(null,"NIF a buscar?","Titulo",JOptionPane.INFORMATION_MESSAGE);
            TAconsola.setText("");
            ArrayList<String> list1= new ArrayList<>();
            File f;
            FileReader fr;
            BufferedReader br;
            f= new File("clientes.dat");
            fr=new FileReader(f);
            br=new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
            list1.add(linea);
            }
            br.close();
            fr.close();
            for(int i=0;i<list1.size();i++){
            StringTokenizer st = new StringTokenizer(list1.get(i),"-");
            int s=st.countTokens();
            for (int r=0;r<s;r++){
            cliente_datos[r]=st.nextToken();
            }
            if (cliente_datos[0].equals(bal1)) {
                
                TAconsola.setText("------ REGISTRO A BORRAR ------\n\n");
                //TAconsola.setText("\n");
                for (int n=0;n<s;n++){
                    String salida2=(datos[n]+cliente_datos[n]+"\n");
                    TAconsola.append(salida2);
                }
            int confirmacion = JOptionPane.showConfirmDialog(null, "Estas seguro de borrar el registro? \n NIF: "+cliente_datos[0], "Confirmar Borrado", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirmacion==JOptionPane.YES_OPTION){
            list1.remove(i);
            escribir_archivo(list1);
            TAconsola.setText("");
            }else 
                {
                    TAconsola.setText("");
                    TAconsola.setText("NO SE HA BORRADO NADA");
                }
            }
            }
       }catch(IOException e)
        {
            e.getStackTrace();
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_BTborrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFEmpresa().setVisible(true);
        });
    }
    public static void escribir_archivo (ArrayList<String> list) throws IOException{
        try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("clientes.dat"))) {
                for(String x:list)
                {
                    writer.write(x);
                    writer.newLine();
                }
            }
        }catch(IOException e)
        {
            e.getStackTrace();
         }
 }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTañadir;
    private javax.swing.JButton BTborrar;
    private javax.swing.JButton BTbuscar;
    private javax.swing.JButton BTeliminar;
    private javax.swing.JButton BTlistar;
    private javax.swing.JButton BTsalir;
    private javax.swing.JTextArea TAconsola;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
