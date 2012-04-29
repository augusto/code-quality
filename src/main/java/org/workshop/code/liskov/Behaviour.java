package org.workshop.code.liskov;

/**
 * Created with IntelliJ IDEA.
 * User: Augusto
 * Date: 29/04/12
 * Time: 11:17
 * To change this template use File | Settings | File Templates.
 */
public class Behaviour {

    class User {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class ValitatorRespose {
        private final Boolean response;

        ValitatorRespose(Boolean response) {
            this.response = response;
        }

        public Boolean getResponse() {
            return response;
        }
    }

    class UserValidator {
        public ValitatorRespose validate(User user) {
            boolean isValid = user.getName().length() > 6;
            return new ValitatorRespose(isValid);
        }
    }

    class BrokenUserValidator {
        public ValitatorRespose validate(User user) {
            user.setName(user.getName().toUpperCase());

            ValitatorRespose response;
            if( user.getName().length() < 2) {
                response = new ValitatorRespose(false);
            } else if( user.getName().length()  < 10) {
                response = new ValitatorRespose(true);
            } else {
                response = new ValitatorRespose(null);
            }

            return response;
        }
    }



}
