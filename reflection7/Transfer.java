package week7Exercises.reflection7;

public class Transfer {

    public void transfer (Bank bank){

        Integer salary = bank.getSalary();
        Integer account = bank.getAccount();
        System.out.println("Transfer successful: "+ salary + " to account " + account);
    }
}
