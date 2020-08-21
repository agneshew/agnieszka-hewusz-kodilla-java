package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    @Override
    public String executeTask() {
        return "Task is executing";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return true;
    }

//    Następnie wymyśl, w jaki sposób przechowywać informację o tym, czy zadanie jest
//    już wykonane i napisz fabrykę TaskFactory,
//    która będzie tworzyła zadania zgodnie ze wzorcem Factory.
//    Kiedy kod będzie już gotowy, w
//    katalogu src/test/java utwórz pakiet com.kodilla.patterns.factory.tasks i
//    stwórz w nim zestaw testów TaskFactoryTestSuite
//    Napisz testy sprawdzające, czy fabryka w poprawny sposób tworzy różne typy zadań.
//    Stworzony kod prześlij do repozytorium GitHub.
}
