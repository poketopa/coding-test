def solution(s):
    for i in range(0, len(s)):
        # 숫자면
        if not s[i].isdegit():
            if 0 < i and s[i-1] == ' ':
                s[i] = s[i].upper()
        
    return s