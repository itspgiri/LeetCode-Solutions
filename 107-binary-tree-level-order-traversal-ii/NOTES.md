*     }
* }
*/
class Solution {
​
public List<List<Integer>> levelOrderBottom(TreeNode root) {
List<List<Integer>> arr = new ArrayList<List<Integer>>();
if (root == null) return arr;
​
Queue<TreeNode> queue = new LinkedList<TreeNode>();
queue.add(root);
​
while (!queue.isEmpty()) {
List<Integer> child = new ArrayList<Integer>();
int current_size = queue.size();
for (int i = 0; i < current_size; i++) {
TreeNode cur = queue.poll();
child.add(cur.val);
if (cur.left != null) queue.add(cur.left);
if (cur.right != null) queue.add(cur.right);
}
arr.add(child);
}
Collections.reverse(arr);
return arr;
}
}
​
```