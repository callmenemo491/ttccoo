package p260oi;

/* renamed from: oi.q */
/* loaded from: classes.dex */
public final class C5295q extends p062dh.AbstractC1466b<p260oi.C5287i> implements java.util.RandomAccess {

    /* renamed from: a0 */
    public static final p260oi.C5295q.a f20524a0 = null;

    /* renamed from: Y */
    public final p260oi.C5287i[] f20525Y;

    /* renamed from: Z */
    public final int[] f20526Z;

    /* renamed from: oi.q$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final void m11599a(long r20, p260oi.C5283e r22, int r23, java.util.List<? extends p260oi.C5287i> r24, int r25, int r26, java.util.List<java.lang.Integer> r27) {
                r19 = this;
                r9 = r19
                r10 = r22
                r11 = r23
                r12 = r24
                r0 = r25
                r13 = r26
                r14 = r27
                if (r0 >= r13) goto L12
                r3 = 1
                goto L13
            L12:
                r3 = 0
            L13:
                java.lang.String r4 = "Failed requirement."
                if (r3 == 0) goto L1ce
                r3 = r0
            L18:
                if (r3 >= r13) goto L38
                java.lang.Object r5 = r12.get(r3)
                oi.i r5 = (p260oi.C5287i) r5
                int r5 = r5.mo11585h()
                if (r5 < r11) goto L28
                r5 = 1
                goto L29
            L28:
                r5 = 0
            L29:
                if (r5 == 0) goto L2e
                int r3 = r3 + 1
                goto L18
            L2e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r4.toString()
                r0.<init>(r1)
                throw r0
            L38:
                java.lang.Object r3 = r24.get(r25)
                oi.i r3 = (p260oi.C5287i) r3
                int r4 = r13 + (-1)
                java.lang.Object r4 = r12.get(r4)
                oi.i r4 = (p260oi.C5287i) r4
                int r5 = r3.mo11585h()
                r15 = -1
                if (r11 != r5) goto L63
                java.lang.Object r3 = r14.get(r0)
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                int r0 = r0 + 1
                java.lang.Object r5 = r12.get(r0)
                oi.i r5 = (p260oi.C5287i) r5
                r6 = r0
                r0 = r3
                r3 = r5
                goto L65
            L63:
                r6 = r0
                r0 = -1
            L65:
                byte r5 = r3.mo11588o(r11)
                byte r7 = r4.mo11588o(r11)
                r8 = 2
                if (r5 == r7) goto L13b
                int r1 = r6 + 1
                r2 = 1
            L73:
                if (r1 >= r13) goto L92
                int r3 = r1 + (-1)
                java.lang.Object r3 = r12.get(r3)
                oi.i r3 = (p260oi.C5287i) r3
                byte r3 = r3.mo11588o(r11)
                java.lang.Object r4 = r12.get(r1)
                oi.i r4 = (p260oi.C5287i) r4
                byte r4 = r4.mo11588o(r11)
                if (r3 == r4) goto L8f
                int r2 = r2 + 1
            L8f:
                int r1 = r1 + 1
                goto L73
            L92:
                long r3 = r9.m11600b(r10)
                long r3 = r3 + r20
                long r7 = (long) r8
                long r3 = r3 + r7
                int r1 = r2 * 2
                long r7 = (long) r1
                long r16 = r3 + r7
                r10.m11544G0(r2)
                r10.m11544G0(r0)
                r0 = r6
            La6:
                if (r0 >= r13) goto Lca
                java.lang.Object r1 = r12.get(r0)
                oi.i r1 = (p260oi.C5287i) r1
                byte r1 = r1.mo11588o(r11)
                if (r0 == r6) goto Lc2
                int r2 = r0 + (-1)
                java.lang.Object r2 = r12.get(r2)
                oi.i r2 = (p260oi.C5287i) r2
                byte r2 = r2.mo11588o(r11)
                if (r1 == r2) goto Lc7
            Lc2:
                r1 = r1 & 255(0xff, float:3.57E-43)
                r10.m11544G0(r1)
            Lc7:
                int r0 = r0 + 1
                goto La6
            Lca:
                oi.e r8 = new oi.e
                r8.<init>()
            Lcf:
                if (r6 >= r13) goto L135
                java.lang.Object r0 = r12.get(r6)
                oi.i r0 = (p260oi.C5287i) r0
                byte r0 = r0.mo11588o(r11)
                int r1 = r6 + 1
                r2 = r1
            Lde:
                if (r2 >= r13) goto Lf1
                java.lang.Object r3 = r12.get(r2)
                oi.i r3 = (p260oi.C5287i) r3
                byte r3 = r3.mo11588o(r11)
                if (r0 == r3) goto Lee
                r7 = r2
                goto Lf2
            Lee:
                int r2 = r2 + 1
                goto Lde
            Lf1:
                r7 = r13
            Lf2:
                if (r1 != r7) goto L113
                int r0 = r11 + 1
                java.lang.Object r1 = r12.get(r6)
                oi.i r1 = (p260oi.C5287i) r1
                int r1 = r1.mo11585h()
                if (r0 != r1) goto L113
                java.lang.Object r0 = r14.get(r6)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r10.m11544G0(r0)
                r18 = r7
                r15 = r8
                goto L130
            L113:
                long r0 = r9.m11600b(r8)
                long r0 = r0 + r16
                int r1 = (int) r0
                int r1 = r1 * (-1)
                r10.m11544G0(r1)
                int r4 = r11 + 1
                r0 = r19
                r1 = r16
                r3 = r8
                r5 = r24
                r18 = r7
                r15 = r8
                r8 = r27
                r0.m11599a(r1, r3, r4, r5, r6, r7, r8)
            L130:
                r8 = r15
                r6 = r18
                r15 = -1
                goto Lcf
            L135:
                r15 = r8
                r10.m11538C0(r15)
                goto L1cd
            L13b:
                int r5 = r3.mo11585h()
                int r7 = r4.mo11585h()
                int r5 = java.lang.Math.min(r5, r7)
                r7 = r11
                r15 = 0
            L149:
                if (r7 >= r5) goto L15a
                byte r1 = r3.mo11588o(r7)
                byte r2 = r4.mo11588o(r7)
                if (r1 != r2) goto L15a
                int r15 = r15 + 1
                int r7 = r7 + 1
                goto L149
            L15a:
                long r1 = r9.m11600b(r10)
                long r1 = r1 + r20
                long r4 = (long) r8
                long r1 = r1 + r4
                long r4 = (long) r15
                long r1 = r1 + r4
                r4 = 1
                long r1 = r1 + r4
                int r4 = -r15
                r10.m11544G0(r4)
                r10.m11544G0(r0)
                int r4 = r11 + r15
            L170:
                if (r11 >= r4) goto L17e
                byte r0 = r3.mo11588o(r11)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r10.m11544G0(r0)
                int r11 = r11 + 1
                goto L170
            L17e:
                int r0 = r6 + 1
                if (r0 != r13) goto L1ad
                java.lang.Object r0 = r12.get(r6)
                oi.i r0 = (p260oi.C5287i) r0
                int r0 = r0.mo11585h()
                if (r4 != r0) goto L190
                r1 = 1
                goto L191
            L190:
                r1 = 0
            L191:
                if (r1 == 0) goto L1a1
                java.lang.Object r0 = r14.get(r6)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r10.m11544G0(r0)
                goto L1cd
            L1a1:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Check failed."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L1ad:
                oi.e r11 = new oi.e
                r11.<init>()
                long r7 = r9.m11600b(r11)
                long r7 = r7 + r1
                int r0 = (int) r7
                r3 = -1
                int r0 = r0 * (-1)
                r10.m11544G0(r0)
                r0 = r19
                r3 = r11
                r5 = r24
                r7 = r26
                r8 = r27
                r0.m11599a(r1, r3, r4, r5, r6, r7, r8)
                r10.m11538C0(r11)
            L1cd:
                return
            L1ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r4.toString()
                r0.<init>(r1)
                throw r0
        }

        /* renamed from: b */
        public final long m11600b(p260oi.C5283e r5) {
                r4 = this;
                long r0 = r5.f20501Z
                r5 = 4
                long r2 = (long) r5
                long r0 = r0 / r2
                return r0
        }
    }

    static {
            oi.q$a r0 = new oi.q$a
            r1 = 0
            r0.<init>(r1)
            p260oi.C5295q.f20524a0 = r0
            return
    }

    public C5295q(p260oi.C5287i[] r1, int[] r2, p239nh.C4826f r3) {
            r0 = this;
            r0.<init>()
            r0.f20525Y = r1
            r0.f20526Z = r2
            return
    }

    @Override // p062dh.AbstractC1465a
    /* renamed from: a */
    public int mo3981a() {
            r1 = this;
            oi.i[] r0 = r1.f20525Y
            int r0 = r0.length
            return r0
    }

    @Override // p062dh.AbstractC1465a, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p260oi.C5287i
            if (r0 == 0) goto Lb
            oi.i r2 = (p260oi.C5287i) r2
            boolean r2 = super.contains(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @Override // p062dh.AbstractC1466b, java.util.List
    public java.lang.Object get(int r2) {
            r1 = this;
            oi.i[] r0 = r1.f20525Y
            r2 = r0[r2]
            return r2
    }

    @Override // p062dh.AbstractC1466b, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p260oi.C5287i
            if (r0 == 0) goto Lb
            oi.i r2 = (p260oi.C5287i) r2
            int r2 = super.indexOf(r2)
            return r2
        Lb:
            r2 = -1
            return r2
    }

    @Override // p062dh.AbstractC1466b, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p260oi.C5287i
            if (r0 == 0) goto Lb
            oi.i r2 = (p260oi.C5287i) r2
            int r2 = super.lastIndexOf(r2)
            return r2
        Lb:
            r2 = -1
            return r2
    }
}
