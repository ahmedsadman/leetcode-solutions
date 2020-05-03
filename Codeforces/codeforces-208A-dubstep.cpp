#include <iostream>
#include <string>
#include <regex>
using namespace std;

int main() {
	string str;
	int pos = 0;
	int space_max = 0;
	cin >> str;

	while (1) {
		pos = str.find("WUB");
		if (pos == -1)
			break;
		str.insert(pos+3, " ");
		str.erase(pos, 3);
	}

	for (int i = 0; i < str.length(); i++) {
		if (str[i] == ' ')
			space_max++;
		else
			break;
	}
	
	str.erase(0, space_max);
	str = regex_replace(str, std::regex("^ +| +$|( ) +"), "$1"); // removes extra spaces between words (collected from internet, i don't understand)
	//cout << space_max << endl;
	cout << str << endl;
	return 0;
}
