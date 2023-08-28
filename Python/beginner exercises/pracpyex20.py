"""
Write a function that takes an ordered list of numbers and another number. 
The function decides whether or not the given number is inside the list 
and returns (then prints) an appropriate boolean.
"""

def find(sorted_list, num_to_find):
    for elem in sorted_list:
        if elem == num_to_find:
            return True
    return False
    
if __name__=="__main__":
    a = [3, 5, 6, 12, 56, 78]
    num = int(input("Enter a number to see if it's in the list: "))
    print(find(a, num))