package com.sda.mvc.controler;

import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.view.GiantView;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

public class GiantControllerTest {

    @Test
    public void setHealth() {
        final GiantModel model = mock(GiantModel.class);
        final GiantView view = mock(GiantView.class);
        final GiantController controller = new GiantController(model, view);
        verifyZeroInteractions(model, view);
        for (Health health : Health.values()) {
            System.out.println(health.toString());
            controller.setHealth(health);
            verify(model).setHealth(health);
        }
    }
}