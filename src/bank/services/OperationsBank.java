package bank.services;

public interface OperationsBank {
    void deposit(Long account, Long amount);
    void withdraw(Long account, String passwd, Long amount);
    void changePassword(Long account, String oldPassword, String newPassword);
}
