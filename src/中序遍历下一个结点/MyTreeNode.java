package 中序遍历下一个结点;

public class MyTreeNode {

    private final char value;
    private MyTreeNode left;
    private MyTreeNode right;
    private MyTreeNode parent;

    public MyTreeNode(char value) {
        super();
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public MyTreeNode getLeft() {
        return left;
    }

    public void setLeft(MyTreeNode left) {
        this.left = left;

        if (left != null) {
            this.left.setParent(this);
        }
    }

    public MyTreeNode getRight() {
        return right;
    }

    public void setRight(MyTreeNode right) {
        this.right = right;

        if (right != null) {
            this.right.setParent(this);
        }
    }

    public MyTreeNode getParent() {
        return parent;
    }

    private void setParent(MyTreeNode parent) {
        this.parent = parent;
    }

    public char getValue() {
        return value;
    }
}
