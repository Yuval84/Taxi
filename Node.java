
/**
 * This class represent a Node whith  number and  Node leftSon, rightSon
 * 
 * @author Edelman yuval
 * @version 31.1.12
 */
public class Node {
	private int _number;//num value in the node
	private Node _leftSon, _rightSon;//the node left and right nodes
	/**
	 * constructor node 
	 * @param number num   
	 */
	public Node (int number) {
		_number = number;
		_leftSon = null;
		_rightSon = null;
	}
	/**
	 * constructor node 
	 * @param number num
	 * @param  leftSon left node
	 * @param  rightSon right node
	 */
	public Node (int number, Node leftSon, Node rightSon) {
		_number = number;
		_leftSon = leftSon;
		_rightSon = rightSon;
	}
	/**
	 * return number
	 * @return numbre
	 */
	public int getNumber() {return _number;}
	/**
	 * return leftson node
	 * @return leftSon node
	 */
	public Node getLeftSon() { return _leftSon;}
	/**
	 * return right son nod
	 * @return rightSon node
	 */
	public Node getRightSon() {return _rightSon;}
	/**
	 * seting number value of the node
	 * @param number the num to set
	 */
	public void setNumber(int number) {_number = number;}
	/**
	 * seting left nod son
	 * @node the node to set at leftSon
	 */
	public void setLeftSon (Node node) {_leftSon = node;}
	/**
	 * seting right node
	 * @node the nod to set at rightSon node
	 */
	public void setRightSon (Node node) {_rightSon = node; }
}
	