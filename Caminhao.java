//Programadores
//Marcos Vinicius Souza Pinheiro - 580678
//João Pedro Lourenção - 579610
//Pedro Luis - 580473

public class Caminhao extends VeiculoHabitaculo
{
	private int PesoCarga;
	private boolean SeguroCarga;

	// Construtor //
	public Caminhao(int ex, float sld, String pl, String mdl, int npt, boolean vde, boolean acd, int pc, boolean seg)
	{
		super(ex, sld, pl, mdl, npt, vde, acd);
		PesoCarga= pc;
		SeguroCarga= seg;
	}


	/////////////  SET  //////////////
	public void setPesoCarga( int pc )
	{
		PesoCarga = pc;
	}
	
	public void setSeguroCarga( boolean seg )
	{
		SeguroCarga = seg;
	}


	////////////  GET  ////////////
	public int getPesoCarga()
	{
		return PesoCarga;
	}
	
	public boolean getSeguroCarga()
	{
		return SeguroCarga;
	}
}
