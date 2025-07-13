package p094fa;

/* renamed from: fa.j */
/* loaded from: classes.dex */
public final class C2114j extends p094fa.AbstractC2103a0.e.c {

    /* renamed from: a */
    public final int f9718a;

    /* renamed from: b */
    public final java.lang.String f9719b;

    /* renamed from: c */
    public final int f9720c;

    /* renamed from: d */
    public final long f9721d;

    /* renamed from: e */
    public final long f9722e;

    /* renamed from: f */
    public final boolean f9723f;

    /* renamed from: g */
    public final int f9724g;

    /* renamed from: h */
    public final java.lang.String f9725h;

    /* renamed from: i */
    public final java.lang.String f9726i;

    /* renamed from: fa.j$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: fa.j$b */
    public static final class b extends p094fa.AbstractC2103a0.e.c.a {

        /* renamed from: a */
        public java.lang.Integer f9727a;

        /* renamed from: b */
        public java.lang.String f9728b;

        /* renamed from: c */
        public java.lang.Integer f9729c;

        /* renamed from: d */
        public java.lang.Long f9730d;

        /* renamed from: e */
        public java.lang.Long f9731e;

        /* renamed from: f */
        public java.lang.Boolean f9732f;

        /* renamed from: g */
        public java.lang.Integer f9733g;

        /* renamed from: h */
        public java.lang.String f9734h;

        /* renamed from: i */
        public java.lang.String f9735i;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public p094fa.AbstractC2103a0.e.c m5685a() {
                r15 = this;
                java.lang.Integer r0 = r15.f9727a
                if (r0 != 0) goto L7
                java.lang.String r0 = " arch"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                java.lang.String r1 = r15.f9728b
                if (r1 != 0) goto L13
                java.lang.String r1 = " model"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L13:
                java.lang.Integer r1 = r15.f9729c
                if (r1 != 0) goto L1d
                java.lang.String r1 = " cores"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L1d:
                java.lang.Long r1 = r15.f9730d
                if (r1 != 0) goto L27
                java.lang.String r1 = " ram"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L27:
                java.lang.Long r1 = r15.f9731e
                if (r1 != 0) goto L31
                java.lang.String r1 = " diskSpace"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L31:
                java.lang.Boolean r1 = r15.f9732f
                if (r1 != 0) goto L3b
                java.lang.String r1 = " simulator"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L3b:
                java.lang.Integer r1 = r15.f9733g
                if (r1 != 0) goto L45
                java.lang.String r1 = " state"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L45:
                java.lang.String r1 = r15.f9734h
                if (r1 != 0) goto L4f
                java.lang.String r1 = " manufacturer"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L4f:
                java.lang.String r1 = r15.f9735i
                if (r1 != 0) goto L59
                java.lang.String r1 = " modelClass"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L59:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L91
                fa.j r0 = new fa.j
                java.lang.Integer r1 = r15.f9727a
                int r3 = r1.intValue()
                java.lang.String r4 = r15.f9728b
                java.lang.Integer r1 = r15.f9729c
                int r5 = r1.intValue()
                java.lang.Long r1 = r15.f9730d
                long r6 = r1.longValue()
                java.lang.Long r1 = r15.f9731e
                long r8 = r1.longValue()
                java.lang.Boolean r1 = r15.f9732f
                boolean r10 = r1.booleanValue()
                java.lang.Integer r1 = r15.f9733g
                int r11 = r1.intValue()
                java.lang.String r12 = r15.f9734h
                java.lang.String r13 = r15.f9735i
                r14 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r8, r10, r11, r12, r13, r14)
                return r0
            L91:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }
    }

    public C2114j(int r1, java.lang.String r2, int r3, long r4, long r6, boolean r8, int r9, java.lang.String r10, java.lang.String r11, p094fa.C2114j.a r12) {
            r0 = this;
            r0.<init>()
            r0.f9718a = r1
            r0.f9719b = r2
            r0.f9720c = r3
            r0.f9721d = r4
            r0.f9722e = r6
            r0.f9723f = r8
            r0.f9724g = r9
            r0.f9725h = r10
            r0.f9726i = r11
            return
    }

    @Override // p094fa.AbstractC2103a0.e.c
    /* renamed from: a */
    public int mo5603a() {
            r1 = this;
            int r0 = r1.f9718a
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.c
    /* renamed from: b */
    public int mo5604b() {
            r1 = this;
            int r0 = r1.f9720c
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.c
    /* renamed from: c */
    public long mo5605c() {
            r2 = this;
            long r0 = r2.f9722e
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.c
    /* renamed from: d */
    public java.lang.String mo5606d() {
            r1 = this;
            java.lang.String r0 = r1.f9725h
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.c
    /* renamed from: e */
    public java.lang.String mo5607e() {
            r1 = this;
            java.lang.String r0 = r1.f9719b
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p094fa.AbstractC2103a0.e.c
            r2 = 0
            if (r1 == 0) goto L66
            fa.a0$e$c r8 = (p094fa.AbstractC2103a0.e.c) r8
            int r1 = r7.f9718a
            int r3 = r8.mo5603a()
            if (r1 != r3) goto L64
            java.lang.String r1 = r7.f9719b
            java.lang.String r3 = r8.mo5607e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            int r1 = r7.f9720c
            int r3 = r8.mo5604b()
            if (r1 != r3) goto L64
            long r3 = r7.f9721d
            long r5 = r8.mo5609g()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L64
            long r3 = r7.f9722e
            long r5 = r8.mo5605c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L64
            boolean r1 = r7.f9723f
            boolean r3 = r8.mo5611i()
            if (r1 != r3) goto L64
            int r1 = r7.f9724g
            int r3 = r8.mo5610h()
            if (r1 != r3) goto L64
            java.lang.String r1 = r7.f9725h
            java.lang.String r3 = r8.mo5606d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            java.lang.String r1 = r7.f9726i
            java.lang.String r8 = r8.mo5608f()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L64
            goto L65
        L64:
            r0 = 0
        L65:
            return r0
        L66:
            return r2
    }

    @Override // p094fa.AbstractC2103a0.e.c
    /* renamed from: f */
    public java.lang.String mo5608f() {
            r1 = this;
            java.lang.String r0 = r1.f9726i
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.c
    /* renamed from: g */
    public long mo5609g() {
            r2 = this;
            long r0 = r2.f9721d
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.c
    /* renamed from: h */
    public int mo5610h() {
            r1 = this;
            int r0 = r1.f9724g
            return r0
    }

    public int hashCode() {
            r7 = this;
            int r0 = r7.f9718a
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r7.f9719b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.f9720c
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.f9721d
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r2 = r7.f9722e
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            boolean r2 = r7.f9723f
            if (r2 == 0) goto L31
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L33
        L31:
            r2 = 1237(0x4d5, float:1.733E-42)
        L33:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.f9724g
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r7.f9725h
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r7.f9726i
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.c
    /* renamed from: i */
    public boolean mo5611i() {
            r1 = this;
            boolean r0 = r1.f9723f
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Device{arch="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f9718a
            r0.append(r1)
            java.lang.String r1 = ", model="
            r0.append(r1)
            java.lang.String r1 = r3.f9719b
            r0.append(r1)
            java.lang.String r1 = ", cores="
            r0.append(r1)
            int r1 = r3.f9720c
            r0.append(r1)
            java.lang.String r1 = ", ram="
            r0.append(r1)
            long r1 = r3.f9721d
            r0.append(r1)
            java.lang.String r1 = ", diskSpace="
            r0.append(r1)
            long r1 = r3.f9722e
            r0.append(r1)
            java.lang.String r1 = ", simulator="
            r0.append(r1)
            boolean r1 = r3.f9723f
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            int r1 = r3.f9724g
            r0.append(r1)
            java.lang.String r1 = ", manufacturer="
            r0.append(r1)
            java.lang.String r1 = r3.f9725h
            r0.append(r1)
            java.lang.String r1 = ", modelClass="
            r0.append(r1)
            java.lang.String r1 = r3.f9726i
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
