package com.theschool.autotasker.model.task;

import javax.validation.constraints.*;

/**
 * The {@code AutoScheduledTask} class represents a task that is automatically scheduled.
 * <p>
 * An auto-scheduled task is characterized by the following properties:
 * <ul>
 *     <li>The time to the task's deadline - the number of milliseconds until the task's deadline.
 *     <li>A priority, an integer between 1 (inclusive) and 5 (inclusive). The lower the number, the higher the priority.
 *     <li>A difficulty, an integer between 1 (inclusive) and 5 (inclusive) representing how difficult a task is to
 *         perform. The higher the number, the more difficult the task is to perform.
 * </ul>
 *
 * @author Thomas Munguya.
 *
 */
public final class AutoScheduledTask extends Task implements Comparable<AutoScheduledTask> {

    /**
     * The time till the task's deadline.
     */
    private long timeToDeadline;

    /**
     * The priority of the task.
     * This is a number between 1 (inclusive) and 5 (inclusive).
     * The lower the number, the higher the priority.
     */
    @Size(min = 1, max = 5)
    private int priority;

    /**
     * The difficulty level of the task.
     * This represents how difficult the task is to perform.
     * It is a number between 1 (inclusive) and 5 (inclusive). The higher the number, the more difficult a task is to
     * perform.
     */
    @Size(min = 1, max = 5)
    private int difficulty;

    /**
     * The schedule score of the task.
     * This represents the score of a task on the schedule after performing parameter calculations.
     * The higher the score, the sooner the task will be scheduled.
     */
    private double scheduleScore;

    /**
     * How long the task will run when it is next scheduled.
     */
    @Size(min = 1000)
    private long lengthOfNextSchedule;

    /**
     * Constructs an auto-scheduled {@code Task}.
     */
    public AutoScheduledTask() {
        super();
    }

    /**
     * Constructs an {@code AutoScheduledTask} with the provided arguments.
     * @param name the name of the task.
     * @param timeToDeadline how long until the deadline of the task.
     * @param priority the priority of the task.
     * @param difficulty the difficulty of the task.
     */
    public AutoScheduledTask(String name, long timeToDeadline, int priority, int difficulty) {
        super(name);
        this.timeToDeadline = timeToDeadline;
        this.priority = priority;
        this.difficulty = difficulty;
    }

    /**
     * Returns the time to the deadline of the task.
     * @return the time to deadline.
     */
    public long getTimeToDeadline() {
        return timeToDeadline;
    }

    /**
     * Returns the priority of the task.
     * @return the priority.
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Returns the difficulty of the task.
     * @return the difficulty.
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * Returns the schedule score of the task.
     * @return the schedule score.
     */
    public double getScheduleScore() {
        return scheduleScore;
    }

    /**
     * Returns the length of the task when it is next scheduled.
     * @return the length of the next schedule.
     */
    public long getLengthOfNextSchedule() {
        return lengthOfNextSchedule;
    }

    /**
     * Sets how long (in milliseconds) until the task's deadline.
     * @param timeToDeadline the time to the deadline.
     * @throws IllegalArgumentException if {@code timeToDeadline} is less than 0.
     */
    public void setTimeToDeadline(long timeToDeadline) {
        if(timeToDeadline < 0) {
            throw new IllegalArgumentException("Invalid value provided for time to deadline.");
        }
        this.timeToDeadline = timeToDeadline;
    }

    /**
     * Sets the priority of the task.
     * @param priority the priority.
     * @throws IllegalArgumentException if {@code priority} is not between 1 (inclusive) and 5 (inclusive).
     */
    public void setPriority(int priority) {
        if(priority < 1 || priority > 5) {
            throw new IllegalArgumentException("Invalid value provided for priority.");
        }
        this.priority = priority;
    }

    /**
     * Sets the difficulty of the task.
     * @param difficulty the difficulty.
     * @throws IllegalArgumentException if {@code difficulty} is not between 1 (inclusive) and 5 (inclusive).
     */
    public void setDifficulty(int difficulty) {
        if(difficulty < 1 || difficulty > 5) {
            throw new IllegalArgumentException("Invalid value provided for difficulty.");
        }
        this.difficulty = difficulty;
    }

    /**
     * Sets the schedule score of the task.
     * @param scheduleScore the schedule score.
     * @throws IllegalArgumentException if {@code scheduleScore} is less than 0.
     */
    public void setScheduleScore(double scheduleScore) {
        if(scheduleScore < 0) {
            throw new IllegalArgumentException("Invalid value provided for schedule score.");
        }
        this.scheduleScore = scheduleScore;
    }

    /**
     * Sets the length of the next task schedule.
     * @param lengthOfNextSchedule the length of next schedule.
     * @throws IllegalArgumentException if {@code lengthOfNextSchedule} is less than 0.
     */
    public void setLengthOfNextSchedule(long lengthOfNextSchedule) {
        this.lengthOfNextSchedule = lengthOfNextSchedule;
    }

    @Override
    public int compareTo(AutoScheduledTask o) {
        return getStartDateTime().compareTo(o.getStartDateTime());
    }

    /**
     * Checks whether this {@code AutoScheduledTask} is equal to the other {@code AutoScheduledTask}.
     * @param o the object to check, {@code null} returns {@code false}.
     * @return {@code true} if this {@code AutoScheduledTask} is equal to the other {@code AutoScheduledTask}.
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    /**
     * Returns a hash code for this {@code AutoScheduledTask}.
     * @return a suitable hash code.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
