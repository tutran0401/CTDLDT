public class bai6 {
    public static void levelOrder(Node root) {

        Queue<Node> queue = new LinkedList<Node>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Node p = queue.poll();
            System.out.print(p.data + " ");
            if (p.left != null) queue.add(p.left);
            if (p.right != null) queue.add(p.right);
        }
    }
}
