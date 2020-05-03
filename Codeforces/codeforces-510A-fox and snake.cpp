#include <iostream>
using namespace std;

int main() {
	int n, m, turn(1);
	cin >> n >> m;
	char snake[n][m];

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			if ((i+1) % 2 == 0) {
				snake[i][j] = '.';
			}
			else
				snake[i][j] = '#';
		}
	}

	for (int i = 1; i < n; i += 2) {
		if (turn == 1) {
			snake[i][m-1] = '#';
			turn = 0;
		}
		else {
			snake[i][0] = '#';
			turn = 1;
		}
	}

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			cout << snake[i][j];
		}
		cout << endl;
	}
	return 0;
}