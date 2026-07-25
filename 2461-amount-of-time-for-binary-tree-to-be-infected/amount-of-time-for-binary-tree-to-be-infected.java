/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int amountOfTime(TreeNode root, int start) {

        // Step1:Create ParentMap
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode res = new TreeNode(-1);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.val == start)
                    res = node;
                if (node.left != null) {
                    parentMap.put(node.left, node);
                    q.offer(node.left);
                }
                if (node.right != null) {
                    parentMap.put(node.right, node);
                    q.offer(node.right);
                }
            }
        }

        // Step2:Visited and Queue
        Set<TreeNode> visited = new HashSet<>();
        q.offer(res);
        visited.add(res);
        int time = 0;
        while (!q.isEmpty()) {
            int flag = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                // Left Child
                if (node.left != null && !visited.contains(node.left)) {
                    flag = 1;
                    q.offer(node.left);
                    visited.add(node.left);
                }

                // Right Child
                if (node.right != null && !visited.contains(node.right)) {
                    flag = 1;
                    q.offer(node.right);
                    visited.add(node.right);
                }

                // Parent
                if (parentMap.containsKey(node) && !visited.contains(parentMap.get(node))) {
                    flag = 1;
                    q.offer(parentMap.get(node));
                    visited.add(parentMap.get(node));
                }
            }
            if (flag == 1)
                time++;
        }
        return time;
    }
}