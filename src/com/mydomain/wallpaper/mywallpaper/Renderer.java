package com.mydomain.wallpaper.mywallpaper;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import rajawali.animation.Animation.RepeatMode;
import rajawali.animation.Animation3D;
import rajawali.animation.RotateOnAxisAnimation;
import rajawali.lights.ALight;
import rajawali.lights.DirectionalLight;
import rajawali.materials.Material;
import rajawali.materials.methods.DiffuseMethod;
import rajawali.materials.textures.ATexture.TextureException;
import rajawali.materials.textures.Texture;
import rajawali.math.vector.Vector3;
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
		
		getCurrentScene().addLight(light);
		
		getCurrentCamera().setPosition(0, 0, 7);
		getCurrentCamera().setLookAt(0, 0, 0);

		try {
			Cube cube = new Cube(1);
			Material material = new Material();
			material.enableLighting(true);
			material.setDiffuseMethod(new DiffuseMethod.Lambert());
			material.addTexture(new Texture("rajawaliTex", R.drawable.rajawali_tex));
			material.setColorInfluence(0);
			cube.setMaterial(material);
			getCurrentScene().addChild(cube);

			Vector3 axis = new Vector3(3, 1, 6);
			axis.normalize();
			Animation3D anim = new RotateOnAxisAnimation(axis, 0, 360);
			anim.setDurationMilliseconds(8000);
			anim.setRepeatMode(RepeatMode.INFINITE);
			anim.setInterpolator(new AccelerateDecelerateInterpolator());
			anim.setTransformable3D(cube);
			getCurrentScene().registerAnimation(anim);
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
