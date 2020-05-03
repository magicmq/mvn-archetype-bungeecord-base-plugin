package ${groupId}.${artifactId}.commands;

import ${groupId}.${artifactId}.${name};
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class ${name}Command implements Command {

    @Override
    public boolean onCommand(CommandSender sender, String[] args) {
        if (sender.hasPermission("${artifactId}.command")) {

        } else {
            sender.sendMessage(ChatColor.RED + "Insufficient permissions!");
        }
        return true;
    }
}