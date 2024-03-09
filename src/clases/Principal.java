package clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Font;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea ta_salida;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_procesar = new JButton("PROCESAR");
		btn_procesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArregloDocentes miArreglo = new ArregloDocentes();
				
				reportar(miArreglo);
			}
		});
		btn_procesar.setBounds(149, 10, 118, 21);
		contentPane.add(btn_procesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 416, 666);
		contentPane.add(scrollPane);
		
		ta_salida = new JTextArea();
		ta_salida.setFont(new Font("Arial", Font.PLAIN, 13));
		scrollPane.setViewportView(ta_salida);
	}
	
	// METODOS
	public void reportar(ArregloDocentes ad) {
		String reporte = "";
		
		for (Docente docente : ad.getDocentes()) {
			reporte += "Codigo: " + docente.getCodigo() + "\n";
			reporte += "Tipo de docente: " + docente.tipoDocente() + "\n";
			reporte += "Nombre: " + docente.getNombre() + "\n";
			reporte += "Sueldo: S/. " + docente.sueldo() + "\n";
			reporte += "Bonificación: S/. " + docente.bonificacion() + "\n\n";
		}
		
		reporte += "---------------------------------------------------------------------\n";
		reporte += "Suma total de sueldos: S/. " + ad.sumaSueldos() + "\n";
		reporte += "Cantidad de docentes que ganan menos que 900: " + ad.cantidadSueldosMenoresQue900();
		
		ta_salida.setText(reporte);
	}
}
