#include <stdio.h>
void printMultable(int arr[], int a)
{
    printf("multiplication table of %d\n", a);
    for (int i = 0; i < 10; i++)
    {
        printf("%d X %d =%d\n", a, i + 1, a * (i + 1));
    }
    printf("\n===============================\n");
}

int main()
{
    int mulTable[3][10];

    // printMultable(mulTable,2);
    // printMultable(mulTable,7);
    // printMultable(mulTable,9);

    printf("which number's multiplication table u want to see\n");
    int n;
    scanf("%d", &n);
    printMultable(mulTable, n);
    printf("hy this is saswat\n");

    return 0;
}