import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BuildTextObjectServiceTest {
    @Test
    public void parseParagraphTest(){
        String paragraph="ПРивет пока досвидос. Один, два, три, пять!";
        Paragraph rezult = new BuildTextObjectService().parseParagraph(paragraph);

        Paragraph expected = new Paragraph();
        Sentence sentence1 = new Sentence();
        Sentence sentence2 = new Sentence();
        Word word = new Word("ПРивет");
        Word word1 = new Word("пока");
        Word word2 = new Word("досвидос");
        sentence1.setWords(Arrays.asList(word,word1,word2));

        Word word4 = new Word("Один,");
        Word word5 = new Word("два,");
        Word word6 = new Word("три,");
        Word word7 = new Word("пять");
        sentence2.setWords(Arrays.asList(word4,word5,word6,word7));
        expected.setSentences(Arrays.asList(sentence1,sentence2));

        assertEquals(expected, rezult);
    }
}