def solution(people, limit):
    answer = 0
    people.sort()
    left = 0
    right = len(people)-1
    twins = 0
    while left != right:
        if people[left] + people[right] <= limit:
            twins += 1
            left += 1
            if left == right:
                break
        right -= 1

    answer = len(people) - twins
    return answer