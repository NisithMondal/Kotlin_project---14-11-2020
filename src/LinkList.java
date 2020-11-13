//public class LinkList {
//    #include <stdio.h>
//#include <stdlib.h>
//    struct node{
//        int data;
//        struct node *next;
//    } ;
//    struct node *head=NULL;
//    struct node* createNode();
//    void insertNode();
//    void displayNode();
//    void deleteNodeFromFirst();
//    int main()
//    {
//        int i, j=1;
//        while(j){
//            printf("\nSelect Option\n");
//            scanf("%d",&i);
//            switch(i){
//                case 0:
//                    j=0;
//                    break;
//                case 1:
//                    insertNode();
//                    break;
//                case 2:
//                    deleteNode();
//                    break;
//                case 3:
//                    displayNode();
//                    break;
//                default:
//                    printf("\nInvalid Input\n");
//            }
//        }
//        return 0;
//    }
//
//
//    struct node* createNode(){
//        struct node *temp;
//        temp = (struct node*) malloc(sizeof(struct node));
//        temp->next = NULL;
//        return temp;
//    }
//
//
//    void insertNode(){
//        struct node *temp, *t;
//        int num;
//        printf("Enter a number");
//        scanf("%d",&num);
//        temp = createNode();
//        temp->data = num;
//        if(head==NULL){
//            head = temp;
//        }else{
//            t = head;
//            while(t->next!=NULL){
//                t = t->next;
//            }
//            t->next = temp;
//        }
//    }
//
//    void displayNode(){
//        struct node *temp;
//        if(head==NULL){
//            printf("\nlist is empty\n");
//        }else{
//            temp = head;
//            while(temp->next!=NULL){
//                printf(" %d ",temp->data);
//                temp=temp->next;
//            }
//            printf(" %d ",temp->data);
//        }
//    }
//
//    void deleteNodeFromFirst(){
//        struct node *temp;
//        if(head==NULL){
//            printf("list is empty");
//        }else{
//            temp = head;
//            head = head->next;
//            free(temp);
//            printf("Node deleted successfully");
//
//        }
//    }
//
//
//    struct node* reverseList(struct node *start){
//        struct node *t1,*t2;
//        t1=t2=NULL;
//        while(start!=NULL){
//            t2 = start->next;
//            start->next = t1;
//            t1 = start;
//            start = t2;
//        }
//        return t1;
//    }

//}
