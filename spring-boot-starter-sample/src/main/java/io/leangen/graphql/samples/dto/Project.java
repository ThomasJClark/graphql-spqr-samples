package io.leangen.graphql.samples.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private final String code;
    private final String name;
    private final List<Task> tasks;
    private final Tags tags;

    public Project(String name) {
        this(null, name, new ArrayList<>(), new Tags());
    }

    @JsonCreator
    public Project(String code, String name, List<Task> tasks, Tags tags) {
        this.code = code;
        this.name = name;
        this.tasks = tasks;
        this.tags = tags;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void addTag(String tag) {
        this.tags.add(tag);
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Tags getTags() {
        return tags;
    }
}
