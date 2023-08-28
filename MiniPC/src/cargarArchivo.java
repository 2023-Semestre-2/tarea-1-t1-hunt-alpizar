
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jeanp
 */
public class cargarArchivo extends javax.swing.JFrame {

    File archivo = null;
    boolean archivoValido = false;
    ArrayList<String[]> espaciosMemoria = new ArrayList<>(100);
    PC miPC = new PC();
    int posIni;
    int posActual;
    
    
    /**
     * Creates new form cargarArchivo
     */
    public cargarArchivo() {
        initComponents();
        inicializarMemoria(100);
    }

    public void inicializarMemoria(int tamanio){
        for (int i = 0; i < 100; i++) {
            tablaMemoria.setValueAt(i, i, 0);
            tablaMemoria.disable();
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        archivoSeleccionado = new javax.swing.JTextField();
        cargarArchivo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        axInput = new javax.swing.JTextField();
        bxInput = new javax.swing.JTextField();
        cxInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pcInput = new javax.swing.JTextField();
        acInput = new javax.swing.JTextField();
        irInput = new javax.swing.JTextField();
        dxInput = new javax.swing.JTextField();
        procesadorLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMemoria = new javax.swing.JTable();
        botSiguiente = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        ejecutar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        archivoSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoSeleccionadoActionPerformed(evt);
            }
        });

        cargarArchivo.setText("Cargar");
        cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("AX");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("BX");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("CX");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("DX");

        axInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                axInputActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("PC");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("AC");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("IR");

        irInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irInputActionPerformed(evt);
            }
        });

        dxInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dxInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pcInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(acInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(irInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(axInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(pcInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(acInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(irInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(axInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(bxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(dxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, pcInput});

        procesadorLabel.setText("Procesador");

        jLabel8.setText("Memoria");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaMemoria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tablaMemoria.setForeground(new java.awt.Color(0, 0, 0));
        tablaMemoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {"", null, null},
                {"", null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "asm", "bin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMemoria.setRowHeight(30);
        tablaMemoria.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaMemoria);
        tablaMemoria.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaMemoria.getColumnModel().getColumnCount() > 0) {
            tablaMemoria.getColumnModel().getColumn(0).setMinWidth(40);
            tablaMemoria.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaMemoria.getColumnModel().getColumn(0).setMaxWidth(40);
            tablaMemoria.getColumnModel().getColumn(1).setResizable(false);
            tablaMemoria.getColumnModel().getColumn(2).setResizable(false);
        }

        botSiguiente.setText("Siguiente");
        botSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSiguienteActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(botSiguiente)
                        .addGap(122, 122, 122)
                        .addComponent(limpiar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botSiguiente)
                    .addComponent(limpiar))
                .addGap(21, 21, 21))
        );

        ejecutar.setText("Ejecutar");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarActionPerformed(evt);
            }
        });

        jLabel9.setText("Archivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(procesadorLabel)
                .addGap(167, 167, 167))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(archivoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cargarArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(ejecutar)))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(archivoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargarArchivo)
                            .addComponent(ejecutar)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(procesadorLabel)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoActionPerformed
        archivoValido = false;
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        archivo = chooser.getSelectedFile();
        String nombreArchivo = archivo.getAbsolutePath();
        archivoSeleccionado.setText(nombreArchivo);
    
        try {
            miPC.setInstruccionesASM(Asistente.validarArchivo(nombreArchivo));
            if(miPC.getInstruccionesASM() == null){
                archivoValido = true;
            }
        } catch (IOException ex) {
            Logger.getLogger(cargarArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cargarArchivoActionPerformed

    public static void mostrarError(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
       
    }
    
    private void archivoSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_archivoSeleccionadoActionPerformed

    private void ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarActionPerformed
        // TODO add your handling code here:
        ArrayList<String[]> instruccionesASM = miPC.getInstruccionesASM();
        ArrayList<String[]> instruccionesbin = miPC.getInstruccionesbin() ;
        if(instruccionesASM == null){
            JOptionPane.showMessageDialog(null, "Seleccione un archivo primero");
        }else{
            instruccionesbin = Asistente.transformarBinario(instruccionesASM);
            int largo = Arrays.asList(instruccionesASM.toArray()).size();
            posIni = Asistente.escogerPosicion(largo);
            posActual = posIni;
            int j = 0;
            for (int i = posIni; j < largo; i++) {
                String instruccionASM = instruccionesASM.get(j)[0]+" "+instruccionesASM.get(j)[1];
                String instruccionBin = instruccionesbin.get(j)[0]+" "+instruccionesbin.get(j)[1]+" "+instruccionesbin.get(j)[2];
                if(instruccionesASM.get(j).length == 3) instruccionASM += " "+instruccionesASM.get(j)[2];
                tablaMemoria.setValueAt( instruccionASM, i, 1);
                tablaMemoria.setValueAt( instruccionBin, i, 2);
                j++;
            }   
            
            //tablaMemoria.addRowSelectionInterval(posIni, posIni);
            pcInput.setText(Integer.toString(posIni));
            
        }
        
        miPC.setInstruccionesASM(instruccionesASM);
        miPC.setInstruccionesbin(instruccionesbin);
        
    }//GEN-LAST:event_ejecutarActionPerformed

    private void botSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSiguienteActionPerformed
        // TODO add your handling code here:
        if(posActual-posIni<miPC.getInstruccionesbin().size()){
            ejecutarInstruccion();
        }
    }//GEN-LAST:event_botSiguienteActionPerformed

    private void ejecutarInstruccion(){
        String instruccion = tablaMemoria.getValueAt(posActual, 2).toString();
            String[] elementos = instruccion.split(" ");
            System.out.println("operador: "+elementos[0]);
            String valorAR =Integer.toString(Integer.parseInt(elementos[0],2))
                    + Integer.toString(Integer.parseInt(elementos[1],2))
                    + Integer.toString(Integer.parseInt(elementos[2].substring(1),2));
            irInput.setText(valorAR);
            System.out.println(valorAR);
            tablaMemoria.removeRowSelectionInterval(posActual-1, posActual-1);
            tablaMemoria.addRowSelectionInterval(posActual, posActual);
            posActual++;
            System.out.println(elementos[0].getClass());
            if(elementos[0].equals("0011")){//mov
                //System.out.println("registro: "+elementos[1]+" valor: "+elementos[2]);
                miPC.ejecutarMov(elementos[1],elementos[2]);
                actualizarInput(elementos[1]);
            }else if(elementos[0].equals("0001")){//LOAD
                miPC.ejecutarLoad(elementos[1]);
                actualizarInput("AC");
            }else if(elementos[0].equals("0101")){//ADD
                miPC.ejecutarAdd(elementos[1]);
                actualizarInput("AC");
            }else if(elementos[0].equals("0100")){//ADD
                miPC.ejecutarSub(elementos[1]);
                actualizarInput("AC");
            }else if(elementos[0].equals("0010")){//ADD
                miPC.ejecutarStore(elementos[1]);
                actualizarInput(elementos[1]);
            }
            pcInput.setText(Integer.toString(posActual));          
            System.out.println("Largo: "+miPC.getInstruccionesbin().size()+" actual: "+ (posActual-posIni) );
    }
    
   private void actualizarInput(String registro){
       if(registro.equals("0001")){
           axInput.setText(Integer.toString(
                   miPC.getRegistros().get(registro).getValor()));
       }else if(registro.equals("0010")){
           bxInput.setText(Integer.toString(
                   miPC.getRegistros().get(registro).getValor()));
       }else if(registro.equals("0011")){
           cxInput.setText(Integer.toString(
                   miPC.getRegistros().get(registro).getValor()));
       }else if(registro.equals("0100")){
           dxInput.setText(Integer.toString(
                   miPC.getRegistros().get(registro).getValor()));
       }else if(registro.equals("AC")){
           acInput.setText(Integer.toString(
                   miPC.getRegistros().get(registro).getValor()));
       }
   }
    
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < 100; i++) {
            tablaMemoria.setValueAt(null, i, 1);
            tablaMemoria.setValueAt(null, i, 2);
        }
    }//GEN-LAST:event_limpiarActionPerformed

    
    private void irInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irInputActionPerformed

    private void axInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_axInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_axInputActionPerformed

    private void dxInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dxInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dxInputActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cargarArchivo().setVisible(true);
                
                
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acInput;
    private javax.swing.JTextField archivoSeleccionado;
    private javax.swing.JTextField axInput;
    private javax.swing.JButton botSiguiente;
    private javax.swing.JTextField bxInput;
    private javax.swing.JButton cargarArchivo;
    private javax.swing.JTextField cxInput;
    private javax.swing.JTextField dxInput;
    private javax.swing.JButton ejecutar;
    private javax.swing.JTextField irInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField pcInput;
    private javax.swing.JLabel procesadorLabel;
    private javax.swing.JTable tablaMemoria;
    // End of variables declaration//GEN-END:variables
}
