package com.example.pu;

import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class points
{
    public void writecsv() throws IOException {

        File folder = new File(Environment.getExternalStorageDirectory()+ "/Tushar");
        Log.d(String.valueOf(folder), "herewer");
        boolean var = false;

        if (!folder.exists())
            var = folder.mkdir();

        System.out.println("" + var);
        final String filename = folder.toString() + "/" + "Test.csv";
        FileWriter fw = new FileWriter(filename);

        fw.append("No");
        fw.append(',');

        fw.append("code");
        fw.append(',');

        fw.append("nr");
        fw.append(',');

        fw.append("Orde");
        fw.append(',');

        fw.append("Da");
        fw.append(',');

        fw.append("Date");
        fw.append(',');

        fw.append("Leverancier");
        fw.append(',');

        fw.append("Baaln");
        fw.append(',');

        fw.append("asd");
        fw.append(',');

        fw.append("Kwaliteit");
        fw.append(',');

        fw.append("asd");
        fw.append(',');

        fw.append('\n');
        // fw.flush();
        fw.close();

    }

}