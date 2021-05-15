package example.com.pattern.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

enum LoginStatus {
    SUCCESS, FAILURE, INVALID, EXPIRED
}

@Data
class User {
    private String email;
    private String ip;
    private LoginStatus status;
}

    public class AccountService implements Subject {

    private User user;
    private List<Observer> observers = new ArrayList<Observer>();

    public AccountService(String email, String ip){
        user = new User();
        user.setEmail(email);
        user.setIp(ip);
    }

        @Override
        public void attach(Observer observer) {
            if(!observers.contains(observer))
                observers.add(observer);
        }

        @Override
        public void detach(Observer observer) {
            if(observers.contains(observer))
                observers.add(observer);
        }

        @Override
        public void notifyAllObserver() {
            Observable observable = null;
            for (Observer observer : observers) {
                observer.update(observable, user);
            }
        }
        public void changeStatus(LoginStatus status){
            user.setStatus(status);
            System.out.println("Status is changed");
            this.notifyAllObserver();
        }
        public void login(){
            if(!this.isValidEmail()){
                user.setStatus(LoginStatus.INVALID);
            }else if(this.isValidEmail()){
                user.setStatus(LoginStatus.SUCCESS);
            }else {
                user.setStatus(LoginStatus.FAILURE);
            }
            System.out.println("Login is handled");
            this.notifyAllObserver();
        }
        private boolean isValidIP(){
            return "127.0.0.1".equals(user.getIp());
        }
        private boolean isValidEmail(){
            return "quanganh.le@gmail.com".equalsIgnoreCase(user.getEmail());
        }
    }
