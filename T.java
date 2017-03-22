
/**
 * Write a description of class t here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

   public class T {
	public static void main (String[] args) {
		TaxiQueue tq = new TaxiQueue();
		System.out.println (tq);
		System.out.println ("enqueue");
		tq.enqueue (new Taxi (13, "driverA"));
		System.out.println (tq);
		System.out.println ("enqueue");
		tq.enqueue (new Taxi (18, "driverB"));
		System.out.println (tq);
		System.out.println ("topQueue");
		Taxi t1 = tq.topQueue ();
		System.out.println (t1);
		System.out.println (tq);
		System.out.println ("dequeue");
		t1 = tq.dequeue ();
		System.out.println (t1);
		System.out.println (tq);
		System.out.println ("dequeue");
		t1 = tq.dequeue ();
		System.out.println (t1);
		System.out.println (tq);
		System.out.println ("dequeue");
		t1 = tq.dequeue ();
		System.out.println (t1);
		System.out.println (tq);
		System.out.println ("enqueue");
		tq.enqueue (new Taxi (13, "driverA"));
		System.out.println (tq);
		System.out.println ("enqueue");
		tq.enqueue (new Taxi (18, "driverB"));
		System.out.println (tq);

		System.out.println ("enqueue");
		tq.enqueue (new Taxi (12, "driverC"));
		System.out.println (tq);
		System.out.println ("enqueue");
		tq.enqueue (new Taxi (15, "driverD"));
		System.out.println (tq);
		System.out.println ("enqueue");
		tq.enqueue (new Taxi (14, "driverE"));
		System.out.println (tq);
		System.out.println ("enqueue");
		tq.enqueue (new Taxi (17, "driverF"));
		System.out.println (tq);
		System.out.println ("enqueue");
		tq.enqueue (new Taxi (19, "driverG"));
		System.out.println (tq);
		System.out.println ("enqueue");
		tq.enqueue (new Taxi (11, "driverH"));
		System.out.println (tq);
		System.out.println ("enqueue");
		tq.enqueue (new Taxi (16, "driverI"));
		System.out.println (tq);
		System.out.println ("sort");
		tq.sort();
		System.out.println (tq);
		
		Node [] n = new Node [10];
		n[1] = new Node (2,null,null);
		n[2] = new Node (35,n[1],null);
		n[3] = new Node (23,null,n[2]);
		n[4] = new Node (12,null,null);
		n[5] = new Node (5,null,n[4]);
		n[6] = new Node (18,n[5],null);
		n[7] = new Node (20,n[6],n[3]);
		n[8] = new Node (10,null,null);
		n[0] = new Node (15,n[8],n[7]);
		System.out.println ("method h():");
		for (int i=0;i < 9; i++)
			System.out.println ("h(" + n[i].getNumber()+") = " + BinaryTree.h(n[i]));
		
		System.out.println ("\nmethod something():");
		for (int i=0;i < 9; i++)
			System.out.println ("something(" + n[i].getNumber()+") = " + BinaryTree.something(n[i]));
		System.out.println ("\nmethod what():");
		for (int i=0;i < 9; i++)
			System.out.println ("what(" + n[i].getNumber()+") = " + BinaryTree.what(n[i]));
		System.out.println ("\nBinary tree:");
		BinaryTree.level (n[0]);
		n[1] = new Node (2,null,null);
		n[2] = new Node (5,null,n[1]);
		n[3] = new Node (1,null,null);
		n[4] = new Node (2,null,null);
		n[5] = new Node (3,n[3],n[4]);
		n[0] = new Node (13,n[5],n[2]);
		System.out.println ("\nBinary tree:");
		BinaryTree.level (n[0]);	
}
}
