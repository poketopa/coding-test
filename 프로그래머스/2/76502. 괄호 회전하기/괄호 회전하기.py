def solution(s):
    if len(s) == 1:
        return 0
    openList = ['(', '{', '[']
    closeList = [')', '}', ']']
    openDict = {'(': 0, '{': 0, '[': 0}
    matchDict = {'(': ')', '{': '}', '[': ']'}

    newS = 2*s

    count = 0

    # 길이만큼 반복
    for j in range(len(s)):
        openDict = {'(': 0, '{': 0, '[': 0}
        stack = []
        # 1씩 옮겨가며 확인
        for i in range(j, len(s)+j):
            # 여는 괄호면 딕셔너리 1, 스택에 넣는다
            if (newS[i] in openList):
                # 여는 괄호 중복이면 리턴
                # 중복 아니면 딕셔너리
                openDict[newS[i]] += 1
                stack.append(newS[i])
            else:
                # 여는 괄호 없이 닫는 괄호일 때
                if (len(stack) == 0):
                    break
                # 닫는괄호가 정상적일 때
                elif (matchDict[stack[-1]] == newS[i]):
                    stack.pop()
                else:
                    break
            if i == (len(s)+j-1) and len(stack) == 0:
                count += 1

    return count