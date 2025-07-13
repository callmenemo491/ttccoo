package ca;

/* renamed from: ca.c */
/* loaded from: classes.dex */
public class C0940c implements ca.InterfaceC0939b {
    public C0940c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ca.InterfaceC0939b
    /* renamed from: f */
    public void mo2663f(ca.InterfaceC0938a r3) {
            r2 = this;
            r3 = 3
            java.lang.String r0 = "FirebaseCrashlytics"
            boolean r3 = android.util.Log.isLoggable(r0, r3)
            if (r3 == 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 == 0) goto L14
            r3 = 0
            java.lang.String r1 = "Could not register handler for breadcrumbs events."
            android.util.Log.d(r0, r1, r3)
        L14:
            return
    }
}
