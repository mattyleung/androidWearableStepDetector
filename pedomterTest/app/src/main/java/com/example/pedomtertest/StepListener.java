package com.example.pedomtertest;

/**
 * The interface Step listener.
 */
// Will listen to step alerts
public interface StepListener {

    /**
     * Step.
     *
     * @param timeNs the time ns
     */
    public void step(long timeNs);

}