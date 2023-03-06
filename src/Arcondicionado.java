public class Arcondicionado {
	private String ma, mo, modo,umid,equec;
	private int consumo, pot, temp,aquec;
	private boolean ligado;

	public Arcondicionado(String ma, String md, int c, int p) {
		this.ma = ma;
		mo = md;
		modo = "r";
		consumo = c;
		pot = p;
		temp = 23;
		aquec = 30;
		equec = "e";
		umid = "d";
	}

	public void ligarDesligar() {
		if (ligado) {
			ligado = false;
			System.out.println("Ar desligado.");
		} else {
			ligado = true;
			System.out.println("Ar ligado.");
		}

	}

	void status() {
		if (ligado) {
			System.out.println("Marca = " + ma);
			System.out.println("Modelo = " + mo);
			System.out.println("Pot�ncia = " + pot + " btus.");
			System.out.println("Consumo = " + consumo + " Kw/h.");
			if (modo == "r") {
				System.out.println("Modo de opera��o = Refrigera��o.");
				System.out.println("Temperatura = " + temp + " �C.");
			} else {
				System.out.println("Modo de opera��o = Ventila��o.");
				
			}
			if (modo == "d") {
				System.out.println("Modo de opera��o = Desumidificar.");
		
			} else {
				System.out.println("Modo de opera��o = normal.");
				
			}

		} else {
			System.out.println("Ar condicionado desligado.");
		}

		System.out.println();
	}
	public void mudarOp() {
		if(ligado) {
			if(modo=="r") {
				modo="v";
				System.out.println("Ar condicionado no modo ventila��o.");
			}
			else {
				modo="r";
				System.out.println("Ar condicionado no modo refrigera��o.");
			}
		}
		else
			System.out.println("Ar condicionado desligado");		
		
	}
	
	
	public void mudarop() {
		if(ligado) {
			if(modo=="n") {
				modo="d";
				System.out.println("Ar condicionado no modo desumidificar.");
			}
			else {
				modo="n";
				System.out.println("Ar condicionado no modo normal.");
			}
		}
		else
			System.out.println("Ar condicionado desligado");		
		
	}
	
	
	public void mudarOP() {
		if(ligado) {
			if(modo=="f") {
				modo="e";
				System.out.println("Iniciando aquecimento.");
			}
			else {
				modo="f";
				System.out.println("Desligando aquecimento");
			}
		}
		else
			System.out.println("Ar condicionado desligado");
	}
		
	public void aumentarT() {
		if(ligado) {
			if(modo=="r") {
				if(temp<30) {
					temp++;					
				}				
			}			
		}		
	}
	
	public void diminuirT() {
		if(ligado) {
			if(modo=="r") {
				if(temp>16) {
					temp--;					
				}				
			}			
		}		
	}

	public String getMa() {
		return ma;
	}

	public String getMo() {
		return mo;
	}

	public String getModo() {
		return modo;
	}

	public int getConsumo() {
		return consumo;
	}

	public int getPot() {
		return pot;
	}

	public int getTemp() {
		return temp;
	}

	public boolean isLigado() {
		return ligado;
	}

	public String getUmid () {
		return umid;
	}
}
