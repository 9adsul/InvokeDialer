module.exports = {
    invokeDial : function (number, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "InvokeDial", "invokeDial", [number]);
    }
};
