package scratch.cucumber.test;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.util.Collections.unmodifiableMap;
import static java.util.Collections.unmodifiableSet;

/**
 * Factory for getting Selenium {@link WebDriver} instances for the different browser.
 *
 * @author Karl Bennett
 */
public class WebDriverFactory {

    private WebDriverFactory() {
    }

    private static final Map<String, String> WEB_DRIVER_CLASS_NAMES = unmodifiableMap(
            new HashMap<String, String>() {{
                put("firefox", "org.openqa.selenium.firefox.FirefoxDriver");
                put("chrome", "org.openqa.selenium.chrome.ChromeDriver");
                put("ie", "org.openqa.selenium.ie.InternetExplorerDriver");
                put("phantonjs", "org.openqa.selenium.phantomjs.PhantomJSDriver");
            }});

    private static final Set<String> AVAILABLE_DRIVERS = unmodifiableSet(WEB_DRIVER_CLASS_NAMES.keySet());

    /**
     * Load the {@code WebDriver} for the supplied {@code name}.
     *
     * @param name the name of the required {@code WebDriver} e.g. firefox, chrome, ie, phantomjs...
     * @return the instantiated {@code WebDriver} in one for the supplied name exists.
     * @throws IllegalArgumentException if the supplied {@code name} doesn't match an available {@code WebDriver}.
     * @throws IllegalStateException    if the matching {@code WebDriver} isn't in the class path.
     */
    public static WebDriver loadWebDriver(String name) {

        if (!AVAILABLE_DRIVERS.contains(name)) {

            throw new IllegalArgumentException("no driver for name (" + name + ") found.");
        }

        try {
            return (WebDriver) Class.forName(WEB_DRIVER_CLASS_NAMES.get(name)).newInstance();

        } catch (InstantiationException e) {

            throw new IllegalStateException(e);

        } catch (IllegalAccessException e) {

            throw new IllegalStateException(e);

        } catch (ClassNotFoundException e) {

            throw new IllegalStateException(e);
        }
    }

    /**
     * @return a set containing the currently supported {@code WebDriver}s.
     */
    public static Set<String> getAvailableDrivers() {

        return AVAILABLE_DRIVERS;
    }
}
