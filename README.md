# Rajawali Live Wallpaper Template

This is a sample live wallpaper for Android. It uses [Rajawali][1], an
[open-source][2] OpenGL ES 2.x engine.

## Setup

1. Install the [Android SDK][3].
2. Clone https://github.com/MasDennis/Rajawali and
   https://github.com/MasDennis/RajawaliWallpaperTemplate into the same
   parent directory (i.e. `ls ~/foo` outputs
  `Rajawali/	RajawaliWallpaperTemplate/`). 
3. Import both projects into [Eclipse][4].

## Customizing

* Change the Java package ```com.mydomain.wallpaper.mywallpaper``` to
  something new. [Eclipse][4] makes this relatively simple with its
  "Refactor" -> "Rename" functionality.
* Update any package references in ```AndroidManifest.xml```
  and ```res/xml/wallpaper.xml```.
* Rename the wallpaper in ```res/values/strings.xml```.
* Edit the settings activity in ```res/xml/settings.xml```.

[1]: http://www.rozengain.com/blog/2011/08/23/announcing-rajawali-an-opengl-es-2-0-based-3d-framework-for-android/  "Rajawali introduction"
[2]: https://github.com/MasDennis/Rajawali  "Rajawali source code repository"
[3]: https://developer.android.com/sdk/index.html  "Android SDK"
[4]: http://www.eclipse.org/  "Eclipse home page"
