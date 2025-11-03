package org.example;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private
    public void bookDevice(Employee employee, Device device){
        employee.rentDevice(device);
    }

    public void relaseDevice(Employee employee, Device device){}


}


class Employee{
    String name;
    String surname;
    String role;
    List<Device> devices = new ArrayList<>();


    public Employee(String name, String surname, String role){
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

    public void rentDevice(Device device){
        devices.add(device);
        device.rentDevice();
    }

}


class Device{
    String name;
    String manufacturer;
    String type;
    boolean isRented = false;

    public Device(String name, String manufacturer, String model){
        this.name = name;
        this.manufacturer = manufacturer;
        this.type = model;
    }

    public void rentDevice(){
        this.isRented = true;
    }
}