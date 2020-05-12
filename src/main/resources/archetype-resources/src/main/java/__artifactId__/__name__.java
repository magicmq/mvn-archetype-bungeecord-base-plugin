package ${groupId}.${artifactId};

import ${groupId}.${artifactId}.commands.${name}Command;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.logging.Level;

/**
 * @author ${author}
 */
public class ${name} extends Plugin {

    private static ${name} instance;

    private Configuration config;

    @Override
    public void onEnable() {
        instance = this;

        if (!getDataFolder().exists())
            getDataFolder().mkdir();
        File config = new File(getDataFolder(), "config.yml");
        if (!config.exists()) {
            try (InputStream in = getResourceAsStream("config.yml")) {
                Files.copy(in, config.toPath());
            } catch (IOException e) {
                getLogger().log(Level.SEVERE, "Error loading default config!");
                e.printStackTrace();
            }
        }

        try {
            this.config = ConfigurationProvider.getProvider(YamlConfiguration.class).load(config);
        } catch (IOException e) {
            getLogger().log(Level.SEVERE, "Error loading config!");
            e.printStackTrace();
        }

        getProxy().getPluginManager().registerListener(this, new PluginListener());

        getProxy().getPluginManager().registerCommand(this, new ${name}Command());
    }

    @Override
    public void onDisable() {

    }

    public Configuration getConfig() {
        return config;
    }

    public static ${name} get() {
        return instance;
    }

}
