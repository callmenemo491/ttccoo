package p385w3;

/* renamed from: w3.b */
/* loaded from: classes.dex */
public final class C6780b extends p385w3.AbstractC6787i {

    /* renamed from: a */
    public final java.lang.String f26318a;

    /* renamed from: b */
    public final byte[] f26319b;

    /* renamed from: c */
    public final p335t3.EnumC6151d f26320c;

    /* renamed from: w3.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: w3.b$b */
    public static final class b extends p385w3.AbstractC6787i.a {

        /* renamed from: a */
        public java.lang.String f26321a;

        /* renamed from: b */
        public byte[] f26322b;

        /* renamed from: c */
        public p335t3.EnumC6151d f26323c;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p385w3.AbstractC6787i.a
        /* renamed from: a */
        public p385w3.AbstractC6787i mo13801a() {
                r5 = this;
                java.lang.String r0 = r5.f26321a
                if (r0 != 0) goto L7
                java.lang.String r0 = " backendName"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                t3.d r1 = r5.f26323c
                if (r1 != 0) goto L13
                java.lang.String r1 = " priority"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L13:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L26
                w3.b r0 = new w3.b
                java.lang.String r1 = r5.f26321a
                byte[] r2 = r5.f26322b
                t3.d r3 = r5.f26323c
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
            L26:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }

        @Override // p385w3.AbstractC6787i.a
        /* renamed from: b */
        public p385w3.AbstractC6787i.a mo13802b(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null backendName"
                java.util.Objects.requireNonNull(r2, r0)
                r1.f26321a = r2
                return r1
        }

        @Override // p385w3.AbstractC6787i.a
        /* renamed from: c */
        public p385w3.AbstractC6787i.a mo13803c(p335t3.EnumC6151d r2) {
                r1 = this;
                java.lang.String r0 = "Null priority"
                java.util.Objects.requireNonNull(r2, r0)
                r1.f26323c = r2
                return r1
        }
    }

    public C6780b(java.lang.String r1, byte[] r2, p335t3.EnumC6151d r3, p385w3.C6780b.a r4) {
            r0 = this;
            r0.<init>()
            r0.f26318a = r1
            r0.f26319b = r2
            r0.f26320c = r3
            return
    }

    @Override // p385w3.AbstractC6787i
    /* renamed from: b */
    public java.lang.String mo13798b() {
            r1 = this;
            java.lang.String r0 = r1.f26318a
            return r0
    }

    @Override // p385w3.AbstractC6787i
    /* renamed from: c */
    public byte[] mo13799c() {
            r1 = this;
            byte[] r0 = r1.f26319b
            return r0
    }

    @Override // p385w3.AbstractC6787i
    /* renamed from: d */
    public p335t3.EnumC6151d mo13800d() {
            r1 = this;
            t3.d r0 = r1.f26320c
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p385w3.AbstractC6787i
            r2 = 0
            if (r1 == 0) goto L3c
            w3.i r5 = (p385w3.AbstractC6787i) r5
            java.lang.String r1 = r4.f26318a
            java.lang.String r3 = r5.mo13798b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            byte[] r1 = r4.f26319b
            boolean r3 = r5 instanceof p385w3.C6780b
            if (r3 == 0) goto L23
            r3 = r5
            w3.b r3 = (p385w3.C6780b) r3
            byte[] r3 = r3.f26319b
            goto L27
        L23:
            byte[] r3 = r5.mo13799c()
        L27:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L3a
            t3.d r1 = r4.f26320c
            t3.d r5 = r5.mo13800d()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            r0 = 0
        L3b:
            return r0
        L3c:
            return r2
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f26318a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r2 = r3.f26319b
            int r2 = java.util.Arrays.hashCode(r2)
            r0 = r0 ^ r2
            int r0 = r0 * r1
            t3.d r1 = r3.f26320c
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }
}
