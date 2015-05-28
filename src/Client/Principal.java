package Client;

import proiectCTS.Companie;
import proiectCTS.Dealer;
import proiectCTS.Handler;
import proiectCTS.ICommand;
import proiectCTS.IVanzare;
import proiectCTS.PauseCommand;
import proiectCTS.PlayCommand;
import proiectCTS.Vanzari;
import proiectCTS.VizitatorMediu;
import proiectCTS.VizitatorPremium;
import proiectCTS.VizitatorSimplu;
import proiectCTS.Companie.CompanieBuilder;;



public class Principal {

	public static void main(String[] args) {
//prima parte Builder
		Companie companie1 = new CompanieBuilder("Policolor","Sector 3","45 ani","S.A").build();
		System.out.println(companie1);
		
		//A doua parte Chain of Resp
		Handler simplu= new VizitatorSimplu();
		Handler mediu = new VizitatorMediu();
		Handler premium = new VizitatorPremium();
		
		simplu.setPretulUrmator(mediu);
		mediu.setPretulUrmator(premium);
		simplu.calculeaza(1);
		
		//a treia parte Command
		
		IVanzare vanzare = new Vanzari();
		
		ICommand comanda = new PlayCommand(vanzare);
		Dealer dealer = new Dealer();
		dealer.invoca(comanda);
		dealer.invoca(comanda);
		
		comanda=new PauseCommand(vanzare);
		dealer.invoca(comanda);
		dealer.invoca(comanda);
		
		dealer.undo();
		dealer.undo();
		dealer.undo();
		dealer.undo();
		
		
	}

	}


