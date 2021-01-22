#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(pair<int,int> a, pair<int,int> b){
    if(a.second == b.second) return a.first < b.first;
    else return a.second < b.second;
}

int main(){
    vector< pair<int, int> > arr;
    int n;
    cin >> n;

    for(int i = 0; i < n; i++){
        int a, b;
        scanf("%d %d", &a, &b);

        arr.push_back(make_pair(a, b));
    }

    sort(arr.begin(), arr.end(), compare);

    for(int i = 0; i < n; i++){
        printf("%d %d\n", arr[i].first, arr[i].second);
    }

    return 0;
}