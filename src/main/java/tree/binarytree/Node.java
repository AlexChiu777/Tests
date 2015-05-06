package tree.binarytree;

/**
 * Created by Alex on 5/5/2015.
 */
public class Node {
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", key=" + key +
                '}';
    }
}
