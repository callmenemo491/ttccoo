package p012ab;

/* renamed from: ab.a */
/* loaded from: classes.dex */
public final class C0049a extends p012ab.AbstractC0052d {

    /* renamed from: a */
    public final java.lang.String f102a;

    /* renamed from: b */
    public final java.lang.String f103b;

    /* renamed from: c */
    public final java.lang.String f104c;

    /* renamed from: d */
    public final p012ab.AbstractC0054f f105d;

    /* renamed from: e */
    public final p012ab.AbstractC0052d.a f106e;

    /* renamed from: ab.a$a */
    public static /* synthetic */ class a {
    }

    public C0049a(java.lang.String r1, java.lang.String r2, java.lang.String r3, p012ab.AbstractC0054f r4, p012ab.AbstractC0052d.a r5, p012ab.C0049a.a r6) {
            r0 = this;
            r0.<init>()
            r0.f102a = r1
            r0.f103b = r2
            r0.f104c = r3
            r0.f105d = r4
            r0.f106e = r5
            return
    }

    @Override // p012ab.AbstractC0052d
    /* renamed from: a */
    public p012ab.AbstractC0054f mo56a() {
            r1 = this;
            ab.f r0 = r1.f105d
            return r0
    }

    @Override // p012ab.AbstractC0052d
    /* renamed from: b */
    public java.lang.String mo57b() {
            r1 = this;
            java.lang.String r0 = r1.f103b
            return r0
    }

    @Override // p012ab.AbstractC0052d
    /* renamed from: c */
    public java.lang.String mo58c() {
            r1 = this;
            java.lang.String r0 = r1.f104c
            return r0
    }

    @Override // p012ab.AbstractC0052d
    /* renamed from: d */
    public p012ab.AbstractC0052d.a mo59d() {
            r1 = this;
            ab.d$a r0 = r1.f106e
            return r0
    }

    @Override // p012ab.AbstractC0052d
    /* renamed from: e */
    public java.lang.String mo60e() {
            r1 = this;
            java.lang.String r0 = r1.f102a
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p012ab.AbstractC0052d
            r2 = 0
            if (r1 == 0) goto L73
            ab.d r5 = (p012ab.AbstractC0052d) r5
            java.lang.String r1 = r4.f102a
            if (r1 != 0) goto L16
            java.lang.String r1 = r5.mo60e()
            if (r1 != 0) goto L71
            goto L20
        L16:
            java.lang.String r3 = r5.mo60e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L71
        L20:
            java.lang.String r1 = r4.f103b
            if (r1 != 0) goto L2b
            java.lang.String r1 = r5.mo57b()
            if (r1 != 0) goto L71
            goto L35
        L2b:
            java.lang.String r3 = r5.mo57b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L71
        L35:
            java.lang.String r1 = r4.f104c
            if (r1 != 0) goto L40
            java.lang.String r1 = r5.mo58c()
            if (r1 != 0) goto L71
            goto L4a
        L40:
            java.lang.String r3 = r5.mo58c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L71
        L4a:
            ab.f r1 = r4.f105d
            if (r1 != 0) goto L55
            ab.f r1 = r5.mo56a()
            if (r1 != 0) goto L71
            goto L5f
        L55:
            ab.f r3 = r5.mo56a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L71
        L5f:
            ab.d$a r1 = r4.f106e
            ab.d$a r5 = r5.mo59d()
            if (r1 != 0) goto L6a
            if (r5 != 0) goto L71
            goto L72
        L6a:
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L71
            goto L72
        L71:
            r0 = 0
        L72:
            return r0
        L73:
            return r2
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f102a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r2
            int r0 = r0 * r2
            java.lang.String r3 = r4.f103b
            if (r3 != 0) goto L17
            r3 = 0
            goto L1b
        L17:
            int r3 = r3.hashCode()
        L1b:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r4.f104c
            if (r3 != 0) goto L24
            r3 = 0
            goto L28
        L24:
            int r3 = r3.hashCode()
        L28:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            ab.f r3 = r4.f105d
            if (r3 != 0) goto L31
            r3 = 0
            goto L35
        L31:
            int r3 = r3.hashCode()
        L35:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            ab.d$a r2 = r4.f106e
            if (r2 != 0) goto L3d
            goto L41
        L3d:
            int r1 = r2.hashCode()
        L41:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "InstallationResponse{uri="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f102a
            r0.append(r1)
            java.lang.String r1 = ", fid="
            r0.append(r1)
            java.lang.String r1 = r2.f103b
            r0.append(r1)
            java.lang.String r1 = ", refreshToken="
            r0.append(r1)
            java.lang.String r1 = r2.f104c
            r0.append(r1)
            java.lang.String r1 = ", authToken="
            r0.append(r1)
            ab.f r1 = r2.f105d
            r0.append(r1)
            java.lang.String r1 = ", responseCode="
            r0.append(r1)
            ab.d$a r1 = r2.f106e
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
