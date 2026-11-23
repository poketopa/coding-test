def solution(want, number, discount):
    wantDict = {}
    answer = 0
    # 과일 몇 개 필요한지 매칭
    for i in range(len(want)):
        wantDict[want[i]] = number[i]

    # 몇 일 반복할지
    for i in range(len(discount)-sum(number)+1):
        for j in range(len(want)):
            if (wantDict[want[j]] == discount[i:sum(number)+i].count(want[j])):
                if j == len(want)-1:
                    answer += 1
                else:
                    continue
            else:
                break

    return answer