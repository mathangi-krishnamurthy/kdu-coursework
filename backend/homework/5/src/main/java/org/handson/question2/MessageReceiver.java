package org.handson.question2;

import org.handson.MyLogger;

public class MessageReceiver implements Runnable{


    private String consumerDetails;
    MessageQueue queue = MessageQueue.getInstance();
    MessageReceiver(String consumerDetails)
    {
        this.consumerDetails=consumerDetails;
    }
    public void run()
    {
        try{
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            MyLogger.customLogger("Error in sleeping: "+e, "ERROR");
            Thread.currentThread().interrupt();
        }
        MyLogger.customLogger("Entering Run of Message Reciever", "INFO");
        MyLogger.customLogger(consumerDetails + queue.getMessage(),"DEBUG");
    }

}
