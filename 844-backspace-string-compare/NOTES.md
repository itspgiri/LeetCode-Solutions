if (t.charAt(j) == '#')
{
skipT++;
j--;
}
else if (skipT>0)
{
skipT--;
j--;
}
else break;
}
if (i>=0 && j>=0 && s.charAt(i)!=t.charAt(j)) //if their current character is same or not and making sure we aren't going out of index
return false;
if ((i>=0) != (j>=0)) //If their lengths don't match
return false;
i--;
j--;
}
return true;
}
}
```