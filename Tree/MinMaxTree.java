import java.util.*;
class Tree{
	Node root;
	Tree(){
		this.root=null;
	}
	class Node{
		Node left;
		Node right;
		int data;
		Node(int data){
			this.data=data;
			right=left=null;
		}
	}
	public void insert(int data){
		root=insertData(root,data);
	}
	public Node insertData(Node root, int data){
		if(root==null){
			return new Node(data);
		}
		if(data>root.data){
			root.right=insertData(root.right,data);
		}
		if(data<root.data){
			root.left=insertData(root.left,data);
		}
		return root;
	}
	void inOrder(Node root){
		if(root==null){
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+"-->");
		inOrder(root.right);
	}
	int min(Node root){
		if(root==null){
			throw new IllegalArgumentException("Tree is empty");
		}
		if(root.left!=null){
			return min(root.left);
		}
		return root.data;
	}
	int max(Node root){
		if(root==null){
			throw new IllegalArgumentException("Tree is empty");
		}
		if(root.right!=null){
			return max(root.right);
		}
		return root.data;
	}
}
class MinMaxTree{
	public static void main(String args[]){
		Tree t1 = new Tree();
		t1.insert(30);
		t1.insert(50);
		t1.insert(20);
		t1.insert(80);
		t1.insert(430);
		t1.insert(320);
		t1.inOrder(t1.root);
		System.out.println();
		System.out.println(t1.min(t1.root));
		System.out.println();
		System.out.println(t1.max(t1.root));
		
	}

}