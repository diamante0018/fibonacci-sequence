#include <stdio.h>  
  
unsigned long long int fibonacci(int n)  
{  
    int a = 0, b = 1, c, i;  
    if (n == 0)  
        return a;  
    for (i = 2; i <= n; i++)  
    {  
        c = a + b;  
        a = b;  
        b = c;  
    }  
    return b;  
}  
  
int main(void)  
{   
    int n;  
  
    printf("Enter n:\n");  
    scanf("%d", &n);   
  
    unsigned long long int result = fibonacci(n);    
  
    printf("The result is: %llu\n", result);   
       
    return 0;  
}
