public class Automovel extends VeiculoHabitaculo
{
	private boolean Conversivel;
	private float VolPortaMala;
	
	// Construtor //
	public Automovel(int ex, float sld, String pl, String mdl, int npt, boolean vde, boolean acd, boolean cvs, float vpm)
	{
		super(ex, sld, pl, mdl, npt, vde, acd);
		Conversivel= cvs;
		VolPortaMala= vpm;		
	}
	
	
	//Inserindo Dados
	//Conversivel
	public void setConversivel( boolean cvs )
	{
		Conversivel = cvs;
	}

	//VolPortaMala
	public void setVolPortaMala( float vpm )
	{
		VolPortaMala = vpm;
	}

	//Obtendo Dados
	//Conversivel
	public boolean getConversivel()
	{
		return Conversivel;
	}

	//Volume Porta Malas
	public float getVolPortaMala()
	{
		return VolPortaMala;
	}
}
