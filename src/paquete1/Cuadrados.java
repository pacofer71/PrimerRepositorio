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
	public double calculaPerimetro() {
		return 4*lado;
	}
}
