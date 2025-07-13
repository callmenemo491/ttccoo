package p094fa;

/* renamed from: fa.l */
/* loaded from: classes.dex */
public final class C2116l extends p094fa.AbstractC2103a0.e.d.a {

    /* renamed from: a */
    public final p094fa.AbstractC2103a0.e.d.a.b f9746a;

    /* renamed from: b */
    public final p094fa.C2105b0<p094fa.AbstractC2103a0.c> f9747b;

    /* renamed from: c */
    public final p094fa.C2105b0<p094fa.AbstractC2103a0.c> f9748c;

    /* renamed from: d */
    public final java.lang.Boolean f9749d;

    /* renamed from: e */
    public final int f9750e;

    /* renamed from: fa.l$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: fa.l$b */
    public static final class b extends p094fa.AbstractC2103a0.e.d.a.AbstractC7383a {

        /* renamed from: a */
        public p094fa.AbstractC2103a0.e.d.a.b f9751a;

        /* renamed from: b */
        public p094fa.C2105b0<p094fa.AbstractC2103a0.c> f9752b;

        /* renamed from: c */
        public p094fa.C2105b0<p094fa.AbstractC2103a0.c> f9753c;

        /* renamed from: d */
        public java.lang.Boolean f9754d;

        /* renamed from: e */
        public java.lang.Integer f9755e;

        public b(p094fa.AbstractC2103a0.e.d.a r1, p094fa.C2116l.a r2) {
                r0 = this;
                r0.<init>()
                fa.l r1 = (p094fa.C2116l) r1
                fa.a0$e$d$a$b r2 = r1.f9746a
                r0.f9751a = r2
                fa.b0<fa.a0$c> r2 = r1.f9747b
                r0.f9752b = r2
                fa.b0<fa.a0$c> r2 = r1.f9748c
                r0.f9753c = r2
                java.lang.Boolean r2 = r1.f9749d
                r0.f9754d = r2
                int r1 = r1.f9750e
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.f9755e = r1
                return
        }

        /* renamed from: a */
        public p094fa.AbstractC2103a0.e.d.a m5688a() {
                r9 = this;
                fa.a0$e$d$a$b r0 = r9.f9751a
                if (r0 != 0) goto L7
                java.lang.String r0 = " execution"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                java.lang.Integer r1 = r9.f9755e
                if (r1 != 0) goto L13
                java.lang.String r1 = " uiOrientation"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L13:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L2f
                fa.l r0 = new fa.l
                fa.a0$e$d$a$b r3 = r9.f9751a
                fa.b0<fa.a0$c> r4 = r9.f9752b
                fa.b0<fa.a0$c> r5 = r9.f9753c
                java.lang.Boolean r6 = r9.f9754d
                java.lang.Integer r1 = r9.f9755e
                int r7 = r1.intValue()
                r8 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return r0
            L2f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }
    }

    public C2116l(p094fa.AbstractC2103a0.e.d.a.b r1, p094fa.C2105b0 r2, p094fa.C2105b0 r3, java.lang.Boolean r4, int r5, p094fa.C2116l.a r6) {
            r0 = this;
            r0.<init>()
            r0.f9746a = r1
            r0.f9747b = r2
            r0.f9748c = r3
            r0.f9749d = r4
            r0.f9750e = r5
            return
    }

    @Override // p094fa.AbstractC2103a0.e.d.a
    /* renamed from: a */
    public java.lang.Boolean mo5618a() {
            r1 = this;
            java.lang.Boolean r0 = r1.f9749d
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a
    /* renamed from: b */
    public p094fa.C2105b0<p094fa.AbstractC2103a0.c> mo5619b() {
            r1 = this;
            fa.b0<fa.a0$c> r0 = r1.f9747b
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a
    /* renamed from: c */
    public p094fa.AbstractC2103a0.e.d.a.b mo5620c() {
            r1 = this;
            fa.a0$e$d$a$b r0 = r1.f9746a
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a
    /* renamed from: d */
    public p094fa.C2105b0<p094fa.AbstractC2103a0.c> mo5621d() {
            r1 = this;
            fa.b0<fa.a0$c> r0 = r1.f9748c
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a
    /* renamed from: e */
    public int mo5622e() {
            r1 = this;
            int r0 = r1.f9750e
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2103a0.e.d.a
            r2 = 0
            if (r1 == 0) goto L61
            fa.a0$e$d$a r5 = (p094fa.AbstractC2103a0.e.d.a) r5
            fa.a0$e$d$a$b r1 = r4.f9746a
            fa.a0$e$d$a$b r3 = r5.mo5620c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5f
            fa.b0<fa.a0$c> r1 = r4.f9747b
            if (r1 != 0) goto L22
            fa.b0 r1 = r5.mo5619b()
            if (r1 != 0) goto L5f
            goto L2c
        L22:
            fa.b0 r3 = r5.mo5619b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5f
        L2c:
            fa.b0<fa.a0$c> r1 = r4.f9748c
            if (r1 != 0) goto L37
            fa.b0 r1 = r5.mo5621d()
            if (r1 != 0) goto L5f
            goto L41
        L37:
            fa.b0 r3 = r5.mo5621d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5f
        L41:
            java.lang.Boolean r1 = r4.f9749d
            if (r1 != 0) goto L4c
            java.lang.Boolean r1 = r5.mo5618a()
            if (r1 != 0) goto L5f
            goto L56
        L4c:
            java.lang.Boolean r3 = r5.mo5618a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5f
        L56:
            int r1 = r4.f9750e
            int r5 = r5.mo5622e()
            if (r1 != r5) goto L5f
            goto L60
        L5f:
            r0 = 0
        L60:
            return r0
        L61:
            return r2
    }

    @Override // p094fa.AbstractC2103a0.e.d.a
    /* renamed from: f */
    public p094fa.AbstractC2103a0.e.d.a.AbstractC7383a mo5623f() {
            r2 = this;
            fa.l$b r0 = new fa.l$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public int hashCode() {
            r4 = this;
            fa.a0$e$d$a$b r0 = r4.f9746a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            fa.b0<fa.a0$c> r2 = r4.f9747b
            r3 = 0
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            fa.b0<fa.a0$c> r2 = r4.f9748c
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.Boolean r2 = r4.f9749d
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            int r3 = r2.hashCode()
        L30:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            int r1 = r4.f9750e
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Application{execution="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            fa.a0$e$d$a$b r1 = r3.f9746a
            r0.append(r1)
            java.lang.String r1 = ", customAttributes="
            r0.append(r1)
            fa.b0<fa.a0$c> r1 = r3.f9747b
            r0.append(r1)
            java.lang.String r1 = ", internalKeys="
            r0.append(r1)
            fa.b0<fa.a0$c> r1 = r3.f9748c
            r0.append(r1)
            java.lang.String r1 = ", background="
            r0.append(r1)
            java.lang.Boolean r1 = r3.f9749d
            r0.append(r1)
            java.lang.String r1 = ", uiOrientation="
            r0.append(r1)
            int r1 = r3.f9750e
            java.lang.String r2 = "}"
            java.lang.String r0 = p381w.C6764e.m13690a(r0, r1, r2)
            return r0
    }
}
