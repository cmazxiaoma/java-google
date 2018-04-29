package 中序遍历下一个结点;

public class InOrder {

    public MyTreeNode next(MyTreeNode node) {
        if (node == null) {
            return null;
        }

        if (node.getRight() != null) {
            return first(node.getRight());
        } else {
            while (node.getParent() != null && node.getParent().getLeft() != node) {
                node = node.getParent();
            }

            return node.getParent();
        }
    }

    /**
     * Gets first node
     *
     * @param node
     * @return
     */
    public MyTreeNode first(MyTreeNode node) {
        if (node == null) {
            return null;
        }

        MyTreeNode curNode = node;

        while (curNode.getLeft() != null) {
            curNode = curNode.getLeft();
        }

        return curNode;
    }
}
