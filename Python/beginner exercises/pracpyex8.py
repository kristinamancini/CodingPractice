"""
Make a two-player Rock-Paper-Scissors game. 
(Hint: Ask for player plays (using input), 
compare them, print out a message of congratulations 
to the winner, and ask if the players want to start a new game)
Note to self: you could have made this more organized with
a function...
"""
keep_playing = input("Type 'yes' to play: ")

while keep_playing != "no":
    player1play = input("Player 1, enter 'rock', 'paper', or 'scissors': ")
    player2play = input("Player 2, enter 'rock', 'paper', or 'scissors': ")
    
    if player1play != 'rock' and player1play != 'paper' and  player1play != 'scissors' or player2play != 'rock' and player2play != 'paper' and player2play != 'scissors':
        print("Something is invalid! Try again next time.")


    elif player1play == player2play:
        print("It's a tie!")
    
    elif player1play == 'rock':
        if player2play == 'paper':
            print("Player 2 wins!")
        else:
            print("Player 1 wins!")
    elif player1play == 'paper':
        if player2play == 'scissors':
            print("Player 2 wins!")
        else:
            print("Player 1 wins!")
    elif player1play == 'scissors':
        if player2play == 'rock':
            print("Player 2 wins!")
        else:
            print("Player 1 wins!")
    else:
        print("Invalid input!")

    
    keep_playing = input("Type 'yes' to play again: ")
    