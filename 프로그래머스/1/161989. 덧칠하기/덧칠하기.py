def solution(n, m, section):
    counter = 0
    wall = [1] * n
    for i in section:
        wall[i-1] = 0
    
    for i in range(0, n):
        if wall[i] == 0:
            counter += 1
            for j in range(0,m):
                wall[i+j] = 1
                if i+j == n-1:
                    break
    
    return counter