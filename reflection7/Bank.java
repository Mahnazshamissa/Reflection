package week7Exercises.reflection7;

public class Bank {
    private Integer salary;
    private Integer account;

    public Bank(Integer salary, Integer account) {
        this.salary = salary;
        this.account = account;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getAccount() {
        return account;
    }
}
