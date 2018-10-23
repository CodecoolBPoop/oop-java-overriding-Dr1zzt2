package com.codecool.uml.overriding;

public class Order implements Orderable {
    private static int ID_COUNTER = 0;
    private int id;
    private String status;

    public Order() {
        this.id = ID_COUNTER++;
        this.status = "new";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public boolean checkout() {
        if (this.status.equals("new")) {
            this.status = "checked";
            return true;
        } else {
            return false;
        }
    }

    public boolean pay() {
        if (this.status.equals("checked")) {
            this.status = "payed";
            return true;
        } else {
            return false;
        }
    }
}
