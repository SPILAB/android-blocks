package spilab.net.blocks.databinding.viewmodel;

import android.databinding.ObservableField;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import spilab.net.blocks.databinding.model.TextModel;

@RunWith(AndroidJUnit4.class)
public class TextViewModelTest {

    private static final String USER_NAME = "Xavier";
    private TextViewModel speakViewModel;

    @Mock
    private TextModel mockTextModel;
    @Mock
    private ObservableField<String> mockText;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        speakViewModel = new TextViewModel(mockTextModel, mockText);
    }

    @Test
    public void GIVEN_a_text_view_model_WHEN_set_an_user_name_THEN_set_model_user_name() {
        speakViewModel.setUserName(USER_NAME);
        Mockito.verify(mockTextModel).setUserName(USER_NAME);
    }

    @Test
    public void GIVEN_a_text_view_model_WHEN_get_an_user_name_THEN_get_model_user_name() {
        Mockito.when(mockTextModel.getUserName()).thenReturn(USER_NAME);
        Assert.assertEquals(USER_NAME, speakViewModel.getUserName());
    }

    @Test
    public void GIVEN_a_text_view_model_WHEN_get_current_user_name_THEN_create_text_for_ui_with_user_name() {
        Mockito.when(mockTextModel.getUserName()).thenReturn(USER_NAME);
        Assert.assertEquals("Your name is " + USER_NAME, speakViewModel.getCurrentUserName());
    }

    @Test
    public void GIVEN_a_text_view_model_WHEN_say_hello_is_pressed_THEN_update_observable_text() {
        Mockito.when(mockTextModel.getUserName()).thenReturn(USER_NAME);
        Mockito.verify(mockText).set("Hello " + USER_NAME + "!");
    }

    @Test
    public void GIVEN_a_text_view_model_WHEN_ask_question_is_pressed_THEN_update_observable_text() {
        Mockito.when(mockTextModel.getUserName()).thenReturn(USER_NAME);
        Mockito.verify(mockText).set("How are you " + USER_NAME + "?");
    }
}