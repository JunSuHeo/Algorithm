#include <iostream>
#include <vector>
#include <stack>
#include <queue>
#include <algorithm>

using namespace std;

void dfs(int start, vector<int> graph[], bool check[]) {
	stack<int> s;

	s.push(start);
	check[start] = true;

	printf("%d ", start);

	while (!s.empty()) {
		int current_node = s.top();
		s.pop();

		for (int i = 0; i < graph[current_node].size(); i++) {
			int next_node = graph[current_node][i];

			if (!check[next_node]) {
				check[next_node] = true;
				printf("%d ", next_node);

				s.push(current_node);
				s.push(next_node);
				break;
			}
		}
		
	}
}

void bfs(int start, vector<int> graph[], bool check[]) {
	queue<int> q;
	q.push(start);
	check[start] = true;

	while (!q.empty()) {
		int tmp = q.front();
		q.pop();
		printf("%d ", tmp);
		for (int i = 0; i < graph[tmp].size(); i++) {
			if (!check[graph[tmp][i]]) {
				check[graph[tmp][i]] = true;
				q.push(graph[tmp][i]);
			}
		}

	}
}

int main() {
	int n, m, start;
	cin >> n >> m >> start;

	vector<int> *graph = new vector<int>[n + 1];
	bool *check = new bool[n + 1];
	fill(check, check + n + 1, false);

	for (int i = 0; i < m; i++) {
		int u, v;
		cin >> u >> v;

		graph[u].push_back(v);
		graph[v].push_back(u);
	}

	for (int i = 1; i <= n; i++) {
		sort(graph[i].begin(), graph[i].end());
	}

	dfs(start, graph, check);
	fill(check, check + n + 1, false);
	printf("\n");
	bfs(start, graph, check);
	printf("\n");

	return 0;
}