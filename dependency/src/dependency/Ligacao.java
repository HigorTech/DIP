package dependency;

public class Ligacao {

	
	protected DDDRegiao ddd;
	public int number;
	
	public Ligacao(DDDRegiao ddd, int number) {
		super();
		this.ddd = ddd;
		this.number = number;
	}




	
	
	
	
	
	public void discar() {
		
		System.out.println("Ligando para "+ddd.InserirDDD()+" "+number);
		
	}
	

	
	
	
	
}
