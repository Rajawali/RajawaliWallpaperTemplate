package com.mydomain.wallpaper.mywallpaper;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import rajawali.animation.Animation3D.RepeatMode;
import rajawali.animation.RotateAnimation3D;
import rajawali.lights.ALight;
import rajawali.lights.DirectionalLight;
import rajawali.materials.DiffuseMaterial;
import rajawali.materials.textures.ATexture.TextureException;
import rajawali.materials.textures.Texture;
import rajawali.math.Vector3;
import rajawali.primitives.Cube;
import rajawali.renderer.RajawaliRenderer;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;

public class Renderer extends RajawaliRenderer {
	public Renderer(Context context) {
		super(context);
	}

	public void initScene() {
		ALight light = new DirectionalLight(-1, 0, -1);
		light.setPower(2);
		getCurrentCamera().setPosition(0, 0, 7);
		getCurrentCamera().setLookAt(0, 0, 0);

		try {
			Cube cube = new Cube(1);
			DiffuseMaterial material = new DiffuseMaterial();
			material.addTexture(new Texture(R.drawable.rajawali_tex));
			cube.setMaterial(material);
			cube.addLight(light);
			addChild(cube);

			Vector3 axis = new Vector3(3, 1, 6);
			axis.normalize();
			RotateAnimation3D anim = new RotateAnimation3D(axis, 360);
			anim.setDuration(8000);
			anim.setRepeatMode(RepeatMode.INFINITE);
			anim.setInterpolator(new AccelerateDecelerateInterpolator());
			anim.setTransformable3D(cube);
			registerAnimation(anim);
			anim.play();
			
		} catch (TextureException e) {
			e.printStackTrace();
		}
	}

	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		super.onSurfaceCreated(gl, config);
	}

	public void onDrawFrame(GL10 glUnused) {
		super.onDrawFrame(glUnused);
	}
}
