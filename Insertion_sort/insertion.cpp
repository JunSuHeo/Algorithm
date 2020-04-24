#include <iostream>
#include <vector>

using namespace std;

void InsertionSortUp(vector<int> *v, int num)		//오름차순 정렬
{
	for (int j = 1; j < num; j++)
	{
		int key = v->at(j);
		//Insert A[j] into the sorted sequence A[0..j-1]
		int i = j - 1;
		while ((i >= 0) && (v->at(i) > key))
		{
			v->at(i+1) = v->at(i);
			i--;
		}
		v->at(i+1) = key;
	}
}

void InsertionSortDown(vector<int> *v,int num)	//내림차순 정렬
{
	for (int j = 1; j < num; j++)
	{
		int key = v->at(j);
		//Insert A[j] into the sorted sequence A[0..j-1]
		int i = j - 1;
		while ((i >= 0) && (v->at(i) < key))
		{
			v->at(i + 1) = v->at(i);
			i--;
		}
		v->at(i + 1) = key;
	}
}

int Input(vector<int> *v)
{
	cout << "Input numbers : ";
	
	int num;
	cin >> num;

	for (int i = 0; i < num; i++)
	{
		cout << "input " << i+1 << ": ";
		int tmp;
		cin >> tmp;
		v->push_back(tmp);
	}

	return num;
}

void Output(vector<int> v)
{
	cout << "Result : ";

	vector<int>::iterator iter;

	for (iter = v.begin(); iter != v.end(); iter++) {
		cout << *iter << " ";
	}
	cout << endl;
}

int main()
{
	vector<int> v;
	int num = Input(&v);
	int choice;

	do {
		cout << "Input Up or Down (1 : Up, 2 : Down) : ";
		cin >> choice;
		if (choice == 1)
			InsertionSortUp(&v, num);
		else if (choice == 2)
			InsertionSortDown(&v, num);
		else
			cout << "Error! Input 1 or 2 \n";
	} while (choice != 1 && choice != 2);

	Output(v);
	return 0;
}