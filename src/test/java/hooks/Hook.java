package hooks;

import contex.TestContext;
import io.cucumber.java.After;

public class Hook {

    private TestContext context;

    public Hook(TestContext context) {
        this.context = context;
    }

    @After
    public void closeBrowser() {
        context.quitDriver();
    }
}
