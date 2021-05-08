#include <cstdio>
#include <iostream>
#include <vector>

using namespace std;

int main(){
    int truck_num, bridge_len, max_weight;
    scanf("%d %d %d", &truck_num, &bridge_len, &max_weight);

    vector< pair<int, int> > arr;

    for(int i = 0; i < truck_num; i++){
        int tmp;
        scanf("%d", &tmp);

        arr.push_back(make_pair(tmp, bridge_len));
    }

    int time = 1;
    int last_idx = 0;
    int first_idx = 0;
    int truck_sum = arr[0].first;
    arr[0].second--;

    while(arr[truck_num - 1].second != -1){
        time++;

        for(int i = first_idx; i <= last_idx; i++){
            arr[i].second--;
        }

        if(arr[first_idx].second == -1){
            truck_sum -= arr[first_idx].first;
            first_idx++;
        }

        if(truck_sum + arr[last_idx + 1].first <= max_weight){
            // 트럭 올릴 수 있다.
            last_idx++;
            truck_sum += arr[last_idx].first;
            arr[last_idx].second--;
        }
    }

    printf("%d\n", time);

    return 0;
}