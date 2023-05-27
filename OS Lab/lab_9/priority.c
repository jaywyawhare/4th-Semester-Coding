//priority scheduling algorithm

#include<stdio.h>
#include<math.h>
int main()
{
    int bt[20],p[20],wt[20],tat[20],at[10],pr[20],i,j,n,total=0,pos,temp,avg_wt,avg_tat;
    printf("Enter Total Number of Process:");
    scanf("%d",&n);

    printf("\nEnter Arrival Time Burst Time and Priority\n");
    for(i=0;i<n;i++)
    {
        printf("\nP[%d]",i+1);
        scanf("%d%d%d",&at[i],&bt[i],&pr[i]);

    }

    for(i=0;i<n;i++)
    {
        pos=i;
        for(j=i+1;j<n;j++)
        {
            if(pr[j]<pr[pos])
            {
                pos=j;
            }
        }
        temp=pr[i];
        pr[i]=pr[pos];
        pr[pos]=temp;

        temp=at[i];
        at[i]=at[pos];
        at[pos]=temp;

        temp=bt[i];
        bt[i]=bt[pos];
        bt[pos]=temp;
    }

    for(i=0;i<n;i++)
    {
        if(i==0)
        {
            wt[i]=0;
        }
        else
        {
            wt[i]=wt[i-1]+bt[i-1];
        }
    }

    for(i=0;i<n;i++)
    {
        total=total+wt[i];
    }
    avg_wt=total/n;

    for(i=0;i<n;i++)
    {
        tat[i]=wt[i]+bt[i];
    }

    for(i=0;i<n;i++)
    {
        total=total+tat[i];
    }
    avg_tat=total/n;

    printf("\nProcess\tArrival Time\tBurst Time\tPriority\tWaiting Time\tTurn Around Time\n");
    for(i=0;i<n;i++)
    {
        printf("P[%d]\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n",i+1,at[i],bt[i],pr[i],wt[i],tat[i]);
    }

    printf("\nAverage Waiting Time:%d",avg_wt);
    printf("\nAverage Turn Around Time:%d",avg_tat);
    return 0;
}