#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
    int N;
    scanf("%d", &N);
    vector<int> arr;
    int sum = 0;

    for(int i = 0; i < N; i++){
        int tmp;

        scanf("%d", &tmp);
        arr.push_back(tmp);
    }

    sort(arr.begin(), arr.end());

    sum += arr[0];
    for(int i = 1; i < N; i++){
        arr[i] = arr[i-1] + arr[i];
        sum += arr[i];
    }

    printf("%d\n", sum);

    return 0;
}