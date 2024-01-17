import java.util.Stack;

public class Node {

    private int value;

    private Node left;
    private Node right;

    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public Node(int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int sum(Node root){
        if(root == null){
            return 0;
        }
        int totalSum = 0;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node currentNode = stack.pop();
            totalSum += currentNode.getValue();
            if(currentNode.getRight() != null){
                stack.push(currentNode.getRight());
            }
            if(currentNode.getLeft() != null){
                stack.push(currentNode.getLeft());
            }
        }
        return totalSum;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
    
}
