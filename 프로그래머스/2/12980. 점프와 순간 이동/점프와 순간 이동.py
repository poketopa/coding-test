def solution(n):
    ans = 1
    while 1:
        if n==1:
            return ans
        if n %2 ==0:
            n = n//2
        else:
            n-=1
            n//2
            ans+=1