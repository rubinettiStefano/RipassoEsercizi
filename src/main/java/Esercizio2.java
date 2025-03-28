import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Esercizio2
{
	public static void main(String[] args)
	{
		//ora giochiamo con le string
		List<String> stringhe = new ArrayList<>(Arrays.asList(
				"cielo", "mare", "luna", "albero","osso", "montagna", "fiume", "sole", "stella", "fiore", "vita",
				"amore", "libertà", "energia","otto","anna", "forza", "sogno", "pace", "fuoco", "guerra", "musica", "viaggio"
		));

		//stampare tutte le parole di meno di 5 lettere
		paroleNonCorteMaDiLunghezzaMedia(stringhe);
		//stampare tutte le parole che iniziano con a
		paroleA(stringhe);
		//stampare tutte parole che iniziano con a e finiscono con e oppure o
		paroleAEO(stringhe);
		//stampare tutte le parole che contengono almeno 4 lettere diverse
		parole4lettereDiverse(stringhe);
		//stamparle in ordine alfabetico, poi in ordine inverso
		paroleAlfabetico(stringhe);
		paroleAlfabeticoInv(stringhe);
		//stamparle solo i palindromi (anna,otto,osso)
		parolePalindrome(stringhe);
	}

	private static void paroleNonCorteMaDiLunghezzaMedia(List<String> stringhe)
	{
	}

	private static void paroleA(List<String> stringhe)
	{
	}

	private static void paroleAEO(List<String> stringhe)
	{
	}

	private static void parole4lettereDiverse(List<String> stringhe)
	{
	}

	private static void paroleAlfabetico(List<String> stringhe)
	{
	}

	private static void paroleAlfabeticoInv(List<String> stringhe)
	{
	}

	private static void parolePalindrome(List<String> stringhe)
	{
	}
}
