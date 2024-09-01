#include<stdio.h>
#include<stdlib.h>
#define s 5 
int top=-1,a[5];
void push();
void pop();
void max();
void print();
void min();
void odd();
void even();
int main()
{
    int ch;
    while(1)
    {
       
        printf("\n1.PUSH operation");
        printf("\n2.POP operation");
        printf("\n3.PRINT operation");
        printf("\n4.maximum ");
         printf("\n5.minimum ");
          printf("\n6.odd ");
           printf("\n7.even ");
           printf("\n");
           printf("enter your choice");
      scanf("%d",&ch);
        switch(ch)
        {
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                print();
                break;
            case 4:
                max();
            case 8:
                exit(1);
                break;
            case 5:
                min();
                break;
            case 6:
                odd();
                break;
                
            case 7:
                even();
                break;
                
            default:
                printf("\n Enter correct choice:");
                break;
        }
    }
}
void push(){
    int x;
    if(top==s-1)
    {
        printf("stack overflow");
    }
    else
    {
        printf("enter the element to be inserted:");
        scanf("%d",&x);
        top=top+1;
        a[top]=x;
    }
}
void pop()
{
    if(top==-1)
    {
        printf("stack overflow");
    }
    else
    {
        printf("the deleted element is:");
        printf("%d",a[top]);
        top=top-1;
    }
}
void print()
    {
     if(top==-1)
    {
        printf("stack overflow");
    }
    else
    {
        for(int i=0;i>=0;--i)
        {
            printf("%d",a[i]);
        }
    }
    
}
void max()
{
    int max=0;
    for(int i=0;i<=top;i++)
        {
           if(a[i]>=max)
           {
               max=a[i];
           }
        }
        printf("%d",max);
    
}
void min()
{
    int min=a[0];
    for(int i=0;i<=top;i++)
        {
           if(a[i]<=min)
           {
               min=a[i];
           }
        }
        printf("%d",min);
    
}
void odd()
{
       for(int i=0;i<=top;i++)
        {
           if(a[i]%2!=0)
           {
             printf("%d",a[i]);
           }
        }
        
}
void even()
{
       for(int i=0;i<=top;i++)
        {
           if(a[i]%2==0)
           {
             printf("%d",a[i]);
           }
        }
        
}