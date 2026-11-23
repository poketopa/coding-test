def solution(n, left, right):

    arr = []
    for i in range(left, right+1):
        fir = i // n
        sec = i % n
        if fir >= sec:
            arr.append(fir+1)
        else:
            arr.append(sec+1)
    return arr