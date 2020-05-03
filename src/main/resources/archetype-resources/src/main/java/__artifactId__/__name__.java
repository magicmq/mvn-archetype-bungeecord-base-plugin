package ${groupId}.${artifactId};

import ${groupId}.${artifactId}.command.Command${name};
import ${groupId}.${artifactId}.utils.MessageHandler;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

/**
 * @author ${author}
 */
public class ${name} extends JavaPlugin {

    private static ${name} instance;

    @Override
    public void onEnable() {
        instance = this;

        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        reloadConfig();

        // Set up commands
        getCommand("${artifactId}").setExecutor(new Command${name}(this));
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
