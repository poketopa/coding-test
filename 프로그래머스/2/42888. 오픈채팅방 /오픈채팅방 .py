def solution(record):
    answer = []
    userList = []
    userName = {}
    for i in record:
        i = i.split()
        if i[0] == "Enter":
            if i[1] not in userName or (userName[i[1]] != i[2]):
                userName[i[1]] = i[2]
            userList.append([1, i[1]])
        elif i[0] == "Leave":
            userList.append([0,i[1]])
        else:
            userName[i[1]] = i[2]
    
    for i in userList:
        if i[0] == 1:
            answer.append(f"{userName[i[1]]}님이 들어왔습니다.")
        if i[0] == 0:
            answer.append(f"{userName[i[1]]}님이 나갔습니다.")
           
    return answer