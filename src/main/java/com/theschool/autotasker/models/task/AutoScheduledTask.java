package com.theschool.autotasker.models.task;

import com.theschool.autotasker.models.time.TimeToDeadline;
import java.time.LocalDateTime;

/**
 * Represents a task that is automatically scheduled.
 */
public class AutoScheduledTask extends Task {
    private TimeToDeadline timeToDeadline;
    private int priority;
    private int difficulty;
    private double scheduleScore;
    private int lengthOfNextSchedule;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public AutoScheduledTask() {
        super();
    }

    public AutoScheduledTask(String name, TimeToDeadline timeToDeadline, int priority, int difficulty) {
        super(name);
        this.timeToDeadline = timeToDeadline;
        this.priority = priority;
        this.difficulty = difficulty;
    }

    public TimeToDeadline getTimeToDeadline() {
        return timeToDeadline;
    }

    public int getPriority() {
        return priority;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public double getScheduleScore() {
        return scheduleScore;
    }

    public int getLengthOfNextSchedule() {
        return lengthOfNextSchedule;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}
