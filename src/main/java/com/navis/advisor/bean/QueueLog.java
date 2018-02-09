package com.navis.advisor.bean;

/**
 * This POJO represents the section in the log entry about the AMQ queues
 */
public class QueueLog {
    private String queueName;
    private String queueSize;
    private String inFlight;
    private String enqRate;
    private String deqRate;

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(String queueSize) {
        this.queueSize = queueSize;
    }

    public String getInFlight() {
        return inFlight;
    }

    public void setInFlight(String inFlight) {
        this.inFlight = inFlight;
    }

    public String getEnqRate() {
        return enqRate;
    }

    public void setEnqRate(String enqRate) {
        this.enqRate = enqRate;
    }

    public String getDeqRate() {
        return deqRate;
    }

    public void setDeqRate(String deqRate) {
        this.deqRate = deqRate;
    }

    @Override
    public String toString() {
        return "{ queueName:" + queueName + " queueSize:" + queueSize + " inFlight:" + inFlight +
                " enqRate:" + enqRate + " deqRate:" + deqRate + " }";
    }
}
