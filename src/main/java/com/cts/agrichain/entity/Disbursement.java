package com.cts.agrichain.entity;

import java.time.LocalDate;

public class Disbursement {
    private int DisbursementID;
    private int FarmerID;
    private int ProgramID;
    private double disbursementAmount;
    private LocalDate disbursementDate;
    private DisbursementStatus disbursementStatus;
}
