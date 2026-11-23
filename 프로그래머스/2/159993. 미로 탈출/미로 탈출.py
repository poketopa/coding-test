# 1. 시작점에서 레버까지 이동 / BFS 이용
# 2. 레버에서 출구까지 이동 / BFS 이용
# 3. 이동시간 계산

from collections import deque

def bfs(start, goal, maps,rows, cols):
    visited = [[0] * cols for _ in range(rows)]
    distance = [[0] * cols for _ in range(rows)]
    visited[start[0]][start[1]] = 1
    queue = deque([start])
    
    
    dx = [-1,1,0,0]
    dy = [0,0,-1,1]
    
    while queue:
        x,y = queue.popleft()
        
        if (x,y) == goal:
            return distance[x][y]
        
        for i in range(4):
            nextX, nextY = x+dx[i],y+dy[i]
            
            if 0 <= nextX< rows and 0 <= nextY< cols and not maps[nextX][nextY] == "X" and not visited[nextX][nextY]:
                visited[nextX][nextY] = 1
                distance[nextX][nextY] = distance[x][y] + 1
                queue.append((nextX,nextY))
    return -1
            
        
            

def solution(maps):
    rows = len(maps)
    cols = len(maps[0])
    S, L, E = None, None, None
    
    # 시작점(S), 레버(L), 출구(E)의 좌표를 찾기
    for i in range(rows):
        for j in range(cols):
            if maps[i][j] == 'S':
                S = (i, j)
            elif maps[i][j] == 'L':
                L = (i, j)
            elif maps[i][j] == 'E':
                E = (i, j)
         
    distanceLever = bfs(S,L,maps,rows,cols)
    if distanceLever == -1:
        return -1
    distanceEnd = bfs(L,E,maps,rows,cols)
    if distanceEnd == -1:
        return -1
    
    return distanceLever + distanceEnd