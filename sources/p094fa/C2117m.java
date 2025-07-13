package p094fa;

/* renamed from: fa.m */
/* loaded from: classes.dex */
public final class C2117m extends p094fa.AbstractC2103a0.e.d.a.b {

    /* renamed from: a */
    public final p094fa.C2105b0<p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d> f9756a;

    /* renamed from: b */
    public final p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b f9757b;

    /* renamed from: c */
    public final p094fa.AbstractC2103a0.a f9758c;

    /* renamed from: d */
    public final p094fa.AbstractC2103a0.e.d.a.b.c f9759d;

    /* renamed from: e */
    public final p094fa.C2105b0<p094fa.AbstractC2103a0.e.d.a.b.AbstractC7384a> f9760e;

    /* renamed from: fa.m$a */
    public static /* synthetic */ class a {
    }

    public C2117m(p094fa.C2105b0 r1, p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b r2, p094fa.AbstractC2103a0.a r3, p094fa.AbstractC2103a0.e.d.a.b.c r4, p094fa.C2105b0 r5, p094fa.C2117m.a r6) {
            r0 = this;
            r0.<init>()
            r0.f9756a = r1
            r0.f9757b = r2
            r0.f9758c = r3
            r0.f9759d = r4
            r0.f9760e = r5
            return
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b
    /* renamed from: a */
    public p094fa.AbstractC2103a0.a mo5624a() {
            r1 = this;
            fa.a0$a r0 = r1.f9758c
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b
    /* renamed from: b */
    public p094fa.C2105b0<p094fa.AbstractC2103a0.e.d.a.b.AbstractC7384a> mo5625b() {
            r1 = this;
            fa.b0<fa.a0$e$d$a$b$a> r0 = r1.f9760e
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b
    /* renamed from: c */
    public p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b mo5626c() {
            r1 = this;
            fa.a0$e$d$a$b$b r0 = r1.f9757b
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b
    /* renamed from: d */
    public p094fa.AbstractC2103a0.e.d.a.b.c mo5627d() {
            r1 = this;
            fa.a0$e$d$a$b$c r0 = r1.f9759d
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b
    /* renamed from: e */
    public p094fa.C2105b0<p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d> mo5628e() {
            r1 = this;
            fa.b0<fa.a0$e$d$a$b$d> r0 = r1.f9756a
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2103a0.e.d.a.b
            r2 = 0
            if (r1 == 0) goto L65
            fa.a0$e$d$a$b r5 = (p094fa.AbstractC2103a0.e.d.a.b) r5
            fa.b0<fa.a0$e$d$a$b$d> r1 = r4.f9756a
            if (r1 != 0) goto L16
            fa.b0 r1 = r5.mo5628e()
            if (r1 != 0) goto L63
            goto L20
        L16:
            fa.b0 r3 = r5.mo5628e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L63
        L20:
            fa.a0$e$d$a$b$b r1 = r4.f9757b
            if (r1 != 0) goto L2b
            fa.a0$e$d$a$b$b r1 = r5.mo5626c()
            if (r1 != 0) goto L63
            goto L35
        L2b:
            fa.a0$e$d$a$b$b r3 = r5.mo5626c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L63
        L35:
            fa.a0$a r1 = r4.f9758c
            if (r1 != 0) goto L40
            fa.a0$a r1 = r5.mo5624a()
            if (r1 != 0) goto L63
            goto L4a
        L40:
            fa.a0$a r3 = r5.mo5624a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L63
        L4a:
            fa.a0$e$d$a$b$c r1 = r4.f9759d
            fa.a0$e$d$a$b$c r3 = r5.mo5627d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L63
            fa.b0<fa.a0$e$d$a$b$a> r1 = r4.f9760e
            fa.b0 r5 = r5.mo5625b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L63
            goto L64
        L63:
            r0 = 0
        L64:
            return r0
        L65:
            return r2
    }

    public int hashCode() {
            r4 = this;
            fa.b0<fa.a0$e$d$a$b$d> r0 = r4.f9756a
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
            fa.a0$e$d$a$b$b r3 = r4.f9757b
            if (r3 != 0) goto L17
            r3 = 0
            goto L1b
        L17:
            int r3 = r3.hashCode()
        L1b:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            fa.a0$a r3 = r4.f9758c
            if (r3 != 0) goto L23
            goto L27
        L23:
            int r1 = r3.hashCode()
        L27:
            r0 = r0 ^ r1
            int r0 = r0 * r2
            fa.a0$e$d$a$b$c r1 = r4.f9759d
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            int r0 = r0 * r2
            fa.b0<fa.a0$e$d$a$b$a> r1 = r4.f9760e
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Execution{threads="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            fa.b0<fa.a0$e$d$a$b$d> r1 = r2.f9756a
            r0.append(r1)
            java.lang.String r1 = ", exception="
            r0.append(r1)
            fa.a0$e$d$a$b$b r1 = r2.f9757b
            r0.append(r1)
            java.lang.String r1 = ", appExitInfo="
            r0.append(r1)
            fa.a0$a r1 = r2.f9758c
            r0.append(r1)
            java.lang.String r1 = ", signal="
            r0.append(r1)
            fa.a0$e$d$a$b$c r1 = r2.f9759d
            r0.append(r1)
            java.lang.String r1 = ", binaries="
            r0.append(r1)
            fa.b0<fa.a0$e$d$a$b$a> r1 = r2.f9760e
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
