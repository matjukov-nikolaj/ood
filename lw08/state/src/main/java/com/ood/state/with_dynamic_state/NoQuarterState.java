package com.ood.state.with_dynamic_state;

import com.ood.exception.WrongAmountException;

public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.getQuartersController().addQuarter();
        gumballMachine.setHasQuarterState();
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispence() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }

    @Override
    public void refill(int ballsCount) throws WrongAmountException {
        if (ballsCount < 0) {
            throw new WrongAmountException("Count of gumballs cant be less than zero.");
        }
        gumballMachine.setBallsCount(ballsCount);
        if (gumballMachine.getBallCount() == 0) {
            gumballMachine.setSoldOutState();
        }
    }
}