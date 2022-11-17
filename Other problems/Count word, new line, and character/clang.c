#include <stdio.h>

#define IN 1
#define OUT 0 

int main()
    {
    int state = OUT;
    int wordCount = 0;
    int newLineCount = 0;
    int charCount = 0;
    char c = 0;

    while ((c = getchar()) != EOF) {
        charCount++;

        if (c == '\n') {
            newLineCount++;
            }
        if (c == ' ' || c == '\t' || c == '\n') {
            state = OUT;
            }
        else if (state == OUT) {
            state = IN;
            wordCount++;
            }
        }

    printf("word count: %d\n", wordCount);
    printf("new line count: %d\n", newLineCount - 1);
    printf("character count: %d\n", charCount);

    

    printf("\n - - - - - - - - - - - - - -\nPress any key to Continue\n - - - - - - - - - - - - - -\n");
    return 0;
    }