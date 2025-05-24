package Creationals.Builder;

import Creationals.Builder.Petrecere;
import Creationals.Builder.PetrecereBuilder;

public class Program {

	public static void main(String[] args) {
		//Petrecere petrecere = new Petrecere();
		PetrecereBuilder builder = new PetrecereBuilder();
		Petrecere petrecereTest = builder.build();
		builder = builder.setAreBaloane(true);
		System.out.println(petrecereTest);
		Petrecere petrecere = builder.setAreArtificii(true)
				.setNrPersoane(20)
				.setAreTort(true).build();
		
		System.out.println(petrecere);
	}

}
