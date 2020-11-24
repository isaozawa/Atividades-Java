package Exercicio1e2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		cachorro1.setNome("Cachorro 1");
		cachorro1.setIdade(8);
		cachorro1.setSom("Latir");
		cachorro1.setCorrer("Sim");
		
		cavalo1.setNome("Cavalo 1");
		cavalo1.setIdade(3);
		cavalo1.setSom("Relinchar");
		cavalo1.setCorrer("Sim");
		
		preguica1.setNome("Preguiça 1");
		preguica1.setIdade(10);
		preguica1.setSom("Roncar");
		preguica1.setSubirArvore("Sim");
		
		System.out.println(cachorro1.toString());
		System.out.println(cavalo1.toString());
		System.out.println(preguica1.toString());

	}

}
