package p264p0;

/* renamed from: p0.c */
/* loaded from: classes.dex */
public class C5339c extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ p264p0.InterfaceC5340d f21233a;

    public C5339c(android.view.inputmethod.InputConnection r1, boolean r2, p264p0.InterfaceC5340d r3) {
            r0 = this;
            r0.f21233a = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String r12, android.os.Bundle r13) {
            r11 = this;
            p0.d r0 = r11.f21233a
            r1 = 1
            r2 = 0
            if (r13 != 0) goto L8
            goto L87
        L8:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r12)
            if (r3 == 0) goto L12
            r3 = 0
            goto L1b
        L12:
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r12)
            if (r3 == 0) goto L87
            r3 = 1
        L1b:
            r4 = 0
            if (r3 == 0) goto L21
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L23
        L21:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L23:
            android.os.Parcelable r5 = r13.getParcelable(r5)     // Catch: java.lang.Throwable -> L7f
            android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L2e
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L30
        L2e:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L30:
            android.os.Parcelable r6 = r13.getParcelable(r6)     // Catch: java.lang.Throwable -> L7d
            android.net.Uri r6 = (android.net.Uri) r6     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L3b
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L3d
        L3b:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L3d:
            android.os.Parcelable r7 = r13.getParcelable(r7)     // Catch: java.lang.Throwable -> L7d
            android.content.ClipDescription r7 = (android.content.ClipDescription) r7     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L48
            java.lang.String r8 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L4a
        L48:
            java.lang.String r8 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L4a:
            android.os.Parcelable r8 = r13.getParcelable(r8)     // Catch: java.lang.Throwable -> L7d
            android.net.Uri r8 = (android.net.Uri) r8     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L55
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L57
        L55:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L57:
            int r9 = r13.getInt(r9)     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L60
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L62
        L60:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L62:
            android.os.Parcelable r3 = r13.getParcelable(r3)     // Catch: java.lang.Throwable -> L7d
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L77
            if (r7 == 0) goto L77
            p0.e r10 = new p0.e     // Catch: java.lang.Throwable -> L7d
            r10.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L7d
            androidx.appcompat.widget.t r0 = (androidx.appcompat.widget.C0303t) r0     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r0.m786a(r10, r9, r3)     // Catch: java.lang.Throwable -> L7d
        L77:
            if (r5 == 0) goto L87
            r5.send(r2, r4)
            goto L87
        L7d:
            r12 = move-exception
            goto L81
        L7f:
            r12 = move-exception
            r5 = r4
        L81:
            if (r5 == 0) goto L86
            r5.send(r2, r4)
        L86:
            throw r12
        L87:
            if (r2 == 0) goto L8a
            return r1
        L8a:
            boolean r12 = super.performPrivateCommand(r12, r13)
            return r12
    }
}
