/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by
 * Appcelerator. It should not be modified by hand.
 */
package com.ProgramAssign4;

import org.appcelerator.kroll.runtime.v8.V8Runtime;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.KrollModuleInfo;
import org.appcelerator.kroll.KrollRuntime;
import org.appcelerator.kroll.util.KrollAssetHelper;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiRootActivity;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import android.util.Log;

public final class Programassign4Application extends TiApplication
{
	private static final String TAG = "Programassign4Application";

	@Override
	public void onCreate()
	{
		super.onCreate();

		appInfo = new Programassign4AppInfo(this);
		postAppInfo();



		V8Runtime runtime = new V8Runtime();



		KrollRuntime.init(this, runtime);

		stylesheet = new ApplicationStylesheet();
		postOnCreate();


	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	



	}

	@Override
	public void verifyCustomModules(TiRootActivity rootActivity)
	{

		org.appcelerator.titanium.TiVerify verify = new org.appcelerator.titanium.TiVerify(rootActivity, this);
		verify.verify();

	}
}