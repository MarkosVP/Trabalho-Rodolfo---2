public class Automovel extends VeiculoHabitaculo
{
	private boolean Conversivel;
	private float VolPortaMala;

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
