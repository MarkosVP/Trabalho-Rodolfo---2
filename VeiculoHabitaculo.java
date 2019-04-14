//Programadores
//Marcos Vinicius Souza Pinheiro - 580678
//João Pedro Lourenção - 579610
//Pedro Luis - 580473

public class VeiculoHabitaculo extends Veiculo
{
	private int numPorta;
	private boolean VidroEletrico, ArCondicionado;
	
	public VeiculoHabitaculo(int ex, float sld, String pl, String mdl, int npt, boolean vde, boolean acd)
	{
		super(ex, sld, pl, mdl);
		numPorta= npt;
		VidroEletrico= vde;
		ArCondicionado= acd;	
	}
	

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
