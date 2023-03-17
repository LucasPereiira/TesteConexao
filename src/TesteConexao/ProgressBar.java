package TesteConexao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class ProgressBar {
	JButton jb = new JButton("Refazer teste");
	JFrame jFrame = new JFrame("Teste de conexão");
	JProgressBar bar = new JProgressBar();
	
	JLabel sevidor1 = new JLabel("Servidor 1");
	JLabel lblms1 = new JLabel("ms");
	JLabel lbltimo_1 = new JLabel("Ótimo");
	JProgressBar progressBar_1 = new JProgressBar();
	
	JLabel sevidor2 = new JLabel("Servidor 1");
	JLabel lblms2 = new JLabel("ms");
	JLabel lbltimo_2 = new JLabel("Ótimo");
	JProgressBar progressBar_2 = new JProgressBar();
	
	JLabel sevidor3 = new JLabel("Servidor 1");
	JLabel lblms3 = new JLabel("ms");
	JLabel lbltimo_3 = new JLabel("Ótimo");
	JProgressBar progressBar_3 = new JProgressBar();
	
	JLabel sevidor4 = new JLabel("Servidor 1");
	JLabel lblms4 = new JLabel("ms");
	JLabel lbltimo_4 = new JLabel("Ótimo");
	JProgressBar progressBar_4 = new JProgressBar();
	
	JLabel sevidor5 = new JLabel("Servidor 1");
	JLabel lblms5 = new JLabel("ms");
	JLabel lbltimo_5 = new JLabel("Ótimo");
	JProgressBar progressBar_5 = new JProgressBar();
	
	JLabel sevidor6 = new JLabel("Servidor 1");
	JLabel lblms6 = new JLabel("ms");
	JLabel lbltimo_6 = new JLabel("Ótimo");
	JProgressBar progressBar_6 = new JProgressBar();
	
	JLabel sevidor7 = new JLabel("Servidor 1");
	JLabel lblms7 = new JLabel("ms");
	JLabel lbltimo_7 = new JLabel("Ótimo");
	JProgressBar progressBar_7 = new JProgressBar();
	
	JLabel sevidor8 = new JLabel("Servidor 1");
	JLabel lblms8 = new JLabel("ms");
	JLabel lbltimo_8 = new JLabel("Ótimo");
	JProgressBar progressBar_8 = new JProgressBar();
	
	JLabel sevidor9 = new JLabel("Servidor 1");
	JLabel lblms9 = new JLabel("ms");
	JLabel lbltimo_9 = new JLabel("Ótimo");
	JProgressBar progressBar_9 = new JProgressBar();
	
	JLabel lblNewLabel_1 = new JLabel("Aguarde... Teste em andamento");
	
	ProgressBar(){
		
		bar.setBounds(76, 117, 470, 44);		
			
		
		jFrame.setLayout(null);
		jb.setBounds(10, 411, 190, 39);
		jb.setFont(new Font("Bebas Neue", Font.PLAIN, 15));
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toggleVisible();			
			}			
		});
		
		lblNewLabel_1.setBounds(170, 43, 285, 38);
		lblNewLabel_1.setFont(new Font("Bebas Neue", Font.PLAIN, 15));
		jFrame.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Péssimo");
		lblNewLabel.setBounds(76, 91, 70, 27);
		lblNewLabel.setFont(new Font("Bebas Neue", Font.PLAIN, 15));
		jFrame.add(lblNewLabel);
		
		JLabel lblRuim = new JLabel("Ruim");
		lblRuim.setBounds(205, 92, 70, 22);
		lblRuim.setFont(new Font("Bebas Neue", Font.PLAIN, 15));
		jFrame.add(lblRuim);
		
		JLabel lblRegular = new JLabel("Regular");
		lblRegular.setBounds(351, 92, 70, 22);
		lblRegular.setFont(new Font("Bebas Neue", Font.PLAIN, 15));
		jFrame.add(lblRegular);
		
		JLabel lbltimo = new JLabel("Ótimo");
		lbltimo.setBounds(476, 91, 70, 27);
		lbltimo.setFont(new Font("Bebas Neue", Font.PLAIN, 15));
		jFrame.add(lbltimo);
		
		jFrame.setTitle("Teste de conexão");
		jFrame.setVisible(true);
		jFrame.setSize(650, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setResizable(false);
		jFrame.setLocationRelativeTo(null);
		jFrame.getContentPane().add(jb);
		jFrame.getContentPane().add(bar);	
		
		
		sevidor1.setBounds(268, 190, 82, 22);
		sevidor1.setVisible(false);
		jFrame.add(sevidor1);		
		
		lblms1.setBounds(351, 190, 50, 22);
		lblms1.setVisible(false);		
		jFrame.add(lblms1);		
		
		lbltimo_1.setBounds(411, 190, 82, 22);
		lbltimo_1.setVisible(false);
		jFrame.add(lbltimo_1);		
		
		progressBar_1.setValue(0);
		progressBar_1.setBounds(476, 190, 70, 22);
		progressBar_1.setVisible(false);		
		jFrame.add(progressBar_1);
		
		sevidor2.setBounds(268, 220, 82, 22);
		sevidor2.setVisible(false);
		jFrame.add(sevidor2);		
		
		lblms2.setBounds(351, 220, 50, 22);
		lblms2.setVisible(false);		
		jFrame.add(lblms2);		
		
		lbltimo_2.setBounds(411, 220, 82, 22);
		lbltimo_2.setVisible(false);
		jFrame.add(lbltimo_2);		
		
		progressBar_2.setValue(0);
		progressBar_2.setBounds(476, 220, 70, 22);
		progressBar_2.setVisible(false);		
		jFrame.add(progressBar_2);
		
		sevidor3.setBounds(268, 250, 82, 22);
		sevidor3.setVisible(false);
		jFrame.add(sevidor3);		
		
		lblms3.setBounds(351, 250, 50, 22);
		lblms3.setVisible(false);		
		jFrame.add(lblms3);		
		
		lbltimo_3.setBounds(411, 250, 82, 22);
		lbltimo_3.setVisible(false);
		jFrame.add(lbltimo_3);		
		
		progressBar_3.setValue(0);
		progressBar_3.setBounds(476, 250, 70, 22);
		progressBar_3.setVisible(false);		
		jFrame.add(progressBar_3);
		
		sevidor4.setBounds(268, 280, 82, 22);
		sevidor4.setVisible(false);
		jFrame.add(sevidor4);		
		
		lblms4.setBounds(351, 280, 50, 22);
		lblms4.setVisible(false);		
		jFrame.add(lblms4);		
		
		lbltimo_4.setBounds(411, 280, 82, 22);
		lbltimo_4.setVisible(false);
		jFrame.add(lbltimo_4);		
		
		progressBar_4.setValue(0);
		progressBar_4.setBounds(476, 280, 70, 22);
		progressBar_4.setVisible(false);		
		jFrame.add(progressBar_4);
		
		sevidor5.setBounds(268, 310, 82, 22);
		sevidor5.setVisible(false);
		jFrame.add(sevidor5);		
		
		lblms5.setBounds(351, 310, 50, 22);
		lblms5.setVisible(false);		
		jFrame.add(lblms5);		
		
		lbltimo_5.setBounds(411, 310, 82, 22);
		lbltimo_5.setVisible(false);
		jFrame.add(lbltimo_5);		
		
		progressBar_5.setValue(0);
		progressBar_5.setBounds(476, 310, 70, 22);
		progressBar_5.setVisible(false);		
		jFrame.add(progressBar_5);
		
		sevidor6.setBounds(268, 340, 82, 22);
		sevidor6.setVisible(false);
		jFrame.add(sevidor6);		
		
		lblms6.setBounds(351, 340, 50, 22);
		lblms6.setVisible(false);		
		jFrame.add(lblms6);		
		
		lbltimo_6.setBounds(411, 340, 82, 22);
		lbltimo_6.setVisible(false);
		jFrame.add(lbltimo_6);		
		
		progressBar_6.setValue(0);
		progressBar_6.setBounds(476, 340, 70, 22);
		progressBar_6.setVisible(false);		
		jFrame.add(progressBar_6);
		
		sevidor7.setBounds(268, 370, 82, 22);
		sevidor7.setVisible(false);
		jFrame.add(sevidor7);		
		
		lblms7.setBounds(351, 370, 50, 22);
		lblms7.setVisible(false);		
		jFrame.add(lblms7);		
		
		lbltimo_7.setBounds(411, 370, 82, 22);
		lbltimo_7.setVisible(false);
		jFrame.add(lbltimo_7);		
		
		progressBar_7.setValue(0);
		progressBar_7.setBounds(476, 370, 70, 22);
		progressBar_7.setVisible(false);		
		jFrame.add(progressBar_7);
		
		sevidor8.setBounds(268, 400, 82, 22);
		sevidor8.setVisible(false);
		jFrame.add(sevidor8);		
		
		lblms8.setBounds(351, 400, 50, 22);
		lblms8.setVisible(false);		
		jFrame.add(lblms8);		
		
		lbltimo_8.setBounds(411, 400, 82, 22);
		lbltimo_8.setVisible(false);
		jFrame.add(lbltimo_8);		
		
		progressBar_8.setValue(0);
		progressBar_8.setBounds(476, 400, 70, 22);
		progressBar_8.setVisible(false);		
		jFrame.add(progressBar_8);
		
		sevidor9.setBounds(268, 430, 82, 22);
		sevidor9.setVisible(false);
		jFrame.add(sevidor9);		
		
		lblms9.setBounds(351, 430, 50, 22);
		lblms9.setVisible(false);		
		jFrame.add(lblms9);		
		
		lbltimo_9.setBounds(411, 430, 82, 22);
		lbltimo_9.setVisible(false);
		jFrame.add(lbltimo_9);
		
		progressBar_9.setValue(0);
		progressBar_9.setBounds(476, 430, 70, 22);
		progressBar_9.setVisible(false);		
		jFrame.add(progressBar_9);
		
		pingar("link"); //server1
		pingar(""); //server2
		pingar(""); //server3
		pingar(""); //server4
		pingar(""); //server5
		pingar(""); //server6
		pingar(""); //server7
		pingar(""); //server8
		pingar(""); //server9		
	}
	
	public void pingar(String host) {
		try {
		    if (InetAddress.getByName(host).isReachable(5000)) {   
		      long nanos = 0;
	          long millis = 0;
	          long iterations = 0;
	          String result = null;
	          String color = null;
	          int ms = 0;
	          for (int i = 0; i < 4; i++)  {
		            iterations++;
		            try {
		              nanos = System.nanoTime();
		              InetAddress.getByName(host).isReachable(5000); // this invocation is the offender
		              nanos = System.nanoTime()-nanos;
		            } catch (IOException e) {
		              System.out.println("Failed to reach host");
		            }
		            millis = Math.round(nanos/Math.pow(10,6));
		            //System.out.println("Resposta do IP: "+InetAddress.getByName(host).getHostAddress()+" com de tempo="+millis+" ms");
		            ms = 100 - (int)millis;
		            if (ms >= 80) {
		            	bar.setForeground(Color.decode("#00D269"));
		            	bar.setValue(ms);
		            	result = "Ótimo";
		            	color = "#00D269";
		            }else if(ms >= 65 && ms <= 79) {
		            	bar.setForeground(Color.decode("#E3FC8D"));
		            	bar.setValue(ms);
		            	result = "Regular";
		            	color = "#E3FC8D";
		            }else if(ms >= 31 && ms <= 64) {
		            	bar.setForeground(Color.decode("#F8B872"));
		            	bar.setValue(ms);
		            	result = "Ruim";
		            	color = "#F8B872";
		            }else {
		            	bar.setForeground(Color.decode("#EB4747"));
		            	bar.setValue(ms);
		            	result = "Péssimo";
		            	color = "#EB4747";
		            }
		            
		            try {
		              Thread.sleep(Math.max(0, 1000-millis));
		            } catch (InterruptedException e) {
		              break;
		            }
		          }
	          registroPing(ms, (int)millis, result, color);	          	          
		          //System.out.println("Iterations: "+iterations);	         
		    }
		   } catch (IOException e) {
		        System.out.println("Network error.");
		   }	
	}

	private void registroPing(int ms, long millis, String result, String color) {
		if (!sevidor1.isVisible()) {
			sevidor1.setVisible(true);
			lblms1.setVisible(true);			
			lblms1.setText(millis + "ms");
			lbltimo_1.setVisible(true);
			lbltimo_1.setText(result);
			progressBar_1.setVisible(true);
			progressBar_1.setValue(ms);
			progressBar_1.setForeground(Color.decode(color));	
		}
		else if(!sevidor2.isVisible()) {
			sevidor2.setVisible(true);
			sevidor2.setText("Servidor 2");
			lblms2.setVisible(true);
			lblms2.setText(millis + "ms");
			lbltimo_2.setVisible(true);
			lbltimo_2.setText(result);
			progressBar_2.setVisible(true);
			progressBar_2.setValue(ms);
			progressBar_2.setForeground(Color.decode(color));			
		}
		else if(!sevidor3.isVisible()) {
			sevidor3.setVisible(true);
			sevidor3.setText("Servidor 3");
			lblms3.setVisible(true);
			lblms3.setText(millis + "ms");
			lbltimo_3.setVisible(true);
			lbltimo_3.setText(result);
			progressBar_3.setVisible(true);
			progressBar_3.setValue(ms);
			progressBar_3.setForeground(Color.decode(color));			
		}
		
		else if(!sevidor4.isVisible()) {
			sevidor4.setVisible(true);
			sevidor4.setText("Servidor 4");
			lblms4.setVisible(true);
			lblms4.setText(millis + "ms");
			lbltimo_4.setVisible(true);
			lbltimo_4.setText(result);
			progressBar_4.setVisible(true);
			progressBar_4.setValue(ms);
			progressBar_4.setForeground(Color.decode(color));			
		}
		
		else if(!sevidor5.isVisible()) {
			sevidor5.setVisible(true);
			sevidor5.setText("Servidor 5");
			lblms5.setVisible(true);
			lblms5.setText(millis + "ms");
			lbltimo_5.setVisible(true);
			lbltimo_5.setText(result);
			progressBar_5.setVisible(true);
			progressBar_5.setValue(ms);
			progressBar_5.setForeground(Color.decode(color));			
		}
		
		else if(!sevidor6.isVisible()) {
			sevidor6.setVisible(true);
			sevidor6.setText("Servidor 6");
			lblms6.setVisible(true);
			lblms6.setText(millis + "ms");
			lbltimo_6.setVisible(true);
			lbltimo_6.setText(result);
			progressBar_6.setVisible(true);
			progressBar_6.setValue(ms);
			progressBar_6.setForeground(Color.decode(color));			
		}
		
		else if(!sevidor7.isVisible()) {
			sevidor7.setVisible(true);
			sevidor7.setText("Servidor 7");
			lblms7.setVisible(true);
			lblms7.setText(millis + "ms");
			lbltimo_7.setVisible(true);
			lbltimo_7.setText(result);
			progressBar_7.setVisible(true);
			progressBar_7.setValue(ms);
			progressBar_7.setForeground(Color.decode(color));			
		}
		
		else if(!sevidor8.isVisible()) {
			sevidor8.setVisible(true);
			sevidor8.setText("Servidor 8");
			lblms8.setVisible(true);
			lblms8.setText(millis + "ms");
			lbltimo_8.setVisible(true);
			lbltimo_8.setText(result);
			progressBar_8.setVisible(true);
			progressBar_8.setValue(ms);
			progressBar_8.setForeground(Color.decode(color));				
		}
		
		else if(!sevidor9.isVisible()) {
			sevidor9.setVisible(true);
			sevidor9.setText("Servidor 9");
			lblms9.setVisible(true);
			lblms9.setText(millis + "ms");
			lbltimo_9.setVisible(true);
			lbltimo_9.setText(result);
			progressBar_9.setVisible(true);
			progressBar_9.setValue(ms);
			progressBar_9.setForeground(Color.decode(color));	
			lblNewLabel_1.setText("Teste de conexão concluído!");
		}
	}
	
	private void toggleVisible() {
		lblNewLabel_1.setText("Aguarde... Teste em andamento");
		sevidor1.setVisible(false);
		lblms1.setVisible(false);
		lbltimo_1.setVisible(false);
		progressBar_1.setVisible(false);
		
		sevidor2.setVisible(false);
		lblms2.setVisible(false);
		lbltimo_2.setVisible(false);
		progressBar_2.setVisible(false);
		
		sevidor3.setVisible(false);
		lblms3.setVisible(false);
		lbltimo_3.setVisible(false);
		progressBar_3.setVisible(false);
		
		sevidor4.setVisible(false);
		lblms4.setVisible(false);
		lbltimo_4.setVisible(false);
		progressBar_4.setVisible(false);
		
		sevidor5.setVisible(false);
		lblms5.setVisible(false);
		lbltimo_5.setVisible(false);
		progressBar_5.setVisible(false);
		
		sevidor6.setVisible(false);
		lblms6.setVisible(false);
		lbltimo_6.setVisible(false);
		progressBar_6.setVisible(false);
		
		sevidor7.setVisible(false);
		lblms7.setVisible(false);
		lbltimo_7.setVisible(false);
		progressBar_7.setVisible(false);
		
		sevidor8.setVisible(false);
		lblms8.setVisible(false);
		lbltimo_8.setVisible(false);
		progressBar_8.setVisible(false);
		
		
		links();
	}

	private void links() {
		pingar(""); //server1
		pingar(""); //server2
		pingar(""); //server3
		pingar(""); //server4
		pingar(""); //server5
		pingar(""); //server6
		pingar(""); //server7
		pingar(""); //server8
		pingar(""); //server9	
	}
	
	//Legenda
	//Ótimo == 20ms a 0ms == verde
	//Regular == 35ms a 21ms == Amarelo
	//Ruim == 34ms a 69ms == Laranja
	//Péssimo == 70ms... == Vermelho	
}
