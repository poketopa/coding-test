def solution(s):
    s = s.replace('{', '[').replace('}', ']')
    newS = eval(s)
    myDict = {}
    for i in newS:
        for j in i:
            if myDict.get(j, 0):
                myDict[j] += 1
            else:
                myDict[j] = 1
    myDict = dict(sorted(myDict.items(), key=lambda x: x[1], reverse=True))
    arr = list(myDict.keys())
    return arr