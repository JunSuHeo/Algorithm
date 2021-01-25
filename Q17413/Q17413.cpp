#include <cstdio>
#include <string>
#include <iostream>
#include <vector>
#include <stack>

using namespace std;

int main(){
    char arr[100001];
    scanf(" %[^\n]s", arr);

    string return_val = "";
    string S = arr;
    vector<string> v_arr;
    string tmp = "";
    int idx = 0;
    stack<char> st;

    for(int i = 0; i < S.length(); i++){
        if(S[i] == '<'){
            while(!st.empty()){
                return_val.push_back(st.top());
                st.pop();
            }
            while(S[i] != '>') {
                return_val.push_back(S[i]);
                i++;
            }
            return_val.push_back('>');
            
        }
        else if(S[i] == ' '){
            while(!st.empty()){
                return_val.push_back(st.top());
                st.pop();
            }
            while(S[i] != ' ') {
                return_val.push_back(S[i]);
                i++;    
            }
            return_val.push_back(' ');
            
        }
        else if((S[i] >= 'a' && S[i] <= 'z') || (S[i] >= '0' && S[i] <= '9')){
            st.push(S[i]);
        }
    }

    if(return_val.length() != S.length()){
        while(!st.empty()){
            return_val.push_back(st.top());
            st.pop();
        }
    }

    cout << return_val << endl;

    return 0;
}