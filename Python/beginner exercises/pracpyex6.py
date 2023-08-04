'''
Ask the user for a string and print out 
whether this string is a palindrome or not.
'''

word = input("Please enter a string: ")
reverse_list = word[::-1]

if word == reverse_list:
    print("yes, this is a palindrome")
else:
    print("No, not a palindrome")
