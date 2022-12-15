#include<iostream>

using namespace std;

class Animal
{

public:
	void eat() {
		cout<<"ANImal can eat" << endl;

	}

	void sleep() {
		cout << "i can sleep" <<endl;
	}
};

class Dog : public Animal {
public:
	void bark() {
		cout << "dog can bark"<< endl;

	}
};

int main() {
	Dog tommy;

	tommy.eat();
	tommy.sleep();

	tommy.bark();

	return 0;
}