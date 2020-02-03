package easy.tree;

import java.util.Stack;

public class NavegacaoSemRecursao {

    private class Node {
        int data;
        Node left;
        Node right;
    }

    public static void preOrder(Node root){
        Stack<Node> pilha = new Stack();
        pilha.push(root);
        while (!pilha.isEmpty()){
            Node current = pilha.pop();
            System.out.print(current.data + " ");
            if (current.right != null) pilha.push(current.right);
            if (current.left != null) pilha.push(current.left);
        }
    }

}
