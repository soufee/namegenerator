package com.kapahgaiii;

import org.kohsuke.args4j.Option;

import java.io.Serializable;

public class CmdArguments implements Serializable {

    @Option(name = "--gender", usage = "Choose required gender")
    private Genders gender;

    @Option(name = "--length", usage = "Choose required name length")
    private byte length;

    @Option(name = "--count", usage = "How much names do we need")
    private int count;

    public Genders getGender() {
     return gender;
    }

    public CmdArguments(Genders gender, byte length, int count) {
        this.gender = gender;
        this.length = length;
        this.count = count;
    }

    public CmdArguments() {
        this(Genders.BOTH, (byte) 6, 1);
    }

    public byte getLength() {
        return length;
    }

    public int getCount() {
        return count;
    }
}