package p358uc;

/* renamed from: uc.b */
/* loaded from: classes.dex */
public class C6373b implements com.eclipsesource.p043v8.JavaCallback {
    public C6373b(p358uc.C6376e r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.eclipsesource.p043v8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.p043v8.V8Object r4, com.eclipsesource.p043v8.V8Array r5) {
            r3 = this;
            r4 = 0
            java.lang.String r4 = r5.getString(r4)
            java.util.Objects.requireNonNull(r4)
            java.lang.String r0 = "debug"
            boolean r0 = r4.equals(r0)
            r1 = 1
            java.lang.String r2 = "ESR-V8"
            if (r0 != 0) goto L2b
            java.lang.String r0 = "error"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L23
            java.lang.String r4 = r5.getString(r1)
            android.util.Log.i(r2, r4)
            goto L32
        L23:
            java.lang.String r4 = r5.getString(r1)
            android.util.Log.e(r2, r4)
            goto L32
        L2b:
            java.lang.String r4 = r5.getString(r1)
            android.util.Log.d(r2, r4)
        L32:
            r4 = 0
            return r4
    }
}
