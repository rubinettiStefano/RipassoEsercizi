import java.util.ArrayList;
import java.util.List;

public class Esercizio3
{
	public static void main(String[] args)
	{
		List<Mobile> tutti = new ArrayList<>();
		tutti.add(new Mobile("Armadio", "bianco", 75.0));
		tutti.add(new Mobile("Scrivania", "nero", 40.5));
		tutti.add(new Mobile("Comodino", "marrone", 12.0));
		tutti.add(new Mobile("Libreria", "bianco", 60.0));
		tutti.add(new Mobile("Cassettiera", "nero", 30.0));
		tutti.add(new Mobile("Tavolo", "marrone", 50.0));
		tutti.add(new Mobile("Sedia", "nero", 8.5));
		tutti.add(new Mobile("Credenza", "bianco", 55.0));
		tutti.add(new Mobile("Mobile TV", "marrone", 33.3));
		tutti.add(new Mobile("Scarpiera", "bianco", 20.0));

		//1) Stampare tutti i mobili marroni
		//2) Stampare tutti i mobili marroni che pesano più di 40
		//3) stampare una lista con solo i nomi dei mobili
		//4) stampare solo i colori una volta sola (bianco,nero,marrone)
		//5) stampare il peso medio dei mobili
		//6) stampare i 5 mobili più pesanti
		//7) Stampare solo la Sedia, trovandola grazie al nome
	}

	public static void mobiliPesanti(List<Mobile> tutti)
	{
		List<Mobile>res= tutti.stream().
		sorted((m1,m2)->Double.compare(m1.getPeso(),m2.getPeso())).
		limit(5).toList();
		System.out.println(res);
	}
}
