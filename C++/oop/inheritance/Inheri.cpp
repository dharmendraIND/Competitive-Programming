#include<iostream>

using namespace std;

class Parent
{
public:
	string name1 = "kumar";
};

class Child: public Parent
{
public:
	string name2 = "dharmendra";
};

int main()
{
	Child ch;
	cout << ch.name1 + " " + ch.name2;

	return 0;
}