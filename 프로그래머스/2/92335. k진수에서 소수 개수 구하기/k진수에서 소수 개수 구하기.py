import math
import re

def solution(n, k):
    num = []
    while n:
        mod = n % k
        div = n // k
        num.append(mod)
        n = div
    # 문자열로 바꾼다
    num = ''.join(map(str,num[::-1]))
    # 0을 기준으로 리스트를 분리한다
    splitNum = re.split('(0)',num)
    answer = 0
    
    for i in range(len(splitNum)):
        # 0이나 공백이면 넘어간다
        if splitNum[i] == '0' or splitNum[i] == '':
            continue
        currentNum = int(splitNum[i])
        # 2일 떄
        if currentNum == 2:
            answer += 1
        # 소수가 아닐 때 (짝수, 1일 때)
        elif currentNum %2 == 0 or currentNum == 1:
            continue
        
        # 1이 아닌 홀수일 때
        else :
            count = 0
            # 제곱근까지 나눠가며 소수임을 확인한다
            for j in range(3,int(math.sqrt(currentNum))+1):
                # 나눠지는 수가 있으면 (소수 아님)
                if currentNum % j == 0:
                    count = 1
                    break
            # 여기까지 왔으면 소수
            if count == 0:
                answer += 1
    return answer