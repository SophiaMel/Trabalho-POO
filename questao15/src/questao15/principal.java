package questao15;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		int fábrica = Integer.parseInt(JOptionPane.showInputDialog("digite o preço de fábrica : "));
		int Lucro = Integer.parseInt(JOptionPane.showInputDialog("digite o percentual de lucro do distribuidor : "));
		int Imposto = Integer.parseInt(JOptionPane.showInputDialog("digite o percentual de impostos: "));

		int vlr_d = fábrica*Lucro/100;
		int vlr_i = fábrica*Imposto/100;
		int p_final = fábrica + Lucro + Imposto;
		String a = "  valor correspondente ao lucro do distribuidor: " + vlr_d ;
		JOptionPane.showInternalMessageDialog(null, a);
		String b = "  valor correspondente ao lucro do imposto: " + vlr_i ;
		JOptionPane.showInternalMessageDialog(null, b);
		String c = " O preço final do veículo é : " + p_final  ;
		JOptionPane.showInternalMessageDialog(null, c);


	}

}
