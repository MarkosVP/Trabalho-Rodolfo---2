public class Veiculo
{
	private int Eixos;
	private float Saldo;
	private String Placa, Modelo;
	
	
	public Veiculo(int ex, float sld, String pl, String mdl)
	{
		Eixos= ex;
		Saldo= sld;
		Placa= pl;
		Modelo= mdl;		
	}
	
	
	///////////  SET  ////////////
	
	//Inserir Eixos
	public void setEixos( int ex)
	{
		Eixos = ex;
	}
	//Inserir Saldo
	public void setSaldo( float sld)
	{
		Saldo = sld;
	}
	//Inserir Placa
	public void setPlaca( String pl )
	{
		Placa = pl;
	}
	//Inserir Modelo
	public void setModelo( String mdl )
	{
		Modelo = mdl;
	}
	
	
	///////////  GET  ////////////
		
	//Obtendo Eixos
	public int getEixos()
	{
		return Eixos;
	}
	
	//Obtendo Saldo
	public float getSaldo()
	{
		return Saldo;
	}
	
	//Obtendo Placa
	public String getPlaca()
	{
		return Placa;
	}

	//Obtendo Modelo
	public String getModelo()
	{
		return Modelo;
	}
}
