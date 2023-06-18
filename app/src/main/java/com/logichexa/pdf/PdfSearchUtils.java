package com.logichexa.pdf;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.widget.Toast;
import java.io.IOException;
import java.io.InputStream;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PdfSearchUtils {
    public static void searchKeywordInPdf(Context context, String keyword) {
        try {
            Resources res = context.getResources();
            InputStream inputStream = res.openRawResource(R.raw.f810903); // Replace with your PDF file name

            PdfReader reader = new PdfReader(inputStream);
            int pageCount = reader.getNumberOfPages();

            for (int pageIndex = 1; pageIndex <= pageCount; pageIndex++) {
                String pageContent = PdfTextExtractor.getTextFromPage(reader, pageIndex);
                if (pageContent.contains(keyword)) {
                    Log.d("PdfSearch", "Keyword found in the PDF file.");
                    Toast.makeText(context,"Data found",Toast.LENGTH_LONG).show();
                    break;

                }
            }

            reader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
