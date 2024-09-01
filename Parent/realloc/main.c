
#include <stdio.h>
#include<stdlib.h>


int main()
{
    int n,*p=NULL;
    scanf("%d",&n);
    p=(int*)malloc(n*sizeof(int));
    if(p==NULL)
    {
        
        printf("no memory allocated");
    }
    else
    {
        for(int i=0;i<n;i++)
        {
            scanf("%d",p+i);
        }
        for(int i=0;i<n;i++)
        {
            printf("%d",p[i]);
          
        }
        int k;
        scanf("%d",&k);
        p=realloc(p,k*sizeof(int));
         for(int i=0;i<k;i++)
        {
            scanf("%d",p+i);
        }
        for(int i=0;i<k;i++)
        {
            printf("%d",p[i]);
          
        }
        free(p);
        p=NULL;
    }

    return 0;
}