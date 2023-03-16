package tp.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tp.logica.ElementosJuego;

import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class JuegoAritmetico extends JFrame {

	private JPanel contentPane;
	private JTextField textA1;
	private JTextField textA2;
	private JTextField textA3;
	private JTextField textA4;
	private JTextField textB1;
	private JTextField textB2;
	private JTextField textB3;
	private JTextField textB4;
	private JTextField textC1;
	private JTextField textC2;
	private JTextField textC3;
	private JTextField textC4;
	private JTextField textD1;
	private JTextField textD2;
	private JTextField textD3;
	private JTextField textD4;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					JuegoAritmetico frame = new JuegoAritmetico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JuegoAritmetico() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(JuegoAritmetico.class.getResource("/icons/progress/ani/2@2x.png")));
		setTitle("Programacion III - Juego Aritmetico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 556);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//inicio una instancia del objeto elementosJuego
		ElementosJuego elementos = new ElementosJuego(4,4);
		//Auxiliar
		elementos.imprimirMatriz();
		
		textA1 = new JTextField();
		textA1.setHorizontalAlignment(SwingConstants.CENTER);
		textA1.setFont(new Font("Tahoma", Font.BOLD, 25));
		textA1.setBounds(101, 69, 50, 43);
		contentPane.add(textA1);
		textA1.setColumns(10);
		textA1.setText(String.valueOf(elementos.elemMat(0, 0)));
		
		
		textA2 = new JTextField();
		textA2.setHorizontalAlignment(SwingConstants.CENTER);
		textA2.setFont(new Font("Tahoma", Font.BOLD, 25));
		textA2.setColumns(10);
		textA2.setBounds(200, 69, 50, 43);
		contentPane.add(textA2);
		textA2.setText(String.valueOf(elementos.elemMat(0, 1)));
		
		
		textA3 = new JTextField();
		textA3.setHorizontalAlignment(SwingConstants.CENTER);
		textA3.setFont(new Font("Tahoma", Font.BOLD, 25));
		textA3.setColumns(10);
		textA3.setBounds(300, 69, 50, 43);
		contentPane.add(textA3);
		textA3.setText(String.valueOf(elementos.elemMat(0, 2)));
		
		textA4 = new JTextField();
		textA4.setHorizontalAlignment(SwingConstants.CENTER);
		textA4.setFont(new Font("Tahoma", Font.BOLD, 25));
		textA4.setColumns(10);
		textA4.setBounds(400, 69, 50, 43);
		contentPane.add(textA4);
		textA4.setText(String.valueOf(elementos.elemMat(0, 3)));
		
		textB1 = new JTextField();
		textB1.setHorizontalAlignment(SwingConstants.CENTER);
		textB1.setFont(new Font("Tahoma", Font.BOLD, 25));
		textB1.setColumns(10);
		textB1.setBounds(101, 170, 50, 43);
		contentPane.add(textB1);
		textB1.setText(String.valueOf(elementos.elemMat(1, 0)));
		
		textB2 = new JTextField();
		textB2.setHorizontalAlignment(SwingConstants.CENTER);
		textB2.setFont(new Font("Tahoma", Font.BOLD, 25));
		textB2.setColumns(10);
		textB2.setBounds(200, 170, 50, 43);
		contentPane.add(textB2);
		textB2.setText(String.valueOf(elementos.elemMat(1, 1)));
		
		textB3 = new JTextField();
		textB3.setHorizontalAlignment(SwingConstants.CENTER);
		textB3.setFont(new Font("Tahoma", Font.BOLD, 25));
		textB3.setColumns(10);
		textB3.setBounds(300, 170, 50, 43);
		contentPane.add(textB3);
		textB3.setText(String.valueOf(elementos.elemMat(1, 2)));
		
		textB4 = new JTextField();
		textB4.setHorizontalAlignment(SwingConstants.CENTER);
		textB4.setFont(new Font("Tahoma", Font.BOLD, 25));
		textB4.setColumns(10);
		textB4.setBounds(400, 170, 50, 43);
		contentPane.add(textB4);
		textB4.setText(String.valueOf(elementos.elemMat(1, 3)));
		
		textC1 = new JTextField();
		textC1.setHorizontalAlignment(SwingConstants.CENTER);
		textC1.setFont(new Font("Tahoma", Font.BOLD, 25));
		textC1.setColumns(10);
		textC1.setBounds(101, 269, 50, 43);
		contentPane.add(textC1);
		textC1.setText(String.valueOf(elementos.elemMat(2, 0)));
		
		textC2 = new JTextField();
		textC2.setHorizontalAlignment(SwingConstants.CENTER);
		textC2.setFont(new Font("Tahoma", Font.BOLD, 25));
		textC2.setColumns(10);
		textC2.setBounds(200, 269, 50, 43);
		contentPane.add(textC2);
		textC2.setText(String.valueOf(elementos.elemMat(2, 1)));
		
		textC3 = new JTextField();
		textC3.setHorizontalAlignment(SwingConstants.CENTER);
		textC3.setFont(new Font("Tahoma", Font.BOLD, 25));
		textC3.setColumns(10);
		textC3.setBounds(300, 269, 50, 43);
		contentPane.add(textC3);
		textC3.setText(String.valueOf(elementos.elemMat(2, 2)));
		
		textC4 = new JTextField();
		textC4.setHorizontalAlignment(SwingConstants.CENTER);
		textC4.setFont(new Font("Tahoma", Font.BOLD, 25));
		textC4.setColumns(10);
		textC4.setBounds(400, 269, 50, 43);
		contentPane.add(textC4);
		textC4.setText(String.valueOf(elementos.elemMat(2, 3)));
		
		textD1 = new JTextField();
		textD1.setHorizontalAlignment(SwingConstants.CENTER);
		textD1.setFont(new Font("Tahoma", Font.BOLD, 25));
		textD1.setColumns(10);
		textD1.setBounds(101, 369, 50, 43);
		contentPane.add(textD1);
		textD1.setText(String.valueOf(elementos.elemMat(3, 0)));
		
		textD2 = new JTextField();
		textD2.setHorizontalAlignment(SwingConstants.CENTER);
		textD2.setFont(new Font("Tahoma", Font.BOLD, 25));
		textD2.setColumns(10);
		textD2.setBounds(200, 369, 50, 43);
		contentPane.add(textD2);
		textD2.setText(String.valueOf(elementos.elemMat(3, 1)));
		
		textD3 = new JTextField();
		textD3.setHorizontalAlignment(SwingConstants.CENTER);
		textD3.setFont(new Font("Tahoma", Font.BOLD, 25));
		textD3.setColumns(10);
		textD3.setBounds(300, 369, 50, 43);
		contentPane.add(textD3);
		textD3.setText(String.valueOf(elementos.elemMat(3, 2)));
		
		textD4 = new JTextField();
		textD4.setHorizontalAlignment(SwingConstants.CENTER);
		textD4.setFont(new Font("Tahoma", Font.BOLD, 25));
		textD4.setColumns(10);
		textD4.setBounds(400, 369, 50, 43);
		contentPane.add(textD4);
		textD4.setText(String.valueOf(elementos.elemMat(3, 3)));
		
		JLabel lblA = new JLabel(String.valueOf(elementos.getFilaResul()[0]));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblA.setBounds(498, 67, 46, 43);
		contentPane.add(lblA);
		//lblA.setText(String.valueOf(elementos.getFilaResul()[0]));
		
		JLabel lblB = new JLabel(String.valueOf(elementos.getFilaResul()[1]));
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblB.setBounds(498, 170, 46, 43);
		contentPane.add(lblB);
		//lblA.setText(String.valueOf(elementos.getFilaResul()[1]));
		
		JLabel lblC = new JLabel(String.valueOf(elementos.getFilaResul()[2]));
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblC.setBounds(498, 269, 46, 43);
		contentPane.add(lblC);
		//lblA.setText(String.valueOf(elementos.getFilaResul()[2]));
		
		JLabel lblD = new JLabel(String.valueOf(elementos.getFilaResul()[3]));
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblD.setBounds(498, 369, 46, 43);
		contentPane.add(lblD);
		//lblA.setText(String.valueOf(elementos.getFilaResul()[3]));
		
		JLabel lbl1 = new JLabel(String.valueOf(elementos.getColumResul()[0]));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl1.setBounds(101, 463, 46, 43);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel(String.valueOf(elementos.getColumResul()[1]));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl2.setBounds(204, 463, 46, 43);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel(String.valueOf(elementos.getColumResul()[2]));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl3.setBounds(304, 463, 46, 43);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel(String.valueOf(elementos.getColumResul()[3]));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl4.setBounds(404, 463, 46, 43);
		contentPane.add(lbl4);
		
		JLabel lblTiempo = new JLabel("TIEMPO :");
		lblTiempo.setForeground(new Color(255, 0, 0));
		lblTiempo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTiempo.setBounds(10, 11, 137, 34);
		contentPane.add(lblTiempo);
		
		JLabel lblNewLabel = new JLabel("99");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(142, 12, 46, 33);
		contentPane.add(lblNewLabel);
	}
}