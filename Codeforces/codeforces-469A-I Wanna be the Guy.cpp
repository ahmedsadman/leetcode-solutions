#include <iostream>
#include <vector>
using namespace std;

bool valNotExist(int x,vector<int>& storage) {
	for (int i = 0; i < storage.size(); i++)
		if (storage[i] == x)
			return false;
	return true;
}

int main() {
	int n, in(2);
	int p, userin;
	cin >> n;
	vector<int> storage;

	while (in--) {
		cin >> p;
		while (p--) {
			cin >> userin;
			if (valNotExist(userin, storage)) {
				storage.push_back(userin);
			}
		}
	}
	
	if (storage.size() == n)
		cout << "I become the guy." << endl;
	else
		cout << "Oh, my keyboard!";
	
	return 0;
}
