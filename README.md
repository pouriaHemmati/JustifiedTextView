# JustifiedTextView for android (Persian - English)

This project provides a view for android apps that implements justified text view.

![Image](http://uupload.ir/files/yx85_text.jpg)

## Installing
**Quick Setup**

**1.You can import in build.gradle like this**

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
```
dependencies {
	        implementation 'com.github.pouriaHemmati:JustifiedTextView:1.0.0'
	}
  ```
  If you use maven, add this
  ```
  <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ```
  ```
  <dependency>
	    <groupId>com.github.pouriaHemmati</groupId>
	    <artifactId>JustifiedTextView</artifactId>
	    <version>1.0.0</version>
	</dependency>
```
**2. Application class**

```
public class MainActivity extends Activity {

	private JustifiedTextView mJTv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mJTv=(JustifiedTextView) findViewById(R.id.activity_main_jtv_text);
		mJTv.setText(getResources().getString(R.string.test));
		mJTv.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
		mJTv.setLineSpacing(15);
		mJTv.setBackgroundColor(Color.RED);
		// Left for English - Right for Persian
		mJTv.setAlignment(Align.LEFT);
		mJTv.setTypeFace(Typeface.createFromAsset(getAssets(), "fonts/naskh_bold.ttf"));

	}
}
```

**3. Xml**

```
<?xml version="1.0" encoding="utf-8"?>
 <android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    <com.pouriahemati.phhjustifiedtextview.PHJustifiedTextView
       android:id="@+id/txt_test"
       android:layout_width="0dp"
       android:layout_height="wrap_content"
       app:layout_constraintBottom_toBottomOf="parent"
       app:layout_constraintLeft_toLeftOf="parent"
       app:layout_constraintRight_toRightOf="parent"
       app:layout_constraintTop_toTopOf="parent"
       android:gravity="right"
       android:padding="25dp"
       android:layout_marginTop="20dp"
       android:layout_marginLeft="10dp"
       android:layout_marginRight="15dp"
       />
           </android.support.constraint.ConstraintLayout>
```

## Authors

[pouriaHemmati](https://github.com/pouriaHemmati)

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/pouriaHemmati/JustifiedTextView/blob/master/README.md) file for details.

