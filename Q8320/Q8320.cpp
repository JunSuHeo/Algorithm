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

    return 0;
}