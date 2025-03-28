import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Esercizio1
{
	public static void main(String[] args)
	{
		//trovare il numero più alto
		//più basso
		//la media
		//ottenere una lista con i 5 numeri più alti
		//ottenere una lista con tutti i pari

		List<Integer> tutti = new ArrayList<>(Arrays.asList(
				12, 47, 893, 34, 75, 286, 503, 91, 666, 381,
				7, 159, 230, 478, 999, 364, 28, 81, 144, 63,
				715, 422, 53, 802, 319, 205, 88, 193, 342, 61,
				917, 256, 134, 708, 399, 501, 276, 49, 38, 820,
				14, 646, 95, 583, 367, 721, 153, 2, 60, 447,
				106, 378, 213, 594, 812, 385, 170, 824, 301, 445,
				983, 528, 672, 310, 289, 115, 624, 706, 478, 20,
				343, 789, 456, 930, 68, 383, 17, 745, 636, 55,
				892, 190, 365, 640, 240, 711, 221, 501, 310, 888,
				93, 134, 472, 168, 77, 329, 590, 482, 69, 720
		));
		
		numeroAlto(tutti);
		numeroBasso(tutti);
		media(tutti);
		numeriAlti(tutti);
		pari(tutti);
	}

	private static void numeroAlto(List<Integer> tutti)
	{
	}

	private static void numeroBasso(List<Integer> tutti)
	{
	}

	private static void media(List<Integer> tutti)
	{
	}

	private static void numeriAlti(List<Integer> tutti)
	{
	}

	private static void pari(List<Integer> tutti)
	{
	}
}
