// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 3.2.1.6 by WSRD Tencent.
// Generated from `Beacon.jce'
// **********************************************************************

package BEC;

public final class E_FUND_INVEST_STYLE implements java.io.Serializable
{
    private static E_FUND_INVEST_STYLE[] __values = new E_FUND_INVEST_STYLE[4];
    private int __value;
    private String __T = new String();

    public static final int _E_FIS_OTHERS = 0;
    public static final E_FUND_INVEST_STYLE E_FIS_OTHERS = new E_FUND_INVEST_STYLE(0,_E_FIS_OTHERS,"E_FIS_OTHERS");
    public static final int _E_FIS_GROWTH = 1;
    public static final E_FUND_INVEST_STYLE E_FIS_GROWTH = new E_FUND_INVEST_STYLE(1,_E_FIS_GROWTH,"E_FIS_GROWTH");
    public static final int _E_FIS_VALUE = 2;
    public static final E_FUND_INVEST_STYLE E_FIS_VALUE = new E_FUND_INVEST_STYLE(2,_E_FIS_VALUE,"E_FIS_VALUE");
    public static final int _E_FIS_BALNACE = 3;
    public static final E_FUND_INVEST_STYLE E_FIS_BALNACE = new E_FUND_INVEST_STYLE(3,_E_FIS_BALNACE,"E_FIS_BALNACE");

    public static E_FUND_INVEST_STYLE convert(int val)
    {
        for(int __i = 0; __i < __values.length; ++__i)
        {
            if(__values[__i].value() == val)
            {
                return __values[__i];
            }
        }
        assert false;
        return null;
    }

    public static E_FUND_INVEST_STYLE convert(String val)
    {
        for(int __i = 0; __i < __values.length; ++__i)
        {
            if(__values[__i].toString().equals(val))
            {
                return __values[__i];
            }
        }
        assert false;
        return null;
    }

    public int value()
    {
        return __value;
    }

    public String toString()
    {
        return __T;
    }

    private E_FUND_INVEST_STYLE(int index, int val, String s)
    {
        __T = s;
        __value = val;
        __values[index] = this;
    }

}
