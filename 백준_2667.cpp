#include <iostream>
#include <queue>
#include <vector>
#include <algorithm>

using namespace std;

int map[26][26];
int visited[26][26];

int dx[] = { 0, 0, 1, -1 }, dy[] = { 1, -1, 0, 0 };

int cnt = 0;
int n = 0;
vector<int> cnt_map;

void init() {
	for (int i = 0; i < 26; i++) {
		for (int j = 0; j < 26; j++) {
			map[i][j] = -1;
			visited[i][j] = -1;
		}
	}
}

bool range(int x, int y) {
	if (x >= 0 && y >= 0 && x < n && y < n) return true;
	else return false;
}

void solve() {
	queue<pair<int, int>> q;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (visited[i][j] == -1 && map[i][j] == 1) {
				int tmp = 0;
				cnt++;
				q.push(make_pair(i, j));
				visited[i][j] = cnt;
				tmp++;

				while (!q.empty()) {
					pair<int, int> now = q.front();
					visited[now.first][now.second] = cnt;
					q.pop();

					for (int k = 0; k < 4; k++) {
						pair<int, int> next = make_pair(now.first + dx[k], now.second + dy[k]);

						if (map[next.first][next.second] == 1 && visited[next.first][next.second] == -1 && range(next.first, next.second)) {
							q.push(make_pair(next.first, next.second));
							visited[next.first][next.second] = cnt;
							tmp++;
						}
					}
				}
				cnt_map.push_back(tmp);
			}
			else {
				visited[i][j] = 0;
			}
		}
	}
}

int main() {
	cin >> n;

	init();

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			scanf_s("%1d", &map[i][j]);
		}
	}

	solve();

	cout << cnt << endl;

	sort(cnt_map.begin(), cnt_map.end());

	for (int i = 0; i < cnt; i++) {
		cout << cnt_map.at(i) << endl;
	}

	cin >> n;


	return 0;
}