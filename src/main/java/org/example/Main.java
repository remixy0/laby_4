package org.example;


public class Main {
    public static void main(String[] args) {
    Server server = new Server();
    server.addHardDrive(new HardDrive());
    server.addHardDrive(new HardDrive(2048,800,"HDD"));
    server.showHardwareInfo();

    Server server_2 = new Server(21212121,128,64);
    server_2.addHardDrive(new HardDrive(4096,4000,"SSD"));
    server_2.addHardDrive(new HardDrive(1024,650,"HDD"));
    server_2.showHardwareInfo();

    AdminPanel adminPanel = new AdminPanel();
    adminPanel.addUser(new UserAccount("marek","haslo123"));
    adminPanel.showUsers();


    }
}