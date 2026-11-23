def solution(s):
    answer = []
    count = 0
    for i in s:
        if i == ' ':
            count =0
            answer.append(' ')
            continue
        if count % 2== 0 :
            answer.append(i.upper())
            count+=1
        else:
            answer.append(i.lower())
            count+=1
    answer = ''.join(answer)
    return answer