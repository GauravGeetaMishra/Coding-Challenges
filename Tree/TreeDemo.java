class Tree{
	Node root;
	Tree(){
		this.root=null;
	}
	class Node{
		Node right;
		Node left;
		int data;
		
		Node(int data){
			this.right=this.left=null;
			this.data=data;
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
	void delete(int data){
		root=deleteData(root, data);
	}
	Node deleteData(Node root, int data){
		if(root==null){
			return null;
		}
		if(root.data<data){
			root.right=deleteData(root.right,data);
		}
		else if(root.data>data){
			root.left=deleteData(root.left,data);
		}
		else{
			if(root.right==null){
				return root.left;
			}
			if(root.left==null){
				return root.right;
			}
			root.data=min(root.right);
			root.right=deleteData(root.right,root.data);
		}
		return root;
		
	}
	int min(Node root){
		int x = root.data;
		while(root.left!=null){
			x=root.left.data;
			root=root.left;
		}
		return x;
	}
	void inOrder(Node root){
		if(root==null){
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+"-->");
		inOrder(root.right);
	}
	void preOrder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+"-->");
		preOrder(root.left);
		preOrder(root.right);
	}
	void postOrder(Node root){
		if(root==null){
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+"-->");
	}
	String searchData(Node root,int data){
		if(root==null){
			return "Not Found";
		}
		if(root.data<data){
			return searchData(root.right,data);
		}
		else if(root.data>data){
			return searchData(root.left,data);
		}
		else{
			return "Found";
		}
	}
	
}
class TreeDemo{
	public static void main(String args[]){
		Tree t1= new Tree();
		t1.insert(90);
		t1.insert(50);
		t1.insert(60);
		t1.insert(70);
		System.out.println("Inorder Traversal");
		t1.inOrder(t1.root);
		System.out.println("PreOrder Traversal");
		t1.preOrder(t1.root);
		System.out.println("PostOrder Traversal");
		t1.postOrder(t1.root);
		t1.delete(50);
		System.out.println("After Deletion");
		t1.inOrder(t1.root);
		System.out.println(t1.searchData(t1.root,190));
		
		
		
	}
}
