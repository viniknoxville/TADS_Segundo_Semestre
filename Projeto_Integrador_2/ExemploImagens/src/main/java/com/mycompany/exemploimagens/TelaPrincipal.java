/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.exemploimagens;

import java.awt.Color;

/**
 *
 * @author Marcos
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuAlterarCor = new javax.swing.JMenu();
        menuCorBranca = new javax.swing.JMenuItem();
        menuCorPreta = new javax.swing.JMenuItem();
        menuCorVermelha = new javax.swing.JMenuItem();
        menuCorAzul = new javax.swing.JMenuItem();
        menuCorLaranja = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuManutenção = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenu();
        menuCadastrarCliente = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenu();

        menuAlterarCor.setText("AlterarCor");

        menuCorBranca.setText("Branco");
        menuCorBranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCorBrancaActionPerformed(evt);
            }
        });
        menuAlterarCor.add(menuCorBranca);

        menuCorPreta.setText("Preto");
        menuCorPreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCorPretaActionPerformed(evt);
            }
        });
        menuAlterarCor.add(menuCorPreta);

        menuCorVermelha.setText("Vermelho");
        menuCorVermelha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCorVermelhaActionPerformed(evt);
            }
        });
        menuAlterarCor.add(menuCorVermelha);

        menuCorAzul.setText("Azul");
        menuCorAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCorAzulActionPerformed(evt);
            }
        });
        menuAlterarCor.add(menuCorAzul);

        menuCorLaranja.setText("Laranja");
        menuCorLaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCorLaranjaActionPerformed(evt);
            }
        });
        menuAlterarCor.add(menuCorLaranja);

        jPopupMenu1.add(menuAlterarCor);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setComponentPopupMenu(jPopupMenu1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        menuManutenção.setMnemonic('M');
        menuManutenção.setText("Manutenção");

        menuCliente.setMnemonic('C');
        menuCliente.setText("Cliente");

        menuCadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuCadastrarCliente.setText("Cadastrar");
        menuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(menuCadastrarCliente);

        menuManutenção.add(menuCliente);

        menuProduto.setMnemonic('P');
        menuProduto.setText("Produto");
        menuManutenção.add(menuProduto);

        jMenuBar1.add(menuManutenção);

        menuAjuda.setMnemonic('A');
        menuAjuda.setText("Ajuda");
        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteActionPerformed
        cadastrocliente novoCliente = new cadastrocliente();
        novoCliente.setVisible(true);
    }//GEN-LAST:event_menuCadastrarClienteActionPerformed

    private void menuCorBrancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCorBrancaActionPerformed
        this.jPanel1.setBackground(Color.white);
    }//GEN-LAST:event_menuCorBrancaActionPerformed

    private void menuCorPretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCorPretaActionPerformed
       this.jPanel1.setBackground(Color.black);
    }//GEN-LAST:event_menuCorPretaActionPerformed

    private void menuCorVermelhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCorVermelhaActionPerformed
        this.jPanel1.setBackground(Color.red);
    }//GEN-LAST:event_menuCorVermelhaActionPerformed

    private void menuCorAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCorAzulActionPerformed
        this.jPanel1.setBackground(Color.blue);
    }//GEN-LAST:event_menuCorAzulActionPerformed

    private void menuCorLaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCorLaranjaActionPerformed
        this.jPanel1.setBackground(Color.orange);
    }//GEN-LAST:event_menuCorLaranjaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuAlterarCor;
    private javax.swing.JMenuItem menuCadastrarCliente;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuCorAzul;
    private javax.swing.JMenuItem menuCorBranca;
    private javax.swing.JMenuItem menuCorLaranja;
    private javax.swing.JMenuItem menuCorPreta;
    private javax.swing.JMenuItem menuCorVermelha;
    private javax.swing.JMenu menuManutenção;
    private javax.swing.JMenu menuProduto;
    // End of variables declaration//GEN-END:variables
}