#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int main(){
    int r, s;
    cin >> r >> s;

    vector< vector<char> > a;
    vector< vector<int> > meteor_y(s);
    vector< vector<int> > ground_y(s);

    int time_min = 3001;

    for(int i = 0; i < r; i++){
        vector<char> tmp;
        for(int j = 0; j < s; j++){
            char c;
            cin >> c;

            tmp.push_back(c);

            if(c == 'X') meteor_y[j].push_back(i);
            else if(c == '#') ground_y[j].push_back(i);
        }

        a.push_back(tmp);
    }

    for(int i = 0; i < meteor_y.size(); i++){
        if(!meteor_y[i].empty()) sort(meteor_y[i].begin(), meteor_y[i].end(), greater<int>());
        if(!ground_y[i].empty()) sort(ground_y[i].begin(), ground_y[i].end());
        if(!meteor_y[i].empty() && !ground_y[i].empty()) time_min = min(ground_y[i][0] - meteor_y[i][0], time_min);
    }
    time_min--;

    for(int i = 0; i < meteor_y.size(); i++){
        for(int j = 0; j < meteor_y[i].size(); j++){
            a[meteor_y[i][j]][i] = '.';
            a[meteor_y[i][j] + time_min][i] = 'X';
        }
    }

    for(int i = 0; i < r; i++){
        for(int j = 0; j < s; j++){
            cout << a[i][j];
        }
        cout << endl;
    }

    return 0;
}