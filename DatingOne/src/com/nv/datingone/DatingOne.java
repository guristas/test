package com.nv.datingone;

import com.nv.dating.Dating;
import com.nv.dating.VersionDependency;
import com.support.pro.SettingsPro;


public class DatingOne extends Dating {

	@Override
	public void onCreate() {
		VersionDependency.initInstance(VersionDependency.DATING_ONE);
		SettingsPro.appFontDef = "fonts/Roboto-Regular.ttf";
		super.onCreate();
	}
}
