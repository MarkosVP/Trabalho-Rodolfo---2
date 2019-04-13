import java.util.Scanner;

public class PrincipalCabine
{
	public static void main(String[] args)
	{
		Veiculo v[] = new Veiculo[100];
		Scanner teclado = new Scanner(System.in);

		while(op != 0)
		{
			System.out.println("1. Criar Automovel");
			System.out.println("2. Criar Caminhao");
			System.out.println("3. Criar Motocicleta");
			System.out.println("4. Criar Cabine de Pedagio");
			System.out.println("5. Listar Automoveis");
			System.out.println("6. Listar Praca de Pedagio");
			System.out.println("7. Passar Veiculo");
			System.out.println("0. Sair\n");

			System.out.printf("Selecao: ");
			op = teclado.nextInt();
			teclado.nextLine();
			
			switch(op)
			{
						case 1: //Criar Carro 	-----------------------------------------------------------------------------------------
								System.out.println("Insira a quantidade de eixos: ");
								int ex= teclado.nextInt(); teclado.nextLine();
								
								System.out.println("Insira a Placa: ");
								String pl= teclado.nextLine();
								
								System.out.println("Insira o Modelo: ");
								String mdl= teclado.nextLine();
								
								System.out.println("Insira o numero de Portas: ");
								int npt= teclado.nextInt(); teclado.nextLine();
								
								System.out.println("Vidro Eletrico?   Nao(0)  Sim(1): ");
								boolean vde= teclado.hasNextBoolean(); teclado.nextLine();
								
								System.out.println("Ar-Condicionado?  Nao(0)  Sim(1): ");
								boolean acd= teclado.hasNextBoolean(); teclado.nextLine();
								
								System.out.println("Conversivel?  Nao(0)  Sim(1): ");
								boolean cvs= teclado.hasNextBoolean(); teclado.nextLine();
								
								System.out.println("Insira o volume do porta malas: ");
								float vpm= teclado.nextFloat(); teclado.nextLine();
								v[a]= new Automovel(ex, pl, mdl, npt, vde, acd, cvs, vpm);
								a++;
								break;

						case 2: //Criar Caminhão	---------------------------------------------------------------------------------
								System.out.println("Insira a quantidade de eixos: ");
								ex= teclado.nextInt(); teclado.nextLine();
								
								System.out.println("Insira a Placa: ");
								pl= teclado.nextLine();
								
								System.out.println("Insira o Modelo: ");
								mdl= teclado.nextLine();
								
								System.out.println("Insira o numero de Portas: ");
								npt= teclado.nextInt(); teclado.nextLine();
								
								System.out.println("Vidro Eletrico?   Nao(0)  Sim(1): ");
								vde= teclado.hasNextBoolean(); teclado.nextLine();
								
								System.out.println("Ar-Condicionado?  Nao(0)  Sim(1): ");
								acd= teclado.hasNextBoolean(); teclado.nextLine();
								
								System.out.println("A carga tem seguro?  Nao(0)  Sim(1): ");
								boolean seg= teclado.hasNextBoolean(); teclado.nextLine();
								
								System.out.println("Insira o pesa da carga: ");
								int pc= teclado.nextInt();  teclado.nextLine();
								v[a]= new Caminhao(ex, pl, mdl, npt, vde, acd, pc, seg);
								a++;
								break;

						case 3: //Criar Moto
								System.out.println("Insira a quantidade de eixos: ");
								ex= teclado.nextInt(); teclado.nextLine();
								
								System.out.println("Insira a Placa: ");
								pl= teclado.nextLine();
								
								System.out.println("Insira o Modelo: ");
								mdl= teclado.nextLine();
								
								System.out.println("Insira o modelo do guidao: ");
								String mdlg= teclado.nextLine();
								
								System.out.println("Tem corta linha?  Nao(0)  Sim(1): ");
								boolean ctln= teclado.hasNextBoolean(); teclado.nextLine();

								v[a]= new Moto(ex, pl, mdl, mdlg, ctln);
								a++;
								break;

						case 4: //Criar Cabine de Pedágio
								System.out.println("Insira a Tarifa da praca de pedagio: ");
								float val = teclado.nextFloat();	teclado.nextLine();
								vcb[cb].setTarifa(val);
								cb++;
								break;

						case 5: //Listar Veículos
								System.out.println("Veiculos cadastrados sao:");
								for(i=0;i<a;i++){
									System.out.printf("\n%d",((Veiculo) v[i]).getEixos());
									System.out.printf("\n%d",((Veiculo) v[i]).getSaldo());
									System.out.printf("\n%d",((Veiculo) v[i]).getPlaca());
									System.out.printf("\n%d",((Veiculo) v[i]).getModelo());
								}
								break;
								
						case 6:

								break;
								
						case 7:

								break;
			}
		}
	}
}
