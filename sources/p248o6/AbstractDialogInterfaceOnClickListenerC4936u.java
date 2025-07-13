package p248o6;

/* renamed from: o6.u */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC4936u implements android.content.DialogInterface.OnClickListener {
    public AbstractDialogInterfaceOnClickListenerC4936u() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r4, int r5) {
            r3 = this;
            r5 = r3
            o6.w r5 = (p248o6.C4940w) r5     // Catch: android.content.ActivityNotFoundException -> Lf java.lang.Throwable -> L30
            android.content.Intent r0 = r5.f19547Y     // Catch: android.content.ActivityNotFoundException -> Lf java.lang.Throwable -> L30
            if (r0 == 0) goto L11
            android.app.Activity r1 = r5.f19548Z     // Catch: android.content.ActivityNotFoundException -> Lf java.lang.Throwable -> L30
            int r5 = r5.f19549a0     // Catch: android.content.ActivityNotFoundException -> Lf java.lang.Throwable -> L30
            r1.startActivityForResult(r0, r5)     // Catch: android.content.ActivityNotFoundException -> Lf java.lang.Throwable -> L30
            goto L11
        Lf:
            r5 = move-exception
            goto L15
        L11:
            r4.dismiss()
            return
        L15:
            java.lang.String r0 = "Failed to start resolution intent."
            java.lang.String r1 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "generic"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L27
            java.lang.String r1 = " This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L30
        L27:
            java.lang.String r1 = "DialogRedirect"
            android.util.Log.e(r1, r0, r5)     // Catch: java.lang.Throwable -> L30
            r4.dismiss()
            return
        L30:
            r5 = move-exception
            r4.dismiss()
            throw r5
    }
}
