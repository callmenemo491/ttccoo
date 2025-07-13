package p214m2;

/* renamed from: m2.y */
/* loaded from: classes.dex */
public final class C4347y implements p180k2.InterfaceC3671c {

    /* renamed from: j */
    public static final p106g3.C2235g<java.lang.Class<?>, byte[]> f17825j = null;

    /* renamed from: b */
    public final p229n2.InterfaceC4672b f17826b;

    /* renamed from: c */
    public final p180k2.InterfaceC3671c f17827c;

    /* renamed from: d */
    public final p180k2.InterfaceC3671c f17828d;

    /* renamed from: e */
    public final int f17829e;

    /* renamed from: f */
    public final int f17830f;

    /* renamed from: g */
    public final java.lang.Class<?> f17831g;

    /* renamed from: h */
    public final p180k2.C3673e f17832h;

    /* renamed from: i */
    public final p180k2.InterfaceC3676h<?> f17833i;

    static {
            g3.g r0 = new g3.g
            r1 = 50
            r0.<init>(r1)
            p214m2.C4347y.f17825j = r0
            return
    }

    public C4347y(p229n2.InterfaceC4672b r1, p180k2.InterfaceC3671c r2, p180k2.InterfaceC3671c r3, int r4, int r5, p180k2.InterfaceC3676h<?> r6, java.lang.Class<?> r7, p180k2.C3673e r8) {
            r0 = this;
            r0.<init>()
            r0.f17826b = r1
            r0.f17827c = r2
            r0.f17828d = r3
            r0.f17829e = r4
            r0.f17830f = r5
            r0.f17833i = r6
            r0.f17831g = r7
            r0.f17832h = r8
            return
    }

    @Override // p180k2.InterfaceC3671c
    /* renamed from: b */
    public void mo5082b(java.security.MessageDigest r5) {
            r4 = this;
            n2.b r0 = r4.f17826b
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 8
            java.lang.Object r0 = r0.mo10686c(r2, r1)
            byte[] r0 = (byte[]) r0
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            int r2 = r4.f17829e
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            int r2 = r4.f17830f
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            r1.array()
            k2.c r1 = r4.f17828d
            r1.mo5082b(r5)
            k2.c r1 = r4.f17827c
            r1.mo5082b(r5)
            r5.update(r0)
            k2.h<?> r1 = r4.f17833i
            if (r1 == 0) goto L33
            r1.mo5082b(r5)
        L33:
            k2.e r1 = r4.f17832h
            r1.mo5082b(r5)
            g3.g<java.lang.Class<?>, byte[]> r1 = p214m2.C4347y.f17825j
            java.lang.Class<?> r2 = r4.f17831g
            java.lang.Object r2 = r1.m5834a(r2)
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L55
            java.lang.Class<?> r2 = r4.f17831g
            java.lang.String r2 = r2.getName()
            java.nio.charset.Charset r3 = p180k2.InterfaceC3671c.f16244a
            byte[] r2 = r2.getBytes(r3)
            java.lang.Class<?> r3 = r4.f17831g
            r1.m5837d(r3, r2)
        L55:
            r5.update(r2)
            n2.b r5 = r4.f17826b
            r5.mo10687d(r0)
            return
    }

    @Override // p180k2.InterfaceC3671c
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p214m2.C4347y
            r1 = 0
            if (r0 == 0) goto L46
            m2.y r4 = (p214m2.C4347y) r4
            int r0 = r3.f17830f
            int r2 = r4.f17830f
            if (r0 != r2) goto L46
            int r0 = r3.f17829e
            int r2 = r4.f17829e
            if (r0 != r2) goto L46
            k2.h<?> r0 = r3.f17833i
            k2.h<?> r2 = r4.f17833i
            boolean r0 = p106g3.C2238j.m5842b(r0, r2)
            if (r0 == 0) goto L46
            java.lang.Class<?> r0 = r3.f17831g
            java.lang.Class<?> r2 = r4.f17831g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L46
            k2.c r0 = r3.f17827c
            k2.c r2 = r4.f17827c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L46
            k2.c r0 = r3.f17828d
            k2.c r2 = r4.f17828d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L46
            k2.e r0 = r3.f17832h
            k2.e r4 = r4.f17832h
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L46
            r1 = 1
        L46:
            return r1
    }

    @Override // p180k2.InterfaceC3671c
    public int hashCode() {
            r2 = this;
            k2.c r0 = r2.f17827c
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            k2.c r1 = r2.f17828d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f17829e
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f17830f
            int r1 = r1 + r0
            k2.h<?> r0 = r2.f17833i
            if (r0 == 0) goto L24
            int r1 = r1 * 31
            int r0 = r0.hashCode()
            int r1 = r1 + r0
        L24:
            int r1 = r1 * 31
            java.lang.Class<?> r0 = r2.f17831g
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            k2.e r1 = r2.f17832h
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ResourceCacheKey{sourceKey="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            k2.c r1 = r2.f17827c
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            k2.c r1 = r2.f17828d
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.f17829e
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.f17830f
            r0.append(r1)
            java.lang.String r1 = ", decodedResourceClass="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.f17831g
            r0.append(r1)
            java.lang.String r1 = ", transformation='"
            r0.append(r1)
            k2.h<?> r1 = r2.f17833i
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", options="
            r0.append(r1)
            k2.e r1 = r2.f17832h
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
