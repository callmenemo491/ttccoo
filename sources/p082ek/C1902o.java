package p082ek;

/* renamed from: ek.o */
/* loaded from: classes.dex */
public final class C1902o {

    /* renamed from: ek.o$a */
    public static final class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p101fh.InterfaceC2172d f8186Y;

        /* renamed from: Z */
        public final /* synthetic */ java.lang.Exception f8187Z;

        public a(p101fh.InterfaceC2172d r1, java.lang.Exception r2) {
                r0 = this;
                r0.f8186Y = r1
                r0.f8187Z = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                fh.d r0 = r2.f8186Y
                fh.d r0 = gh.C2390b.m6127q(r0)
                java.lang.Exception r1 = r2.f8187Z
                java.lang.Object r1 = p074e9.C1805a.m4520e(r1)
                r0.mo5707k(r1)
                return
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "retrofit2.KotlinExtensions", m7452f = "KotlinExtensions.kt", m7453l = {113}, m7454m = "suspendAndThrow")
    /* renamed from: ek.o$b */
    public static final class b extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public /* synthetic */ java.lang.Object f8188b0;

        /* renamed from: c0 */
        public int f8189c0;

        /* renamed from: d0 */
        public java.lang.Object f8190d0;

        public b(p101fh.InterfaceC2172d r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f8188b0 = r2
                int r2 = r1.f8189c0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f8189c0 = r2
                r2 = 0
                java.lang.Object r2 = p082ek.C1902o.m4677a(r2, r1)
                return r2
        }
    }

    /* renamed from: a */
    public static final java.lang.Object m4677a(java.lang.Exception r4, p101fh.InterfaceC2172d<?> r5) {
            boolean r0 = r5 instanceof p082ek.C1902o.b
            if (r0 == 0) goto L13
            r0 = r5
            ek.o$b r0 = (p082ek.C1902o.b) r0
            int r1 = r0.f8189c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8189c0 = r1
            goto L18
        L13:
            ek.o$b r0 = new ek.o$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f8188b0
            gh.a r1 = gh.EnumC2389a.f10764Y
            int r2 = r0.f8189c0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f8190d0
            java.lang.Exception r4 = (java.lang.Exception) r4
            p074e9.C1805a.m4540y(r5)
            ch.l r4 = ch.C0985l.f5061a
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p074e9.C1805a.m4540y(r5)
            r0.f8190d0 = r4
            r0.f8189c0 = r3
            vh.z r5 = p379vh.C6716l0.f26007a
            fh.g r2 = r0.mo5706c()
            ek.o$a r3 = new ek.o$a
            r3.<init>(r0, r4)
            r5.mo156x0(r2, r3)
            java.lang.String r4 = "frame"
            p214m2.C4339q.m9706k(r0, r4)
            return r1
    }
}
