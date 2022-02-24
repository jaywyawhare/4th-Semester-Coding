// FCFS SCHEDULING (All arrived at same time)

// Find out Completion time, Turn around time and waiting time for each process. Find average turn around time and waiting time.

#include<stdio.h>

int main(){
    int n,i,
        at[10],bt[10],
        wt[10],tat[10],ct[10],
        total_wt=0,total_tat=0;
    float avg_wt,avg_tat;
    printf("Enter the number of processes: ");
    scanf("%d",&n);
    printf("Enter the arrival time and burst time of each process:\n"); 
    for(i=0;i<n;i++){
        printf("P[%d] ",i+1);
        scanf("%d %d",&at[i],&bt[i]);
    }
    wt[0]=0;
    for(i=1;i<n;i++){
        wt[i]=wt[i-1]+bt[i-1];
    }
    for(i=0;i<n;i++){
        tat[i]=wt[i]+bt[i];
    }
    for(i=0;i<n;i++){
        total_wt=total_wt+wt[i];
        total_tat=total_tat+tat[i];
    }
    avg_wt=(float)total_wt/n;
    avg_tat=(float)total_tat/n;
    ct[0]=bt[0];
    for(i=1;i<n;i++){
        ct[i]=ct[i-1]+bt[i];

    }
    
    printf("Process\tArrival Time\tBurst Time\tWaiting Time\tTurn Around Time\tCompletion Time\n");
    for(i=0;i<n;i++){
        printf("P[%d]\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n",i+1,at[i],bt[i],wt[i],tat[i],ct[i]);
    }
    printf("Average Waiting Time: %f\n",avg_wt);
    printf("Average Turn Around Time: %f\n",avg_tat);

    return 0;
}