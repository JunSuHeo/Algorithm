#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string lower(string str){
    string return_val = str;
    
    for(int i = 0; i < str.length(); i++){
        if(str[i] >= 'A' && str[i] <= 'Z'){
            int tmp = str[i] - 'A';
            return_val[i] = 'a' + tmp;
        }
    }

    return return_val;
}

int main(){
    int num;
    cin >> num;

    cin.ignore();

    vector<string> arr(num);

    for(int i = 0; i < num; i++){
        getline(cin, arr[i]);
    }

    for(int i = 0; i < arr.size(); i++){
        arr[i] = lower(arr[i]);
        vector<int> alpha(26, 0);

        for(int j = 0; j < arr[i].length(); j++){
            if(arr[i][j] >= 'a' && arr[i][j] <= 'z'){
                int idx = arr[i][j] - 'a';
                alpha[idx]++;
            }
        }

        sort(alpha.begin(), alpha.end());

        switch(alpha[0]){
            case 0:
                cout << "Case " << i+1 << ": Not a pangram" << endl;
            break;
            
            case 1:
                cout << "Case " << i+1 << ": Pangram!" << endl;
            break;
            
            case 2:
                cout << "Case " << i+1 << ": Double pangram!!" << endl;
            break;

            case 3:
                cout << "Case " << i+1 << ": Triple pangram!!!" << endl;
            break;

            default:
                cout << "Case " << i+1 << ": Not a pangram" << endl;
            break;
        }
    }

    return 0;
}