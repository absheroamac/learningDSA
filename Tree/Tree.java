package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{

    int value;
    Node left;
    Node right;


    public Node(int value){

        this.value = value;
        this.left = null;
        this.right = null;

    }
}

public class Tree {

    Node root;
    public Tree(int value){
        this.root = new Node(value);
    }

    public Tree(){
        this.root = null;
    }

    //Inorder Traversal left->root->right
    public void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);

    }

    public void preorder(Node root){
        if(root==null){
            return;
        }

        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);

    }

    public void postOrder(Node node){
        if(node==null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

    public void levelOrder(){
        Node root = this.root;
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            Node currentNode = queue.poll(); 
            System.out.println(currentNode.value);
            

            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
        }
    }
}