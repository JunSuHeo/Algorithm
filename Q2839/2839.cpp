#include <iostream>
#include <string>

int main() {
	int n;		//¼³ÅÁÀÇ ¹«°Ô
	int n5 = 0;		//5kg ¼³ÅÁ °¹¼ö
	int n3 = -1;		//3kg ¼³ÅÁ °¹¼ö

	int tmp;
	int tmp2 = 0;
	std::string arr;

	std::cin >> n;

	for (n5 = n / 5; n5 >= 0; n5--) {
		tmp = n - (n5 * 5);
		tmp2 = 0;

		if (tmp == 0) {
			n3 = 0;
			break;
		}

		arr = std::to_string(tmp);

		for (n3 = 0; n3 < arr.length(); n3++) {
			tmp2 += arr[n3] - '0';
		}

		if (tmp2 % 3 == 0) {
			n3 = tmp / 3;
			break;
		}
		n3 = -1;
	}
	if (n3 == -1 && n5 == -1) {
		std::cout << "-1";
	}
	else {
		std::cout << n3 + n5;
	}

	return 0;
}