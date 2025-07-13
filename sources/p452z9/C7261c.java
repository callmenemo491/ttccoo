package p452z9;

/* renamed from: z9.c */
/* loaded from: classes.dex */
public class C7261c implements p329s9.InterfaceC5997a.b {

    /* renamed from: a */
    public ba.InterfaceC0728b f27868a;

    /* renamed from: b */
    public ba.InterfaceC0728b f27869b;

    public C7261c() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public void m14339a(int r5, android.os.Bundle r6) {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            java.lang.String r5 = "Analytics listener received message. ID: %d, Extras: %s"
            java.lang.String r5 = java.lang.String.format(r0, r5, r2)
            java.lang.String r0 = "FirebaseCrashlytics"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L21
            r1 = 0
            android.util.Log.v(r0, r5, r1)
        L21:
            java.lang.String r5 = "name"
            java.lang.String r5 = r6.getString(r5)
            if (r5 == 0) goto L4f
            java.lang.String r0 = "params"
            android.os.Bundle r6 = r6.getBundle(r0)
            if (r6 != 0) goto L36
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L36:
            java.lang.String r0 = "_o"
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = "clx"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L47
            ba.b r0 = r4.f27868a
            goto L49
        L47:
            ba.b r0 = r4.f27869b
        L49:
            if (r0 != 0) goto L4c
            goto L4f
        L4c:
            r0.mo2334G(r5, r6)
        L4f:
            return
    }
}
