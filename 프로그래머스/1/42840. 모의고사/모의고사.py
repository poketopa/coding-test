def solution(array):
    stu1 = [1, 2, 3, 4, 5] # 5
    stu2 = [2, 1, 2, 3, 2, 4, 2, 5] # 8
    stu3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] # 10
    answer = [0,0,0]
    for i in range(0,len(array)):
        if array[i] == stu1[i%5]:
            answer[0] += 1
        if array[i] == stu2[i%8]:
            answer[1] += 1
        if array[i] == stu3[i%10]:
            answer[2] += 1
    
    maxNum = max(answer)
    returnNum = []
    
    
    for i in range(0,3):
        if answer[i] == maxNum:
            returnNum.append(i+1)
    
    return returnNum