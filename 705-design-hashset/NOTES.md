![image](https://assets.leetcode.com/users/images/1d289b8d-a7d1-420e-ba42-7fb214a302ad_1650618802.1927094.jpeg)
​
```
private final int MAX_VALUE = 1000000;
private final int ARRAY_SIZE = 100;
private List<List<Integer>> parentList;
​
public MyHashSet() {
parentList = new ArrayList<>(ARRAY_SIZE);
for(int i = 0; i<ARRAY_SIZE;i++){
parentList.add(null);
}
}
​
public void add(int key) {
int index = key%ARRAY_SIZE;
List<Integer> childList = parentList.get(index);
if(childList == null){
List<Integer> list = new LinkedList<>();
list.add(key);
parentList.set(index,list);
}
else{
if(!childList.contains(key)){
childList.add(key);
}
}}
​
public void remove(int key) {
int index = key % ARRAY_SIZE;
List<Integer> childList = parentList.get(index);
if(childList != null){
childList.remove(Integer.valueOf(key));
}
}
​
public boolean contains(int key) {
int index = key % ARRAY_SIZE;
List<Integer> childList = parentList.get(index);
return childList != null && childList.contains(key);
}
```
​
Video References:
https://www.youtube.com/watch?v=NrMaQL_4Npo&ab_channel=JavaBrains
https://www.youtube.com/watch?v=U79BoHTcCYw&t