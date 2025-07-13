package p351u4;

/* renamed from: u4.b */
/* loaded from: classes.dex */
public final class C6296b extends p351u4.AbstractC6302h {

    /* renamed from: n */
    public p216m4.C4373r f24572n;

    /* renamed from: o */
    public p351u4.C6296b.a f24573o;

    /* renamed from: u4.b$a */
    public static final class a implements p351u4.InterfaceC6300f {

        /* renamed from: a */
        public p216m4.C4373r f24574a;

        /* renamed from: b */
        public p216m4.C4373r.a f24575b;

        /* renamed from: c */
        public long f24576c;

        /* renamed from: d */
        public long f24577d;

        public a(p216m4.C4373r r1, p216m4.C4373r.a r2) {
                r0 = this;
                r0.<init>()
                r0.f24574a = r1
                r0.f24575b = r2
                r1 = -1
                r0.f24576c = r1
                r0.f24577d = r1
                return
        }

        @Override // p351u4.InterfaceC6300f
        /* renamed from: a */
        public p216m4.InterfaceC4378w mo12930a() {
                r5 = this;
                long r0 = r5.f24576c
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                p371v5.C6549a.m13291e(r0)
                m4.q r0 = new m4.q
                m4.r r1 = r5.f24574a
                long r2 = r5.f24576c
                r0.<init>(r1, r2)
                return r0
        }

        @Override // p351u4.InterfaceC6300f
        /* renamed from: b */
        public void mo12931b(long r3) {
                r2 = this;
                m4.r$a r0 = r2.f24575b
                long[] r0 = r0.f17924a
                r1 = 1
                int r3 = p371v5.C6552b0.m13312e(r0, r3, r1, r1)
                r3 = r0[r3]
                r2.f24577d = r3
                return
        }

        @Override // p351u4.InterfaceC6300f
        /* renamed from: c */
        public long mo12932c(p216m4.InterfaceC4365j r7) {
                r6 = this;
                long r0 = r6.f24577d
                r2 = -1
                r4 = 0
                int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r7 < 0) goto L11
                r4 = 2
                long r0 = r0 + r4
                long r0 = -r0
                r6.f24577d = r2
                return r0
            L11:
                return r2
        }
    }

    public C6296b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p351u4.AbstractC6302h
    /* renamed from: c */
    public long mo12933c(p371v5.C6571u r5) {
            r4 = this;
            byte[] r0 = r5.f25710a
            r1 = 0
            r2 = r0[r1]
            r3 = -1
            if (r2 != r3) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            if (r2 != 0) goto L10
            r0 = -1
            return r0
        L10:
            r2 = 2
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 4
            int r0 = r0 >> r2
            r3 = 6
            if (r0 == r3) goto L1d
            r3 = 7
            if (r0 != r3) goto L23
        L1d:
            r5.m13397G(r2)
            r5.m13391A()
        L23:
            int r0 = p216m4.C4370o.m9815c(r5, r0)
            r5.m13396F(r1)
            long r0 = (long) r0
            return r0
    }

    @Override // p351u4.AbstractC6302h
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: d */
    public boolean mo12934d(p371v5.C6571u r7, long r8, p351u4.AbstractC6302h.b r10) {
            r6 = this;
            byte[] r0 = r7.f25710a
            m4.r r1 = r6.f24572n
            r2 = 1
            if (r1 != 0) goto L20
            m4.r r8 = new m4.r
            r9 = 17
            r8.<init>(r0, r9)
            r6.f24572n = r8
            r9 = 9
            int r7 = r7.f25712c
            byte[] r7 = java.util.Arrays.copyOfRange(r0, r9, r7)
            r9 = 0
            f4.e0 r7 = r8.m9824e(r7, r9)
            r10.f24608a = r7
            return r2
        L20:
            r3 = 0
            r4 = r0[r3]
            r4 = r4 & 127(0x7f, float:1.78E-43)
            r5 = 3
            if (r4 != r5) goto L3a
            m4.r$a r7 = p216m4.C4371p.m9817b(r7)
            m4.r r8 = r1.m9822b(r7)
            r6.f24572n = r8
            u4.b$a r9 = new u4.b$a
            r9.<init>(r8, r7)
            r6.f24573o = r9
            return r2
        L3a:
            r7 = r0[r3]
            r0 = -1
            if (r7 != r0) goto L41
            r7 = 1
            goto L42
        L41:
            r7 = 0
        L42:
            if (r7 == 0) goto L52
            u4.b$a r7 = r6.f24573o
            if (r7 == 0) goto L4c
            r7.f24576c = r8
            r10.f24609b = r7
        L4c:
            f4.e0 r7 = r10.f24608a
            java.util.Objects.requireNonNull(r7)
            return r3
        L52:
            return r2
    }

    @Override // p351u4.AbstractC6302h
    /* renamed from: e */
    public void mo12935e(boolean r1) {
            r0 = this;
            super.mo12935e(r1)
            if (r1 == 0) goto La
            r1 = 0
            r0.f24572n = r1
            r0.f24573o = r1
        La:
            return
    }
}
