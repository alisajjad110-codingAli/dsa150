package DSA150;

public class Solution {
    public int maxLevelSum(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list, 0);
        int maxLevel = 0;
        for (int i = 0; i<list.size(); i++) {
            
            if (list.get(maxLevel) < list.get(i)) {
                maxLevel = i;
            }
        }
        return maxLevel+1;
    }
    
    private void dfs(TreeNode n, List<Integer> l, int level) {
        if (n == null) return;
        if (l.size() == level) {
            l.add(n.val);
        } else {
            l.set(level, l.get(level)+n.val);
        }
        dfs(n.left, l, level+1);
        dfs(n.right, l, level+1);
        
    }
    
    public int maxLevelSum2(TreeNode root) {
        int max = Integer.MIN_VALUE, maxLevel = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        for (int level = 1; !q.isEmpty(); ++level) {
            int sum = 0;
            for (int sz = q.size(); sz>0; --sz) {
                TreeNode n = q.poll;
                sum += n.val;
                
                if (n.left != null) {
                    q.offer(n.left);
                }
                if (n.right != null) {
                    q.offer(n.right);
                }
            }
            if (max<sum) {
                max = sum;
                maxLevel = level;
            }
        }
        return maxLevel;
    }
}