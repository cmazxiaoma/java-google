package 树的遍历;

public class TreeCreator {
    
    public TreeNode createSampleTree() {
        TreeNode root = new TreeNode('A');
        root.setLeft(new TreeNode('B'));
        root.getLeft().setLeft(new TreeNode('D'));
        root.getLeft().setRight(new TreeNode('E'));
        root.getLeft().getRight().setLeft(new TreeNode('G'));
        root.setRight(new TreeNode('C'));
        root.getRight().setRight(new TreeNode('F'));
        return root;
    }
    
    public TreeNode createTree(String preOrder, String midOrder) {
        if (preOrder.isEmpty()) {
            return null;
        }
        char rootValue = preOrder.charAt(0);
        int rootIndex = midOrder.indexOf(rootValue);
        TreeNode root = new TreeNode(rootValue);
        root.setLeft(createTree(preOrder.substring(1, rootIndex + 1), midOrder.substring(0, rootIndex)));
        root.setRight(createTree(preOrder.substring(1 + rootIndex), midOrder.substring(1 + rootIndex)));
        return root;
    }
    
    public String printfBehindOrder(String preOrder, String midOrder) {
        if (preOrder.isEmpty()) {
            return "";
        }
        
        char rootValue = preOrder.charAt(0);
        int rootIndex = midOrder.indexOf(rootValue);
        
        return 
                printfBehindOrder(preOrder.substring(1, rootIndex + 1), midOrder.substring(0, rootIndex))
                + printfBehindOrder(preOrder.substring(1 + rootIndex), midOrder.substring(1 + rootIndex))
                + rootValue;
    }
}
