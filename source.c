#include <stdio.h>

int main() {
    int n;

    printf("Enter the value of n\n");
    scanf("%d",&n);
    if (n<=2) {
        printf("Invalid parameters, n must be at least 2\n");
        return 0;
    }

    unsigned long long int a[n];
    a[0] = 0;
    a[1] = 1;
    unsigned long long int i = 2;
    int size = sizeof(a) / sizeof(a[0]);
         
    while (i<n) {
        a[i] = a[i-1] + a[i-2];
        i++;
    }

    for (int j=0;j<size;j++) {
        printf("a[%d] = %llu\n", j, a[j]);
    }
    
    return 0;
}
