public class CabinePedagio
{
	private float Tarifa, Total=0, Lucro=0;

	public void Passar(Veiculo a)
	{
		Total = a.getEixos()*Tarifa;
		
		if(a instanceof Moto)
		{
			Total*=0.5;
			Lucro += Total;
		}
		if(a instanceof Caminhao)
		{
			Total*=2;
			Lucro += Total;
		}
		
		if( a.getSaldo() >= (a.getSaldo() - Total) )
			a.setSaldo( (a.getSaldo() - Total) );
		else
			System.out.printf("Saldo Insuficiente!");
	}

	//Inserindo Tarifa
	public void setTarifa( float val )
	{
		Tarifa = val;
	}

	//Obtendo Tarifa
	public float getTarifa()
	{
		return Tarifa;
	}
}
