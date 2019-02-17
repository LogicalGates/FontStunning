# FontStunning
This is very Useful library to use custom fonts in your android apps very easily without adding fonts into asset/resource folder. Also by using this library developer should not have to worry about Typeface object creation for every new font that he use.

FontStunning will handle all this for you.

➤Type of fonts available:


![](https://raw.githubusercontent.com/vsvankhede/easyfonts/master/images/fontface_list.png)


# Getting Started

## Installation

Add gradle dependency with command:

```
dependencies {
       implementation 'com.github.LogicalGates:FontStunning:1.0'
}   
```

for Maven:

```
allprojects {
		repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

## Usage

You can set number of font face provided by EasyFont to your `TextView` or `EditText` etc by passing `FontStunning.yourFont(Context context)` to `setTypeface()`

### Example:

```
TextView razaTxt = (TextView) findViewById(R.id.razaTxt);
razaTxt.setTypeface(EasyFonts.robotoBlack(this));
```

You can also check sample project created in app directory.

## Version: 1.0

Full Functional Release

`Copyright 2019, Muhammad Raza Saeed`
