#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(){
    string arr;
    int a[26] = {0};
    char next_char;

    cin >> arr;

    if(arr.length() == 26){
        string tmp = arr;
        if(next_permutation(tmp.begin(), tmp.end())){
            for(int i = 0; i < arr.length(); i++){
                if(tmp[i] != arr[i]){
                    tmp.erase(tmp.begin() + i + 1, tmp.end());
                    break;
                }
            }

            cout << tmp << endl;
        }
        else cout << -1 << endl;
    }
    else{
        for(int i = 0; i < arr.length(); i++){
            int tmp = arr[i] - 'a';
            a[tmp] = 1;
        }

        int i = 0;

        for(; i < 26; i++){
            if(a[i] == 1){
                continue;
            }
            else{
                next_char = 'a' + i;
                break;
            }
        }

        if(i == 26){
            cout << -1 << endl;
        }
        else{
            arr += next_char;
            cout << arr << endl;
        }
    }

    

    return 0;
}