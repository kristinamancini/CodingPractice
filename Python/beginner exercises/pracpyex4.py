'''
Create a program that asks the user for 
a number and then prints out a list of 
all the divisors of that number.
'''

number = int(input("Enter a number: "))
number_range = range(1, number + 1)
divisor_list = []

for num in number_range:
    if number % num == 0:
        divisor_list.append(num)
    else:
        continue
print("The divisor list of ",number," is... ")
print(divisor_list)