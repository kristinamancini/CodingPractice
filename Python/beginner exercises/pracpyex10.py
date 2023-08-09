"""
write a program that returns a list that contains 
only the elements that are common between the lists 
(without duplicates). Using list comprehension.
"""

a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
b = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
c = []

#below line did not work because append method returned none
#c = [element for element in a if element in b and element not in c]

c = [element1 for element1 in a if element1 in b]
c = [element2 for element2 in b if element2 in c]

print(c)