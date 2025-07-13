package p083f;

/* renamed from: f.w */
/* loaded from: classes.dex */
public class C1936w {

    /* renamed from: d */
    public static p083f.C1936w f8438d;

    /* renamed from: a */
    public final android.content.Context f8439a;

    /* renamed from: b */
    public final android.location.LocationManager f8440b;

    /* renamed from: c */
    public final p083f.C1936w.a f8441c;

    /* renamed from: f.w$a */
    public static class a {

        /* renamed from: a */
        public boolean f8442a;

        /* renamed from: b */
        public long f8443b;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public C1936w(android.content.Context r2, android.location.LocationManager r3) {
            r1 = this;
            r1.<init>()
            f.w$a r0 = new f.w$a
            r0.<init>()
            r1.f8441c = r0
            r1.f8439a = r2
            r1.f8440b = r3
            return
    }

    /* renamed from: a */
    public final android.location.Location m4797a(java.lang.String r3) {
            r2 = this;
            android.location.LocationManager r0 = r2.f8440b     // Catch: java.lang.Exception -> Lf
            boolean r0 = r0.isProviderEnabled(r3)     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L17
            android.location.LocationManager r0 = r2.f8440b     // Catch: java.lang.Exception -> Lf
            android.location.Location r3 = r0.getLastKnownLocation(r3)     // Catch: java.lang.Exception -> Lf
            return r3
        Lf:
            r3 = move-exception
            java.lang.String r0 = "TwilightManager"
            java.lang.String r1 = "Failed to get last known location"
            android.util.Log.d(r0, r1, r3)
        L17:
            r3 = 0
            return r3
    }
}
