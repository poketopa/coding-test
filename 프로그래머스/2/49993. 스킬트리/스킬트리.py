def solution(skill, skill_trees):
    answer = 0
    mapping = {}
    for i in skill:
        mapping[i] = 0
    skillList = list(mapping.keys())
    
    count = 0 
    
    for i in range(len(skill_trees)):
        count = 0
        for k in skill:
            mapping[k] = 0
        for j in range(len(skill_trees[i])):
            if skill_trees[i][j] in skill:
                if skill_trees[i][j] == skillList[count]:
                    count+=1
                else:
                    break
            if j == len(skill_trees[i])-1:
                answer += 1
    

    return answer