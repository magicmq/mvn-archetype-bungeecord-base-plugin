package ${groupId}.${artifactId};

import ${groupId}.${artifactId}.command.${name}Command;
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

    @Override
    public void onEnable() {
        instance = this;

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

        getProxy().getPluginManager().registerCommand("${artifactId}").setExecutor(new ${name}Command());
    }

    @Override
    public void onDisable() {

    }

    public void reload() {
        reloadConfig();
    }

    public static ${name} get() {
        return instance;
    }

}
