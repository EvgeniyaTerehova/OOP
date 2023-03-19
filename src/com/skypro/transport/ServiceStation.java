package com.skypro.transport;

import java.util.Objects;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queueToService;

    public ServiceStation(Queue<Transport> queueToService) {
        this.queueToService = queueToService;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceStation that = (ServiceStation) o;
        return queueToService.equals(that.queueToService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueToService);
    }

    @Override
    public String toString() {
        return  "ServiceStation{" + "queueToService=" + queueToService +
                '}';
    }
}
