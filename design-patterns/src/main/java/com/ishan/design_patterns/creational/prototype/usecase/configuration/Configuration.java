package com.ishan.design_patterns.creational.prototype.usecase.configuration;

/**
 * Concrete Prototype representing application configuration.
 *
 * <p>
 * Design:
 * - Immutable (safe for reuse as a prototype)
 * - copy() performs controlled cloning
 * </p>
 */
public class Configuration implements Prototype<Configuration> {

    private final String themeColor;
    private final Boolean autoSave;
    private final String language;
    private final Boolean darkMode;
    private final Integer fontSize;
    private final String fontFamily;
    private final ConfigurationType type;

    public Configuration(String themeColor,
                         Boolean autoSave,
                         String language,
                         Boolean darkMode,
                         Integer fontSize,
                         String fontFamily,
                         ConfigurationType type) {
        this.themeColor = themeColor;
        this.autoSave = autoSave;
        this.language = language;
        this.darkMode = darkMode;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.type = type;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public Boolean getAutoSave() {
        return autoSave;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public ConfigurationType getType() {
        return type;
    }

    /**
     * Prototype cloning logic.
     */
    @Override
    public Configuration copy() {
        return new Configuration(
                themeColor,
                autoSave,
                language,
                darkMode,
                fontSize,
                fontFamily,
                type
        );
    }
}
