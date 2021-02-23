package com.assertj;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Todo {
    private final String name;
    private final String description;
    private TASK_STATUS taskStatus;
    private int passedDay;
    private final int estimate;

    public void passedDay() {
        this.passedDay++;
    }

    public void next() {
        switch (this.taskStatus) {
            case TODO:
                this.taskStatus = TASK_STATUS.DOING;
                break;
            case DOING:
                this.taskStatus = TASK_STATUS.DONE;
                break;
            default:
                break;
        }
    }
}
