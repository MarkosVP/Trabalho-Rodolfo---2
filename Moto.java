public class Moto extends Veiculo
{
	private String ModeloGuidao;
	private boolean CortaLinha;

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
