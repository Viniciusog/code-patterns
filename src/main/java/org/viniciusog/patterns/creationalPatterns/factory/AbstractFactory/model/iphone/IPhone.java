package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.iphone;

import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;

public abstract class IPhone {

    private CountryRulesAbstractFactory rules;

    public IPhone(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println("Testing all certificates");
        System.out.println(rules.getCertificate().applyCertification());
    }

    public void pack() {
        System.out.println("Packing the device");
        System.out.println(rules.getPacking().pack());
    }
}