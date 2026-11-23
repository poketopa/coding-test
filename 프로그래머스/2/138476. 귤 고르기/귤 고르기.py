def solution(k, tangerine):
    # 1. 딕셔너리로 무슨 숫자가 몇 개 있는지 세기
    numCount = {}
    for i in tangerine:
        if i in numCount:
            numCount[i] += 1
        else:
            numCount[i] = 1

    # 2. 딕셔너리를 정렬해서 리스트로 넣기

    newTangerine = sorted(tangerine, key=lambda x: (-numCount[x], x))

    count = 1
    for i in range(1, k):
        if (newTangerine[i] != newTangerine[i-1]):
            count += 1

    return count