package com.exampleapp;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.react.rnspinkit.RNSpinkitPackage;
import com.rnim.rn.audio.ReactNativeAudioPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.zmxv.RNSound.RNSoundPackage;
import java.util.Arrays;
import java.util.List;
import com.imagepicker.ImagePickerPackage;
import com.reactnative.ivpusic.imagepicker.PickerPackage;
import cn.qiuxiang.react.geolocation.AMapGeolocationPackage;
import me.jhen.react.BadgePackage;
import com.cmcewen.blurview.BlurViewPackage;
import com.rt2zz.reactnativecontacts.ReactNativeContacts;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import com.devfd.RNGeocoder.RNGeocoderPackage;
import com.airbnb.android.react.maps.MapsPackage;
import org.reactnative.camera.RNCameraPackage;
import com.shahenlibrary.RNVideoProcessingPackage;
import com.theweflex.react.WeChatPackage;
import com.brentvatne.react.ReactVideoPackage;
import me.hauvo.thumbnail.RNThumbnailPackage;
import com.microsoft.codepush.react.CodePush;
import cn.jpush.reactnativejpush.JPushPackage;
public class MainApplication extends Application implements ReactApplication {
  private boolean SHUTDOWN_TOAST = false;
  private boolean SHUTDOWN_LOG = false;
  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new RNSpinkitPackage(),
            new ReactNativeAudioPackage(),
            new SplashScreenReactPackage(),
            new RNFetchBlobPackage(),
              new RNSoundPackage(),
              new ImagePickerPackage(),
              new PickerPackage(),
              new AMapGeolocationPackage(),
              new BadgePackage(),
              new BlurViewPackage(),
              new ReactNativeContacts(),
              new RNDeviceInfo(),
              new RNGeocoderPackage(),
              new MapsPackage(),
              new RNCameraPackage(),
              new RNVideoProcessingPackage(),
              new WeChatPackage(),
              new ReactVideoPackage(),
              new RNThumbnailPackage(),
              new JPushPackage(SHUTDOWN_TOAST,SHUTDOWN_LOG),
              new CodePush("",MainApplication.this,BuildConfig.DEBUG)
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
