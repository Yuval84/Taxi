
/**
 * represent binary tree of node object
 * 
 * @author Edelman yuval
 * @version 31.1.12
 */
public class BinaryTree {
     /**
     * Prints the values at the junction of the tree and the tree level
     * (The root level is 0, the level of children of the root is 1 and so on)
     * exemple:"6=>0"
     * @param n the node to print
     */
    public static void level(Node n){ 
        printTree(n,0);//use a override method
    }
       
    private static  void  printTree(Node n,int i){
        if(n!=null){
            printTree(n.getLeftSon(),i+1); // use override method  with +1 to count the level  
            printTree(n.getRightSon(),i+1); // use override method  with +1 to count the level              
            System.out.println(n.getNumber()+"=>"+i);//print the num and level
        }
    }
     /**
     * boolean method that checks if the binary tree is a sigma tree
     * (if the value of each node which is greater than or equal to the sum of The values ​​of the sub - trees 
     * then he is a sigma tree)
     * @param n the node to check
     * @return true if the node sigma
     * @return false if the node not sigma
     */
    public static boolean isSigma(Node n){
        if(n!=null){
            if (n.getNumber() >= sum(n.getLeftSon()) + sum(n.getRightSon())){//use override method thet sum the nodes  
                return isSigma(n.getLeftSon()) &&isSigma(n.getRightSon()) ;//check left nodes and right nodes
            }
            else{
                return false;//not sigma
            }
        }       
        return true;//sigma
    }
       
    private static int sum (Node n){
        if(n==null){
            return 0;
        }  
        return n.getNumber()+ sum(n.getLeftSon())+ sum(n.getRightSon());//sum of nodes values
    }

}
     

    

	 
	   












	