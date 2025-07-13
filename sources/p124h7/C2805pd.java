package p124h7;

/* renamed from: h7.pd */
/* loaded from: classes.dex */
public final class C2805pd extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public final java.lang.String f11834a;

    /* renamed from: b */
    public final /* synthetic */ p124h7.C2841rd f11835b;

    public C2805pd(p124h7.C2841rd r1, java.lang.String r2) {
            r0 = this;
            r0.f11835b = r1
            r0.<init>()
            r0.f11834a = r2
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            java.lang.String r0 = r5.getAction()
            java.lang.String r1 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L81
            android.os.Bundle r5 = r5.getExtras()
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.EXTRA_STATUS"
            java.lang.Object r0 = r5.get(r0)
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0
            int r0 = r0.f5536Z
            if (r0 == 0) goto L1d
            goto L7a
        L1d:
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            h7.rd r0 = r3.f11835b
            java.util.HashMap<java.lang.String, h7.qd> r0 = r0.f11888c
            java.lang.String r1 = r3.f11834a
            java.lang.Object r0 = r0.get(r1)
            h7.qd r0 = (p124h7.C2823qd) r0
            r1 = 0
            if (r0 != 0) goto L44
            r6.a r5 = p124h7.C2841rd.f11885d
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = r5.f22479a
            java.lang.String r2 = "Verification code received with no active retrieval session."
            java.lang.String r5 = r5.m12162c(r2, r0)
        L40:
            android.util.Log.e(r1, r5)
            goto L7a
        L44:
            java.lang.String r2 = "(?<!\\d)\\d{6}(?!\\d)"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r5 = r2.matcher(r5)
            boolean r2 = r5.find()
            if (r2 == 0) goto L59
            java.lang.String r5 = r5.group()
            goto L5a
        L59:
            r5 = 0
        L5a:
            r0.f11859e = r5
            if (r5 != 0) goto L6b
            r6.a r5 = p124h7.C2841rd.f11885d
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = r5.f22479a
            java.lang.String r2 = "Unable to extract verification code."
            java.lang.String r5 = r5.m12162c(r2, r0)
            goto L40
        L6b:
            java.lang.String r5 = r0.f11858d
            boolean r5 = p036c6.C0906q0.m2629q(r5)
            if (r5 != 0) goto L7a
            h7.rd r5 = r3.f11835b
            java.lang.String r0 = r3.f11834a
            p124h7.C2841rd.m7099b(r5, r0)
        L7a:
            android.content.Context r4 = r4.getApplicationContext()
            r4.unregisterReceiver(r3)
        L81:
            return
    }
}
