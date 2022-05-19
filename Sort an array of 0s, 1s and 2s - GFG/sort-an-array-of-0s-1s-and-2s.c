// { Driver Code Starts
//Initial Template for C

#include <stdio.h>


 // } Driver Code Ends
//User function Template for C

void sort012(int a[], int n)
{
    int l=0;
     int m=0;
     int h=n-1;
     while(m<=h)
{
    if(a[m]==0)
    {   
        int t=a[m];
        a[m]=a[l];
        a[l]=t;
        m++;
        l++;
    }
    else if(a[m]==1)
    m++;
    else
    {
        int t=a[m];
        a[m]=a[h];
        a[h]=t;
        h--;
    }
}
}

// { Driver Code Starts.

int main() {

    int t;
    scanf("%d", &t);

    while(t--){
        int n;
        scanf("%d", &n);
        int arr[n];
        for(int i=0;i<n;i++){
            scanf("%d", &arr[i]);
        }

        sort012(arr, n);

        for (int i = 0; i < n; i++)
            printf("%d ", arr[i]);
        printf("\n");
    }
    return 0;
}
  // } Driver Code Ends