import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class Main implements de.hamster.model.HamsterProgram {Hamster h = new Hamster(0,0,1,0);
Map map = new Map(new Knoten(true, h.getSpalte(),h.getReihe()));
public void main() {	
	vorw�rts();
    h.linksUm();
    h.linksUm();
	r�ckw�rts();
    h.linksUm();
	vorw�rts();
   	h.linksUm();
   	vorw�rts();
	h.linksUm();
	vorw�rts(3);
	h.linksUm();
	vorw�rts(3);
	h.linksUm();
	h.linksUm();
	r�ckw�rts();
	h.linksUm();
	vorw�rts(2);		
	h.schreib(map.getStartKnoten().findeKnoten(13,5).toString());


}
void vorw�rts(){
    while(h.vornFrei()){
    	h.vor();
    	Knoten k = new Knoten(true, h.getSpalte(),h.getReihe());
    	map.addKnoten(k);
    	map.setAktuellerKnoten(k);
    }	
}
void vorw�rts(int schritte){
	for(int i=0; i<schritte;i++){
		h.vor();
    	Knoten k = new Knoten(true, h.getSpalte(),h.getReihe());
    	map.addKnoten(k);
    	map.setAktuellerKnoten(k);
	}
}
void r�ckw�rts(){
    while(h.vornFrei()){
    	h.vor();
    	map.knotenZurueck();
    }	
}}