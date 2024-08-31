import gt.edu.miumg.TampleteMethod.FormatoArchivo;
import gt.edu.miumg.TampleteMethod.PDF;
import gt.edu.miumg.TampleteMethod.TEXT;
import gt.edu.miumg.TampleteMethod.Word;
import org.w3c.dom.Text;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FormatoArchivo pdf = new PDF();
        FormatoArchivo word = new Word();
        FormatoArchivo text = new TEXT();
        pdf.templete();
        word.templete();
        text.templete();


    }
}