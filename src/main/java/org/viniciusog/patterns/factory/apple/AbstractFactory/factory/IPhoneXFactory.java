package org.viniciusog.patterns.factory.apple.AbstractFactory.factory;

import org.viniciusog.patterns.factory.apple.AbstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.iphone.IPhone;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.iphone.IPhoneX;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIphone(String level) {
        if ("standard".equals(level)) {
            return new IPhoneX(this.rules);
        } else if ("highEnd".equals(level)) {
            return new IPhoneXSMax(this.rules);
        }
        return null;
    }
}