#include<iostream>
#include<string>

using namespace std;

class Person 
{
public:
	int health;
	 char sname;

	void print()
	{
		cout << health << endl;
	}
};


int main()
{

	Person ramesh;
	ramesh.health = 20;
	ramesh.sname = 'C';

	cout <<"health is: " <<ramesh.health<< endl;
	cout <<"surname is: " <<ramesh.sname<< endl;

	return 0;

}