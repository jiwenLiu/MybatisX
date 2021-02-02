package com.baomidou.plugin.idea.mybatisx.setting;

import com.baomidou.plugin.idea.mybatisx.setting.template.TemplateContext;
import com.intellij.openapi.options.ConfigurableBase;
import com.intellij.openapi.options.ConfigurableUi;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Mybatisx 模板生成代码配置
 */
public class MybatisTemplateGeneratorConfigurable extends ConfigurableBase<MybatisTemplateGeneratorConfigurable.MyConfigurableUi, MybatisXTemplateSettings> {

    /**
     * 项目
     */
    private Project project;


    protected MybatisTemplateGeneratorConfigurable(Project project) {
        super("mybatisx.template", "MybatisX Template", "mybatisx.template");
        this.project = project;
    }


    @NotNull
    @Override
    protected MybatisXTemplateSettings getSettings() {
        return mybatisXTemplateSettings;
    }

    private MybatisXTemplateSettings mybatisXTemplateSettings = new MybatisXTemplateSettings();

    @Override
    protected MyConfigurableUi createUi() {
        // 如果是社区版本, 就不需要配置代码生成器
        TemplatesSettings instance = TemplatesSettings.getInstance(project);
        TemplateContext templateConfigs = instance.getTemplateConfigs();
        mybatisXTemplateSettings.loadSettings(templateConfigs);
        return new MyConfigurableUi(instance);
    }

    public class MyConfigurableUi implements ConfigurableUi<MybatisXTemplateSettings> {

        private final TemplatesSettings templatesSettings;

        public MyConfigurableUi(TemplatesSettings templatesSettings) {
            this.templatesSettings = templatesSettings;
        }

        @Override
        public void reset(@NotNull MybatisXTemplateSettings settings) {

        }

        @Override
        public boolean isModified(@NotNull MybatisXTemplateSettings settings) {
            return false;
        }

        @Override
        public void apply(@NotNull MybatisXTemplateSettings settings) throws ConfigurationException {
        }

        @Override
        public @NotNull JComponent getComponent() {
            return mybatisXTemplateSettings.getRootPanel();
        }
    }
}
