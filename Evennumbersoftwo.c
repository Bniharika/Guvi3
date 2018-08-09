#include <stdio.h>
int main(void) {
	int i,a,b;
	printf("enter a value\n");
	scanf("%d",&a);
	printf("enter b value\n");
	scanf("%d,",&b);
	for(i=a;i<=b;i++)
	{
		if(i%2==0)
		printf("%d\t",i);
	}
	return 0;
	
}
