public class CabinePedagio
{
	private float Tarifa, Total;

	public void Passar(Veiculo a)
	{
		Total= eixos*Tarifa;
		
		if(a instanceof Moto)
			Total*0,5;
		if(a instanceof Caminhao)
			Total*2;
		
		a.setSaldo		
	}
}
