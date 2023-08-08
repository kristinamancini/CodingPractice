"""
Generate a random number between 1 and 9 
(including 1 and 9). Ask the user to guess 
the number, then tell them whether they 
guessed too low, too high, or exactly right.
"""
import random

random_number = random.randint(1, 9)
guess_number = int(input("Guess a number: "))

if guess_number == random_number:
    print("You guessed it exactly right!")
    
elif guess_number > random_number:
    print("Your guess is too high!")
    
else:
    print("Your number is too low!")

print("The random number was " + str(random_number))