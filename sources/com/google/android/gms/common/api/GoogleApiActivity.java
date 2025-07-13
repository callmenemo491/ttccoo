package com.google.android.gms.common.api;

@com.google.android.gms.common.annotation.KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: Z */
    public static final /* synthetic */ int f5528Z = 0;

    /* renamed from: Y */
    public int f5529Y;

    public GoogleApiActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5529Y = r0
            return
    }

    @Override // android.app.Activity
    public void onActivityResult(int r4, int r5, @androidx.annotation.RecentlyNonNull android.content.Intent r6) {
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            r0 = 1
            r1 = 0
            if (r4 != r0) goto L50
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r2 = "notify_manager"
            boolean r4 = r4.getBooleanExtra(r2, r0)
            r3.f5529Y = r1
            r3.setResult(r5, r6)
            if (r4 == 0) goto L58
            com.google.android.gms.common.api.internal.b r4 = com.google.android.gms.common.api.internal.C1082b.m3054a(r3)
            r6 = -1
            if (r5 == r6) goto L45
            if (r5 == 0) goto L22
            goto L58
        L22:
            k6.b r5 = new k6.b
            r0 = 13
            r2 = 0
            r5.<init>(r0, r2)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r2 = "failing_client_id"
            int r6 = r0.getIntExtra(r2, r6)
            boolean r0 = r4.m3057c(r5, r6)
            if (r0 != 0) goto L58
            android.os.Handler r4 = r4.f5573k0
            r0 = 5
            android.os.Message r5 = r4.obtainMessage(r0, r6, r1, r5)
            r4.sendMessage(r5)
            goto L58
        L45:
            android.os.Handler r4 = r4.f5573k0
            r5 = 3
            android.os.Message r5 = r4.obtainMessage(r5)
            r4.sendMessage(r5)
            goto L58
        L50:
            r0 = 2
            if (r4 != r0) goto L58
            r3.f5529Y = r1
            r3.setResult(r5, r6)
        L58:
            r3.finish()
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@androidx.annotation.RecentlyNonNull android.content.DialogInterface r1) {
            r0 = this;
            r1 = 0
            r0.f5529Y = r1
            r0.setResult(r1)
            r0.finish()
            return
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r11) {
            r10 = this;
            super.onCreate(r11)
            if (r11 == 0) goto Ld
            java.lang.String r0 = "resolution"
            int r11 = r11.getInt(r0)
            r10.f5529Y = r11
        Ld:
            int r11 = r10.f5529Y
            r0 = 1
            if (r11 == r0) goto Lc9
            android.content.Intent r11 = r10.getIntent()
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r1 = "GoogleApiActivity"
            if (r11 != 0) goto L21
            java.lang.String r11 = "Activity started without extras"
            goto L37
        L21:
            java.lang.String r2 = "pending_intent"
            java.lang.Object r2 = r11.get(r2)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            java.lang.String r3 = "error_code"
            java.lang.Object r3 = r11.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r2 != 0) goto L3c
            if (r3 != 0) goto L3c
            java.lang.String r11 = "Activity started without resolution"
        L37:
            android.util.Log.e(r1, r11)
            goto Lb2
        L3c:
            if (r2 == 0) goto Lb6
            android.content.IntentSender r4 = r2.getIntentSender()     // Catch: android.content.IntentSender.SendIntentException -> L4e android.content.ActivityNotFoundException -> L55
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r10
            r3.startIntentSenderForResult(r4, r5, r6, r7, r8, r9)     // Catch: android.content.IntentSender.SendIntentException -> L4e android.content.ActivityNotFoundException -> L55
            r10.f5529Y = r0     // Catch: android.content.IntentSender.SendIntentException -> L4e android.content.ActivityNotFoundException -> L55
            return
        L4e:
            r11 = move-exception
            java.lang.String r0 = "Failed to launch pendingIntent"
            android.util.Log.e(r1, r0, r11)
            goto Lb2
        L55:
            r3 = move-exception
            java.lang.String r4 = "notify_manager"
            boolean r11 = r11.getBoolean(r4, r0)
            if (r11 == 0) goto L87
            com.google.android.gms.common.api.internal.b r11 = com.google.android.gms.common.api.internal.C1082b.m3054a(r10)
            k6.b r1 = new k6.b
            r2 = 22
            r3 = 0
            r1.<init>(r2, r3)
            android.content.Intent r2 = r10.getIntent()
            r3 = -1
            java.lang.String r4 = "failing_client_id"
            int r2 = r2.getIntExtra(r4, r3)
            boolean r3 = r11.m3057c(r1, r2)
            if (r3 != 0) goto Lb0
            android.os.Handler r11 = r11.f5573k0
            r3 = 5
            r4 = 0
            android.os.Message r1 = r11.obtainMessage(r3, r2, r4, r1)
            r11.sendMessage(r1)
            goto Lb0
        L87:
            java.lang.String r11 = java.lang.String.valueOf(r2)
            int r2 = r11.length()
            int r2 = r2 + 36
            java.lang.String r4 = "Activity not found while launching "
            java.lang.String r5 = "."
            java.lang.String r11 = p088f4.C2035p.m5377a(r2, r4, r11, r5)
            java.lang.String r2 = android.os.Build.FINGERPRINT
            java.lang.String r4 = "generic"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto Lad
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r2 = " This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."
            java.lang.String r11 = r11.concat(r2)
        Lad:
            android.util.Log.e(r1, r11, r3)
        Lb0:
            r10.f5529Y = r0
        Lb2:
            r10.finish()
            return
        Lb6:
            java.lang.String r11 = "null reference"
            java.util.Objects.requireNonNull(r3, r11)
            int r11 = r3.intValue()
            java.lang.Object r1 = p184k6.C3702e.f16404c
            k6.e r1 = p184k6.C3702e.f16405d
            r2 = 2
            r1.m8165c(r10, r11, r2, r10)
            r10.f5529Y = r0
        Lc9:
            return
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@androidx.annotation.RecentlyNonNull android.os.Bundle r3) {
            r2 = this;
            int r0 = r2.f5529Y
            java.lang.String r1 = "resolution"
            r3.putInt(r1, r0)
            super.onSaveInstanceState(r3)
            return
    }
}
