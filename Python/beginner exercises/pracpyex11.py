"""
Ask the user for a number and determine whether the number 
is prime or not.
"""

def number_is_prime():
    number = int(input("Enter a number to see if it's prime or not: "))
    number_range = range(1, number + 1)
    divisor_list = []
    
    for num in number_range:
        if number % num == 0:
            divisor_list.append(num)
        else:
            continue
        
    if len(divisor_list) == 2:
        return True;
    else:
        return False;

result = number_is_prime()
print(result)