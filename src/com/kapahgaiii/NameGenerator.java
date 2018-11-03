package com.kapahgaiii;


import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

public class NameGenerator {

    public String getName(String[] args) {

        CmdArguments cmdArguments = new CmdArguments();
        Engine engine = new Engine();

        if (cmdArguments.getGender() != Genders.BOTH) {//default loaded both. If not,
            engine.clearData();//clear data and
            engine.readData(cmdArguments.getGender().getSrc());//load only male or female
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < cmdArguments.getCount(); i++) {

            builder.append(engine.generateName(cmdArguments.getLength()));
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        System.out.println(new NameGenerator().getName(args));
    }
}
