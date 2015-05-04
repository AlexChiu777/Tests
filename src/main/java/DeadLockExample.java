/**
 * Created by Alex on 5/3/2015.
 */
public class DeadLockExample {
    class Account {
        double balance;

        public void deposit (double amount) {
            balance += amount;
        }

        public void withdrawal (double amount) {
            balance -= amount;
        }

        public void transferFunds(Account from, Account to, double amount) {
            synchronized (from) {
                synchronized (to) {
                    from.withdrawal(amount);
                    to.deposit(amount);
                    //release to
                    //release from
                }
            }
        }

        //example of deadlock because there will always be 2 threads that come in and will try to access the resources in
        //reverse order

    }

}
