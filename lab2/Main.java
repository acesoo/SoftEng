package lab2;

public class Main {
    public static void main(String[] args) {

        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();
        Fan livingRoomFan = new Fan();
        SmartTV livingRoomTV = new SmartTV();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command lightIncreaseBrightness = new LightIncreaseBrightnessCommand(livingRoomLight);
        Command lightDecreaseBrightness = new LightDecreaseBrightnessCommand(livingRoomLight);
        Command thermostatIncrease = new ThermostatIncreaseCommand(thermostat);
        Command thermostatDecrease = new ThermostatDecreaseCommand(thermostat);
        Command musicPlay = new MusicPlayerPlayCommand(musicPlayer);
        Command musicStop = new MusicPlayerStopCommand(musicPlayer);
        Command musicIncreaseVolume = new MusicPlayerIncreaseVolumeCommand(musicPlayer);
        Command musicDecreaseVolume = new MusicPlayerDecreaseVolumeCommand(musicPlayer);
        Command fanOn = new FanOnCommand(livingRoomFan);
        Command fanOff = new FanOffCommand(livingRoomFan);
        Command fanIncreaseSpeed = new FanIncreaseSpeedCommand(livingRoomFan);
        Command fanDecreaseSpeed = new FanDecreaseSpeedCommand(livingRoomFan);
        Command tvOn = new SmartTVOnCommand(livingRoomTV);
        Command tvOff = new SmartTVOffCommand(livingRoomTV);
        Command tvChangeChannelUp = new SmartTVChangeChannelUpCommand(livingRoomTV);
        Command tvChangeChannelDown = new SmartTVChangeChannelDownCommand(livingRoomTV);

        SmartHomeHub hub = new SmartHomeHub();

        hub.setCommand("light_on", lightOn);
        hub.setCommand("light_off", lightOff);
        hub.setCommand("light_increase_brightness", lightIncreaseBrightness);
        hub.setCommand("light_decrease_brightness", lightDecreaseBrightness);
        hub.setCommand("thermostat_increase", thermostatIncrease);
        hub.setCommand("thermostat_decrease", thermostatDecrease);
        hub.setCommand("music_play", musicPlay);
        hub.setCommand("music_stop", musicStop);
        hub.setCommand("music_increase_volume", musicIncreaseVolume);
        hub.setCommand("music_decrease_volume", musicDecreaseVolume);
        hub.setCommand("fan_on", fanOn);
        hub.setCommand("fan_off", fanOff);
        hub.setCommand("fan_increase_speed", fanIncreaseSpeed);
        hub.setCommand("fan_decrease_speed", fanDecreaseSpeed);
        hub.setCommand("tv_on", tvOn);
        hub.setCommand("tv_off", tvOff);
        hub.setCommand("tv_change_channel_up", tvChangeChannelUp);
        hub.setCommand("tv_change_channel_down", tvChangeChannelDown);

        System.out.println("Smart Home Commands:");
        hub.executeCommand("light_on");
        hub.executeCommand("light_increase_brightness");
        hub.undoCommand("light_increase_brightness");
        hub.executeCommand("thermostat_increase");
        hub.executeCommand("music_play");
        hub.executeCommand("music_increase_volume");
        hub.undoCommand("music_increase_volume");
        hub.executeCommand("fan_on");
        hub.executeCommand("fan_increase_speed");
        hub.executeCommand("tv_on");
        hub.executeCommand("tv_change_channel_up");
        hub.undoCommand("tv_change_channel_up");
        hub.executeCommand("tv_off");
        hub.executeCommand("fan_off");
        hub.executeCommand("light_off");
    }
}