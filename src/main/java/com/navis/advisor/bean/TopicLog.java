package com.navis.advisor.bean;

/**
 * This POJO represents the section of log entry about the AMQ topic consumers
 */
public class TopicLog {
    private String hostName;
    private String queueSize;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(String queueSize) {
        this.queueSize = queueSize;
    }
}
