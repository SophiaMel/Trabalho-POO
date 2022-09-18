package questao24;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		float hora, min;
	    int h;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite a hora em valor númerico");
	    hora = sc.nextFloat();
	    h =  (int)hora;
	    min = (hora - h);

	    float convert = h*60 + min*60;
	   
	    System.out.println(h + " Horas");
	    System.out.println(min + " Horas");
	    System.out.println("TOTAL: " + convert  + " minutos");
		// TODO Auto-generated method stub

	}

}
