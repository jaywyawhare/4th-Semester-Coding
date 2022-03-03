// using ROUND ROBIN 
// Find out Completion time, Turn around time and waiting time for each process. Find average turn around time and average waiting time.
// Time Slice=2

#include<stdio.h>

int main(){
    //round robin
    int n, i, j, time_slice, time_quantum, time_remaining[10], time_elapsed[10], time_spent[10], time_remaining_copy[10], time_elapsed_copy[10], time_spent_copy[10];
    int burst_time[10], arrival_time[10], waiting_time[10], turn_around_time[10], completion_time[10], total_waiting_time = 0, total_turn_around_time = 0;
    float avg_waiting_time, avg_turn_around_time;
    printf("Enter number of processes: ");
    scanf("%d", &n);
    printf("Enter arrival time and burst time of each process:\n");
    for (i = 0; i < n; i++) {
        printf("P[%d] ", i + 1);
        scanf("%d %d", &arrival_time[i], &burst_time[i]);
    }
    printf("Enter time slice: ");
    scanf("%d", &time_slice);
    // Calculate waiting time for each process
    time_remaining[0] = burst_time[0];
    time_elapsed[0] = 0;
    time_spent[0] = 0;
    for (i = 1; i < n; i++) {
        time_remaining[i] = burst_time[i];
        time_elapsed[i] = 0;
        time_spent[i] = 0;
    }
    // Calculate turn around time for each process
    for (i = 0; i < n; i++) {
        turn_around_time[i] = burst_time[i] + waiting_time[i];
        total_turn_around_time = total_turn_around_time + turn_around_time[i];
    }
    // Calculate average waiting time
    avg_waiting_time = (float) total_waiting_time / (float) n;
    // Calculate average turn around time
    avg_turn_around_time = (float) total_turn_around_time / (float) n;
    // Print the process ID, arrival time, burst time, completion time, waiting time, turn around time
    printf("Processes\tArrival Time\tBurst Time\tCompletion Time\tWaiting Time\tTurn Around Time\n");
    for (i = 0; i < n; i++) {
        completion_time[i] = burst_time[i] + waiting_time[i];
        printf("P[%d]\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", i + 1, arrival_time[i], burst_time[i], completion_time[i], waiting_time[i], turn_around_time[i]);
    }
    printf("Average Waiting Time = %f\n", avg_waiting_time);
    printf("Average Turn Around Time = %f\n", avg_turn_around_time);
    
    return 0;
}