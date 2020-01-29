package ordenacion;

public class Ordenacion {
	public static boolean ordenacionTres(int numero1, int numero2, int numero3) {
		if(numero1 < numero2 && numero1 < numero3) {
			System.out.println(numero1);
			if(numero2 < numero3) {
				System.out.println(numero2);
				System.out.println(numero3);
				return true;
			}else {
				System.out.println(numero3);
				System.out.println(numero2);
				return true;
			}
		}
		if(numero2 < numero1 && numero2 < numero3) {
			System.out.println(numero2);
			if(numero1 < numero3) {
				System.out.println(numero1);
				System.out.println(numero3);
				return true;
			}else {
				System.out.println(numero3);
				System.out.println(numero1);
				return true;
			}
		}
		if(numero3 < numero1 && numero3 < numero2) {
			System.out.println(numero3);
			if(numero1 < numero2) {
				System.out.println(numero1);
				System.out.println(numero2);
				return true;
			}else {
				System.out.println(numero2);
				System.out.println(numero1);
				return true;
			}
		}
		return false;
	}
}
