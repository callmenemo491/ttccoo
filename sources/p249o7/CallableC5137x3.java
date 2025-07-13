package p249o7;

/* renamed from: o7.x3 */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC5137x3 implements java.util.concurrent.Callable {

    /* renamed from: a */
    public final /* synthetic */ int f20163a;

    /* renamed from: b */
    public final /* synthetic */ p249o7.C4953a4 f20164b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.String f20165c;

    public /* synthetic */ CallableC5137x3(p249o7.C4953a4 r2, java.lang.String r3, int r4) {
            r1 = this;
            r1.f20163a = r4
            r0 = 1
            if (r4 == r0) goto L18
            r0 = 2
            if (r4 == r0) goto L10
            r1.<init>()
            r1.f20164b = r2
            r1.f20165c = r3
            return
        L10:
            r1.<init>()
            r1.f20164b = r2
            r1.f20165c = r3
            return
        L18:
            r1.<init>()
            r1.f20164b = r2
            r1.f20165c = r3
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r6 = this;
            int r0 = r6.f20163a
            switch(r0) {
                case 0: goto L61;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L72
        L6:
            o7.a4 r0 = r6.f20164b
            java.lang.String r1 = r6.f20165c
            o7.m6 r2 = r0.f19756b
            o7.j r2 = r2.f19862c
            p249o7.C5052m6.m11327I(r2)
            o7.h4 r2 = r2.m11255F(r1)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "platform"
            java.lang.String r5 = "android"
            r3.put(r4, r5)
            java.lang.String r4 = "package_name"
            r3.put(r4, r1)
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f r0 = r0.f5716g
            r0.m11157q()
            r0 = 43042(0xa822, double:2.12656E-319)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "gmp_version"
            r3.put(r1, r0)
            if (r2 == 0) goto L60
            java.lang.String r0 = r2.m11216P()
            if (r0 == 0) goto L46
            java.lang.String r1 = "app_version"
            r3.put(r1, r0)
        L46:
            long r0 = r2.m11202B()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "app_version_int"
            r3.put(r1, r0)
            long r0 = r2.m11205E()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "dynamite_version"
            r3.put(r1, r0)
        L60:
            return r3
        L61:
            o7.a4 r0 = r6.f20164b
            java.lang.String r1 = r6.f20165c
            k7.w7 r2 = new k7.w7
            androidx.appcompat.widget.x r3 = new androidx.appcompat.widget.x
            r3.<init>(r0, r1)
            java.lang.String r0 = "internal.remoteConfig"
            r2.<init>(r0, r3)
            return r2
        L72:
            o7.a4 r0 = r6.f20164b
            java.lang.String r1 = r6.f20165c
            k7.e6 r2 = new k7.e6
            o7.x3 r3 = new o7.x3
            r4 = 1
            r3.<init>(r0, r1, r4)
            r2.<init>(r3)
            return r2
    }
}
