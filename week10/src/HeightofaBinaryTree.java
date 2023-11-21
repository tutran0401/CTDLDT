import org.w3c.dom.Node;

public class HeightofaBinaryTree {
    public static int height(Node root){
        // Write your code here.
            if(root==null){
                return-1;
            }

            int leftHeight=height(root.left);
            int rightHeight=height(root.right);

            return Math.max(leftHeight,rightHeight)+1;
    }
}
