package org.workshop.code.liskov;

import java.math.BigDecimal;

public class MethodSignatures {

    public class Super {
        public Number doSomething(Integer i) throws NumberFormatException {
            return new Float(2.2);
        }

        public class SubClass extends Super {
            // java doesn't support contravariance
            public BigDecimal doSomething(Number n) {
                return new BigDecimal(5);
            }

            @Override
            public BigDecimal doSomething(Integer i) throws NumberFormatException /*, CloneNotSupportedException */{
                return doSomething((Number)i);
            }
        }
    }
}
