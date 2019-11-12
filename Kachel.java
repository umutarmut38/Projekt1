import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class Kachel {
    private boolean kachelFrei;
   	private boolean korn;
   	private int spalte;
   	private int zeile;
   	
   	Kachel(boolean kachelFrei, int spalte, int zeile){
   		this.kachelFrei = kachelFrei;
   		this.spalte = spalte;
   		this.zeile = zeile;
   		korn = false;
   	}
   	void setKorn(){
   		korn = true;
   	}
   	public boolean getKachelFrei(){
   		return this.kachelFrei;
   	}
   	public int getSpalte(){
   		return this.spalte;
   	}
   	public int getZeile(){
   		return this.zeile;
   	}
   	public boolean vergleicheKoordinaten(int spalte, int zeile){
   		if(this.spalte == spalte && this.zeile==zeile){
   			return true;
   		}
   		return false;
   	}
	public String toString(){
		
		String s = Integer.toString(spalte);
		s=s.concat(Integer.toString(zeile));
		return s;
	}
}
