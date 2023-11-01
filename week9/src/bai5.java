public class bai5 {
        public static void preOrder(Node root) {
            Stack<Node> s = new Stack<Node>();
            Node curr = root;
            if(curr==null){
                return;
            }
            while(curr!=null||s.size()>0){
                while(curr!=null){
                    s.push(curr);
                    System.out.print(curr.data+" ");
                    curr=curr.left;
                }
                curr= s.pop();
                curr=curr.right;
            }
        }
}
