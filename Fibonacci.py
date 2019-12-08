def fibonacci(n):
  a = 0
  b = 1
  if n == 0:
    return a 
  i = 2
  while i <= n:  
      
    c = a + b  
    a = b 
    b = c
    i += 1 
     
  return b

def fibonacci_recursive(n):
  if n <= 1:
    return n
  return fibonacci_recursive(n-1) + fibonacci_recursive(n-2)

n = int(input("Enter n: ")) 
print("Fn is: " + str(fibonacci(n)))
print("Fn recursive is: " + str(fibonacci_recursive(n)))
