import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.WindowConstants;

public class Conta_Cliques {

	public static void main(String[] args) {

		int i = 0;

		JFrame frame = new JFrame("Conta cliques");
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel painel = new JPanel(new GridBagLayout());
		JButton incrementa = new JButton("+");
		JLabel valor = new JLabel(Integer.toString(i));
		JButton decrementa = new JButton("-");

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5); // Margem entre os componentes

		gbc.gridx = 0;
		gbc.gridy = 0;
		painel.add(incrementa, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		painel.add(valor, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		painel.add(decrementa, gbc);
		
		
		Dimension buttonSize = new Dimension(100, 40); 
        incrementa.setPreferredSize(buttonSize);
        decrementa.setPreferredSize(buttonSize);

		incrementa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(valor.getText()) + 1;
				valor.setText(Integer.toString(i));

			}
		});

		decrementa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(Integer.parseInt(valor.getText()) > 0) {
				int i = Integer.parseInt(valor.getText()) - 1;
				valor.setText(Integer.toString(i));
				}

			}
		});
		frame.add(painel, BorderLayout.CENTER);
		frame.setBounds(50, 400, 300, 200);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
