import org.junit.Test;

import static org.junit.Assert.*;

public class BuildTextObjectServiceTest {

    @Test
    public void parseParagraphTest(){
        String paragraph="ПРивет пока досвидос. Один, два, три, пять!";
        Paragraph rezult = new BuildTextObjectService().parseParagraph(paragraph);
        Paragraph expected = new Paragraph();
        Sentence sentence1 = new Sentence();
        Sentence sentence2 = new Sentence();
        Word word = new Word();
        Word word1 = new Word();
        Word word2 = new Word();
        Word word3 = new Word();
        Word word4 = new Word();
        Word word5 = new Word();
        Word word6 = new Word();
    }

}