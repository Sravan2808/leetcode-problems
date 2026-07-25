/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        // Step1:Create a map and store the parent of each Node
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            // If the left child exists,map its parent and push it into the Queue
            if (node.left != null) {
                parentMap.put(node.left, node);
                q.offer(node.left);
            }
            // If the right child exists,map its parent and push it into the Queue
            if (node.right != null) {
                parentMap.put(node.right, node);
                q.offer(node.right);
            }
        }

        // Step2:Use BFS to find all nodes at distance K from the target
        Set<TreeNode> visited = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        q.offer(target);
        visited.add(target);
        int currDist = 0;
        while (!q.isEmpty()) {
            
                // currDist==k
                if (currDist == k) {
                    while (!q.isEmpty()) {
                        result.add(q.poll().val);
                    }
                    return result;
                }

            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                // LeftChild exist
                if (node.left != null && !visited.contains(node.left)) {
                    q.offer(node.left);
                    visited.add(node.left);
                }

                // RightChild exist
                if (node.right != null && !visited.contains(node.right)) {
                    q.offer(node.right);
                    visited.add(node.right);
                }

                // Parent exist
                if (parentMap.containsKey(node) && !visited.contains(parentMap.get(node))) {
                    q.offer(parentMap.get(node));
                    visited.add(parentMap.get(node));
                }

            }
            currDist++;
        }
        return result;
    }
}