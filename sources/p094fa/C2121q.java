package p094fa;

/* renamed from: fa.q */
/* loaded from: classes.dex */
public final class C2121q extends p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d {

    /* renamed from: a */
    public final java.lang.String f9773a;

    /* renamed from: b */
    public final int f9774b;

    /* renamed from: c */
    public final p094fa.C2105b0<p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a> f9775c;

    /* renamed from: fa.q$a */
    public static /* synthetic */ class a {
    }

    public C2121q(java.lang.String r1, int r2, p094fa.C2105b0 r3, p094fa.C2121q.a r4) {
            r0 = this;
            r0.<init>()
            r0.f9773a = r1
            r0.f9774b = r2
            r0.f9775c = r3
            return
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d
    /* renamed from: a */
    public p094fa.C2105b0<p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a> mo5641a() {
            r1 = this;
            fa.b0<fa.a0$e$d$a$b$d$a> r0 = r1.f9775c
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d
    /* renamed from: b */
    public int mo5642b() {
            r1 = this;
            int r0 = r1.f9774b
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d
    /* renamed from: c */
    public java.lang.String mo5643c() {
            r1 = this;
            java.lang.String r0 = r1.f9773a
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d
            r2 = 0
            if (r1 == 0) goto L2e
            fa.a0$e$d$a$b$d r5 = (p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d) r5
            java.lang.String r1 = r4.f9773a
            java.lang.String r3 = r5.mo5643c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            int r1 = r4.f9774b
            int r3 = r5.mo5642b()
            if (r1 != r3) goto L2c
            fa.b0<fa.a0$e$d$a$b$d$a> r1 = r4.f9775c
            fa.b0 r5 = r5.mo5641a()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
        L2e:
            return r2
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9773a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.f9774b
            r0 = r0 ^ r2
            int r0 = r0 * r1
            fa.b0<fa.a0$e$d$a$b$d$a> r1 = r3.f9775c
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Thread{name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f9773a
            r0.append(r1)
            java.lang.String r1 = ", importance="
            r0.append(r1)
            int r1 = r2.f9774b
            r0.append(r1)
            java.lang.String r1 = ", frames="
            r0.append(r1)
            fa.b0<fa.a0$e$d$a$b$d$a> r1 = r2.f9775c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
