package interfaceGrafica;

/**
 * @author Guilherme Gadelha, Armstrong Goes, Daniell Azevedo, Caio Libanio
 */
public class InterfaceGrafica extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	/** Creates new form InterfaceGrafica */
	public InterfaceGrafica() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Equipe 14 - Daniell Wagner; Armstrong Goes; Caio Libaneo; Guilherme Gadelha");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object [][] {
						{"Job1", 7, 100},
						{"Job2", 8, 123},
						{"Job3", 8, 122},
						{"Job4", 4, 134},
						{"Job4", 6, 154}

				},
				new String [] {
						"Job Number", "Priority", "Lenght"
				}
				));
		jScrollPane1.setViewportView(jTable1);

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
		jLabel1.setText("Schedule of Jobs");

		jButton1.setText("Insert");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Search");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("Modify Priority");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("Modify Lenght");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setText("Top");

		jButton6.setText("Size");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("Process the job in the top");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setText("Exit");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(77, 77, 77)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jButton1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton3))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jButton4)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton5)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton6))
												.addComponent(jButton7)
												.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
												.addContainerGap())
												.addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
														.addGap(321, 321, 321)
														.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(255, 255, 255))
														.addGroup(layout.createSequentialGroup()
																.addContainerGap(565, Short.MAX_VALUE)
																.addComponent(jButton8)
																.addGap(170, 170, 170))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
						.addGap(113, 113, 113)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1)
								.addComponent(jButton2)
								.addComponent(jButton3))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jButton4)
										.addComponent(jButton5)
										.addComponent(jButton6))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton7)
										.addGap(40, 40, 40)
										.addComponent(jButton8)
										.addGap(63, 63, 63))
				);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		if (evt.getSource() == jButton1) {
			GUIInserir guiInserir = new GUIInserir(this, rootPaneCheckingEnabled);
			guiInserir.setVisible(true);
		}
	}//GEN-LAST:event_jButton1ActionPerformed

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
		InterfaceGrafica.this.dispose();
	}//GEN-LAST:event_jButton8ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		GUISearch guiSearch = new GUISearch(this, rootPaneCheckingEnabled);
		guiSearch.setVisible(rootPaneCheckingEnabled);
	}//GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		ModifyPriority modifyPriority = new ModifyPriority(this, rootPaneCheckingEnabled);
		modifyPriority.setVisible(rootPaneCheckingEnabled);
	}//GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
		ModifyLength modifyLength = new ModifyLength(this, rootPaneCheckingEnabled);
		modifyLength.setVisible(rootPaneCheckingEnabled);
	}//GEN-LAST:event_jButton4ActionPerformed

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		Size size = new Size(this, rootPaneCheckingEnabled);
		size.setVisible(rootPaneCheckingEnabled);
	}//GEN-LAST:event_jButton6ActionPerformed

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
		Processing processing = new Processing(this, rootPaneCheckingEnabled);
		processing.setVisible(rootPaneCheckingEnabled);
	}//GEN-LAST:event_jButton7ActionPerformed

	public static void main(String args[]) {
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new InterfaceGrafica().setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration//GEN-END:variables
}
