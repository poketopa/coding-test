import heapq

def solution(scoville, K):
    heapq.heapify(scoville)
    if scoville[0]>=K:
        return 0
    count =0
    
    while len(scoville) != 1:
        small1 = heapq.heappop(scoville)
        small2 = heapq.heappop(scoville)
        heapq.heappush(scoville, small1 + (small2*2))
        count+=1
        if scoville[0] >= K:
            return count
    if scoville[0] >= K:
        return count
    else:
        return -1