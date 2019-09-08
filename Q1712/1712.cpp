//백준 1712번

#include <iostream>

int main() {
	unsigned int a, b, c;	//a : 고정비용 b : 노트북 재료비,인건비 c : 노트북 판매비
	unsigned int tmp;

	std::cin >> a >> b >> c;

	if (b >= c) {		//재료비와 인건비가 판매비보다 더 크거나 같을때는 손익분기점 발생하지 않음
		std::cout << "-1";
	}

	else {			//노트북 판매비와 재료비,인건비를 뺀 값에서 고정비용을 나누고 1을 더해주는것이 손익분기점 발생시점
		tmp = a / (c - b);
		std::cout << tmp + 1;
	}

	return 0;
}