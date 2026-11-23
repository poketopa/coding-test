def solution(n):
    num = n
    binN = bin(n)[2:]
    oneNum = binN.count('1')
    while 1:
        num += 1
        binN2 = bin(num)[2:]
        if (oneNum == binN2.count('1')):
            return num