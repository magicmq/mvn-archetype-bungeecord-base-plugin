package ${groupId}.${artifactId}.commands;

import ${groupId}.${artifactId}.${name};
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class ${name}Command implements Command {

    public ${name}Command() {
        super("${artifactId}", "${artifactId}.command");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("${artifactId}.command")) {

        } else {
            sender.sendMessage(getErrorMessage("Insufficient permissions!"));
        }
    }

    private TextComponent getErrorMessage(String message) {
        TextComponent component = new TextComponent(ChatColor.translateAlternateColorCodes('&', message));
        component.setColor(ChatColor.RED);
        return component;
    }

    private TextComponent getSuccessMessage(String message) {
        TextComponent component = new TextComponent(ChatColor.translateAlternateColorCodes('&', message));
        component.setColor(ChatColor.GREEN);
        return component;
    }
}