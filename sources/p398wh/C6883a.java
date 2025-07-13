package p398wh;

/* renamed from: wh.a */
/* loaded from: classes.dex */
public final class C6883a extends p398wh.AbstractC6884b {

    /* renamed from: Z */
    public final android.os.Handler f26774Z;
    private volatile p398wh.C6883a _immediate;

    /* renamed from: a0 */
    public final java.lang.String f26775a0;

    /* renamed from: b0 */
    public final boolean f26776b0;

    /* renamed from: c0 */
    public final p398wh.C6883a f26777c0;

    /* renamed from: wh.a$a */
    public static final class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p379vh.InterfaceC6703h f26778Y;

        /* renamed from: Z */
        public final /* synthetic */ p398wh.C6883a f26779Z;

        public a(p379vh.InterfaceC6703h r1, p398wh.C6883a r2) {
                r0 = this;
                r0.f26778Y = r1
                r0.f26779Z = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                vh.h r0 = r3.f26778Y
                wh.a r1 = r3.f26779Z
                ch.l r2 = ch.C0985l.f5061a
                r0.mo13612p(r1, r2)
                return
        }
    }

    /* renamed from: wh.a$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Throwable, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p398wh.C6883a f26780Z;

        /* renamed from: a0 */
        public final /* synthetic */ java.lang.Runnable f26781a0;

        public b(p398wh.C6883a r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f26780Z = r1
                r0.f26781a0 = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.Throwable r2) {
                r1 = this;
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                wh.a r2 = r1.f26780Z
                android.os.Handler r2 = r2.f26774Z
                java.lang.Runnable r0 = r1.f26781a0
                r2.removeCallbacks(r0)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    public C6883a(android.os.Handler r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.f26774Z = r2
            r1.f26775a0 = r3
            r1.f26776b0 = r4
            if (r4 == 0) goto Ld
            r0 = r1
        Ld:
            r1._immediate = r0
            wh.a r4 = r1._immediate
            if (r4 != 0) goto L1b
            wh.a r4 = new wh.a
            r0 = 1
            r4.<init>(r2, r3, r0)
            r1._immediate = r4
        L1b:
            r1.f26777c0 = r4
            return
    }

    /* renamed from: B0 */
    public final void m13946B0(p101fh.InterfaceC2175g r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The task was rejected, the handler underlying the dispatcher '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "' was closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            p209lh.C4304a.m9611e(r4, r0)
            vh.z r4 = p379vh.C6716l0.f26008b
            ai.e r4 = (ai.ExecutorC0105e) r4
            r0 = 0
            r4.m159z0(r5, r0)
            return
    }

    @Override // p379vh.InterfaceC6704h0
    /* renamed from: b0 */
    public void mo13615b0(long r5, p379vh.InterfaceC6703h<? super ch.C0985l> r7) {
            r4 = this;
            wh.a$a r0 = new wh.a$a
            r0.<init>(r7, r4)
            android.os.Handler r1 = r4.f26774Z
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r5 = p209lh.C4304a.m9615i(r5, r2)
            boolean r5 = r1.postDelayed(r0, r5)
            if (r5 == 0) goto L21
            wh.a$b r5 = new wh.a$b
            r5.<init>(r4, r0)
            vh.i r7 = (p379vh.C6706i) r7
            r7.mo13609d(r5)
            goto L28
        L21:
            vh.i r7 = (p379vh.C6706i) r7
            fh.g r5 = r7.f25998c0
            r4.m13946B0(r5, r0)
        L28:
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p398wh.C6883a
            if (r0 == 0) goto Le
            wh.a r2 = (p398wh.C6883a) r2
            android.os.Handler r2 = r2.f26774Z
            android.os.Handler r0 = r1.f26774Z
            if (r2 != r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.os.Handler r0 = r1.f26774Z
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // p379vh.AbstractC6714k1, p379vh.AbstractC6755z
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.m13639A0()
            if (r0 != 0) goto L1a
            java.lang.String r0 = r2.f26775a0
            if (r0 != 0) goto L10
            android.os.Handler r0 = r2.f26774Z
            java.lang.String r0 = r0.toString()
        L10:
            boolean r1 = r2.f26776b0
            if (r1 == 0) goto L1a
            java.lang.String r1 = ".immediate"
            java.lang.String r0 = p214m2.C4339q.m9711u(r0, r1)
        L1a:
            return r0
    }

    @Override // p379vh.AbstractC6755z
    /* renamed from: x0 */
    public void mo156x0(p101fh.InterfaceC2175g r2, java.lang.Runnable r3) {
            r1 = this;
            android.os.Handler r0 = r1.f26774Z
            boolean r0 = r0.post(r3)
            if (r0 != 0) goto Lb
            r1.m13946B0(r2, r3)
        Lb:
            return
    }

    @Override // p379vh.AbstractC6755z
    /* renamed from: y0 */
    public boolean mo1433y0(p101fh.InterfaceC2175g r2) {
            r1 = this;
            boolean r2 = r1.f26776b0
            if (r2 == 0) goto L17
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Handler r0 = r1.f26774Z
            android.os.Looper r0 = r0.getLooper()
            boolean r2 = p214m2.C4339q.m9702c(r2, r0)
            if (r2 != 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
    }

    @Override // p379vh.AbstractC6714k1
    /* renamed from: z0 */
    public p379vh.AbstractC6714k1 mo13640z0() {
            r1 = this;
            wh.a r0 = r1.f26777c0
            return r0
    }
}
