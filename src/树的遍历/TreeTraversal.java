package 树的遍历;

public class TreeTraversal {
    
    public static void main(String[] args) {
        TreeCreator creator = new TreeCreator();
        TreeNode root = creator.createSampleTree();
        TreeTraversal traversal = new TreeTraversal();
        traversal.preOrder(root);
        System.out.println("");
        traversal.midOrder(root);
        System.out.println("");
        traversal.behindOrder(root);
        System.out.println("");
        System.out.println("=================");
        traversal.behindOrder(creator.createTree("ABDEGCF", "DBGEACF"));
        System.out.println("");
        System.out.println("=================");
        traversal.behindOrder(creator.createTree("ABDGCEFH", "DGBAECFH"));
        System.out.println("");
        System.out.println("=================");
        traversal.behindOrder(creator.createTree("ACDEFHGB", "DECAHFBG"));
        System.out.println("");
        System.out.println("=================");
        System.out.println(creator.printfBehindOrder("ABDGCEFH", "DGBAECFH"));
        System.out.println("");
        System.out.println("=================");
        System.out.println(creator.printfBehindOrder("ACDEFHGB", "DECAHFBG"));
    }
    
    public void preOrder(TreeNode root) { 
        if (root == null) {
            return ;
        }
        
        System.out.print(root.getValue() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    
    public void midOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        midOrder(root.getLeft());
        System.out.print(root.getValue() + " ");
        midOrder(root.getRight());
    }
    
    public void behindOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        behindOrder(root.getLeft());
        behindOrder(root.getRight());
        System.out.print(root.getValue() + " ");
    }
}
