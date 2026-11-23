def solution(n, a, b):
    temp = n
    expN = 0
    while temp != 1:
        temp //= 2
        expN += 1

    # 1. 반 나누기
    halfN = n // 2
    while halfN != 1:
        if (a <= halfN and b > halfN) or (a > halfN and b <= halfN):
            return expN
        else:
            # 2. 같은 곳에 있고, 절반보다 작은 경우
            if (a <= halfN):
                halfN //= 2
                expN -= 1
            else:
                a -= halfN
                b -= halfN
                halfN //= 2
                expN -= 1

    return expN