// O(N^2)
// for (int i=0;i<nums.length;i++)
// {
//     for (int j=0; j<nums.length; j++)
//     {
//         if (i!=j)
//             if (nums[i] == nums[j])
//                 return true;
//     }
// }
// return false;
//O(NLogN)
// Arrays.sort(nums);
// for (int i=1; i<nums.length; i++)
// {
//     if (nums[i-1]==nums[i])
//         return true;
// }
// return false;
//O(N) TC + O(N) SC
HashSet<Integer> s = new HashSet<Integer>();
for (int x : nums)
{
if (s.contains(x))
return true;
s.add(x);
}
return false;