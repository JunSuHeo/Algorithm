// 백준 2798번 블랙잭

#include <iostream>

int main() {
	int n, m;

	std::cin >> n >> m;			//카드 개수와 합을 입력
	
	int *arr = new int[n];		//카드 개수만큼 배열 생성
	int sum = 0;
	int tmp = m;				//합과의 차를 비교대상으로 삼을것이다.

	for (int i = 0; i < n; i++) {
		std::cin >> arr[i];
	}

	for (int i = 0; i < n - 2; i++) {

		for (int j = i + 1; j < n - 1; j++) {

			for (int k = j + 1; k < n; k++) {

				sum = arr[i] + arr[j] + arr[k];		//합을 구해놓는다

				if (sum <= m) {
					if (m - sum < tmp) {		//목표 숫자와 차이가 적은걸 기억해둔다.
						tmp = m - sum;
					}
				}
			}
		}
	}

	std::cout << m - tmp;

	return 0;
}