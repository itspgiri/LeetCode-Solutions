Atleast 3 Neighbours*/
board[i][j] =2;
}
}
/*We don't change values in the case of 0>0 and 1>1 State Changes, and hence they aren't unconsidered above. Since their key notation matches their final state anyways.*/
//We change all our values of 2 and 3 to their appropriate values
for (int i=0; i<R;i++)
{
for (int j =0; j<C; j++)
{
if (board[i][j] == 1)
board[i][j] =0;
if (board[i][j]>=2)
board[i][j]=1;
/*Because only those whose value is '3' and '2'will have new state value as '1' according to our above nested for loop conditions.*/
}
}
}
}
​
```
​
​
​
​