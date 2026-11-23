def solution(n):
    num1 = 0
    num2 = 1
    for i in range(n-1):
        temp = num1+num2
        num1 = num2
        num2 = temp

    return temp % 1234567