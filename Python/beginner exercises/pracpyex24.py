"""
Note: this program only works on n by n game board
"""

def print_horizontal():
    print(" --- " * board_size)
    
def print_vertical():
    print("|   " * (board_size + 1))


if __name__=="__main__":
    print("Let's figure out the size of the gameboard.")
    board_size = int(input("Enter a board size: "))
    
    for index in range(board_size):
        print_horizontal()
        print_vertical()
    print_horizontal()