package p094fa;

/* renamed from: fa.o */
/* loaded from: classes.dex */
public final class C2119o extends p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b {

    /* renamed from: a */
    public final java.lang.String f9765a;

    /* renamed from: b */
    public final java.lang.String f9766b;

    /* renamed from: c */
    public final p094fa.C2105b0<p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a> f9767c;

    /* renamed from: d */
    public final p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b f9768d;

    /* renamed from: e */
    public final int f9769e;

    /* renamed from: fa.o$a */
    public static /* synthetic */ class a {
    }

    public C2119o(java.lang.String r1, java.lang.String r2, p094fa.C2105b0 r3, p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b r4, int r5, p094fa.C2119o.a r6) {
            r0 = this;
            r0.<init>()
            r0.f9765a = r1
            r0.f9766b = r2
            r0.f9767c = r3
            r0.f9768d = r4
            r0.f9769e = r5
            return
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b
    /* renamed from: a */
    public p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b mo5633a() {
            r1 = this;
            fa.a0$e$d$a$b$b r0 = r1.f9768d
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b
    /* renamed from: b */
    public p094fa.C2105b0<p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a> mo5634b() {
            r1 = this;
            fa.b0<fa.a0$e$d$a$b$d$a> r0 = r1.f9767c
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b
    /* renamed from: c */
    public int mo5635c() {
            r1 = this;
            int r0 = r1.f9769e
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b
    /* renamed from: d */
    public java.lang.String mo5636d() {
            r1 = this;
            java.lang.String r0 = r1.f9766b
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b
    /* renamed from: e */
    public java.lang.String mo5637e() {
            r1 = this;
            java.lang.String r0 = r1.f9765a
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b
            r2 = 0
            if (r1 == 0) goto L58
            fa.a0$e$d$a$b$b r5 = (p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b) r5
            java.lang.String r1 = r4.f9765a
            java.lang.String r3 = r5.mo5637e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
            java.lang.String r1 = r4.f9766b
            if (r1 != 0) goto L22
            java.lang.String r1 = r5.mo5636d()
            if (r1 != 0) goto L56
            goto L2c
        L22:
            java.lang.String r3 = r5.mo5636d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
        L2c:
            fa.b0<fa.a0$e$d$a$b$d$a> r1 = r4.f9767c
            fa.b0 r3 = r5.mo5634b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
            fa.a0$e$d$a$b$b r1 = r4.f9768d
            if (r1 != 0) goto L43
            fa.a0$e$d$a$b$b r1 = r5.mo5633a()
            if (r1 != 0) goto L56
            goto L4d
        L43:
            fa.a0$e$d$a$b$b r3 = r5.mo5633a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
        L4d:
            int r1 = r4.f9769e
            int r5 = r5.mo5635c()
            if (r1 != r5) goto L56
            goto L57
        L56:
            r0 = 0
        L57:
            return r0
        L58:
            return r2
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f9765a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9766b
            r3 = 0
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            fa.b0<fa.a0$e$d$a$b$d$a> r2 = r4.f9767c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            fa.a0$e$d$a$b$b r2 = r4.f9768d
            if (r2 != 0) goto L28
            goto L2c
        L28:
            int r3 = r2.hashCode()
        L2c:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            int r1 = r4.f9769e
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Exception{type="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f9765a
            r0.append(r1)
            java.lang.String r1 = ", reason="
            r0.append(r1)
            java.lang.String r1 = r3.f9766b
            r0.append(r1)
            java.lang.String r1 = ", frames="
            r0.append(r1)
            fa.b0<fa.a0$e$d$a$b$d$a> r1 = r3.f9767c
            r0.append(r1)
            java.lang.String r1 = ", causedBy="
            r0.append(r1)
            fa.a0$e$d$a$b$b r1 = r3.f9768d
            r0.append(r1)
            java.lang.String r1 = ", overflowCount="
            r0.append(r1)
            int r1 = r3.f9769e
            java.lang.String r2 = "}"
            java.lang.String r0 = p381w.C6764e.m13690a(r0, r1, r2)
            return r0
    }
}
