public class Caminhao extends VeiculoHabitaculo
{
	private int PesoCarga;
	private boolean SeguroCarga;


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
