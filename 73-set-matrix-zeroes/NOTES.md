answer[i][k] = 0;
}
break;
}
}
}
// Traverse column wise
for (int j = 0; j < m; j++) {
for (int i = 0; i < n; i++) {
if (matrix[i][j] == 0) {
// Set this column as 0 in answer array
for (int k = 0; k < n; k++) {
answer[k][j] = 0;
}
}
}
}
// Update the elements in matrix array
for (int i = 0; i < n; i++) {
for (int j = 0; j < m; j++) {
if (answer[i][j] == 0) {
matrix[i][j] = 0;
}
}
}
}
}
```