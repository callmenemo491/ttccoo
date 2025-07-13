package p095fb;

/* renamed from: fb.a */
/* loaded from: classes.dex */
public final class C2131a extends p095fb.AbstractC2134d {

    /* renamed from: a */
    public final java.lang.String f9825a;

    /* renamed from: b */
    public final java.lang.String f9826b;

    public C2131a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null libraryName"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f9825a = r2
            java.lang.String r2 = "Null version"
            java.util.Objects.requireNonNull(r3, r2)
            r1.f9826b = r3
            return
    }

    @Override // p095fb.AbstractC2134d
    /* renamed from: a */
    public java.lang.String mo5691a() {
            r1 = this;
            java.lang.String r0 = r1.f9825a
            return r0
    }

    @Override // p095fb.AbstractC2134d
    /* renamed from: b */
    public java.lang.String mo5692b() {
            r1 = this;
            java.lang.String r0 = r1.f9826b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p095fb.AbstractC2134d
            r2 = 0
            if (r1 == 0) goto L26
            fb.d r5 = (p095fb.AbstractC2134d) r5
            java.lang.String r1 = r4.f9825a
            java.lang.String r3 = r5.mo5691a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            java.lang.String r1 = r4.f9826b
            java.lang.String r5 = r5.mo5692b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
        L26:
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f9825a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r1 = r2.f9826b
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "LibraryVersion{libraryName="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f9825a
            r0.append(r1)
            java.lang.String r1 = ", version="
            r0.append(r1)
            java.lang.String r1 = r3.f9826b
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
