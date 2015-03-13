/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIInserir.java
 *
 * Created on 23/11/2011, 21:07:58
 */
package interfaceGrafica;

/**
 *
 * @author Daniell
 */
public class GUIInserir extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;
	/** Creates new form GUIInserir */
	public GUIInserir(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabelJobNumber = new javax.swing.JLabel();
		jLabelJobSorteado = new javax.swing.JLabel();
		jLabelPriority = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabelLength = new javax.swing.JLabel();
		jTextFieldLength = new javax.swing.JTextField();
		jButtonOK = new javax.swing.JButton();
		jButtonCancelar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Insert Job");

		jLabelJobNumber.setText("JobNumber:");

		jLabelJobSorteado.setText("jLabel1");

		jLabelPriority.setText("Priority:");

		jLabelLength.setText("Length");

		jButtonOK.setText("Ok");

		jButtonCancelar.setText("Cancel");
		jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCancelarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(51, 51, 51)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabelLength)
										.addContainerGap())
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(jLabelJobNumber)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabelJobSorteado))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(jLabelPriority)
																		.addGap(18, 18, 18)
																		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jTextFieldLength, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
																				.addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))))
																				.addGap(191, 191, 191))))
																				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
																						.addContainerGap(181, Short.MAX_VALUE)
																						.addComponent(jButtonOK)
																						.addGap(18, 18, 18)
																						.addComponent(jButtonCancelar)
																						.addGap(34, 34, 34))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(27, 27, 27)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelJobNumber)
								.addComponent(jLabelJobSorteado))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabelPriority)
										.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabelLength)
												.addComponent(jTextFieldLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(116, 116, 116)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButtonOK)
														.addComponent(jButtonCancelar))
														.addContainerGap(35, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(34, 34, 34)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(23, Short.MAX_VALUE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(24, 24, 24)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
		GUIInserir.this.dispose();
	}//GEN-LAST:event_jButtonCancelarActionPerformed

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUIInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUIInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUIInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUIInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				GUIInserir dialog = new GUIInserir(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {

					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonCancelar;
	private javax.swing.JButton jButtonOK;
	private javax.swing.JLabel jLabelJobNumber;
	private javax.swing.JLabel jLabelJobSorteado;
	private javax.swing.JLabel jLabelLength;
	private javax.swing.JLabel jLabelPriority;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextFieldLength;
	// End of variables declaration//GEN-END:variables
}
