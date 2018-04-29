package 树的遍历;

public class TreeNode {
    
    private final char value;
    private TreeNode left;
    private TreeNode right;
    
    public TreeNode(char value) {
        this.value = value;
        this.left = null;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public char getValue() {
        return value;
    }
    
}
