
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
        int k,ch;
        while(1)
        {
            
        printf("\n1 memory allocate");
        printf("\n0 no memory want");
        printf("\n enter your choice:");
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            {
            printf("\n give the size of extend memory: ");
            scanf("%d",&k);
            p=realloc(p,k*sizeof(int));
            for(int i=n;i<k;i++)
            {
            scanf("%d",p+i);
            }
           
                n=k;
            
            }
            break;
            case 0:
            {
                 for(int i=0;i<k;i++)
            {
            printf("%d",p[i]);
          
            }
            exit(0);
            }
        }
    }
    }
    

    return 0;
}
