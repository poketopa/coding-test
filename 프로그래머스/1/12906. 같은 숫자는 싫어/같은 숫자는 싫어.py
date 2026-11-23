def solution(arr):
    answer = []
    lastIndex = -1 
    for i in arr:
        if lastIndex == i:
            continue
        else:
            answer.append(i)
        lastIndex = i
        
    return answer