package dsa;

public class Perfectbinarytree {
static class Node{
	int key;
	Node left,right;
}
static int depth(Node node) {
	int d=0;
	while(node !=null) {
		d++;
		node=node.left;
	}return d;
}
static boolean is_perfect(Node root, int d, int level) {
	if(root==null)
		return true;
	if(root.left==null && root.right==null)
		return(d==level+1);
	if(root.left==null ||root.right==null)
		return false;
	return is_perfect(root.left,d,level+1)&& is_perfect(root.right,d,level+1);
} static boolean is_perfect(Node root) {
	int d=depth(root);
	return is_perfect(root,d,0);
}
	static Node newNode(int k) {
		Node node=new Node();
		node.key=k;
		node.left=null;
		node.right=null;
		return node;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Node root=null;
      root=newNode(1);
      root.left=newNode(2);
    		  root.right=newNode(3);
    		  root.left.left=newNode(4);
    		  root.left.right=newNode(5);
    		  root.right.left=newNode(6);
    		  root.right.right=newNode(7);
    		  if(is_perfect(root)==true)
    			  System.out.println("the tree is perfect bt");
    		  else
    			  System.out.println("the tree is not a perfect bt");
}

}
