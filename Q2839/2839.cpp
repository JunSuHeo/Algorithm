//백준 2839

#include <iostream>
#include <string>

int main() {
	int n;			//설탕의 무게
	int n5 = 0;		//5kg 설탕 갯수
	int n3 = -1;	//3kg 설탕 갯수

	int tmp;
	int tmp2 = 0;

	std::string arr;	//각 자릿수의 합을 구하기 위한 문자열

	std::cin >> n;		//설탕의 무게를 받아온다.

	for (n5 = n / 5; n5 >= 0; n5--) {		
		tmp = n - (n5 * 5);		//5kg을 최대한으로 많이 만든 뒤, 남은 무게를 저장한다.
		tmp2 = 0;

		if (tmp == 0) {		//5kg단위로 나누어 떨어지면 더이상 만들 수 없다.
			n3 = 0;
			break;
		}

		arr = std::to_string(tmp);		//남은 무게의 각 자리수의 합을 알아보기 위해 문자열로 변환한다.

		for (n3 = 0; n3 < arr.length(); n3++) {		
			tmp2 += arr[n3] - '0';		//각 자리수의 숫자 합을 구한다.
		}

		if (tmp2 % 3 == 0) {		//자리수의 숫자 합이 3의 배수라면 3kg 설탕으로 만들 수 있다.
			n3 = tmp / 3;
			break;
		}
		n3 = -1;
	}
	if (n3 == -1 && n5 == -1) {		//3kg, 5kg으로 만들 수 없을때
		std::cout << "-1";
	}

	else {
		std::cout << n3 + n5;
	}

	return 0;
}