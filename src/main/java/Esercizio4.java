import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Esercizio4
{
	public static void main(String[] args)
	{
		//sostanzialmente una matrice nulla di strano//no
		List<List<Integer>> listaDiListeDiInteri = new ArrayList<>();
		listaDiListeDiInteri.add(Arrays.asList(24, 77, 77, 86,16));
		listaDiListeDiInteri.add(Arrays.asList(73, 41, 27, 67,9,10));
		listaDiListeDiInteri.add(Arrays.asList(34, 31, 56, 19));
		listaDiListeDiInteri.add(Arrays.asList(69, 69, 69, 73));
		listaDiListeDiInteri.add(Arrays.asList(98, 56, 100, 78));

		//lista la cui somma dei numeri è maggiore
		listaPiuGrande(listaDiListeDiInteri);
		//lista la cui somma dei numeri è minore
		listaPiuPiccola(listaDiListeDiInteri);
		//lista che contiene il numero più alto
		listaConNumeroMaggiore(listaDiListeDiInteri);
		//lista che contiene più elementi
		listaPiuLunga(listaDiListeDiInteri);
		//lista che contiene più numeri pari
		listaConPiuNumeriPari(listaDiListeDiInteri);
		//lista che contiene più numeri uguali tra loro
		listaConPiuNumeriUguali(listaDiListeDiInteri);

	}


	private static void listaPiuGrande(List<List<Integer>> mat)
	{
	}

	private static void listaPiuPiccola(List<List<Integer>> mat)
	{
	}

	private static void listaConNumeroMaggiore(List<List<Integer>> mat)
	{
	}

	private static void listaPiuLunga(List<List<Integer>> mat)
	{
	}

	private static void listaConPiuNumeriPari(List<List<Integer>> mat)
	{
	}

	private static void listaConPiuNumeriUguali(List<List<Integer>> mat)
	{
	}
}
