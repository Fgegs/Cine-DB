
package org.progra;

import javax.swing.JOptionPane;


public class Search extends javax.swing.JFrame {

   
    public Search() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDescriptionM = new javax.swing.JTextField();
        txtDurationM = new javax.swing.JTextField();
        btnMenuM = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblTitleM = new javax.swing.JLabel();
        lblDescriptionM = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblClassification = new javax.swing.JLabel();
        txtTitleM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtClas = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDescriptionM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionMActionPerformed(evt);
            }
        });

        txtDurationM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationMActionPerformed(evt);
            }
        });

        btnMenuM.setText("Menu");
        btnMenuM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuMActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblTitleM.setText("Movie Title:");

        lblDescriptionM.setText("Description:");

        lblDuration.setText("Duration:");

        lblClassification.setText("Classification:");

        txtTitleM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleMActionPerformed(evt);
            }
        });

        jLabel1.setText("Search and Modify Movie");

        txtClas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClasActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove Movie");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnModify.setText("Modify Movie");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTitleM, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTitleM, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDurationM, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblClassification, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClas)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescriptionM, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescriptionM, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(184, 225, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemove))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnMenuM)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitleM)
                        .addComponent(txtTitleM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch))
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescriptionM)
                            .addComponent(txtDescriptionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDuration)
                            .addComponent(txtDurationM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClassification)
                    .addComponent(btnMenuM))
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuMActionPerformed

    private void txtTitleMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleMActionPerformed

    private void txtDescriptionMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionMActionPerformed

    private void txtDurationMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurationMActionPerformed

    private void txtClasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClasActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchTitle = txtTitleM.getText();

    for (Movie movie : MovieDatabase.getMovies()) {
        if (movie.getTitle().equalsIgnoreCase(searchTitle)) {
            // Mostrar información de la película encontrada en los campos correspondientes
            System.out.println("Película encontrada: " + movie.getTitle());
            cargarDatosPelicula(movie);
            return; // Detener la búsqueda después de encontrar la primera coincidencia
        }
    }

    // Mostrar un mensaje si no se encuentra la película
    JOptionPane.showMessageDialog(this, "Película no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
} 

private void cargarDatosPelicula(Movie movie) {
    // Cargar todos los datos de la película en los campos correspondientes
    System.out.println("Cargando datos de la película: " + movie.getTitle());
    txtDescriptionM.setText(movie.getDescription());
    txtDurationM.setText(movie.getDuration());
    txtClas.setText(movie.getClassification());

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        String searchTitle = txtTitleM.getText();

        for (Movie movie : MovieDatabase.getMovies()) {
            if (movie.getTitle().equalsIgnoreCase(searchTitle)) {
                // Eliminar la película de la base de datos
                MovieDatabase.removeMovie(movie);
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "Película eliminada exitosamente");
                return; // Detener la búsqueda después de encontrar la primera coincidencia
            }
             JOptionPane.showMessageDialog(this, "Película no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
    
    limpiarCampos(); // Limpiar los campos en caso de éxito
            }

       
    }
    private void limpiarCampos() {
        // Limpiar los campos después de eliminar la película
        txtTitleM.setText("");
        txtDescriptionM.setText("");
        txtDurationM.setText("");
        txtClas.setText(""); 
    
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
       // Obtener el título de la película a modificar
    String searchTitle = txtTitleM.getText();

    // Buscar la película en la base de datos
    for (Movie movie : MovieDatabase.getMovies()) {
        if (movie.getTitle().equalsIgnoreCase(searchTitle)) {
            // Modificar los datos de la película con la nueva información (se va 1 por 1)
            movie.setDescription(txtDescriptionM.getText());
            movie.setDuration(txtDurationM.getText());
            movie.setClassification(txtClas.getText());

            // Mostrar un mensaje de realizado
            JOptionPane.showMessageDialog(this, "Película modificada exitosamente");
            return; // Detener la búsqueda después de encontrar la primera coincidencia
        }
    }

    // Mostrar un mensaje si no se encuentra la película
    JOptionPane.showMessageDialog(this, "Película no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
  limpiarCampos(); // Limpiar los campos en caso de éxito
    }//GEN-LAST:event_btnModifyActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuM;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblClassification;
    private javax.swing.JLabel lblDescriptionM;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblTitleM;
    private javax.swing.JTextField txtClas;
    private javax.swing.JTextField txtDescriptionM;
    private javax.swing.JTextField txtDurationM;
    private javax.swing.JTextField txtTitleM;
    // End of variables declaration//GEN-END:variables
}
