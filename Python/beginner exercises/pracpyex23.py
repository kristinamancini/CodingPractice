def find(a, b):
    c = []
    for elem in a:
        if elem in b:
            if elem not in c:
                c.append(elem)
        else:
            continue
    return c
            
if __name__=="__main__":
    a = []
    with open("prime.txt", "r") as f:
        line = f.readline()
        while line:
            a.append(int(line))
            line = f.readline()

    b = []
    with open("happy.txt", "r") as f2:
        line = f2.readline()
        while line:
            b.append(int(line))
            line = f2.readline()

    print(find(a, b))