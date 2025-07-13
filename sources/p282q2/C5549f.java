package p282q2;

/* renamed from: q2.f */
/* loaded from: classes.dex */
public class C5549f implements p180k2.InterfaceC3671c {

    /* renamed from: b */
    public final p282q2.InterfaceC5550g f21601b;

    /* renamed from: c */
    public final java.net.URL f21602c;

    /* renamed from: d */
    public final java.lang.String f21603d;

    /* renamed from: e */
    public java.lang.String f21604e;

    /* renamed from: f */
    public java.net.URL f21605f;

    /* renamed from: g */
    public volatile byte[] f21606g;

    /* renamed from: h */
    public int f21607h;

    public C5549f(java.lang.String r3) {
            r2 = this;
            q2.g r0 = p282q2.InterfaceC5550g.f21608a
            r2.<init>()
            r1 = 0
            r2.f21602c = r1
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L18
            r2.f21603d = r3
            java.lang.String r3 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r3)
            r2.f21601b = r0
            return
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must not be null or empty"
            r3.<init>(r0)
            throw r3
    }

    public C5549f(java.net.URL r3) {
            r2 = this;
            q2.g r0 = p282q2.InterfaceC5550g.f21608a
            r2.<init>()
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r3, r1)
            r2.f21602c = r3
            r3 = 0
            r2.f21603d = r3
            java.util.Objects.requireNonNull(r0, r1)
            r2.f21601b = r0
            return
    }

    @Override // p180k2.InterfaceC3671c
    /* renamed from: b */
    public void mo5082b(java.security.MessageDigest r3) {
            r2 = this;
            byte[] r0 = r2.f21606g
            if (r0 != 0) goto L10
            java.lang.String r0 = r2.m11831c()
            java.nio.charset.Charset r1 = p180k2.InterfaceC3671c.f16244a
            byte[] r0 = r0.getBytes(r1)
            r2.f21606g = r0
        L10:
            byte[] r0 = r2.f21606g
            r3.update(r0)
            return
    }

    /* renamed from: c */
    public java.lang.String m11831c() {
            r2 = this;
            java.lang.String r0 = r2.f21603d
            if (r0 == 0) goto L5
            goto L10
        L5:
            java.net.URL r0 = r2.f21602c
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.String r0 = r0.toString()
        L10:
            return r0
    }

    /* renamed from: d */
    public java.net.URL m11832d() {
            r3 = this;
            java.net.URL r0 = r3.f21605f
            if (r0 != 0) goto L30
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r3.f21604e
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L29
            java.lang.String r1 = r3.f21603d
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L21
            java.net.URL r1 = r3.f21602c
            java.lang.String r2 = "Argument must not be null"
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.toString()
        L21:
            java.lang.String r2 = "@#&=*+-_.,:!?()/~'%;$"
            java.lang.String r1 = android.net.Uri.encode(r1, r2)
            r3.f21604e = r1
        L29:
            java.lang.String r1 = r3.f21604e
            r0.<init>(r1)
            r3.f21605f = r0
        L30:
            java.net.URL r0 = r3.f21605f
            return r0
    }

    @Override // p180k2.InterfaceC3671c
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p282q2.C5549f
            r1 = 0
            if (r0 == 0) goto L20
            q2.f r4 = (p282q2.C5549f) r4
            java.lang.String r0 = r3.m11831c()
            java.lang.String r2 = r4.m11831c()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L20
            q2.g r0 = r3.f21601b
            q2.g r4 = r4.f21601b
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L20
            r1 = 1
        L20:
            return r1
    }

    @Override // p180k2.InterfaceC3671c
    public int hashCode() {
            r2 = this;
            int r0 = r2.f21607h
            if (r0 != 0) goto L19
            java.lang.String r0 = r2.m11831c()
            int r0 = r0.hashCode()
            r2.f21607h = r0
            int r0 = r0 * 31
            q2.g r1 = r2.f21601b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r2.f21607h = r1
        L19:
            int r0 = r2.f21607h
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.m11831c()
            return r0
    }
}
