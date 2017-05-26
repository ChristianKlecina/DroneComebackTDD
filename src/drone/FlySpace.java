package drone;

public class FlySpace {
	
	private int[] boundariesVecaPocetna = {0,0,0};
	private int[] boundariesVecaKrajnja = {50,50,50};
	private int[] boundariesManjaPocetna = {10,10,10};
	private int[] boundariesManjaKrajnja = {40,40,40};
	
	public FlySpace (int[] boundariesVecaPocetna, int[] boundariesVecaKrajnja, int[] boundariesManjaPocetna, int[] boundariesManjaKrajnja){
		this.boundariesManjaKrajnja = boundariesManjaKrajnja;
		this.boundariesManjaPocetna = boundariesManjaPocetna;
		this.boundariesVecaKrajnja = boundariesVecaKrajnja;
		this.boundariesVecaPocetna = boundariesVecaPocetna;
		
	}
}
