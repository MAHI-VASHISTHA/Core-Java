package text;

public class ParentClassObject {
	
	int eid;
	String name;
	static String companyname="Accenture";
	static String companyaddress="Noida";
	
	public ParentClassObject(int eid1,String name1) {
		eid=eid1;
		name=name1;
	}
	public String toString() {
		return("eid= "+eid+" ,Name= "+name+" ,Companyname= "+companyname+" ,Companyaddress= "+companyaddress);
	}
	
public static void main(String[] args) {
	ParentClassObject pc=new ParentClassObject(101,"Mahi vashistha");
	ParentClassObject pc1=new ParentClassObject(102,"Ansh vashistha");

	System.out.println(pc);
	System.out.println(pc1);
	
}
}
