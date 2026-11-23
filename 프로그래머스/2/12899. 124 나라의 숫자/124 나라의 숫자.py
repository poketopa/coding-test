def solution(n):
    answer = ''
    
    while n:
        if n%3:
            answer += str(n%3)
        else:
            answer += '4'
            n-=1
        n//=3
    return answer[::-1]