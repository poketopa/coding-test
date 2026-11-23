def solution(n):
    if (n == 1 or n == 2):
        return 1
    count = 1

    for i in range(1, n//2 + 2):
        sum = 0
        for j in range(i, n//2+2):
            sum += j
            if (sum > n):
                break
            elif (sum == n):
                print(i)
                count += 1
                break

    answer = count
    return answer