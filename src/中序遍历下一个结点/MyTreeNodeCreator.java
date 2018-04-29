package 中序遍历下一个结点;

import org.apache.commons.lang.StringUtils;

public class MyTreeNodeCreator {

    public static MyTreeNode sampleTree() {
        MyTreeNode root = new MyTreeNode('A');
        root.setLeft(new MyTreeNode('B'));
        root.setRight(new MyTreeNode('C'));
        root.getLeft().setLeft(new MyTreeNode('D'));
        root.getLeft().setRight(new MyTreeNode('E'));
        root.getLeft().getRight().setLeft(new MyTreeNode('G'));
        root.getRight().setRight(new MyTreeNode('F'));

        return root;
    }

    public static MyTreeNode customTree(String font, String mid) {
        if (StringUtils.isEmpty(font)) {
            return null;
        }

        char rootValue = font.charAt(0);
        int index = mid.indexOf(rootValue);
        MyTreeNode root = new MyTreeNode(rootValue);

        root.setLeft(customTree(font.substring(1, index + 1), mid.substring(0, index)));
        root.setRight(customTree(font.substring(index + 1), mid.substring(index + 1)));

        return root;
    }

    public static void behindOrder(MyTreeNode node) {
        if (node == null) {
            return;
        }

        behindOrder(node.getLeft());
        behindOrder(node.getRight());

        System.out.print(node.getValue() + " ");
    }

    public static String displayBehindOrder(String font, String mid) {
        if (StringUtils.isEmpty(font)) {
            return "";
        }

        char rootValue = font.charAt(0);
        int index = mid.indexOf(rootValue);

        return displayBehindOrder(font.substring(1, index + 1), mid.substring(0, index))
                + displayBehindOrder(font.substring(index + 1), mid.substring(index + 1)) + rootValue;
    }
}
