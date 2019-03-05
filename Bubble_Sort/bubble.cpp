#include <iostream>

using namespace std;

void Swap(int *a, int*b)
{
	int tmp;

	tmp = *a;
	*a = *b;
	*b = tmp;
}

int* bubble(int* arr, int num)
{

	for (int i = 0; i < num; i++)
	{
		for (int j = i+1; j < num; j++)
		{
			if (arr[i] > arr[j])
				Swap(&arr[i], &arr[j]);
		}
	}

	return arr;
}

int main(int argc, char** argv)
{
	cout << "��� �迭������ �Ͻðڽ��ϱ�? : ";
	
	int num = 0;
	cin >> num;

	int* arr = new int[num];

	for (int i = 0; i < num; i++)
	{
		cout << i << "��° ���Ҹ� �Է��ϼ��� : ";
		cin >> arr[i];
	}

	arr = bubble(arr, num);

	cout << "----------------------���� �� ---------------------" << endl;

	for (int i = 0; i < num; i++)
		cout << arr[i] << " ";

	return 0;
}