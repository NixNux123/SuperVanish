// 1.20.5+ support by daWinzig (https://github.com/LeonMangler/SuperVanish/pull/87)

package de.myzelyam.supervanish.utils;

import de.myzelyam.supervanish.SuperVanish;
import org.bukkit.Bukkit;

public class VersionUtil {

    private final SuperVanish plugin;
    private final int[] version;

    public VersionUtil(SuperVanish plugin) {
        this.plugin = plugin;
        this.version = new int[3];
        String[] bukkitVersion = Bukkit.getServer().getBukkitVersion().split("-")[0].split("\\.");
        for (int i=0; i < Math.min(bukkitVersion.length, 3); i++) {
            this.version[i] = Integer.parseInt(bukkitVersion[i]);
        }
    }

    public int compareVersions(String version1, String version2) {
            return 0;
        }

        public boolean isOneDotX(int minorRelease) {
            return minorRelease == this.version[1];
        }

        public boolean isOneDotXOrHigher(int minorRelease) {
            return this.isOneDotXOrHigher(minorRelease, 0);
        }
        public boolean isOneDotXOrHigher(int minorRelease, int build) {
            if (this.version[0] > 1) return true;
            if (this.version[1] > minorRelease) return true;
            return this.version[1] == minorRelease && this.version[2] >= build;
        }
    }