#include<iostream>

using namespace std;

class Parent
{
public:
	string name3 = "kumar";

};

class Child: public Parent
{
public:
	string name4 = "jitin";

};

int main()
{
	Child obj;

	cout << obj.name3 + " " + obj.name4;

	return 0;
}