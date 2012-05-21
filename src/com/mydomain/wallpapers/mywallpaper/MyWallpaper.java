package com.mydomain.wallpapers.mywallpaper;

import rajawali.wallpaper.Wallpaper;
import android.content.Context;

public class MyWallpaper extends Wallpaper {
	private MyWallpaperRenderer mRenderer;

	public Engine onCreateEngine() {
		mRenderer = new MyWallpaperRenderer(this);
		return new WallpaperEngine(this.getSharedPreferences(SHARED_PREFS_NAME,
				Context.MODE_PRIVATE), getBaseContext(), mRenderer, false);
	}
}
