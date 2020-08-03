//#include <iostream>
//#include <queue>
//#include <algorithm>
//#include <string>
//
//using namespace std;
//
//int dx[] = { 0, 0, 1, -1 }, dy[] = { 1, -1, 0, 0 };
//int map[101][101];
//int visited[101][101];
//int n, m;
//
//void init() {
//	for (int i = 0; i < 102; i++) {
//		for (int j = 0; j < 102; j++) {
//			visited[i][j] = -1;
//		}
//	}
//	
//}
//
//bool range(int x, int y) {
//	if (x >= 1 && y >= 1 && x < n+1 && y < m+1) return true;
//	else return false;
//}
//
//void solve() {
//
//	queue<pair<int, int>> q;
//
//	//초기 시작
//	q.push(make_pair(1, 1));
//	visited[1][1] = 1;
//
//	while (!q.empty()) {
//		pair<int, int> now = q.front();
//		q.pop();
//
//		for (int i = 0; i < 4; i++) {
//			pair<int, int> next = make_pair(now.first, now.second);
//			next.first = now.first + dx[i];
//			next.second = now.second + dy[i];
//
//			if (range(next.first, next.second) && map[next.first][next.second] == 1 && visited[next.first][next.second] == -1) {
//				q.push(make_pair(next.first, next.second));
//				visited[next.first][next.second] = visited[now.first][now.second] + 1;
//
//			}
//		}
//	}
//
//}
//
//int main() {
//	init();
//
//	//n,m 설정
//	cin >> n >> m;
//
//
//	//맵 입력받기
//	for (int i = 1; i <= n; i++) {
//		for (int j = 1; j <= m; j++) {
//			scanf("%1d", &map[i][j]);
//
//		}
//	}
//
//	solve();
//
//	cout << visited[n][m];
//
//
//	return 0;
//}