#include <iostream>
#include <algorithm>

using namespace std;


int main(){
    int source, fried, half, source_num, fried_num;
    int total_min = 0;

    cin >> source >> fried >> half >> source_num >> fried_num;

    // case 1 half로 다 샀을 경우
    int total_1 = 0;
    if(fried_num >= source_num){
        total_1 += source_num * half * 2;
        total_1 += (fried_num - source_num) * half * 2;
    }
    else{
        total_1 += fried_num * half * 2;
        total_1 += (source_num - fried_num) * half * 2;
    }

    // case 2 각각 다 샀을 경우
    int total_2 = 0;
    total_2 += source_num * source;
    total_2 += fried_num * fried;


    // case 3 half로 최소한 산 다음, 나머지를 한 경우
    int total_3 = 0;
    if(fried_num >= source_num){
        total_3 += source_num * half * 2;
        total_3 += (fried_num - source_num) * fried;
    }
    else{
        total_3 += fried_num * half * 2;
        total_3 += (source_num - fried_num) * source;
    }

    total_min = min(total_1, total_2);
    total_min = min(total_min, total_3);


    cout << total_min << endl;

    return 0;
}