// ���� 2798�� ����

#include <iostream>

int main() {
	int n, m;

	std::cin >> n >> m;			//ī�� ������ ���� �Է�
	
	int *arr = new int[n];		//ī�� ������ŭ �迭 ����
	int sum = 0;
	int tmp = m;				//�հ��� ���� �񱳴������ �������̴�.

	for (int i = 0; i < n; i++) {
		std::cin >> arr[i];
	}

	for (int i = 0; i < n - 2; i++) {

		for (int j = i + 1; j < n - 1; j++) {

			for (int k = j + 1; k < n; k++) {

				sum = arr[i] + arr[j] + arr[k];		//���� ���س��´�

				if (sum <= m) {
					if (m - sum < tmp) {		//��ǥ ���ڿ� ���̰� ������ ����صд�.
						tmp = m - sum;
					}
				}
			}
		}
	}

	std::cout << m - tmp;

	return 0;
}