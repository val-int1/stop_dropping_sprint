# Stop Dropping Sprint

<p align="center"><img src="src/main/resources/assets/stop_dropping_sprint/icon.png" alt="Mod Icon" width="256"></p>

<p align="center">
  <a href="https://fabricmc.net/use/"><img src="https://raw.githubusercontent.com/val-int1/val_int1/ofpuppets/mod_badges/fabricloader.png" alt="Made for Fabric" /></a><br />
  <img src="https://raw.githubusercontent.com/val-int1/val_int1/ofpuppets/mod_badges/clientonly.png" alt="Client-side only" /><br />
  <a href="https://modrinth.com/mod/stop_dropping_sprint"><img src="https://raw.githubusercontent.com/val-int1/val_int1/ofpuppets/mod_badges/modrinth.png" alt="Download on modrinth" /></a></p>

A simple mod that prevents sticky keybinds to be toggled when used in key combos.

Its name comes from the one vanilla use-case where the way sticky keybinds work normally bothers me: dropping an entire stack with sprinting set to toggle causes it to also toggle sprint.

It *should* work on any Minecraft version from snapshot 19w41a (where sticky keybinds where added) to the latest version (but in case it doesn't work, feel free to [open an issue here](https://github.com/val-int1/stop_dropping_sprint/issues)), and only requires Fabric Loader version 0.15.0 or above.

It works by doing two changes:

1. It makes sticky keybinds toggle on *release* instead of on press
   
   <img src="readme/toggle_on_release.gif" alt="Showcasing toggle on release" width="720"/>

2. It prevents toggling if another key was pressed before release
   
   <img src="readme/combo.gif" alt="Showcasing combos not interfering with sticky keys" width="720"/>
