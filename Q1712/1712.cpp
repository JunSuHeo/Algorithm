//���� 1712��

#include <iostream>

int main() {
	unsigned int a, b, c;	//a : ������� b : ��Ʈ�� ����,�ΰǺ� c : ��Ʈ�� �Ǹź�
	unsigned int tmp;

	std::cin >> a >> b >> c;

	if (b >= c) {		//����� �ΰǺ� �Ǹź񺸴� �� ũ�ų� �������� ���ͺб��� �߻����� ����
		std::cout << "-1";
	}

	else {			//��Ʈ�� �Ǹź�� ����,�ΰǺ� �� ������ ��������� ������ 1�� �����ִ°��� ���ͺб��� �߻�����
		tmp = a / (c - b);
		std::cout << tmp + 1;
	}

	return 0;
}