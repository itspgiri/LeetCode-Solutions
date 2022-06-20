}
}
```
​
## Non-recurrsive / Optimised for Space
```
class Solution {
public List<Integer> preorderTraversal(TreeNode root) {
List<Integer> arr = new ArrayList<Integer>();
if (root == null)
return arr;
Stack<TreeNode> st = new Stack<TreeNode>();
st.push(root);
while (st.isEmpty() == false)
{
TreeNode curr = st.pop();
arr.add(curr.val);
if (curr.right != null)
st.push(curr.right);
if (curr.left != null)
st.push(curr.left);
}
return arr;
}
}
```