package fixacao1;

public class Círculo {
	private double raio; 
	private double circunferencia; 
	private double area;
	
	public Círculo(double raio) {
		super();
		this.raio = raio;
	} 
	
	public double calculaAreaCirculo()
	{
		return area = Math.PI*Math.pow(raio, 2.0); 
	}
	
	public double calculaCircunferencia()
	{
		return circunferencia = 2*Math.PI*raio; 
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
	

}
