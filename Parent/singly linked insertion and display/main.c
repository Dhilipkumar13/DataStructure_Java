
#include <stdio.h>
#include<stdlib.h>
void insert();
void display();
struct node{
    int data;
    struct node*next;
}*head=NULL,*ne,*temp;

int main()
{
    int n;
    head=(struct node*)malloc(sizeof(struct node));
    printf("enter the head value:");
    scanf("%d",&head->data);
    head->next=NULL;
    temp=head;
    printf("enter how many node created:");
    int k;
    scanf("%d",&k);
    for(int i=0;i<k;i++)
    {
        insert();
    }
  display();
}
    
    
void insert()
{
       ne=(struct node*)malloc(sizeof(struct node));
       printf("enter the element to be inserted:");
       scanf("%d",&ne->data);
       temp->next=ne;
       temp=ne;
       ne->next=NULL;
       
       
}
       
void display()
{
    temp=head;
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
}

