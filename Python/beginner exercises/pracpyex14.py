"""
Write a program (function!) that takes
a list and returns a new list that 
contains all the elements of the first 
list minus all the duplicates.
"""

def removeDuplicates(elements):
    elements = set(elements)

    return elements
    
example_list = [3, 3, 9, 2, 4, 4, 7]
print(removeDuplicates(example_list))