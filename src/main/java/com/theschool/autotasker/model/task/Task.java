package com.theschool.autotasker.model.task;

import javax.validation.constraints.*;
import java.time.*;
import java.util.*;

/**
 * The {@code Task} class is the superclass of all tasks.
 * <p>
 * This class represents a generic task.
 * A {@code Task} is (at its basic level) characterized by its identifier (unique), name, and an optional description.
 *
 * @author Thomas Munguya
 */
public class Task {
    /**
     * The unique identifier of the task.
     */
    @NotNull
    private Long id;

    /**
     * The name of the task.
     */
    @NotNull @Size(min = 1, max = 25)
    protected String name;

    /**
     * The start date time of the task.
     * For instances of {@code AutoScheduledTask} the start date time represents the next start date time of the task.
     */
    protected LocalDateTime startDateTime;

    /**
     * Whether the task is in progress.
     */
    protected boolean inProgress;

    /**
     * Whether the task is overdue.
     */
    protected boolean overDue;

    /**
     * The description of the task.
     */
    @Size(max = 45)
    protected String description;

    /**
     * Constructs a {@code Task}.
     */
    public Task() {
    }

    /**
     * Constructs a {code Task} with the provided name.
     * @param name the name of the task.
     */
    public Task (String name) {
        setName(name);
    }

    /**
     * Constructs a task with the provided {@code name} and {@code description}.
     * @param name the name of the task.
     * @param description the description of the task.
     */
    public Task(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public Task(String name, String description, LocalDateTime startDateTime) {
        setName(name);
        setDescription(description);
        setStartDateTime(startDateTime);
    }

    /**
     * Returns the identifier of the task.
     * @return the identifier of the task.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the identifier of the task.
     * @param id the identifier
     * @throws IllegalArgumentException if {@code id} is {@code null}.
     */
    public void setId(Long id) {
        if(id == null) {
            throw new IllegalArgumentException("Invalid value provided for id");
        }
        this.id = id;
    }


    /**
     * Returns the name of the task.
     * @return the name of the task.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the task.
     * @param name the name of the task.
     * @throws IllegalArgumentException if {@code name} is null or empty.
     */
    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid value provided for name.");
        }
        this.name = name;
    }

    /**
     * Returns the description of the task.
     * @return the description of the task.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the task.
     * @param description the description of the task.
     * @throws IllegalArgumentException if {@code description} is {@code null}.
     */
    public void setDescription(String description) {
        if(description == null) {
            throw new IllegalArgumentException("Invalid value provided for description.");
        }
        this.description = description;
    }

    /**
     * Returns the start date-time of the task.
     * @return the start date-time of the task.
     */
    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the start date-time of the task.
     * @param startDateTime the start-date time.
     * @throws IllegalArgumentException if {@code startDateTime} is {@code null} or in the past.
     */
    public void setStartDateTime(LocalDateTime startDateTime) {
        if(startDateTime == null || startDateTime.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Invalid value provided for start date time.");
        }
        this.startDateTime = startDateTime;
    }

    /**
     * Returns whether the task is in progress.
     * @return {@code true} if the task is progress, or {@code false} otherwise.
     */
    public boolean isInProgress() {
        return inProgress;
    }

    /**
     * Sets whether the task is in progress.
     * @param inProgress whether the task is in progress.
     */
    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }

    /**
     * Returns whether the task is overdue.
     * @return {@code true} if the task is overdue, or {@code false} otherwise.
     */
    public boolean isOverDue() {
        return overDue;
    }

    /**
     * Sets whether the task is overdue.
     * @param overDue whether the task is overdue.
     */
    public void setOverDue(boolean overDue) {
        this.overDue = overDue;
    }

    /**
     * Checks if this task is equal to another task.
     * @param o the object to check, {@code null} returns {@code false}.
     * @return {@code true} if this task is equal to the other task.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(getId(), task.getId());
    }

    /**
     * Returns the hash code for this task.
     * @return a suitable hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
