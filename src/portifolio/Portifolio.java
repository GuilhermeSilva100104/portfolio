package portifolio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Portifolio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portifolio frame = new Portifolio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Portifolio() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				Date data = new Date();
				DateFormat formatador = DateFormat.getDateInstance(DateFormat.DATE_FIELD);
				lblStatus.setText(formatador.format(data));
			}
		});
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Portifolio.class.getResource("/img/pc.png")));
		setForeground(SystemColor.activeCaption);
		setResizable(false);
		setTitle("Portif\u00F3lio de Projetos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 471);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnImc = new JButton("");
		btnImc.setContentAreaFilled(false);
		btnImc.setBorderPainted(false);
		btnImc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnImc.setIcon(new ImageIcon(Portifolio.class.getResource("/img/6518723_balance_equality_measure_scale_weight_icon.png")));
		btnImc.setToolTipText("C\u00E1lculo do IMC");
		btnImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// as linhas abaixo fazem o link com o formulário IMC
				IMC imc = new IMC();
				imc.setVisible(true);
			}
		});
		btnImc.setBounds(24, 86, 64, 64);
		contentPane.add(btnImc);

		JButton btnSobre = new JButton("");
		btnSobre.setContentAreaFilled(false);
		btnSobre.setBorderPainted(false);
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setIcon(new ImageIcon(Portifolio.class.getResource("/img/interroga\u00E7\u00E3o.png")));
		btnSobre.setToolTipText("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// as linhas abaixo fazem o link com o formulário Sobre
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setBounds(176, 235, 64, 64);
		contentPane.add(btnSobre);

		JButton btnBoletim = new JButton("");
		btnBoletim.setContentAreaFilled(false);
		btnBoletim.setBorderPainted(false);
		btnBoletim.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBoletim.setToolTipText("Calculadora da M\u00E9dia");
		btnBoletim.setIcon(new ImageIcon(Portifolio.class.getResource("/img/7067484_finance_calculate_calculator_icon.png")));
		btnBoletim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Boletim boletim = new Boletim();
				boletim.setVisible(true);
			}
		});
		btnBoletim.setBounds(100, 12, 64, 64);
		contentPane.add(btnBoletim);

		JButton btnFarenheit = new JButton("");
		btnFarenheit.setContentAreaFilled(false);
		btnFarenheit.setBorderPainted(false);
		btnFarenheit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFarenheit.setIcon(new ImageIcon(Portifolio.class.getResource("/img/315981_celsius_degree_icon.png")));
		btnFarenheit.setToolTipText("Converte para Fahrenheit");
		btnFarenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Temperatura2 temperatura2 = new Temperatura2();
				temperatura2.setVisible(true);
			}
		});
		btnFarenheit.setFont(new Font("Dialog", Font.BOLD, 12));
		btnFarenheit.setBounds(24, 12, 64, 64);
		contentPane.add(btnFarenheit);

		JButton btnPorcentagem = new JButton("");
		btnPorcentagem.setContentAreaFilled(false);
		btnPorcentagem.setBorderPainted(false);
		btnPorcentagem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPorcentagem.setIcon(new ImageIcon(Portifolio.class.getResource("/img/7898501_percentage_business_finance_office_marketing_icon.png")));
		btnPorcentagem.setToolTipText("C\u00E1lculo da Porcentagem");
		btnPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Porcentagem porcentagem = new Porcentagem();
				porcentagem.setVisible(true);
			}
		});
		btnPorcentagem.setFont(new Font("Dialog", Font.BOLD, 12));
		btnPorcentagem.setBounds(176, 12, 64, 64);
		contentPane.add(btnPorcentagem);

		JButton btnServico = new JButton("");
		btnServico.setContentAreaFilled(false);
		btnServico.setBorderPainted(false);
		btnServico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnServico.setIcon(new ImageIcon(Portifolio.class.getResource("/img/app de service.png")));
		btnServico.setToolTipText("C\u00E1lculo da Hora de Trabalho");
		btnServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HoraServico horaservico = new HoraServico();
				horaservico.setVisible(true);
			}
		});
		btnServico.setBounds(100, 86, 64, 64);
		contentPane.add(btnServico);

		JButton btnCombustivel = new JButton("");
		btnCombustivel.setContentAreaFilled(false);
		btnCombustivel.setBorderPainted(false);
		btnCombustivel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCombustivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Combustivel combustivel = new Combustivel();
				combustivel.setVisible(true);
			}
		});
		btnCombustivel.setToolTipText("Gasolina ou Etanol ?");
		btnCombustivel.setIcon(new ImageIcon(Portifolio.class.getResource("/img/7437306_gas_station_oil_gasoline_icon.png")));
		btnCombustivel.setBounds(250, 22, 64, 64);
		contentPane.add(btnCombustivel);

		JButton btnEleicao = new JButton("");
		btnEleicao.setContentAreaFilled(false);
		btnEleicao.setBorderPainted(false);
		btnEleicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Eleitor eleitor = new Eleitor();
				eleitor.setVisible(true);
			}
		});
		btnEleicao.setToolTipText("Elei\u00E7\u00E3o");
		btnEleicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEleicao.setIcon(new ImageIcon(Portifolio.class.getResource("/img/vote.png")));
		btnEleicao.setBounds(176, 86, 64, 64);
		contentPane.add(btnEleicao);

		JButton btnDado = new JButton("");
		btnDado.setContentAreaFilled(false);
		btnDado.setBorderPainted(false);
		btnDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dado dado = new Dado();
				dado.setVisible(true);
			}
		});
		btnDado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDado.setToolTipText("Dado");
		btnDado.setIcon(new ImageIcon(Portifolio.class.getResource("/img/dado1.png")));
		btnDado.setBounds(24, 160, 64, 64);
		contentPane.add(btnDado);

		JButton btnCep = new JButton("");
		btnCep.setContentAreaFilled(false);
		btnCep.setBorderPainted(false);
		btnCep.setIcon(new ImageIcon(Portifolio.class.getResource("/img/8684342_post_office_mail_maps_location_icon.png")));
		btnCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cep cep = new Cep();
				cep.setVisible(true);
			}
		});
		btnCep.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCep.setToolTipText("Busca CEP");
		btnCep.setBounds(100, 160, 64, 64);
		contentPane.add(btnCep);

		JButton btnSnake = new JButton("");
		btnSnake.setContentAreaFilled(false);
		btnSnake.setBorderPainted(false);
		btnSnake.setToolTipText("Snake");
		btnSnake.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSnake.setIcon(new ImageIcon(Portifolio.class.getResource("/img/snake.png")));
		btnSnake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IniciarJogo jogo = new IniciarJogo();
				jogo.setVisible(true);
			}
		});
		btnSnake.setBounds(176, 160, 64, 64);
		contentPane.add(btnSnake);

		JButton btnJoKenPo = new JButton("");
		btnJoKenPo.setContentAreaFilled(false);
		btnJoKenPo.setBorderPainted(false);
		btnJoKenPo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokenpo jokenpo = new Jokenpo();
				jokenpo.setVisible(true);
			}
		});
		btnJoKenPo.setToolTipText("JoKenPo");
		btnJoKenPo.setIcon(new ImageIcon(Portifolio.class.getResource("/img/8664857_hand_scissors_icon (1).png")));
		btnJoKenPo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnJoKenPo.setBounds(250, 86, 64, 64);
		contentPane.add(btnJoKenPo);

		JButton btnTabuada = new JButton("");
		btnTabuada.setContentAreaFilled(false);
		btnTabuada.setBorderPainted(false);
		btnTabuada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.setVisible(true);
			}
		});
		btnTabuada.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTabuada.setToolTipText("Tabuada");
		btnTabuada.setIcon(new ImageIcon(Portifolio.class.getResource("/img/tabuada-64.png")));
		btnTabuada.setBounds(24, 234, 64, 64);
		contentPane.add(btnTabuada);

		JButton btnJurosCompostos = new JButton("");
		btnJurosCompostos.setContentAreaFilled(false);
		btnJurosCompostos.setBorderPainted(false);
		btnJurosCompostos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnJurosCompostos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temperatura temperatura = new Temperatura();
				temperatura.setVisible(true);

			}
		});
		btnJurosCompostos.setIcon(new ImageIcon(Portifolio.class.getResource("/img/316067_degree_fahrenheit_icon.png")));
		btnJurosCompostos.setToolTipText("Juros Compostos");
		btnJurosCompostos.setBounds(100, 234, 64, 64);
		contentPane.add(btnJurosCompostos);

		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(0, 383, 335, 39);
		contentPane.add(panel);
		panel.setLayout(null);

		lblStatus = new JLabel("");
		lblStatus.setBounds(10, 0, 315, 39);
		panel.add(lblStatus);
		lblStatus.setBackground(Color.BLACK);
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setForeground(Color.BLACK);
		lblStatus.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));

		JButton btnCarta = new JButton("");
		btnCarta.setBorderPainted(false);
		btnCarta.setContentAreaFilled(false);
		btnCarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carta carta = new Carta();
				carta.setVisible(true);
			}
		});
		btnCarta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarta.setToolTipText("Carta");
		btnCarta.setIcon(new ImageIcon(Portifolio.class.getResource("/img/carta.png")));
		btnCarta.setBounds(250, 161, 64, 64);
		contentPane.add(btnCarta);
	} // fim do construtor
}
