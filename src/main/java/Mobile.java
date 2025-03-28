import java.util.StringJoiner;

public class Mobile
{
	private String nome,colore;
	private double peso;

	public Mobile(String nome, String colore, double peso)
	{
		this.nome = nome;
		this.colore = colore;
		this.peso = peso;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getColore()
	{
		return colore;
	}

	public void setColore(String colore)
	{
		this.colore = colore;
	}

	public double getPeso()
	{
		return peso;
	}

	public void setPeso(double peso)
	{
		this.peso = peso;
	}

	@Override
	public String toString()
	{
		return new StringJoiner(" ", "", ".")
				.add("nome: " + nome)
				.add("colore: " + colore)
				.add("peso: " + peso)
				.toString();
	}
}
