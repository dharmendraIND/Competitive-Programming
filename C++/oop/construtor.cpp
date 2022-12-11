#include<iostream>

using namespace std;

class student {
	int rno;
	char name[10];
	double fee;

	//defining the constructor within the class

public: 
	student()
	{
		cout <<"Enter the roll no: ";
		cin >> rno;
		cout <<"ENTER THE NAME: ";
		cin << name;
		cout << "enter the fee: ";
		cin >>fee;
	}

	void display()
	{
		cout <<endl << rno << "\t" <<name<< "\t" <<fee;
	}
};

int main()
{
	student s;
	s.display();

	return 0;

}