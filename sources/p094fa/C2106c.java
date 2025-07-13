package p094fa;

/* renamed from: fa.c */
/* loaded from: classes.dex */
public final class C2106c extends p094fa.AbstractC2103a0.a {

    /* renamed from: a */
    public final int f9667a;

    /* renamed from: b */
    public final java.lang.String f9668b;

    /* renamed from: c */
    public final int f9669c;

    /* renamed from: d */
    public final int f9670d;

    /* renamed from: e */
    public final long f9671e;

    /* renamed from: f */
    public final long f9672f;

    /* renamed from: g */
    public final long f9673g;

    /* renamed from: h */
    public final java.lang.String f9674h;

    /* renamed from: fa.c$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: fa.c$b */
    public static final class b extends p094fa.AbstractC2103a0.a.AbstractC7381a {

        /* renamed from: a */
        public java.lang.Integer f9675a;

        /* renamed from: b */
        public java.lang.String f9676b;

        /* renamed from: c */
        public java.lang.Integer f9677c;

        /* renamed from: d */
        public java.lang.Integer f9678d;

        /* renamed from: e */
        public java.lang.Long f9679e;

        /* renamed from: f */
        public java.lang.Long f9680f;

        /* renamed from: g */
        public java.lang.Long f9681g;

        /* renamed from: h */
        public java.lang.String f9682h;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public p094fa.AbstractC2103a0.a m5662a() {
                r15 = this;
                java.lang.Integer r0 = r15.f9675a
                if (r0 != 0) goto L7
                java.lang.String r0 = " pid"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                java.lang.String r1 = r15.f9676b
                if (r1 != 0) goto L13
                java.lang.String r1 = " processName"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L13:
                java.lang.Integer r1 = r15.f9677c
                if (r1 != 0) goto L1d
                java.lang.String r1 = " reasonCode"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L1d:
                java.lang.Integer r1 = r15.f9678d
                if (r1 != 0) goto L27
                java.lang.String r1 = " importance"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L27:
                java.lang.Long r1 = r15.f9679e
                if (r1 != 0) goto L31
                java.lang.String r1 = " pss"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L31:
                java.lang.Long r1 = r15.f9680f
                if (r1 != 0) goto L3b
                java.lang.String r1 = " rss"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L3b:
                java.lang.Long r1 = r15.f9681g
                if (r1 != 0) goto L45
                java.lang.String r1 = " timestamp"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L45:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L7b
                fa.c r0 = new fa.c
                java.lang.Integer r1 = r15.f9675a
                int r3 = r1.intValue()
                java.lang.String r4 = r15.f9676b
                java.lang.Integer r1 = r15.f9677c
                int r5 = r1.intValue()
                java.lang.Integer r1 = r15.f9678d
                int r6 = r1.intValue()
                java.lang.Long r1 = r15.f9679e
                long r7 = r1.longValue()
                java.lang.Long r1 = r15.f9680f
                long r9 = r1.longValue()
                java.lang.Long r1 = r15.f9681g
                long r11 = r1.longValue()
                java.lang.String r13 = r15.f9682h
                r14 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r9, r11, r13, r14)
                return r0
            L7b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }
    }

    public C2106c(int r1, java.lang.String r2, int r3, int r4, long r5, long r7, long r9, java.lang.String r11, p094fa.C2106c.a r12) {
            r0 = this;
            r0.<init>()
            r0.f9667a = r1
            r0.f9668b = r2
            r0.f9669c = r3
            r0.f9670d = r4
            r0.f9671e = r5
            r0.f9672f = r7
            r0.f9673g = r9
            r0.f9674h = r11
            return
    }

    @Override // p094fa.AbstractC2103a0.a
    /* renamed from: a */
    public int mo5567a() {
            r1 = this;
            int r0 = r1.f9670d
            return r0
    }

    @Override // p094fa.AbstractC2103a0.a
    /* renamed from: b */
    public int mo5568b() {
            r1 = this;
            int r0 = r1.f9667a
            return r0
    }

    @Override // p094fa.AbstractC2103a0.a
    /* renamed from: c */
    public java.lang.String mo5569c() {
            r1 = this;
            java.lang.String r0 = r1.f9668b
            return r0
    }

    @Override // p094fa.AbstractC2103a0.a
    /* renamed from: d */
    public long mo5570d() {
            r2 = this;
            long r0 = r2.f9671e
            return r0
    }

    @Override // p094fa.AbstractC2103a0.a
    /* renamed from: e */
    public int mo5571e() {
            r1 = this;
            int r0 = r1.f9669c
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p094fa.AbstractC2103a0.a
            r2 = 0
            if (r1 == 0) goto L61
            fa.a0$a r8 = (p094fa.AbstractC2103a0.a) r8
            int r1 = r7.f9667a
            int r3 = r8.mo5568b()
            if (r1 != r3) goto L5f
            java.lang.String r1 = r7.f9668b
            java.lang.String r3 = r8.mo5569c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5f
            int r1 = r7.f9669c
            int r3 = r8.mo5571e()
            if (r1 != r3) goto L5f
            int r1 = r7.f9670d
            int r3 = r8.mo5567a()
            if (r1 != r3) goto L5f
            long r3 = r7.f9671e
            long r5 = r8.mo5570d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L5f
            long r3 = r7.f9672f
            long r5 = r8.mo5572f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L5f
            long r3 = r7.f9673g
            long r5 = r8.mo5573g()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L5f
            java.lang.String r1 = r7.f9674h
            java.lang.String r8 = r8.mo5574h()
            if (r1 != 0) goto L58
            if (r8 != 0) goto L5f
            goto L60
        L58:
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L5f
            goto L60
        L5f:
            r0 = 0
        L60:
            return r0
        L61:
            return r2
    }

    @Override // p094fa.AbstractC2103a0.a
    /* renamed from: f */
    public long mo5572f() {
            r2 = this;
            long r0 = r2.f9672f
            return r0
    }

    @Override // p094fa.AbstractC2103a0.a
    /* renamed from: g */
    public long mo5573g() {
            r2 = this;
            long r0 = r2.f9673g
            return r0
    }

    @Override // p094fa.AbstractC2103a0.a
    /* renamed from: h */
    public java.lang.String mo5574h() {
            r1 = this;
            java.lang.String r0 = r1.f9674h
            return r0
    }

    public int hashCode() {
            r7 = this;
            int r0 = r7.f9667a
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r7.f9668b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.f9669c
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.f9670d
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.f9671e
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r2 = r7.f9672f
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r2 = r7.f9673g
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            java.lang.String r1 = r7.f9674h
            if (r1 != 0) goto L3e
            r1 = 0
            goto L42
        L3e:
            int r1 = r1.hashCode()
        L42:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ApplicationExitInfo{pid="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f9667a
            r0.append(r1)
            java.lang.String r1 = ", processName="
            r0.append(r1)
            java.lang.String r1 = r3.f9668b
            r0.append(r1)
            java.lang.String r1 = ", reasonCode="
            r0.append(r1)
            int r1 = r3.f9669c
            r0.append(r1)
            java.lang.String r1 = ", importance="
            r0.append(r1)
            int r1 = r3.f9670d
            r0.append(r1)
            java.lang.String r1 = ", pss="
            r0.append(r1)
            long r1 = r3.f9671e
            r0.append(r1)
            java.lang.String r1 = ", rss="
            r0.append(r1)
            long r1 = r3.f9672f
            r0.append(r1)
            java.lang.String r1 = ", timestamp="
            r0.append(r1)
            long r1 = r3.f9673g
            r0.append(r1)
            java.lang.String r1 = ", traceFile="
            r0.append(r1)
            java.lang.String r1 = r3.f9674h
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
