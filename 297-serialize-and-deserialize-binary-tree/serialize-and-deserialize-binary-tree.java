/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "";
        StringBuilder ans = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) {
                ans.append("# ");
                continue;
            }
            ans.append(node.val + " ");
            q.offer(node.left);
            q.offer(node.right);
        }
        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty())
            return null;
        String[] value = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(value[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            for (int i = 1; i < value.length; i++) {
                TreeNode parent = q.poll();
                if (!value[i].equals("#")) {
                    TreeNode left = new TreeNode(Integer.parseInt(value[i]));
                    parent.left = left;
                    q.add(left);
                }
                if (!value[++i].equals("#")) {
                    TreeNode right = new TreeNode(Integer.parseInt(value[i]));
                    parent.right = right;
                    q.add(right);
                }
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));