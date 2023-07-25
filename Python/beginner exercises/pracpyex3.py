'''
write a program that prints out all the elements
of list_a that are less than 5
'''

list_a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
list_b=[]

for element in list_a:
    if element < 5:
        list_b.append(element)
    else:
        continue

print(list_b)