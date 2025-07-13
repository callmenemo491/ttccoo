package p124h7;

/* renamed from: h7.ic */
/* loaded from: classes.dex */
public final class C2678ic {

    /* renamed from: a */
    public static final android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> f11627a = null;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            p124h7.C2678ic.f11627a = r0
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_CUSTOM_TOKEN"
            java.lang.String r3 = "The custom token format is incorrect. Please check the documentation."
            r1.<init>(r2, r3)
            r2 = 17000(0x4268, float:2.3822E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_CUSTOM_TOKEN_MISMATCH"
            java.lang.String r3 = "The custom token corresponds to a different audience."
            r1.<init>(r2, r3)
            r2 = 17002(0x426a, float:2.3825E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_CREDENTIAL"
            java.lang.String r3 = "The supplied auth credential is malformed or has expired."
            r1.<init>(r2, r3)
            r2 = 17004(0x426c, float:2.3828E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_EMAIL"
            java.lang.String r3 = "The email address is badly formatted."
            r1.<init>(r2, r3)
            r2 = 17008(0x4270, float:2.3833E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_WRONG_PASSWORD"
            java.lang.String r3 = "The password is invalid or the user does not have a password."
            r1.<init>(r2, r3)
            r2 = 17009(0x4271, float:2.3835E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_USER_MISMATCH"
            java.lang.String r3 = "The supplied credentials do not correspond to the previously signed in user."
            r1.<init>(r2, r3)
            r2 = 17024(0x4280, float:2.3856E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_REQUIRES_RECENT_LOGIN"
            java.lang.String r3 = "This operation is sensitive and requires recent authentication. Log in again before retrying this request."
            r1.<init>(r2, r3)
            r2 = 17014(0x4276, float:2.3842E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL"
            java.lang.String r3 = "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."
            r1.<init>(r2, r3)
            r2 = 17012(0x4274, float:2.3839E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_EMAIL_ALREADY_IN_USE"
            java.lang.String r3 = "The email address is already in use by another account."
            r1.<init>(r2, r3)
            r2 = 17007(0x426f, float:2.3832E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_CREDENTIAL_ALREADY_IN_USE"
            java.lang.String r3 = "This credential is already associated with a different user account."
            r1.<init>(r2, r3)
            r2 = 17025(0x4281, float:2.3857E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_USER_DISABLED"
            java.lang.String r3 = "The user account has been disabled by an administrator."
            r1.<init>(r2, r3)
            r2 = 17005(0x426d, float:2.3829E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_USER_TOKEN_EXPIRED"
            java.lang.String r3 = "The user's credential is no longer valid. The user must sign in again."
            r1.<init>(r2, r3)
            r2 = 17021(0x427d, float:2.3852E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_USER_NOT_FOUND"
            java.lang.String r3 = "There is no user record corresponding to this identifier. The user may have been deleted."
            r1.<init>(r2, r3)
            r2 = 17011(0x4273, float:2.3837E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_USER_TOKEN"
            java.lang.String r3 = "This user's credential isn't valid for this project. This can happen if the user's token has been tampered with, or if the user isn't for the project associated with this API key."
            r1.<init>(r2, r3)
            r2 = 17017(0x4279, float:2.3846E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_OPERATION_NOT_ALLOWED"
            java.lang.String r3 = "The given sign-in provider is disabled for this Firebase project. Enable it in the Firebase console, under the sign-in method tab of the Auth section."
            r1.<init>(r2, r3)
            r2 = 17006(0x426e, float:2.383E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_WEAK_PASSWORD"
            java.lang.String r3 = "The given password is invalid."
            r1.<init>(r2, r3)
            r2 = 17026(0x4282, float:2.3859E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_EXPIRED_ACTION_CODE"
            java.lang.String r3 = "The out of band code has expired."
            r1.<init>(r2, r3)
            r2 = 17029(0x4285, float:2.3863E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_ACTION_CODE"
            java.lang.String r3 = "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used."
            r1.<init>(r2, r3)
            r2 = 17030(0x4286, float:2.3864E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_MESSAGE_PAYLOAD"
            java.lang.String r3 = "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console."
            r1.<init>(r2, r3)
            r2 = 17031(0x4287, float:2.3866E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_RECIPIENT_EMAIL"
            java.lang.String r3 = "The email corresponding to this action failed to send as the provided recipient email address is invalid."
            r1.<init>(r2, r3)
            r2 = 17033(0x4289, float:2.3868E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_SENDER"
            java.lang.String r3 = "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console."
            r1.<init>(r2, r3)
            r2 = 17032(0x4288, float:2.3867E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MISSING_EMAIL"
            java.lang.String r3 = "An email address must be provided."
            r1.<init>(r2, r3)
            r2 = 17034(0x428a, float:2.387E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MISSING_PASSWORD"
            java.lang.String r3 = "A password must be provided."
            r1.<init>(r2, r3)
            r2 = 17035(0x428b, float:2.3871E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MISSING_PHONE_NUMBER"
            java.lang.String r3 = "To send verification codes, provide a phone number for the recipient."
            r1.<init>(r2, r3)
            r2 = 17041(0x4291, float:2.388E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_PHONE_NUMBER"
            java.lang.String r3 = "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code]."
            r1.<init>(r2, r3)
            r2 = 17042(0x4292, float:2.3881E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MISSING_VERIFICATION_CODE"
            java.lang.String r3 = "The Phone Auth Credential was created with an empty sms verification Code"
            r1.<init>(r2, r3)
            r2 = 17043(0x4293, float:2.3882E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_VERIFICATION_CODE"
            java.lang.String r3 = "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user."
            r1.<init>(r2, r3)
            r2 = 17044(0x4294, float:2.3884E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MISSING_VERIFICATION_ID"
            java.lang.String r3 = "The Phone Auth Credential was created with an empty verification ID"
            r1.<init>(r2, r3)
            r2 = 17045(0x4295, float:2.3885E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_VERIFICATION_ID"
            java.lang.String r3 = "The verification ID used to create the phone auth credential is invalid."
            r1.<init>(r2, r3)
            r2 = 17046(0x4296, float:2.3887E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_RETRY_PHONE_AUTH"
            java.lang.String r3 = "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication."
            r1.<init>(r2, r3)
            r2 = 17049(0x4299, float:2.3891E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_SESSION_EXPIRED"
            java.lang.String r3 = "The sms code has expired. Please re-send the verification code to try again."
            r1.<init>(r2, r3)
            r2 = 17051(0x429b, float:2.3894E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_QUOTA_EXCEEDED"
            java.lang.String r3 = "This project's quota for this operation has been exceeded."
            r1.<init>(r2, r3)
            r2 = 17052(0x429c, float:2.3895E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_APP_NOT_AUTHORIZED"
            java.lang.String r3 = "This app is not authorized to use Firebase Authentication. Please verify that the correct package name and SHA-1 are configured in the Firebase Console."
            r1.<init>(r2, r3)
            r2 = 17028(0x4284, float:2.3861E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_API_NOT_AVAILABLE_WITHOUT_GOOGLE_PLAY"
            java.lang.String r3 = "The API that you are calling is not available on devices without Google Play services."
            r1.<init>(r2, r3)
            r2 = 17063(0x42a7, float:2.391E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_WEB_INTERNAL_ERROR"
            java.lang.String r3 = "There was an internal error in the web widget."
            r1.<init>(r2, r3)
            r2 = 17062(0x42a6, float:2.3909E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_CERT_HASH"
            java.lang.String r3 = "There was an error while trying to get your package certificate hash."
            r1.<init>(r2, r3)
            r2 = 17064(0x42a8, float:2.3912E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_WEB_STORAGE_UNSUPPORTED"
            java.lang.String r3 = "This browser is not supported or 3rd party cookies and data may be disabled."
            r1.<init>(r2, r3)
            r2 = 17065(0x42a9, float:2.3913E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MISSING_CONTINUE_URI"
            java.lang.String r3 = "A continue URL must be provided in the request."
            r1.<init>(r2, r3)
            r2 = 17040(0x4290, float:2.3878E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_DYNAMIC_LINK_NOT_ACTIVATED"
            java.lang.String r3 = "Please activate Dynamic Links in the Firebase Console and agree to the terms and conditions."
            r1.<init>(r2, r3)
            r2 = 17068(0x42ac, float:2.3917E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_PROVIDER_ID"
            java.lang.String r3 = "The provider ID provided for the attempted web operation is invalid."
            r1.<init>(r2, r3)
            r2 = 17071(0x42af, float:2.3922E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_WEB_CONTEXT_ALREADY_PRESENTED"
            java.lang.String r3 = "A headful operation is already in progress. Please wait for that to finish."
            r1.<init>(r2, r3)
            r2 = 17057(0x42a1, float:2.3902E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_WEB_CONTEXT_CANCELED"
            java.lang.String r3 = "The web operation was canceled by the user."
            r1.<init>(r2, r3)
            r2 = 17058(0x42a2, float:2.3903E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_TENANT_ID_MISMATCH"
            java.lang.String r3 = "The provided tenant ID does not match the Auth instance's tenant ID."
            r1.<init>(r2, r3)
            r2 = 17072(0x42b0, float:2.3923E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_UNSUPPORTED_TENANT_OPERATION"
            java.lang.String r3 = "This operation is not supported in a multi-tenant context."
            r1.<init>(r2, r3)
            r2 = 17073(0x42b1, float:2.3924E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_DYNAMIC_LINK_DOMAIN"
            java.lang.String r3 = "The provided dynamic link domain is not configured or authorized for the current project."
            r1.<init>(r2, r3)
            r2 = 17074(0x42b2, float:2.3926E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_REJECTED_CREDENTIAL"
            java.lang.String r3 = "The request contains malformed or mismatching credentials"
            r1.<init>(r2, r3)
            r2 = 17075(0x42b3, float:2.3927E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_PHONE_NUMBER_NOT_FOUND"
            java.lang.String r3 = "The provided phone number does not match any of the second factor phone numbers associated with this user."
            r1.<init>(r2, r3)
            r2 = 17077(0x42b5, float:2.393E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_TENANT_ID"
            java.lang.String r3 = "The Auth instance's tenant ID is invalid."
            r1.<init>(r2, r3)
            r2 = 17079(0x42b7, float:2.3933E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_SECOND_FACTOR_REQUIRED"
            java.lang.String r3 = "Please complete a second factor challenge to finish signing into this account."
            r1.<init>(r2, r3)
            r2 = 17078(0x42b6, float:2.3931E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_API_NOT_AVAILABLE"
            java.lang.String r3 = "The API that you are calling is not available."
            r1.<init>(r2, r3)
            r2 = 17080(0x42b8, float:2.3934E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MISSING_MULTI_FACTOR_SESSION"
            java.lang.String r3 = "The request is missing proof of first factor successful sign-in."
            r1.<init>(r2, r3)
            r2 = 17081(0x42b9, float:2.3936E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MISSING_MULTI_FACTOR_INFO"
            java.lang.String r3 = "No second factor identifier is provided."
            r1.<init>(r2, r3)
            r2 = 17082(0x42ba, float:2.3937E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INVALID_MULTI_FACTOR_SESSION"
            java.lang.String r3 = "The request does not contain a valid proof of first factor successful sign-in."
            r1.<init>(r2, r3)
            r2 = 17083(0x42bb, float:2.3938E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MULTI_FACTOR_INFO_NOT_FOUND"
            java.lang.String r3 = "The user does not have a second factor matching the identifier provided."
            r1.<init>(r2, r3)
            r2 = 17084(0x42bc, float:2.394E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_ADMIN_RESTRICTED_OPERATION"
            java.lang.String r3 = "This operation is restricted to administrators only."
            r1.<init>(r2, r3)
            r2 = 17085(0x42bd, float:2.3941E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_UNVERIFIED_EMAIL"
            java.lang.String r3 = "This operation requires a verified email."
            r1.<init>(r2, r3)
            r2 = 17086(0x42be, float:2.3943E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_SECOND_FACTOR_ALREADY_ENROLLED"
            java.lang.String r3 = "The second factor is already enrolled on this account."
            r1.<init>(r2, r3)
            r2 = 17087(0x42bf, float:2.3944E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MAXIMUM_SECOND_FACTOR_COUNT_EXCEEDED"
            java.lang.String r3 = "The maximum allowed number of second factors on a user has been exceeded."
            r1.<init>(r2, r3)
            r2 = 17088(0x42c0, float:2.3945E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_UNSUPPORTED_FIRST_FACTOR"
            java.lang.String r3 = "Enrolling a second factor or signing in with a multi-factor account requires sign-in with a supported first factor."
            r1.<init>(r2, r3)
            r2 = 17089(0x42c1, float:2.3947E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_EMAIL_CHANGE_NEEDS_VERIFICATION"
            java.lang.String r3 = "Multi-factor users must always have a verified email."
            r1.<init>(r2, r3)
            r2 = 17090(0x42c2, float:2.3948E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_INTERNAL_SUCCESS_SIGN_OUT"
            java.lang.String r3 = "This is an internal error code indicating that the operation was successful but the user needs to be signed out."
            r1.<init>(r2, r3)
            r2 = 17091(0x42c3, float:2.395E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MISSING_CLIENT_IDENTIFIER"
            java.lang.String r3 = "This request is missing a valid app identifier, meaning that neither SafetyNet checks nor reCAPTCHA checks succeeded. Please try again, or check the logcat for more details."
            r1.<init>(r2, r3)
            r2 = 17093(0x42c5, float:2.3952E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_MISSING_OR_INVALID_NONCE"
            java.lang.String r3 = "The request does not contain a valid nonce. This can occur if the SHA-256 hash of the provided raw nonce does not match the hashed nonce in the ID token payload."
            r1.<init>(r2, r3)
            r2 = 17094(0x42c6, float:2.3954E-41)
            r0.put(r2, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "ERROR_USER_CANCELLED"
            java.lang.String r3 = "The user did not grant your application the permissions it requested."
            r1.<init>(r2, r3)
            r2 = 18001(0x4651, float:2.5225E-41)
            r0.put(r2, r1)
            return
    }

    /* renamed from: a */
    public static p251o9.C5181e m6827a(com.google.android.gms.common.api.Status r5) {
            int r0 = r5.f5536Z
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r1 = p124h7.C2678ic.f11627a
            java.lang.Object r1 = r1.get(r0)
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.String r2 = "An internal error has occurred."
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            goto L14
        L13:
            r1 = r2
        L14:
            java.lang.String r1 = m6829c(r1, r5)
            r3 = 17020(0x427c, float:2.385E-41)
            if (r0 == r3) goto L126
            r3 = 17021(0x427d, float:2.3852E-41)
            if (r0 == r3) goto L11c
            r3 = 17051(0x429b, float:2.3894E-41)
            if (r0 == r3) goto L112
            r3 = 17052(0x429c, float:2.3895E-41)
            if (r0 == r3) goto L10c
            r3 = 17057(0x42a1, float:2.3902E-41)
            r4 = 1
            if (r0 == r3) goto L102
            r3 = 17058(0x42a2, float:2.3903E-41)
            if (r0 == r3) goto L102
            r3 = 17000(0x4268, float:2.3822E-41)
            if (r0 == r3) goto L112
            r3 = 17002(0x426a, float:2.3825E-41)
            if (r0 == r3) goto L112
            r3 = 17049(0x4299, float:2.3891E-41)
            if (r0 == r3) goto L112
            r3 = 17068(0x42ac, float:2.3917E-41)
            if (r0 == r3) goto Lf8
            r3 = 17077(0x42b5, float:2.393E-41)
            if (r0 == r3) goto L112
            r3 = 17495(0x4457, float:2.4516E-41)
            if (r0 == r3) goto Lec
            r3 = 17499(0x445b, float:2.4521E-41)
            if (r0 == r3) goto Le2
            r3 = 18001(0x4651, float:2.5225E-41)
            if (r0 == r3) goto Lf8
            r3 = 17093(0x42c5, float:2.3952E-41)
            if (r0 == r3) goto Lf8
            r3 = 17094(0x42c6, float:2.3954E-41)
            if (r0 == r3) goto L112
            switch(r0) {
                case 17004: goto L112;
                case 17005: goto L11c;
                case 17006: goto Lf8;
                case 17007: goto Ld8;
                case 17008: goto L112;
                case 17009: goto L112;
                case 17010: goto Lcc;
                case 17011: goto L11c;
                case 17012: goto Ld8;
                default: goto L5c;
            }
        L5c:
            switch(r0) {
                case 17079: goto Lf8;
                case 17080: goto Lc6;
                case 17081: goto L112;
                case 17082: goto L112;
                case 17083: goto L112;
                case 17084: goto L112;
                case 17085: goto Lf8;
                case 17086: goto Lf8;
                case 17087: goto Lf8;
                case 17088: goto Lf8;
                case 17089: goto Lf8;
                case 17090: goto Lf8;
                case 17091: goto Lf8;
                default: goto L5f;
            }
        L5f:
            switch(r0) {
                case 17014: goto L90;
                case 17015: goto L84;
                case 17016: goto L78;
                case 17017: goto L11c;
                default: goto L62;
            }
        L62:
            switch(r0) {
                case 17024: goto L112;
                case 17025: goto Ld8;
                case 17026: goto L9a;
                default: goto L65;
            }
        L65:
            r3 = 0
            switch(r0) {
                case 17028: goto Lf8;
                case 17029: goto Lb0;
                case 17030: goto Lb0;
                case 17031: goto La6;
                case 17032: goto La6;
                case 17033: goto La6;
                case 17034: goto L112;
                case 17035: goto L112;
                default: goto L69;
            }
        L69:
            switch(r0) {
                case 17040: goto Lf8;
                case 17041: goto L112;
                case 17042: goto L112;
                case 17043: goto L112;
                case 17044: goto L112;
                case 17045: goto L112;
                case 17046: goto L112;
                default: goto L6c;
            }
        L6c:
            switch(r0) {
                case 17061: goto Lba;
                case 17062: goto L102;
                case 17063: goto Lc6;
                case 17064: goto Lf8;
                case 17065: goto L102;
                default: goto L6f;
            }
        L6f:
            switch(r0) {
                case 17071: goto Lf8;
                case 17072: goto Lf8;
                case 17073: goto Lf8;
                case 17074: goto Lf8;
                case 17075: goto L112;
                default: goto L72;
            }
        L72:
            o9.e r5 = new o9.e
            r5.<init>(r2)
            return r5
        L78:
            java.lang.String r0 = "User was not linked to an account with the given provider."
            java.lang.String r5 = m6829c(r0, r5)
            o9.e r0 = new o9.e
            r0.<init>(r5)
            return r0
        L84:
            java.lang.String r0 = "User has already been linked to the given provider."
            java.lang.String r5 = m6829c(r0, r5)
            o9.e r0 = new o9.e
            r0.<init>(r5)
            return r0
        L90:
            v9.g r5 = new v9.g
            java.lang.String r0 = m6828b(r0)
            r5.<init>(r0, r1, r4)
            return r5
        L9a:
            v9.n r2 = new v9.n
            java.lang.String r0 = m6828b(r0)
            java.lang.String r5 = r5.f5537a0
            r2.<init>(r0, r1, r5)
            return r2
        La6:
            v9.h r5 = new v9.h
            java.lang.String r0 = m6828b(r0)
            r5.<init>(r0, r1, r3)
            return r5
        Lb0:
            v9.g r5 = new v9.g
            java.lang.String r0 = m6828b(r0)
            r5.<init>(r0, r1, r3)
            return r5
        Lba:
            java.lang.String r0 = "There was a failure in the connection between the web widget and the Firebase Auth backend."
            java.lang.String r5 = m6829c(r0, r5)
            o9.g r0 = new o9.g
            r0.<init>(r5)
            return r0
        Lc6:
            o9.b r5 = new o9.b
            r5.<init>(r1)
            return r5
        Lcc:
            java.lang.String r0 = "We have blocked all requests from this device due to unusual activity. Try again later."
            java.lang.String r5 = m6829c(r0, r5)
            o9.i r0 = new o9.i
            r0.<init>(r5)
            return r0
        Ld8:
            v9.m r5 = new v9.m
            java.lang.String r0 = m6828b(r0)
            r5.<init>(r0, r1)
            return r5
        Le2:
            java.lang.String r5 = m6829c(r2, r5)
            o9.e r0 = new o9.e
            r0.<init>(r5)
            return r0
        Lec:
            java.lang.String r0 = "Please sign in before trying to get a token."
            java.lang.String r5 = m6829c(r0, r5)
            cb.a r0 = new cb.a
            r0.<init>(r5)
            return r0
        Lf8:
            v9.i r5 = new v9.i
            java.lang.String r0 = m6828b(r0)
            r5.<init>(r0, r1)
            return r5
        L102:
            v9.h r5 = new v9.h
            java.lang.String r0 = m6828b(r0)
            r5.<init>(r0, r1, r4)
            return r5
        L10c:
            o9.i r5 = new o9.i
            r5.<init>(r1)
            return r5
        L112:
            v9.j r5 = new v9.j
            java.lang.String r0 = m6828b(r0)
            r5.<init>(r0, r1)
            return r5
        L11c:
            v9.k r5 = new v9.k
            java.lang.String r0 = m6828b(r0)
            r5.<init>(r0, r1)
            return r5
        L126:
            java.lang.String r0 = "A network error (such as timeout, interrupted connection or unreachable host) has occurred."
            java.lang.String r5 = m6829c(r0, r5)
            o9.g r0 = new o9.g
            r0.<init>(r5)
            return r0
    }

    /* renamed from: b */
    public static java.lang.String m6828b(int r1) {
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r0 = p124h7.C2678ic.f11627a
            java.lang.Object r1 = r0.get(r1)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 == 0) goto Lf
            java.lang.Object r1 = r1.first
            java.lang.String r1 = (java.lang.String) r1
            goto L11
        Lf:
            java.lang.String r1 = "INTERNAL_ERROR"
        L11:
            return r1
    }

    /* renamed from: c */
    public static java.lang.String m6829c(java.lang.String r2, com.google.android.gms.common.api.Status r3) {
            java.lang.String r0 = r3.f5537a0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9
            return r2
        L9:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = " [ %s ]"
            java.lang.String r2 = r2.concat(r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r3 = r3.f5537a0
            r0[r1] = r3
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }
}
