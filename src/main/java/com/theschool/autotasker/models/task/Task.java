package com.theschool.autotasker.models.task;

import java.util.Objects;

/**
 * Represents a task.
 */
public abstract class Task {
    private Long id;
    private String name;
    private boolean inProgress;
    private boolean overDue;

    /**
     * Constructs a task.
     */
    public Task() {
    }

    /**
     * Constructs a task with the provided name.
     * @param name the name of the task.
     */
    public Task(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInProgress() {
        return inProgress;
    }

    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }

    public boolean isOverDue() {
        return overDue;
    }

    public void setOverDue(boolean overDue) {
        this.overDue = overDue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(getId(), task.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
