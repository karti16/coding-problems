#include <iostream>
#include <string>
using namespace std;

int main()
    {
    string str;
    getline(cin, str);
    int i = 0;
    int countSpace = 0;
    while (str[i] != '\0')
        {
        if (str[i] == ' ')
            {
            countSpace++;
            i++;
            continue;
            }
        if (countSpace >= 1)
            {
            cout << " " << str[i];
            countSpace = 0;
            }
        else
            {
            cout << str[i];
            }
        i++;
        }

    return 0;
    }