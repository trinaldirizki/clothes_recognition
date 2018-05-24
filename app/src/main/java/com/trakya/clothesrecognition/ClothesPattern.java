package com.trakya.clothesrecognition;

/**
 * Created by isma-ilou on 19.05.2018.
 */

public class ClothesPattern {
    private String polkadot;

    private String plaid;

    private String patternless;

    private String striped;

    private String irregular;

    public String getPolkadot ()
    {
        return polkadot;
    }

    public void setPolkadot (String polkadot)
    {
        this.polkadot = polkadot;
    }

    public String getPlaid ()
    {
        return plaid;
    }

    public void setPlaid (String plaid)
    {
        this.plaid = plaid;
    }

    public String getPatternless ()
    {
        return patternless;
    }

    public void setPatternless (String patternless)
    {
        this.patternless = patternless;
    }

    public String getStriped ()
    {
        return striped;
    }

    public void setStriped (String striped)
    {
        this.striped = striped;
    }

    public String getIrregular ()
    {
        return irregular;
    }

    public void setIrregular (String irregular)
    {
        this.irregular = irregular;
    }

    @Override
    public String toString()
    {
        return "Pattern: [polkadot = "+polkadot+", plaid = "+plaid+", patternless = "+patternless+", striped = "+striped+", irregular = "+irregular+"]";
    }
}
