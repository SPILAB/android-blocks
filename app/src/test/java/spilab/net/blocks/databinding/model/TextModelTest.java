package spilab.net.blocks.databinding.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TextModelTest {

    private static final String USER_NAME = "Marius";
    private TextModel textModel;

    @Before
    public void setUp() {
        textModel = new TextModel();
    }

    @Test
    public void GIVEN_user_name_WHEN_set_model_THEN_should_keep_the_value() {
        textModel.setUserName(USER_NAME);
        Assert.assertEquals(USER_NAME, textModel.getUserName());
    }

    @Test
    public void GIVEN_model_with_an_user_name_WHEN_build_hello_text_THEN_should_say_hello_with_user_name() {
        textModel.setUserName(USER_NAME);
        Assert.assertEquals("Hello Marius!", textModel.buildHelloText());
    }

    @Test
    public void GIVEN_model_with_an_user_name_WHEN_build_question_THEN_should_say_how_are_you_with_user_name() {
        textModel.setUserName(USER_NAME);
        Assert.assertEquals("How are you Marius?", textModel.buildQuestionText());
    }
}