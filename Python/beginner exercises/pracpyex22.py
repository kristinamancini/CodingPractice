"""
Given a .txt file that has a list of a bunch of names, 
count how many of each name there are in the file, and 
print out the results to the screen. 
"""

name_counter = {}
with open("nameslist.txt", "r") as f:
    line = f.readline()
    while line:
        line = line.strip()
        if line in name_counter:
            name_counter[line] = name_counter[line] + 1
        else:
            name_counter[line] = 1
        line = f.readline()
        
for names in name_counter.items():
  print(names)