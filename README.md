# A Simple plugin template with Utility classes
### You can use this template to create your own plugin, modify it or use it as a reference.
## 1. Configurations
### Create a new config class that extends `ConfigBase`
```java
public class MyConfig extends ConfigBase {
    public MyConfig() {
        super(MyPlugin.getInstance(), "myconfig.yml", false);
    }
    
    public void loadConfig() {
        // Load your config here
    }
}
```
### Use the config manager to load your config
```java
public class MyPlugin extends JavaPlugin {
    private static MyPlugin instance;
    private ConfigManager configManager;
    
    @Override
    public void onEnable() {
        instance = this;
        ConfigManager.create(this);
        ConfigManager.get().addConfigs(new MyConfig()).loadConfigs();
    }
    
    public static MyPlugin getInstance() {
        return instance;
    }
}
```
## 2. Commands
### Create a new command class that extends `CommandBase`
```java
public class MyCommand extends CommandBase {
    public MyCommand() {
        super("mycommand");
    }
    
    public TabCompleter getTabCompleter() { // Optional
        // Return your tab completer here
    }
    
    public List<String> getAliases() { // Optional
        // Return your aliases here
    }
    
    public String getPermission() { // Optional
        // Return your permission here
    }
    
    public String getUsage() { // Optional
        // Return your usage here
    }
    
    public String getDescription() { // Optional
        // Return your description here
    }
    
    @Override
    public void execute(CommandSender sender, Command command, String alias, String[] args) {
        // Execute your command here
    }
}
```
### Register your command
```java
public class MyPlugin extends JavaPlugin {
    private static MyPlugin instance;
    private CommandManager commandManager;
    
    @Override
    public void onEnable() {
        instance = this;
        CommandManager.create();
        CommandManager.get().addCommands(new MyCommand()).registerCommands();
    }
    
    public static MyPlugin getInstance() {
        return instance;
    }
}
```
## 3. Listeners
### Create a new listener class that extends `Listener`
```java
public class MyListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Do something when a player joins
    }
}
```
### Register your listener
```java
public class MyPlugin extends JavaPlugin {
    private static MyPlugin instance;
    private ListenerManager listenerManager;
    
    @Override
    public void onEnable() {
        instance = this;
        ListenerManager.create();
        ListenerManager.get().addListeners(new MyListener()).registerListeners();
    }
    
    public static MyPlugin getInstance() {
        return instance;
    }
}
```
## 4. Tasks
### Create a new task class that extends `BaseRunnable`
```java
public class MyTask extends BaseRunnable {
    public MyTask() {
        super(20L /* counter */, 20L /* delay between runs */); // 20L = 1 second (20 ticks)
        // ↑ Decreasing counter
        // ↓ Increasing counter
        super(20L/* delay between runs */);
    }
    
    @Override
    public void runTask() {
        // Do something every second
    }
}
```
Tasks will be automatically started when the instance is created.

### Tasks Utility Methods
```java
TaskHelper.runTaskLater(Runnable task, long delay);
TaskHelper.stopTask(int taskId);
TaskHelper.startScheduledTask(Runnable task, long period);
```