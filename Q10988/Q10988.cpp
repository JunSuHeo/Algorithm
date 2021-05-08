#include <iostream>
#include <string>

using namespace std;

int main(){
    string input;
    cin >> input;

    int idx = input.length() - 1;
    int i = 0;

    for(; i < input.length(); i++){
        if(input[i] == input[idx]) {
            idx--;
            continue;
        }
        else break;
    }

    if(i == input.length()) cout << 1;
    else cout << 0;

    return 0;
}