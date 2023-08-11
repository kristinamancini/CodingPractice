"""
Write a program that takes a list of numbers 
and makes a new list of only the first and 
last elements of the given list.
"""

def list_ends(numbers_list):
    list_length = len(numbers_list)
    new_list = []
    
    new_list = {numbers_list[0], numbers_list[list_length - 1]}

    return new_list
    
print(list_ends([1, 2, 3, 7]))