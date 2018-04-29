package 中序遍历下一个结点;

public class Demo {
    private static InOrder inOrder = new InOrder();

    public static void main(String[] args) {
        printMidOrder();
    }

    public static void printBehindOrder() {
        MyTreeNode root = MyTreeNodeCreator.customTree("ABDEGCF", "DBGEACF");
        MyTreeNodeCreator.behindOrder(root);
        MyTreeNodeCreator.behindOrder(MyTreeNodeCreator.customTree("ABCD", "ABCD"));
    }

    public static void printMidOrder() {
        MyTreeNode sampleTree = MyTreeNodeCreator.sampleTree();
        display(sampleTree);
        display(MyTreeNodeCreator.customTree("", ""));
        display(MyTreeNodeCreator.customTree("A", "A"));
        display(MyTreeNodeCreator.customTree("AB", "BA"));
        display(MyTreeNodeCreator.customTree("ABCD", "DCBA"));
        display(MyTreeNodeCreator.customTree("ABCD", "ABCD"));
    }

    public static void display(MyTreeNode sampleTree) {
        for (MyTreeNode root = inOrder.first(sampleTree); root != null; root = inOrder.next(root)) {

            System.out.print(root.getValue());
        }
        System.out.println(" ");
    }
}
