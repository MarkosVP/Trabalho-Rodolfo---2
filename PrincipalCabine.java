import java.util.Scanner;

public class PrincipalCabine
{
	public static void main(String[] args)
	{
		int op=999, a=0, i=0, cb=0, idV, idP;
		Veiculo v[] = new Veiculo[100];
		CabinePedagio vcb[] = new CabinePedagio[10];
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
			System.out.printf("\n\n");
			
			switch(op)
			{
						case 1: //Criar Carro-----------------------------------------------------------
								System.out.println("Insira a quantidade de eixos: ");
								int ex= teclado.nextInt(); teclado.nextLine();
								
								System.out.println("Insira o Saldo: ");
								float sld= teclado.nextFloat(); teclado.nextLine();

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
								System.out.printf("\n");

								v[a]= new Automovel(ex, sld, pl, mdl, npt, vde, acd, cvs, vpm);
								a++;
								break;



						case 2: //Criar Caminhão--------------------------------------------------------
								System.out.println("Insira a quantidade de eixos: ");
								ex= teclado.nextInt(); teclado.nextLine();
								
								System.out.println("Insira o Saldo: ");
								sld= teclado.nextFloat(); teclado.nextLine();

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

								v[a]= new Caminhao(ex, sld, pl, mdl, npt, vde, acd, pc, seg);
								a++;
								break;

						case 3: //Criar Moto------------------------------------------------------------
								System.out.println("Insira a quantidade de eixos: ");
								ex= teclado.nextInt(); teclado.nextLine();

								System.out.println("Insira o Saldo: ");
								sld= teclado.nextFloat(); teclado.nextLine();

								System.out.println("Insira a Placa: ");
								pl= teclado.nextLine();

								System.out.println("Insira o Modelo: ");
								mdl= teclado.nextLine();

								System.out.println("Insira o modelo do guidao: ");
								String mdlg= teclado.nextLine();

								System.out.println("Tem corta linha?  Nao(0)  Sim(1): ");
								boolean ctln= teclado.hasNextBoolean(); teclado.nextLine();

								v[a]= new Moto(ex, sld, pl, mdl, mdlg, ctln);
								a++;
								break;

						case 4: //Criar Cabine de Pedágio-----------------------------------------------
								System.out.println("Insira a Tarifa da praca de pedagio: ");
								float trf = teclado.nextFloat(); teclado.nextLine();
								vcb[cb]= new CabinePedagio(trf);
								cb++;
								break;

						case 5: //Listar Veículos-------------------------------------------------------
								System.out.println("Veiculos cadastrados sao:\n");
								for(i=0;i<a;i++)
								{
									System.out.printf("\nID: %d",i);
									System.out.printf("\nPlaca: %s",((Veiculo) v[i]).getPlaca());
									System.out.printf("\nModelo: %s",((Veiculo) v[i]).getModelo());
									System.out.printf("\nSaldo: %.2f",((Veiculo) v[i]).getSaldo());
									System.out.printf("\nEixos: %d",((Veiculo) v[i]).getEixos());
									System.out.printf("\n\n");
								}
								break;
								
						case 6:	//Listar Praças do Pedágio
								System.out.printf("Pracas de Pedagio Disponiveis:\n");
								for(i=0;i<cb;i++)
								{
									System.out.printf("\nID: %d",i);
									System.out.printf("\nTarifa: %.2f\n\n",vcb[i].getTarifa());
								}
								break;
								
						case 7:	//Passar Veículos
								System.out.printf("Insira o ID do veiculo: ");
								idV = teclado.nextInt();	teclado.nextLine();

								System.out.printf("Insira o ID da Praca de Pedagio: ");
								idP = teclado.nextInt();	teclado.nextLine();
								
								vcb[idP].Passar( v[idV] );
								System.out.printf("\nSaldo Atualizado: %.2f\n\n", v[idV].getSaldo());
								
								break;
			}
		}
	}
}
