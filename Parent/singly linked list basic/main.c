
#include <stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
}*head=NULL;

int main()
{
    int n;
    struct node*temp,*ne;
    head=(struct node*)malloc(sizeof(struct node));
    printf("enter the head value:");
    scanf("%d",&head->data);
    head->next=NULL;
    temp=head;
    int choice;
    do
    {
       ne=(struct node*)malloc(sizeof(struct node));
       printf("enter the element to be inserted:");
       scanf("%d",&ne->data);
       temp->next=ne;
       temp=ne;
       ne->next=NULL;
       printf("enter your choice:");
       scanf("%d",&choice);
       
       
    }while(choice!=0);
    temp=head;
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
}

