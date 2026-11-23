def solution(x):
    sum = 0
    string_x = str(x)
    for i in range(len(string_x)):
        sum += int(string_x[i])
    if x % sum == 0:
        return True
    else:
        return False