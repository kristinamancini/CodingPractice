def list_ends(numbers_list):
    list_length = len(numbers_list)
    new_list = []
    
    new_list = {numbers_list[0], numbers_list[list_length - 1]}

    return new_list
    
print(list_ends([1, 2, 3, 7]))