package emf2prolog;


/**
 * 
 * @author Alix Mougenot
 * 
 * @param <T1> first type
 * @param <T2> second type
 * 
 * this is from the C++ STL
 */
public class Pair<T1,T2> {
	T1 a;
	T2 b;
	
	
	public Pair(T1 a, T2 b){
		this.a = a;
		this.b = b;
	}
	
	public void fst(T1 a){
		this.a = a;
	}
	
	public void snd(T2 b){
		this.b = b;
	}
	
	
	public T1 fst(){
		return a;
	}
	
	public T2 snd(){
		return b;
	}
	

}
