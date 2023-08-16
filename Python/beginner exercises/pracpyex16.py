#Write a password generator in Python

import random

def password_generator():
    password = []
    symbols = random.sample(['%', '!', '#', '@', '^', '$', '&', '*', '(', ')'], 2)
    password.extend(symbols)
    
    lower_letters = random.sample(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'], 2)
    password.extend(lower_letters)
    
    random_characters = random.sample(['G', '%', 'n', 'L', '*', 'S', 'w', '1', '@', 'a', 'T'], 3)
    password.extend(random_characters)
    
    upper_letters = random.sample(['M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'], 2)
    password.extend(upper_letters)
    
    numbers = random.sample(['1', '2', '3', '4', '5', '6', '7', '8', '9', '0'], 3)
    password.extend(numbers)
    
    random.shuffle(password)
    result = "".join(password)
    
    return result
    
ask = input("Type 'yes' to generate a password: ")
while ask == 'yes':
    print("The password is: ", password_generator())
    ask = input("Type 'yes' to generate a new password: ")
    