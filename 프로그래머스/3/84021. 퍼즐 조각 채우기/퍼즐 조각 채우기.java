import java.util.*;

class Solution {
    // 상, 하, 좌, 우 이동을 위한 배열 (y, x 방향 수정)
    int[] dy = {1, -1, 0, 0};
    int[] dx = {0, 0, 1, -1};
    
    public int solution(int[][] game_board, int[][] table) {
        int n = game_board.length;
        List<List<int[]>> boardList = new ArrayList<>();
        List<List<int[]>> tableList = new ArrayList<>();
        
        // 배열 크기 초기화 문법 수정
        boolean[][] visitedBoard = new boolean[n][n];
        boolean[][] visitedTable = new boolean[n][n];
        
        // 1. 게임 보드의 빈 공간(0)과 테이블의 퍼즐 조각(1) 추출
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 게임 보드에서는 빈칸(0)을 찾음
                if (game_board[i][j] == 0 && !visitedBoard[i][j]) {
                    boardList.add(bfs(i, j, game_board, visitedBoard, 0, n));
                }
                // 테이블에서는 조각(1)을 찾음
                if (table[i][j] == 1 && !visitedTable[i][j]) {
                    tableList.add(bfs(i, j, table, visitedTable, 1, n));
                }
            }
        }
        
        int answer = 0;
        // 특정 퍼즐 조각을 사용했는지 체크하는 배열
        boolean[] usedTable = new boolean[tableList.size()];
        
        // 2. 빈 공간에 퍼즐 조각 끼워맞추기
        for (int i = 0; i < boardList.size(); i++) {
            List<int[]> boardSpace = boardList.get(i);
            
            for (int j = 0; j < tableList.size(); j++) {
                if (usedTable[j]) continue; // 이미 사용한 조각은 패스
                
                List<int[]> tablePiece = tableList.get(j);
                
                // 크기(칸 수)가 다르면 애초에 맞지 않으므로 패스
                if (boardSpace.size() != tablePiece.size()) continue;
                
                // 모양이 일치하는지 회전시켜가며 확인
                if (isMatch(boardSpace, tablePiece)) {
                    answer += boardSpace.size(); // 채운 칸 수만큼 더하기
                    usedTable[j] = true;         // 사용 완료 처리
                    break;                       // 다음 빈 공간으로 넘어가기
                }
            }
        }
        
        return answer;
    }
    
    // 중복되는 BFS 로직을 별도 메서드로 추출
    private List<int[]> bfs(int r, int c, int[][] map, boolean[][] visited, int target, int n) {
        Queue<int[]> queue = new LinkedList<>();
        List<int[]> list = new ArrayList<>();
        
        queue.add(new int[]{r, c});
        list.add(new int[]{r, c});
        visited[r][c] = true;
        
        // 큐가 비어있지 않을 때 반복하도록 조건 수정 (! 추가)
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            
            for (int k = 0; k < 4; k++) {
                int ny = curr[0] + dy[k];
                int nx = curr[1] + dx[k];
                
                if (ny >= 0 && ny < n && nx >= 0 && nx < n) {
                    if (map[ny][nx] == target && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        queue.add(new int[]{ny, nx});
                        list.add(new int[]{ny, nx});
                    }
                }
            }
        }
        // 추출된 조각은 바로 정규화 및 정렬하여 반환
        return normalize(list);
    }
    
    // 조각을 (0,0) 기준으로 맞추고 정렬하는 메서드
    private List<int[]> normalize(List<int[]> list) {
        int minY = Integer.MAX_VALUE;
        int minX = Integer.MAX_VALUE;
        
        for (int[] p : list) {
            minY = Math.min(minY, p[0]);
            minX = Math.min(minX, p[1]);
        }
        
        List<int[]> normList = new ArrayList<>();
        for (int[] p : list) {
            normList.add(new int[]{p[0] - minY, p[1] - minX});
        }
        
        // 비교하기 쉽도록 좌표를 y축 기준 오름차순, y가 같으면 x축 기준 오름차순 정렬
        normList.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        return normList;
    }
    
    // 90도 시계방향 회전 메서드
    private List<int[]> rotate(List<int[]> list) {
        List<int[]> rotated = new ArrayList<>();
        for (int[] p : list) {
            // (y, x) -> (x, -y) 공식을 적용해 새로운 배열로 생성
            rotated.add(new int[]{p[1], -p[0]});
        }
        // 회전 후에는 기준점이 틀어지므로 반드시 다시 정규화
        return normalize(rotated);
    }
    
    // 빈 공간과 퍼즐 조각이 일치하는지 0~270도 돌려가며 확인
    private boolean isMatch(List<int[]> boardSpace, List<int[]> tablePiece) {
        List<int[]> currentPiece = tablePiece;
        
        for (int r = 0; r < 4; r++) {
            boolean match = true;
            
            // 좌표를 하나씩 비교
            for (int i = 0; i < boardSpace.size(); i++) {
                int[] b = boardSpace.get(i);
                int[] t = currentPiece.get(i);
                
                if (b[0] != t[0] || b[1] != t[1]) {
                    match = false;
                    break;
                }
            }
            
            // 완벽히 일치하면 true 반환
            if (match) return true;
            
            // 일치하지 않으면 90도 회전
            currentPiece = rotate(currentPiece);
        }
        
        return false;
    }
}
