#include <iostream>
#include <string>

using namespace std;

int main()
{
	int A, B, C;
	int count[10] = { 0 };

	cin >> A >> B >> C;

	string arr = to_string(A*B*C);

	for (int i = 0; i < arr.size(); i++)
	{
		switch (arr[i])
		{
		case '0':
			count[0]++;
			break;
		case '1' :
			count[1]++;
			break;
		case '2' :
			count[2]++;
			break;
		case '3' :
			count[3]++;
			break;
		case '4' :
			count[4]++;
			break;
		case '5' :
			count[5]++;
			break;
		case '6' :
			count[6]++;
			break;
		case '7' :
			count[7]++;
			break;
		case '8' :
			count[8]++;
			break;
		case '9' :
			count[9]++;
			break;
		}
	}

	for (int i = 0; i < 10; i++)
		cout << count[i] << endl;

	return 0;
}