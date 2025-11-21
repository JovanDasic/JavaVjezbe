package JavaVjezbe6;
import java.util.ArrayList;

public class Auto {
	private String markaAuta;
	private int godisteAuta;
	private int snagaMotora;
	private boolean prodato;
	private double kubikazaMotora;
	private boolean registrovan;
	
	private static int brojProdatihAuta;
	
	public Auto(String markaAuta, int godisteAuta, int snagaMotora, boolean prodato, double kubikazaMotora, boolean registrovan) {
		if (godisteAuta < 1985) {
			this.registrovan = false;
		} else {
			this.registrovan = registrovan;
		}
		this.markaAuta = markaAuta;
		this.godisteAuta = godisteAuta;
		this.snagaMotora = snagaMotora;
		this.prodato = prodato;
		this.kubikazaMotora = kubikazaMotora;
		
		if (prodato) {
			brojProdatihAuta ++;
		}
	}
	public void setMarkaAuta(String markaAuta) {
		this.markaAuta = markaAuta;
	}
	public void setGodisteAuta(int godisteAuta) {
		this.godisteAuta = godisteAuta;
	}
	public void setSnagaMotora(int snagaMotora) {
		this.snagaMotora = snagaMotora;
	}
	public void setProdato(boolean prodato) {
		if (prodato && !this.prodato) { 
            brojProdatihAuta++;
        }
        this.prodato = prodato;
	}
	public void setKubikazaMotora(double kubikazaMotora) {
		this.kubikazaMotora = kubikazaMotora;
	}
	public void setRegistrovan(boolean registrovan) {
		this.registrovan = registrovan;
	}
	public String getMarkaAuta() {
		return markaAuta;
	}
	public int getGodisteAuta() {
		return godisteAuta;
	}
	public int getSnagaMotora() {
		return snagaMotora;
	}
	public boolean getProdato() {
		return prodato;
	}
	public double getKubikazaMotora() {
		return kubikazaMotora;
	}
	public boolean getRegistrovan() {
		return registrovan;
	}
	@Override
	public String toString() {
		return markaAuta + " " +  godisteAuta + " " + snagaMotora +  " " + kubikazaMotora + "prodato: " + prodato + "registrovan: " + registrovan ;
	}

	public static int getBrojProdatihAuta() {
		return brojProdatihAuta;
	}
	public static ArrayList <Auto> vratiAutaKojaSeNeMoguRegistrovati(ArrayList <Auto> lista){
		ArrayList<Auto> listaAuta = new ArrayList <Auto>();
		for (Auto a : lista) {
			if (a.getGodisteAuta() < 1985) {
				listaAuta.add(a);
			}
		}		
		return listaAuta;
	}
	public static ArrayList <Auto> vratiAutaKojaSeMoguRegistrovatiANisuRegistrovana(ArrayList <Auto> lista) {
		ArrayList<Auto> listaAuta = new ArrayList <Auto>();
		for (Auto a : lista) {
			if (a.getGodisteAuta() > 1985 && a.getRegistrovan() == false) {
				listaAuta.add(a);
			}
		}
		
		return listaAuta;
	}
	public static double izracunajCijenuRegistracije(Auto auto) {
		double koeficijentGodista = 0;
		int godisteAuta = auto.getGodisteAuta();
		double kubikazaMotora = auto.getKubikazaMotora();
		int snagaMotora = auto.getSnagaMotora();
		if (godisteAuta >= 1985 && godisteAuta <= 2000) {
			koeficijentGodista = 3.0;
		} else if (godisteAuta >= 2001 && godisteAuta <= 2010) {
			koeficijentGodista = 2.0;
		} else if (godisteAuta >= 2011) {
			koeficijentGodista = 1.5;
		}
		return koeficijentGodista * kubikazaMotora * snagaMotora;
	}
}
class Test{
	public static void main(String[] args) {
		ArrayList <Auto> listaAuta = new ArrayList <Auto>();
		
		listaAuta.add(new Auto("Audi A3", 2015, 110, false, 1968.0, true));
		listaAuta.add(new Auto("BMW 530", 2012, 180, true, 3000.0, true));
		listaAuta.add(new Auto("Mercedes c220", 2017, 125, false, 2200.0, false));
		listaAuta.add(new Auto("BMW 318", 1980, 80, false, 1968.0, false));
		listaAuta.add(new Auto("Audi 80", 1985, 90, false, 1800.0, false));
		
		System.out.println("---Svi AUtomobili---");
		for (Auto a : listaAuta) {
			System.out.println(a);
		}
		System.out.println("Broj prodatih automobila: " + Auto.getBrojProdatihAuta());
		
		System.out.println("Auta koja se mogu registrovati: ");
		for (Auto a : Auto.vratiAutaKojaSeNeMoguRegistrovati(listaAuta)) {
			System.out.println(a);
		}
		
		System.out.println("Auta koja se mogu registrovati ali nisu registrovana: ");
        for (Auto a : Auto.vratiAutaKojaSeMoguRegistrovatiANisuRegistrovana(listaAuta)) {
            System.out.println(a.getMarkaAuta());
        }

        System.out.println("Cijene registracija");
        for (Auto a : listaAuta) {
            double cijena = Auto.izracunajCijenuRegistracije(a);
            if (cijena > 0)
                System.out.printf("%s -> %.2f €\n", a.getMarkaAuta(), cijena);
            else
                System.out.printf("%s -> ne može se registrovati.\n", a.getMarkaAuta());
        }
	}
}

	

