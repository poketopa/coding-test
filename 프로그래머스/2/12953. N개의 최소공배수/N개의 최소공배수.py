def solution(arr):
    arr.sort()
    num = arr[-1] + 1
    while 1:
        if (num % arr[-1] == 0):
            for i in range(len(arr)-2, -1, -1):
                if (num % arr[i] != 0):
                    break
                if (i == 0):
                    return num
        num += 1