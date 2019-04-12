public class VeiculoHabitaculo extends Veiculo
{
	private int numPorta;
	private boolean VidroEletrico, ArCondicionado;

	//Inserindo Dados
	//NumPorta
	public void setNumPorta( int npt )
	{
		numPorta = npt;
	}

	//VidroEletrico
	public void setVidroEletrico( boolean vde )
	{
		VidroEletrico = vde;
	}

	//ArCondicionado
	public void setArCondicionado( boolean acd )
	{
		ArCondicionado = acd;
	}

	//Obtendo Dados
	//Numporta
	public int getNumPorta()
	{
		return numPorta;
	}

	//VidroEletrico
	public boolean getVidroEletrico()
	{
		return VidroEletrico;
	}

	//ArCondicionado
	public boolean getArCondicionado()
	{
		return ArCondicionado;
	}
}