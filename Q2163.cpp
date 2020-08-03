#include <iostream>
#include <queue>

using namespace std;

void calc_island();
int bfs(int i, int j);

int map[52][52] = { 0 };
int visited[52][52] = {-1};

int dy[8] = {1, 1, 0, -1, -1, -1, 0, 1};
int dx[8] = {0, 1, 1, 1, 0, -1, -1, -1};

int cnt = 0;
int w, h;


int main() {

	while (1) {
		cin >> w >> h;

		if (w == 0 && h == 0) break;

		else {
			fill(&visited[0][0], &visited[51][51], -1);
			fill(&map[0][0], &map[51][51], -1);
			cnt = 0;

			calc_island();

			cout << cnt << endl;
		}
	}

	return 0;
}

void calc_island() {
	for (int i = 1; i <= h; i++) {
		for (int j = 1; j <= w; j++) {
			cin >> map[i][j];
			visited[i][j] = 0;
		}
	}

	for (int i = 1; i <= h; i++) {
		for (int j = 1; j <= w; j++) {
			if (map[i][j] == 1) {
				int tmp = bfs(i, j);

				if (tmp != -1) cnt++;
			}
		}
	}
}

int bfs(int i, int j) {
	queue<pair<int, int>> q;
	int x, y;

	if (visited[i][j] == 1) return -1;

	else {
		q.push(make_pair(i, j));

		while (!q.empty()) {
			x = q.front().first;
			y = q.front().second;
			q.pop();

			for (int k = 0; k < 8; k++) {
				i = x + dx[k];
				j = y + dy[k];
				if (visited[i][j] == 0 && map[i][j] == 1) {
					q.push(make_pair(i, j));
					visited[i][j] = 1;
				}
				else {
					continue;
				}
			}

		}

		return 1;
	}
}