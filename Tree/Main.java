package Tree;
public class Main {

    public static void main(String args[]){
        System.out.println("Hlo");

        Tree tree = new Tree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.inorder(tree.root);
        System.out.println("Pre Order");
        tree.preorder(tree.root);
        System.out.println("Pre Order");
        tree.postOrder(tree.root);
        System.out.println("Level Order");
        tree.levelOrder();
         
        };
    }
    

