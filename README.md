# Rajawali Live Wallpaper Template

This is a sample live wallpaper for Android. It uses [Rajawali][1], an
[open-source][2] OpenGL ES 2.x engine.

## Customizing

* Change the Java package ```com.mydomain.wallpapers.mywallpaper``` to something
  new. [Eclipse][3] makes this relatively simple with its "Refactor" -> "Rename"
  functionality.
* Update any package references in ```AndroidManifest.xml```
  and ```res/xml/wallpaper.xml```.
* Rename the wallpaper in ```res/values/strings.xml```.
* Edit the settings activity in ```res/xml/settings.xml```.

[1]: http://www.rozengain.com/blog/2011/08/23/announcing-rajawali-an-opengl-es-2-0-based-3d-framework-for-android/
  "Rajawali introduction"
[2]: https://github.com/MasDennis/Rajawali
  "Rajawali source code repository"
[3]: http://www.eclipse.org/
  "Eclipse home page"
