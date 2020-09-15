#include <iostream>
using namespace std;

int main() {
	int x;
	x = 5;
  
	int* ptr1;
    ptr1 = &x;

	int* ptr2;
    ptr2 = ptr1;
	*ptr1 = 6;

    cout << ptr1 << endl;
    cout << *ptr2 << endl;
    cout << *ptr1 << endl;
    cout << ptr2 << endl;
    
    /*
    output:
    0x7ffc3af08e54
	6
	6
	0x7ffc3af08e54
	tanda * : isi pointer
	tanpa * : alamat
     */
    
    
    /*
    int* ptr3;
ptr3 = new int;
*ptr3 = 5;
delete ptr3;
ptr3 = NULL;

int *ptr4;
ptr4 = new int[5];
ptr4[0] = 100;
ptr4[4] = 123;
delete [] ptr4;
ptr4 = NULL;
    */
      
	return 0;
}
