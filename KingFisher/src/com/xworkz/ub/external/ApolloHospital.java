package com.xworkz.ub.external;

import com.xworkz.ub.internal.rule.Hospital;

public class ApolloHospital implements Hospital {


    @Override
    public void clean() {
        System.out.println("running clean in ApolloHospital...");
    }
}
