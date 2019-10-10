package invokedialer;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class InvokeDialer extends CordovaPlugin {

   @Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		String number = args.getString(0);
		if (action.equals("invokeDial") && number.startsWith("tel:")) {
			this.invokeDial(number, callbackContext);
			return true;
		}
		callbackContext.error("Please provide number with tel: as prefix");
		return false;
	}

	private void invokeDial(String number, CallbackContext callbackContext) {
		try {
			Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(number));
			cordova.getActivity().startActivity(intent);
			callbackContext.success("Success");

		} catch (Exception e) {
			callbackContext.error("Could not invoke Dial");
		}
	}
}
