package com.skypro.transport;

import java.util.Queue;

public class ServiceStation {

    private static String aiiTransport;
    private Queue<Transport> queueToService;

    public ServiceStation(String aiiTransport, Queue<Transport> queueToService) {
        this.aiiTransport = aiiTransport;
        this.queueToService = queueToService;
    }
    public static String getAiiTransport() {
        return aiiTransport;
    }
    public void setAiiTransport(Transport aiiTransport) {
        this.aiiTransport = ServiceStation.aiiTransport;
    }

    public void addACarToTheQueue(){
        System.out.println("Добавить авто в очередь");
   }
   public String carryOutATechnicalInspectionOfTheCar(){
        System.out.println("Техосмотр прошли: " + aiiTransport);
       return null;
   }
    @Override
    public String toString() {
        return "ServiceStation, aiiTransport: " + aiiTransport;
    }
    public Queue<Transport> getQueueToService() {
        return queueToService;
    }
    public void setQueueToService(Queue<Transport> queueToService) {
        this.queueToService = queueToService;
    }
}
