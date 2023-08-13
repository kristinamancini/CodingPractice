"""
Write a program that asks the user how many 
Fibonnaci numbers to generate and then generates 
them.
"""

def fibonacci(n):
    fib = []
    i = 1
    if n == 0:
        fib = []
    elif n == 1:
        fib = [1]
    elif n == 2:
        fib = [1, 1]
    elif n >= 3:
        fib = [1, 1]
        while i < (n - 1):
            fib.append(fib[i] + fib[i - 1])
            i = i + 1
            
    return fib

number = int(input("How many Fibonacci numbers do you want to generate?: "))
print(fibonacci(number))