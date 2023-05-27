// using SJF PRE-EMPTIVE
// Find out Completion time, Turn around time and waiting time for each process. Find average turn around time and average waiting time.

#include<stdio.h>
#include <math.h>

int main(){
    //pre-emptive
    int n, i;
    int burst_time[10], arrival_time[10], waiting_time[10], turn_around_time[10], completion_time[10], total_waiting_time = 0, total_turn_around_time = 0;
    float avg_waiting_time, avg_turn_around_time;
    printf("Enter number of processes: ");
    scanf("%d", &n);
    printf("Enter arrival time and burst time of each process:\n");
    for (i = 0; i < n; i++) {
        printf("P[%d] ", i + 1);
        scanf("%d %d", &arrival_time[i], &burst_time[i]);
    }
    waiting_time[0] = 0;
    for (i = 1; i < n; i++) {
        waiting_time[i] = 0;
        for (int j = 0; j < i; j++) {
            waiting_time[i] = waiting_time[i] + burst_time[j];
        }
        total_waiting_time = total_waiting_time + waiting_time[i];
    }
    for (i = 0; i < n; i++) {
        turn_around_time[i] = burst_time[i] + waiting_time[i];
        total_turn_around_time = total_turn_around_time + turn_around_time[i];
    }
    avg_waiting_time = (float) total_waiting_time / (float) n;
    avg_turn_around_time = (float) total_turn_around_time / (float) n;
    printf("Processes\tArrival Time\tBurst Time\tCompletion Time\tWaiting Time\tTurn Around Time\n");
    for (i = 0; i < n; i++) {
        completion_time[i] = burst_time[i] + waiting_time[i];
        printf("P[%d]\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", i + 1, arrival_time[i], burst_time[i], completion_time[i], waiting_time[i], turn_around_time[i]);
    }
    printf("Average Waiting Time = %f\n", avg_waiting_time);
    printf("Average Turn Around Time = %f\n", avg_turn_around_time);
    
    return 0;
}