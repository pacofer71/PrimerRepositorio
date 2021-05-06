/**
 * 
 */
package paquete1;

/**
 * @author pacof
 *
 */
public class Cuadrados {
	double lado;
	public Cuadrados() {};
	public Cuadrados(double miLado) {
		lado=miLado;
	}
	/**
	 * @return double
	 */
	public double calculaPerimetro() {
		return 4*lado;
	}
	public double calcularArea() {
		return lado*lado;
	}
}
