/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author felipe
 */
@SuppressWarnings("serial")
public class InfoUsuario extends javax.swing.JPanel {

    /**
     * Creates new form InfoUsuario
     */
    public InfoUsuario() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        nome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        menu_amigos = new javax.swing.JButton();
        menu_amigosnome = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        aniversario = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        sobre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uJPanelImagem1 = new componentes.UJPanelImagem();

        setBackground(new java.awt.Color(58, 89, 152));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");

        nome.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Olá, Felipe");

        jPanel1.setBackground(new java.awt.Color(58, 89, 152));
        jPanel1.setBorder(null);
        jPanel1.setForeground(new java.awt.Color(1, 63, 119));

        menu_amigos.setBackground(new java.awt.Color(255, 255, 255));
        menu_amigos.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        menu_amigos.setForeground(new java.awt.Color(255, 255, 255));
        menu_amigos.setText("Amigos");
        menu_amigos.setBorderPainted(false);
        menu_amigos.setContentAreaFilled(false);
        menu_amigos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        menu_amigosnome.setBackground(new java.awt.Color(255, 255, 255));
        menu_amigosnome.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        menu_amigosnome.setForeground(new java.awt.Color(255, 255, 255));
        menu_amigosnome.setText("Encontrar amigos");
        menu_amigosnome.setBorderPainted(false);
        menu_amigosnome.setContentAreaFilled(false);
        menu_amigosnome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_amigosnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_amigosnomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_amigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_amigosnome, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu_amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_amigosnome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(58, 89, 152));
        jPanel2.setBorder(null);

        aniversario.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        aniversario.setForeground(new java.awt.Color(255, 255, 255));
        aniversario.setText("Felipe Cordeiro");

        cidade.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        cidade.setForeground(new java.awt.Color(255, 255, 255));
        cidade.setText("Nasceu em 04 de fevereiro");

        sobre.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        sobre.setForeground(new java.awt.Color(255, 255, 255));
        sobre.setText("Mora em Natal");

        jLabel5.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estudante de Engenharia de Software");

        uJPanelImagem1.setImagem(new java.io.File("/home/felipe/profile.jpg"));

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(aniversario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cidade, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sobre, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(uJPanelImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(aniversario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cidade)
                        .addGap(18, 18, 18)
                        .addComponent(sobre)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(uJPanelImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(nome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menu_amigosnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_amigosnomeActionPerformed
        ControllerUI.SugerirAmigos();
    }//GEN-LAST:event_menu_amigosnomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aniversario;
    private javax.swing.JLabel cidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton menu_amigos;
    private javax.swing.JButton menu_amigosnome;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel sobre;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JLabel getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario.setText(aniversario);
	}

	public javax.swing.JLabel getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome.setText(nome);
	}

	public javax.swing.JLabel getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre.setText(sobre);
	}

    public javax.swing.JLabel getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade.setText(cidade);
	}
}
