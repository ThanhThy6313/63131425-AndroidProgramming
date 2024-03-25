import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Insets;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.UIManager;

public class mainMH extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTextField txtphan1 = new JTextField();
	private double value1 = 0;
    private double value2 = 0;
    private char operation = ' ';
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainMH frame = new mainMH();
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
	public mainMH() {
		setTitle("Câu 1_Calculator ");
		setBackground(new Color(230, 230, 250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 785);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//đặt MH chính giữa
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("CASIO");
		lblNewLabel.setBackground(UIManager.getColor("Button.light"));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 10, 185, 29);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		panel.setBounds(20, 50, 718, 117);
		contentPane.add(panel);
		panel.setLayout(null);
		txtphan1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtphan1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtphan1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), SystemColor.activeCaptionBorder));
		txtphan1.setBounds(10, 21, 698, 77);
		panel.add(txtphan1);
		txtphan1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 212, 706, 492);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 5, 4, 5));
		
		JButton btnso1 = new JButton("1");
		btnso1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtphan1.setText(txtphan1.getText() + cmd);
			}
		});
		btnso1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnso1);
		
		JButton btnso2 = new JButton("2");
		btnso2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					txtphan1.setText(txtphan1.getText() + cmd);
				
			}
		});
		btnso2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnso2);
		
		JButton btnso3 = new JButton("3");
		btnso3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtphan1.setText(txtphan1.getText() + cmd);
			}
		});
		btnso3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnso3);
		
		 JButton btnSQRT = new JButton("SQRT");
	        btnSQRT.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                double num = Double.parseDouble(txtphan1.getText());
	                double result = Math.sqrt(num);
	                txtphan1.setText(Double.toString(result));
	            }
		});
		btnSQRT.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnSQRT);
		
		JButton btnso4 = new JButton("4");
		btnso4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtphan1.setText(txtphan1.getText() + cmd);
			}
		});
		btnso4.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnso4);
		
		JButton btnso5 = new JButton("5");
		btnso5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtphan1.setText(txtphan1.getText() + cmd);
			}
		});
		btnso5.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnso5);
		
		JButton btnso6 = new JButton("6");
		btnso6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtphan1.setText(txtphan1.getText() + cmd);
			}
		});
		btnso6.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnso6);
		
		JButton btn1x = new JButton("1/x");
		btn1x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        HamXuLy1x();	
			}	
	});
		btn1x.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btn1x);
		
		JButton btnso7 = new JButton("7");
		btnso7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtphan1.setText(txtphan1.getText() + cmd);
			}
		});
		btnso7.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnso7);
		
		JButton btnso8 = new JButton("8");
		btnso8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLy1x();
			}
		});
		btnso8.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnso8);
		
		JButton btnso9 = new JButton("9");
		btnso9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtphan1.setText(txtphan1.getText() + cmd);
			}
		});
		btnso9.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnso9);
		
		JButton btnnhan = new JButton("*");
		btnnhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnnhan.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnnhan);
		
		JButton btnso0 = new JButton("0");
		btnso0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtphan1.setText(txtphan1.getText() + cmd);
			}
		});
		btnso0.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnso0);
		
		JButton btntru = new JButton("-");
		btntru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyTru();
			}
		});
		btntru.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btntru);
		
		JButton btncong = new JButton("+");
		btncong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyCong();
			}
		});
		btncong.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btncong);
		
		JButton btnchia = new JButton("/");
		btnchia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnchia.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnchia);
		
		JButton btnPlush = new JButton("+/-");
		btnPlush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double value = Double.parseDouble(txtphan1.getText());
					value = -value;
					txtphan1.setText(""+ value);
			
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPlush.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnPlush);
		
		JButton btnphantram = new JButton("%");
		btnphantram.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			HamXuLyPhanTram();
		}
	});
		btnphantram.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnphantram);
		
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyXoa();
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnC);
		
		JButton btnB = new JButton("=");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyBang();
			}
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnB);
	}
	// Hàm xử lý phép cộng
	private void HamXuLyCong() {
	    try {
	        value1 = Double.parseDouble(txtphan1.getText());
	        operation = '+';
	        txtphan1.setText("");
	    } catch (NumberFormatException ex) {
	        ex.printStackTrace();
	    }
	}
	// Hàm xử lý phép trừ
	private void HamXuLyTru() {
	    try {
	        value1 = Double.parseDouble(txtphan1.getText());
	        operation = '-';
	        txtphan1.setText("");
	    } catch (NumberFormatException ex) {
	        ex.printStackTrace();
	    }
	}

	// Hàm xử lý phép nhân
	private void HamXuLyNhan() {
	    try {
	        value1 = Double.parseDouble(txtphan1.getText());
	        operation = '*';
	        txtphan1.setText("");
	    } catch (NumberFormatException ex) {
	        ex.printStackTrace();
	    }
	}

	// Hàm xử lý phép chia
	private void HamXuLyChia() {
	    try {
	        value1 = Double.parseDouble(txtphan1.getText());
	        operation = '/';
	        txtphan1.setText("");
	    } catch (NumberFormatException ex) {
	        ex.printStackTrace();
	    }
	}

	// Hàm xử lý phép bằng
	private void HamXuLyBang() {
	    try {
	        value2 = Double.parseDouble(txtphan1.getText());
	        double result = 0;
	        switch (operation) {
	            case '+':
	                result = value1 + value2;
	                break;
	            case '-':
	                result = value1 - value2;
	                break;
	            case '*':
	                result = value1 * value2;
	                break;
	            case '/':
	                if (value2 != 0) {
	                    result = value1 / value2;
	                } else {
	                    txtphan1.setText("Cannot divide by zero");
	                    return;
	                }
	                break;
	        }
	        txtphan1.setText(String.valueOf(result));
	    } catch (NumberFormatException ex) {
	        ex.printStackTrace();
	    }
	}

	// Hàm xử lý phép xóa (C)
	private void HamXuLyXoa() {
	    txtphan1.setText("");
	}
	// Hàm xử lý phép tính 1/x
	private void HamXuLy1x() {
		try {
	        double num = Double.parseDouble(txtphan1.getText());
	        if (num != 0) {
	            txtphan1.setText(String.valueOf(1 / num));
	        } else {
	            txtphan1.setText("Error: Cannot divide by zero");
	        }
	    } catch (NumberFormatException ex) {
	        txtphan1.setText("Error");
	    }
	}

	// Hàm xử lý phép tính phần trăm (%)
	private void HamXuLyPhanTram() {
	    try {
	        double num = Double.parseDouble(txtphan1.getText());
	        txtphan1.setText(String.valueOf(num / 100));
	    } catch (NumberFormatException ex) {
	        txtphan1.setText("Error");
	    }
	}
}
