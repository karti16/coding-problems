#include <stdio.h>

int main()
    {
    int countSpace = 0;
    char str[100];
    fgets(str, 100, stdin);
    int i = 0;
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
            printf(" %c", str[i]);
            countSpace = 0;
            }
        else
            {
            printf("%c", str[i]);
            }
        i++;
        }

    printf("\n\nPress any key to Continue\n");
    return 0;
    }