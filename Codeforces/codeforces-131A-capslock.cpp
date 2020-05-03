// Codeforces 131A cAPSLOCK
#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

string change_case(string data, int i) { // i = 1 -> upper, else lower
    if (i == 0)
        transform(data.begin(), data.end(), data.begin(), ::tolower);
    else
        transform(data.begin(), data.end(), data.begin(), ::toupper);
	return data;
}

int main() {
    string s;
    int upcase = 0, lowcase = 0, i, testResult;
    cin >> s;
    int len = s.length();

    for (i = 0 ; i < len; i++) {
        if (s[i] == tolower(s[i]))
            lowcase++;
        else
            upcase++;
    }

    if (len - upcase == 1 && s[0] == tolower(s[0])) {
        testResult = 1;
        // cout << len << " " << upcase << endl;
    }
    else if (upcase == len)
        testResult = 2;
    else
        testResult = 0;

    if (testResult) {
        // cout << testResult << endl;
        s = change_case(s, 0);
        if (testResult == 1)
            s[0] = toupper(s[0]);
        else {}
    }

    cout << s << endl;
    return 0;
}
