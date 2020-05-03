// Codeforces 479A - Expression
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

#define pb push_back

int main() {
	int a, b, c, test;
	vector<int> v;
	cin >> a >> b >> c;

	test = a + b + c;
	v.pb(test);
	test = a * b * c;
	v.pb(test);
	test = (a + b) * c;
	v.pb(test);
	test = a * (b + c);
	v.pb(test);

	sort(v.begin(), v.end());
	cout << v[v.size() - 1] << endl;
	return 0;
}
