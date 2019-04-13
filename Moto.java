public class Moto extends Veiculo
{
	private String ModeloGuidao;
	private boolean CortaLinha;


	// Construtor //
	public Moto(int ex, float sld, String pl, String mdl, String mdlg, boolean ctln)
	{
		super(ex, sld, pl, mdl);
		ModeloGuidao= mdlg;
		CortaLinha= ctln;		
	}
	

	//Obtendo Dados
	//ModeloGuidao
	public void setModeloGuidao( String mdlg )
	{
		ModeloGuidao = mdlg;
	}

	//CortaLinha
	public void setCortaLinha( boolean ctln )
	{
		CortaLinha = ctln;
	}

	//Obtendo dados
	//ModeloGuidao
	public String getModeloGuidao()
	{
		return ModeloGuidao;
	}

	//CortaLinha
	public boolean getCortaLinha()
	{
		return CortaLinha;
	}
}
