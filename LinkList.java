package lab_03;

public class LinkList {
	public Link first;
	
	//constructor generation 
	public LinkList() {
		first = null;
	}

	//implementing the isEmpty method
	public boolean isEmpty() {
		return(first.next == null);
	}
	
	//implementing the insertFirst method;
	public void insertFirst(String n, double avg) {
		Link nLink = new Link(n,avg);//creation of the new link
		nLink.next = first;//changing the next to the newly created link
		first = nLink;//changing the first to the newly created link
	}
	
	//implementing the deleteFirst method
	public Link deleteFirst() {
		Link temp = first.next;
		first = first.next.next;
		return temp;
	}
	
	//implementing the displayList() method
	public void displayList() {
		Link current = first;
		
		while(current != null) {
			current.displayDetails();
			current = current.next;
		}
	}

	//implementing the deleteLink() method
	public Link deleteLink(String name) {
		Link current = first;
		Link previous = first;
		
		while(current.name != name) {
			if(current.next == null) 
				return null;
			else {
				previous = current;
				current = current.next;
			}
		}
		if(current == first)
			first = first.next;
		else
			previous.next = current.next;
		
		return current;
	}
}
