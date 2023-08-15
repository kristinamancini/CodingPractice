"""
Write a program that asks the user for a 
long string containing multiple words. 
Print back to the user the same string, 
except with the words in backwards order. 
"""

def reverseWords(long_string):
    word_list = long_string.split(" ")
    word_list.reverse()
    result = " ".join(word_list)
    
    return result

words = input("Enter a string of words: ")
print(reverseWords(words))