import java.util.Scanner;

public class PrincipalCabine
{
	public static void main(String[] args)
	{
		int op = 999, a=0, cb=0;
		Veiculo v[] = new Veiculo[100];
		CabinePedagio vcb[] = new CabinePedagio[10];
		Scanner teclado = new Scanner(System.in);

		while(op != 0)
		{
			System.out.println("1. Criar Automovel");
			System.out.println("2. Criar Caminhao");
			System.out.println("3. Criar Motocicleta");
			System.out.println("4. Criar Cabine de Pedagio");
			System.out.println("5. Listar Veiculos");
			System.out.println("6. Listar Praça de Pedagio");
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
								v[a].setEixos(ex);
								
								System.out.println("Insira a Placa: ");
								String pl= teclado.nextLine();
								v[a].setPlaca(pl);
								
								System.out.println("Insira o Modelo: ");
								String mdl= teclado.nextLine();
								v[a].setModelo(mdl);
								
								System.out.println("Insira o numero de Portas: ");
								int npt= teclado.nextInt(); teclado.nextLine();
								((Automovel)v[a]).setNumPorta(npt);
								
								System.out.println("Vidro Eletrico?   Nao(0)  Sim(1): ");
								boolean vde= teclado.nextBoolean(); teclado.nextLine();
								((VeiculoHabitaculo)v[a]).setVidroEletrico(vde);
								
								System.out.println("Ar-Condicionado?  Nao(0)  Sim(1): ");
								boolean acd= teclado.nextBoolean(); teclado.nextLine();
								((VeiculoHabitaculo)v[a]).setArCondicionado(acd);
								
								System.out.println("Conversivel?  Nao(0)  Sim(1): ");
								boolean cvs= teclado.nextBoolean(); teclado.nextLine();
								((Automovel)v[a]).setConversivel(cvs);
								
								System.out.println("Insira o volume do porta malas: ");
								float vpm= teclado.nextFloat(); teclado.nextLine();
								((Automovel)v[a]).setVolPortaMala(vpm);
								a++;
								break;

						case 2: //Criar Caminhão	---------------------------------------------------------------------------------
								System.out.println("Insira a quantidade de eixos: ");
								ex= teclado.nextInt(); teclado.nextLine();
								v[a].setEixos(ex);
								
								System.out.println("Insira a Placa: ");
								pl= teclado.nextLine();
								v[a].setPlaca(pl);
								
								System.out.println("Insira o Modelo: ");
								mdl= teclado.nextLine();
								v[a].setModelo(mdl);
								
								System.out.println("Insira o numero de Portas: ");
								npt= teclado.nextInt(); teclado.nextLine();
								((Automovel)v[a]).setNumPorta(npt);
								
								System.out.println("Vidro Eletrico?   Nao(0)  Sim(1): ");
								vde= teclado.nextBoolean(); teclado.nextLine();
								((VeiculoHabitaculo)v[a]).setVidroEletrico(vde);
								
								System.out.println("Ar-Condicionado?  Nao(0)  Sim(1): ");
								acd= teclado.nextBoolean(); teclado.nextLine();
								((VeiculoHabitaculo)v[a]).setArCondicionado(acd);
								
								System.out.println("A carga tem seguro?  Nao(0)  Sim(1): ");
								boolean seg= teclado.nextBoolean(); teclado.nextLine();
								((Caminhao)(v[a])).setSeguroCarga(seg);
								
								System.out.println("Insira o pesa da carga: ");
								int pc= teclado.nextInt();  teclado.nextLine();
								((Caminhao)(v[a])).setPesoCarga(pc);
								a++;
								break;

						case 3: //Cara ta foda viu
								System.out.println("Insira a quantidade de eixos: ");
								System.out.println("Insira a Placa: ");
								System.out.println("Insira o Modelo: ");
								System.out.println("Insira o modelo do guidao: ");
								System.out.println("Tem corta linha?  Nao(0)  Sim(1): ");
								a++;
								break;

						case 4: 
								System.out.println("Insira a Tarifa da praca de pedagio: ");
								float val = teclado.nextFloat();	teclado.nextLine();
								vcb[cb].setTarifa(val);
								cb++;
								break;

						case 5:

								break;
								
						case 6:

								break;
								
						case 7:

								break;
			}
		}
	}
}
