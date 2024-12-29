package com.system.parkinglot.model.entities;

import java.sql.Time;

public class Ticket {
    String ticketId;
    Vehicle vehicle;
    Operator operator;
    Gate gate;
    Time entryTime;
}
