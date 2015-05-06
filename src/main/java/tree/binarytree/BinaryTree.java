package tree.binarytree;

/**
 * Created by Alex on 5/5/2015.
 */
public class BinaryTree {
    Node root;

    public void addNote(int key, String name) {
        Node newNode = new Node(key, name);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;

            Node parent;

            while (true) {
                parent = focusNode;

                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;

                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }

                } else {
                    focusNode = focusNode.rightChild;

                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    //left child, root, right child
    public  void inOrderTraverseTree (Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    //root, left child, right child
    public void preorderTraverseTree (Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);

        }
    }

    //left, right, root
    public void postTraverseTree (Node focusNode) {
        if (focusNode != null) {
            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);

        }
    }

    public Node findNode(int key) {
        Node focusNode = root;

        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }

            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }

    public static void main(String[] args) {

        BinaryTree theTree = new BinaryTree();

        theTree.addNote(50, "Boss");
        theTree.addNote(25, "Vice Pres");
        theTree.addNote(15, "Office Manager");
        theTree.addNote(30, "Secreatary");
        theTree.addNote(60, "Salesman");

        theTree.inOrderTraverseTree(theTree.root);

        System.out.println("Search for 30");
        System.out.println(theTree.findNode(30));
    }
}
