package com.theschool.autotasker.models.task;

import java.time.LocalDateTime;

/**
 * Represents a task that is manually scheduled.
 */
public class ManualScheduledTask extends Task {
    private LocalDateTime dateTime;

    /**
     * Constructs a manually scheduled task.
     */
    public ManualScheduledTask() {
    }

    /**
     * Constructs a manually scheduled task with the provided paramaters.
     * @param name - the name of the task.
     * @param dateTime - the date and time of the task.
     */
    public ManualScheduledTask(String name, LocalDateTime dateTime) {
        super(name);
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
