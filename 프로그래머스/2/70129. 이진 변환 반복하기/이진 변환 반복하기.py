def solution(s):
    sum = 0
    round = 0
    while s != '1':
        round += 1
        b = len(s)
        s = s.replace('0','')
        a = len(s)
        sum+=(b-a)
        s = bin(a)[2:]
    result = [round,sum]
    return result