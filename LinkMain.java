package lab_03;

public class LinkMain {

	public static void main(String[] args) {
		
		/*
		//creation of LINKS 
		Link l1 = new Link("Nipuna",53.5);
		Link l2 = new Link("Aravinda",78.0);
		Link l3 = new Link("Prashini",69.5);
		
		//Arranging the order
		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		
		//printing the LINKS using displayDetails() method
		l1.next.next.displayDetails();//Prashani
		l2.displayDetails();//Aravinda
		l1.displayDetails();//Nipuna
		*/
		
		//implementing using LinkList class
		LinkList  nList= new LinkList();
		
		nList.insertFirst("Prashani", 69.5);
		nList.insertFirst("Aravinda", 78.0);
		nList.insertFirst("Nipuna", 53.5);
		nList.displayList();
		System.out.println(" ");
		
		nList.deleteLink("Aravinda");
		nList.displayList();

	}

}
