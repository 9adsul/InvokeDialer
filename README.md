# Invoke Dialer

This plugin allows you to invoke the Dialer in the android mobile. This plugin useful in android application created using hosted web application and cordova framework. 

## Getting Started

### Installing

Install the plugin 

```
cordova plugin add https://github.com/9adsul/InvokeDialer.git
```

### How to Use ?

#### cordova.plugins.InvokeDial.invokeDial(number, successCallback,errorCallback)

The `cordova.plugins.InvokeDial.invokeDial` function opens the device's default dial application.


- `number` Its phone number with prefix `tel:` e.g. `tel:040-6700 6700` or `tel: +91 9989000000`
- `successCallback` after successful invoke it will return `Success`
- `errorCallback` it will return error messages if any occures


__Supported Platforms__

- Android

### Example


```js
cordova.plugins.InvokeDial.invokeDial(number, onSuccess, onError);
// number = "tel:040-6700 6700" or "tel: +91 9989000000"
function onSuccess() {
    console.log("Phone/Dial invoked successfully.")
}

function onError(message) {
    console.error(message);
}

```
