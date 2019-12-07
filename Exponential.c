#include <stdio.h>   
  
unsigned long long int fibonacci(int n) {  
    if (n <= 1)  
        return n;  
    return fibonacci(n - 1) + fibonacci(n - 2);  
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