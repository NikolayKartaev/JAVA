package JAVA.Homework;

public class Algorithms_HW4 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        for (int i = 1; i <= 5; i++) {
            tree.push(i);
        }

        System.out.println(tree.find(3));
        System.out.println(tree.find(6));
    }

    static class BinaryTree {
        Node root;

        class Node {
            int value;
            Node left;
            Node right;
            boolean color;

        }

        public boolean find(int value) {
            Node current = root;
            while (current != null) {
                if (current.value == value) {
                    return true;
                }
                if (current.value < value) {
                    current = current.right;
                } else {
                    current = current.left;
                }
            }
            return false;
        }

        public void print() {
            print(root);
        }

        private void print(Node node) {
            if (node == null)
                return;
            System.out.println(node.value);

            if (node.left != null)
                System.out.println("L:" + node.left.value);

            if (node.right != null)
                System.out.println("R:" + node.right.value);

            print(node.left);
            print(node.right);
        }

        public void push(int value) {
            root = insert(root, value);
            root.color = false; 
        }

        private Node insert(Node node, int value) {
            if (node == null) {
                Node newNode = new Node();
                newNode.value = value;
                newNode.color = true; 
                return newNode;
            }

            if (value < node.value) {
                node.left = insert(node.left, value);
            } else if (value > node.value) {
                node.right = insert(node.right, value);
            } else {
                
                return node;
            }

            if (isRed(node.right) && !isRed(node.left)) {
                node = rotateLeft(node);
            }
            if (isRed(node.left) && isRed(node.left.left)) {
                node = rotateRight(node);
            }
            if (isRed(node.left) && isRed(node.right)) {
                flipColors(node);
            }

            return node;
        }

        private boolean isRed(Node node) {
            if (node == null) {
                return false; 
            }
            return node.color;
        }

        private Node rotateLeft(Node node) {
            Node newRoot = node.right;
            node.right = newRoot.left;
            newRoot.left = node;
            newRoot.color = node.color;
            node.color = true;
            return newRoot;
        }

        private Node rotateRight(Node node) {
            Node newRoot = node.left;
            node.left = newRoot.right;
            newRoot.right = node;
            newRoot.color = node.color;
            node.color = true;
            return newRoot;
        }

        private void flipColors(Node node) {
            node.color = true;
            node.left.color = false;
            node.right.color = false;
        }
    }

}
