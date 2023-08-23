import random

#random number generator
def generateNum():
    while True:
        num = random.randint(1000, 9999)
        if noDuplicates(num):
            return num;

#check for no duplicates         
def noDuplicates(num):
    num_list = getDigits(num)
    if len(num_list) == len(set(num_list)):
        return True
    else:
        return False

#return the number as a list, separate each number      
def getDigits(num):
    return [int(i) for i in str(num)]

#bull cow game  
#bulls are exact matches
#cows are matches in wrong position
def numOfBullsCows(num, guess):
    bull_cow = [0, 0]
    num_list = getDigits(num)
    guess_list = getDigits(guess)
    
    for i, j in zip(num_list, guess_list):
        if j in num_list:
            if j == i:
                bull_cow[0] = bull_cow[0] + 1
            else:
                bull_cow[1] = bull_cow[1] + 1

    return bull_cow
            
#main method for starting the game    
if __name__=="__main__":
    num = generateNum()
    tries = int(input("Enter number of tries: "))
    
    while tries > 0:
        guess = int(input("Enter your 4-digit number guess: "))
        
        if noDuplicates(guess) == False:
            print("Repeated digits are not allowed in number. Try again.")
            continue
        if guess < 1000 or guess > 9999:
            print("Enter a 4-digit number only. Try again.")
            continue
        
        bull_cow = numOfBullsCows(num, guess)
        print(f"{bull_cow[0]} bulls, {bull_cow[1]} cows")
        tries = tries - 1
        
        if bull_cow[0] == 4:
            print(f"You guessed right! The number is {num}.")
            break
    else:
        print(f"You ran out of tries. The number was {num}.")
    