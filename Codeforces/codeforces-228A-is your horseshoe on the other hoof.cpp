#include <iostream>
#include <set>
#include <vector>
using namespace std;

int main() {
	set<long long int> unique_shoe;
	vector<long long int> shoe;
	int a;

	while (cin >> a) {
		unique_shoe.insert(a);
		shoe.push_back(a);
	}
	
	cout << shoe.size() - unique_shoe.size() << endl;
	return 0;
}