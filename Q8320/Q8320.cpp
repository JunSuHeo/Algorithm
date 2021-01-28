#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

int main(){
    int n;
    scanf("%d", &n);
    int sum = 0;

    int tmp = sqrt(n);

    sum += n;

    for(int i = 2; i <= tmp; i++){
        int sub_pow = n - pow(i, 2);
        sum += (sub_pow / i);
        sum++;
    }

    printf("%d", sum);


    /*
    1  : 1
    2  : 2
    3  : 3
    4  : 4 + 1
    5  : 5 + 1
    6  : 6 + 2
    7  : 7 + 2
    8  : 8 + 3
    9  : 9 + 3 + 1
    10 : 10 + 4 + 1
    11 : 11 + 4 + 1
    12 : 12 + 5 + 2
    13 : 13 + 5 + 
    */

    return 0;
}