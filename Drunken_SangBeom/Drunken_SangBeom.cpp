/*
백준 6359번 만취한 상범이
2018.7.25
*/
#include <iostream>

using namespace std;

class Room{
protected :
	int num;
	int *room;
public :
	void GetRoom() {cin >> num;	room = new int[num + 1]; }
	void SetZero() { for (int i = 1; i < num + 1; i++) room[i] = 0; }
	void Switch(int multiple) {
		for (int i = multiple; i < num + 1; i += multiple) {
			if (room[i] == 0) room[i] = 1;
			else if (room[i] == 1) room[i] = 0;
		}
	}
	int FindNum() {
		int breaknum = 0;
		for (int i = 1; i < num + 1; i++) if (room[i] == 0) breaknum++;
		return breaknum;
	}
	void Solve() {
		SetZero();
		for (int i = 2; i < num + 1; i++) Switch(i);
		cout << FindNum() << endl;
	}
	void DestroyRoom() { 
		room = NULL;
		delete[] room;
	}
};

int main()
{
	int testnum;
	Room test_room;

	cin >> testnum;

	for (int i = 0; i < testnum; i++)
	{
		test_room.GetRoom();
		test_room.Solve();
		test_room.DestroyRoom();
	}

	return 0;
}