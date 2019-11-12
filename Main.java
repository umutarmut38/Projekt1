import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class Main implements de.hamster.model.HamsterProgram {Hamster h = new Hamster(0,0,1,0);
Map map = new Map(new Knoten(true, h.getSpalte(),h.getReihe()));
public void main() {	
	vorwärts();
    h.linksUm();
    h.linksUm();
	rückwärts();
    h.linksUm();
	vorwärts();
   	h.linksUm();
   	vorwärts();
	h.linksUm();
	vorwärts(3);
	h.linksUm();
	vorwärts(3);
	h.linksUm();
	h.linksUm();
	rückwärts();
	h.linksUm();
	vorwärts(2);		
	h.schreib(map.getStartKnoten().findeKnoten(13,5).toString());


}
void vorwärts(){
    while(h.vornFrei()){
    	h.vor();
    	Knoten k = new Knoten(true, h.getSpalte(),h.getReihe());
    	map.addKnoten(k);
    	map.setAktuellerKnoten(k);
    }	
}
void vorwärts(int schritte){
	for(int i=0; i<schritte;i++){
		h.vor();
    	Knoten k = new Knoten(true, h.getSpalte(),h.getReihe());
    	map.addKnoten(k);
    	map.setAktuellerKnoten(k);
	}
}
void rückwärts(){
    while(h.vornFrei()){
    	h.vor();
    	map.knotenZurueck();
    }	
}}