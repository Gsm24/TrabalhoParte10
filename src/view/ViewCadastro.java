/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UsuarioController;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ViewCadastro extends javax.swing.JFrame {

    /**
     * Creates new form ViewCadastro
     */
    public ViewCadastro() {
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

        jPanelCadastro = new javax.swing.JPanel();
        jLabelTituloCadastro = new javax.swing.JLabel();
        jLabelSubtitulo1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelEmail1 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jSeparatorCadastro = new javax.swing.JSeparator();
        jLabelTituloCadastro1 = new javax.swing.JLabel();
        jLabelDiasTrabalho = new javax.swing.JLabel();
        jCheckBoxDomingo = new javax.swing.JCheckBox();
        jCheckBoxSegunda = new javax.swing.JCheckBox();
        jCheckBoxTerca = new javax.swing.JCheckBox();
        jCheckBoxQuarta = new javax.swing.JCheckBox();
        jCheckBoxQuinta = new javax.swing.JCheckBox();
        jCheckBoxSexta = new javax.swing.JCheckBox();
        jCheckBoxSabado = new javax.swing.JCheckBox();
        jTextFieldCargaHoraria = new javax.swing.JTextField();
        jLabelCargaHoraria = new javax.swing.JLabel();
        jLabelDiasFerias = new javax.swing.JLabel();
        jTextFieldDiasFerias = new javax.swing.JTextField();
        jTextFieldPretensao = new javax.swing.JTextField();
        jLabelPretensao = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelVoltarLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Free! - Cadastrar Usuário");
        setResizable(false);

        jPanelCadastro.setBackground(new java.awt.Color(0, 0, 0));

        jLabelTituloCadastro.setFont(new java.awt.Font("The Bold Font", 0, 30)); // NOI18N
        jLabelTituloCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloCadastro.setText("CADASTRO");

        jLabelSubtitulo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelSubtitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSubtitulo1.setText("A liberdade o espera.");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome:");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail:");

        jLabelEmail1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEmail1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail1.setText("Senha:");

        jSeparatorCadastro.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelTituloCadastro1.setFont(new java.awt.Font("The Bold Font", 0, 30)); // NOI18N
        jLabelTituloCadastro1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloCadastro1.setText("VOCÊ NO CONTROLE");

        jLabelDiasTrabalho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDiasTrabalho.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDiasTrabalho.setText("Dias de trabalho:");

        jCheckBoxDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxDomingo.setText("D");

        jCheckBoxSegunda.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxSegunda.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxSegunda.setText("S");

        jCheckBoxTerca.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxTerca.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxTerca.setText("T");

        jCheckBoxQuarta.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxQuarta.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxQuarta.setText("Q");

        jCheckBoxQuinta.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxQuinta.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxQuinta.setText("Q");

        jCheckBoxSexta.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxSexta.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxSexta.setText("S");

        jCheckBoxSabado.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxSabado.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxSabado.setText("S");

        jTextFieldCargaHoraria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCargaHorariaKeyTyped(evt);
            }
        });

        jLabelCargaHoraria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCargaHoraria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCargaHoraria.setText("Carga horária diária:");

        jLabelDiasFerias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDiasFerias.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDiasFerias.setText("Dias de férias:");

        jTextFieldDiasFerias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDiasFeriasKeyTyped(evt);
            }
        });

        jTextFieldPretensao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPretensaoKeyTyped(evt);
            }
        });

        jLabelPretensao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPretensao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPretensao.setText("Pretensão salarial:");

        jButtonCadastrar.setBackground(new java.awt.Color(255, 0, 102));
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setToolTipText("");
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jLabelVoltarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVoltarLogin.setText("Voltar ao login");
        jLabelVoltarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVoltarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVoltarLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelEmail1)
                                .addComponent(jLabelEmail)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                .addComponent(jLabelNome)
                                .addComponent(jLabelTituloCadastro)
                                .addComponent(jTextFieldNome)
                                .addComponent(jPasswordFieldSenha))
                            .addComponent(jLabelSubtitulo1))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparatorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTituloCadastro1)
                            .addComponent(jLabelDiasTrabalho)
                            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jCheckBoxDomingo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxSegunda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxTerca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxQuarta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxQuinta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxSexta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxSabado))
                            .addComponent(jLabelPretensao)
                            .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                    .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelCargaHoraria)
                                        .addComponent(jTextFieldCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDiasFerias)
                                        .addComponent(jTextFieldDiasFerias, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jTextFieldPretensao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelVoltarLogin))
                            .addComponent(jButtonCadastrar))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabelTituloCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                .addComponent(jLabelDiasTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBoxDomingo)
                                    .addComponent(jCheckBoxSegunda)
                                    .addComponent(jCheckBoxTerca)
                                    .addComponent(jCheckBoxQuarta)
                                    .addComponent(jCheckBoxQuinta)
                                    .addComponent(jCheckBoxSexta)
                                    .addComponent(jCheckBoxSabado))
                                .addGap(12, 12, 12)
                                .addComponent(jLabelCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                .addComponent(jLabelDiasFerias, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDiasFerias, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPretensao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPretensao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparatorCadastro)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabelTituloCadastro)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelSubtitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVoltarLogin)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void FecharJanela(java.awt.event.WindowEvent evt)
    {
        this.dispose();
        ViewLogin viewLogin = new ViewLogin();
        viewLogin.setVisible(true);
    }
    
    private void limparTelaCadastroUsuario(java.awt.event.ActionEvent evt)
    {
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jPasswordFieldSenha.setText("");
        jCheckBoxDomingo.setSelected(false);
        jCheckBoxSegunda.setSelected(false);
        jCheckBoxTerca.setSelected(false);
        jCheckBoxQuarta.setSelected(false);
        jCheckBoxQuinta.setSelected(false);
        jCheckBoxSexta.setSelected(false);
        jCheckBoxSabado.setSelected(false);
        jTextFieldCargaHoraria.setText("");
        jTextFieldDiasFerias.setText("");
        jTextFieldPretensao.setText("");
    }
    
    
    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // TODO add your handling code here:
        String nome = jTextFieldNome.getText();
        String email = jTextFieldEmail.getText();
        String senha = String.valueOf(jPasswordFieldSenha.getPassword());
        ArrayList<String> dias_trabalhados = new ArrayList<String>();
        if(jCheckBoxDomingo.isSelected())
            dias_trabalhados.add("Domingo");
        if(jCheckBoxSegunda.isSelected())
            dias_trabalhados.add("Segunda");
        if(jCheckBoxTerca.isSelected())
            dias_trabalhados.add("Terça");
        if(jCheckBoxQuarta.isSelected())
            dias_trabalhados.add("Quarta");
        if(jCheckBoxQuinta.isSelected())
            dias_trabalhados.add("Quinta");
        if(jCheckBoxSexta.isSelected())
            dias_trabalhados.add("Sexta");
        if(jCheckBoxSabado.isSelected())
            dias_trabalhados.add("Sábado");
        int carga_horaria_diaria = Integer.parseInt(jTextFieldCargaHoraria.getText());
        int dias_ferias = Integer.parseInt(jTextFieldDiasFerias.getText());
        float pretensao_salarial = Float.parseFloat(jTextFieldPretensao.getText());
        boolean sucesso;
        
        try
        {
            UsuarioController usuarioController = new UsuarioController();
            sucesso = usuarioController.cadastrarUsuario(nome, email, senha, dias_trabalhados, carga_horaria_diaria, dias_ferias, pretensao_salarial);
            if(sucesso == true)
            {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                this.limparTelaCadastroUsuario(evt);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Campos não preenchidos corretamente!");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        
        this.dispose();
        ViewLogin viewLogin = new ViewLogin();
        viewLogin.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldCargaHorariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCargaHorariaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCargaHorariaKeyTyped

    private void jTextFieldDiasFeriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDiasFeriasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDiasFeriasKeyTyped

    private void jTextFieldPretensaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPretensaoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != '.'))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPretensaoKeyTyped

    private void jLabelVoltarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVoltarLoginMouseClicked
        // TODO add your handling code here:
        ViewLogin viewLogin = new ViewLogin();
        viewLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelVoltarLoginMouseClicked

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
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JCheckBox jCheckBoxDomingo;
    private javax.swing.JCheckBox jCheckBoxQuarta;
    private javax.swing.JCheckBox jCheckBoxQuinta;
    private javax.swing.JCheckBox jCheckBoxSabado;
    private javax.swing.JCheckBox jCheckBoxSegunda;
    private javax.swing.JCheckBox jCheckBoxSexta;
    private javax.swing.JCheckBox jCheckBoxTerca;
    private javax.swing.JLabel jLabelCargaHoraria;
    private javax.swing.JLabel jLabelDiasFerias;
    private javax.swing.JLabel jLabelDiasTrabalho;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmail1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPretensao;
    private javax.swing.JLabel jLabelSubtitulo1;
    private javax.swing.JLabel jLabelTituloCadastro;
    private javax.swing.JLabel jLabelTituloCadastro1;
    private javax.swing.JLabel jLabelVoltarLogin;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JSeparator jSeparatorCadastro;
    private javax.swing.JTextField jTextFieldCargaHoraria;
    private javax.swing.JTextField jTextFieldDiasFerias;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPretensao;
    // End of variables declaration//GEN-END:variables
}
