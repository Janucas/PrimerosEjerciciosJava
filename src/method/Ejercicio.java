package method;


public class Ejercicio {
	
	public static final Double PI = 3.14;
	

	public static void main(String[] args) {
				
		// Variables
		
		// Inicio
		System.out.println(numeroSolucionesEcuacionSegundoGrado(2,1,3));
		
				
				
	}
	
	public static int numeroSolucionesEcuacionSegundoGrado(int a, int b, int c) {
		int resul;
		resul=b*b - 4*a*c;
		if (resul==0) {
			return 1;
		}else if (resul < 0) {
			return 0;
		}else if (a==0) {
			return -1;
		}else {
			return 2;
		}
	
		
	}
	
	public static Double solucionSumaEcuacionSegundoGrado(int a, int b, int c) {
		int result;
		result=numeroSolucionesEcuacionSegundoGrado(a,b,c);
		Double ecuacion;
		ecuacion=(-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		if (result<=0) {
			return (double) -1000;
		}else if (result>0) {
			return ecuacion;
		}else {
			return (double) -1000;
		}
		
	}
	
	
	
	public static Double solucionRestaEcuacionSegundoGrado(int a, int b, int c) {
		int result;
		result=numeroSolucionesEcuacionSegundoGrado(a,b,c);
		Double ecuacion;
		ecuacion=(-b-Math.sqrt(b*b - 4*a*c))/(2*a);
		if (result<0) {
			return (double) -1000;
		}else if (result>0) {
			return ecuacion;
		}else {
			return (double) -1000;
		}
		
	}	
	
	public static Double areaCirculo(Double r) {
		Double radio;
		radio=(PI*r*r);
		return radio;
		
	}
	
	public static Double longitudCirculo(Double r) {
		Double radio;
		radio=(2*PI*r);
		return radio;
		
	}
	
	public static boolean esMultiplo(int a, int b) {
		if (a==0 || b==0) {
			return false;
		}
		else if (a%b==0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static int horaMayor(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		int horaM1;
		horaM1=hora1*3600+min1*60+seg1;
		int horaM2;
		horaM2=hora2*3600+min2*60+seg2;
		if ((hora1>=24 || min1>60 || seg1>60)||(hora2>=24 || min2>60 || seg2>60)) {
			return -1000;
		}else if (horaM1>horaM2) {
			return 1;
		}else if (horaM1<horaM2) {
			return 2;
		}else {
			return 0;
		}
		
	}
	
	public static int segundosEntre(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		int cuentaSeg;
		cuentaSeg=horaMayor(hora1,min1,seg1,hora2,min2,seg2);
		int horaM1;
		horaM1=hora1*3600+min1*60+seg1;
		int horaM2;
		horaM2=hora2*3600+min2*60+seg2;
		if(cuentaSeg<0 ||horaM1<horaM2) {
			return -1000;
		}else if (cuentaSeg>0) {
			return(horaM1-horaM2);
		}else {
			return 0;
		}
		
	}
	
	public static int maximoComunDivisor(int a, int b) {
		
	}
	
	public static int minimoComunMultiplo(int a, int b) {
		
	}
	
	public static String binario(int num) {
		
	}
	
	public static int decimal(String num) {
		
	}
}
