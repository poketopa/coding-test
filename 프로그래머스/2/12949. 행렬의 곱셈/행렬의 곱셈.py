def solution(arr1, arr2):

    answer = [[0 for _ in range(len(arr2[0]))] for _ in range(len(arr1))]
    sum = 0
    for i in range(len(arr1)):
        for j in range(len(arr2[0])):
            for k in range(len(arr1[0])):
                sum += arr1[i][k]*arr2[k][j]
            answer[i][j] = sum
            sum = 0

    return answer