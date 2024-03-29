package com.example.demo.help;

import java.util.Date;

public class Generater {


    public String toSet(String field){
        return "set" + field.substring(0,1).toUpperCase() + field.substring(1);
    }

    public String toGet(String field){
        return "get" + field.substring(0,1).toUpperCase() + field.substring(1);
    }

    public StringBuilder getMappingCode(String[] fields, String objectName){
        StringBuilder str = new StringBuilder();
        for (String field : fields){
            str.append("_" + objectName + ".");
            str.append(toSet(field)+"(");
            str.append(objectName + ".");
            str.append(toGet(field)+"());");
            str.append(System.lineSeparator());
        }

        return str;
    }

    public StringBuilder getConstructingCode(String[] fields, String objectName){
        StringBuilder str = new StringBuilder();
        for (String field : fields){
            str.append(objectName+  ".");
            str.append(toGet(field)+"(),");
        }

        return str;
    }

    public static void replaceAll(StringBuilder builder, String from, String to)
    {
        int index = builder.indexOf(from);
        while (index != -1)
        {
            builder.replace(index, index + from.length(), to);
            index += to.length(); // Move to the end of the replacement
            index = builder.indexOf(from, index);
        }
    }

    public static StringBuilder getControllerCode(StringBuilder builder, String className, String entityName)
    {
        replaceAll(builder, "BasicInfo", className);
        replaceAll(builder, "basicInfo", entityName);
        return builder;
    }

    public static StringBuilder getFindByCode(StringBuilder builder, String className, String entityName)
    {
        replaceAll(builder, "Boston", className);
        replaceAll(builder, "boston", entityName);
        return builder;
    }

    public static  void main(String[] argv) throws Exception{

//        System.out.println(getControllerCode(Field.originalControllerCode(), "DailyLife", "dailyLife"));

        Generater generator = new Generater();
//        System.out.println(generator.getConstructingCode(Field.otherFields, "other"));
//        System.out.println(generator.getMappingCode(Field.otherFields, "other"));

        System.out.println(generator.getConstructingCode(Field.dailylifeFields, "dailyLife"));

    }

}
