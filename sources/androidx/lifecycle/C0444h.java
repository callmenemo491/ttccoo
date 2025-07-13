package androidx.lifecycle;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public final class C0444h<T> extends androidx.lifecycle.C0433b0<T> {

    /* renamed from: m */
    public androidx.lifecycle.C0438e<T> f2498m;

    /* renamed from: androidx.lifecycle.h$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.lifecycle.C0444h f2499Z;

        public a(androidx.lifecycle.C0444h r1) {
                r0 = this;
                r0.f2499Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public ch.C0985l mo15e() {
                r2 = this;
                androidx.lifecycle.h r0 = r2.f2499Z
                r1 = 0
                r0.f2498m = r1
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "androidx.lifecycle.CoroutineLiveData", m7452f = "CoroutineLiveData.kt", m7453l = {234}, m7454m = "clearSource$lifecycle_livedata_ktx_release")
    /* renamed from: androidx.lifecycle.h$b */
    public static final class b extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public /* synthetic */ java.lang.Object f2500b0;

        /* renamed from: c0 */
        public int f2501c0;

        /* renamed from: d0 */
        public final /* synthetic */ androidx.lifecycle.C0444h f2502d0;

        /* renamed from: e0 */
        public java.lang.Object f2503e0;

        public b(androidx.lifecycle.C0444h r1, p101fh.InterfaceC2172d r2) {
                r0 = this;
                r0.f2502d0 = r1
                r0.<init>(r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f2500b0 = r2
                int r2 = r1.f2501c0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f2501c0 = r2
                androidx.lifecycle.h r2 = r1.f2502d0
                java.lang.Object r2 = r2.m1434n(r1)
                return r2
        }
    }

    public C0444h(p101fh.InterfaceC2175g r8, long r9, mh.InterfaceC4624p<? super androidx.lifecycle.InterfaceC0475z<T>, ? super p101fh.InterfaceC2172d<? super ch.C0985l>, ? extends java.lang.Object> r11) {
            r7 = this;
            r7.<init>()
            int r0 = p379vh.InterfaceC6687b1.f25957X
            vh.b1$b r0 = p379vh.InterfaceC6687b1.b.f25958Y
            fh.g$a r0 = r8.get(r0)
            vh.b1 r0 = (p379vh.InterfaceC6687b1) r0
            vh.q1 r1 = new vh.q1
            r1.<init>(r0)
            vh.z r0 = p379vh.C6716l0.f26007a
            vh.k1 r0 = p459zh.C7346l.f28106a
            vh.k1 r0 = r0.mo13640z0()
            fh.g r8 = r0.plus(r8)
            fh.g r8 = r8.plus(r1)
            vh.b0 r5 = p101fh.C2174f.m5711a(r8)
            androidx.lifecycle.e r8 = new androidx.lifecycle.e
            androidx.lifecycle.h$a r6 = new androidx.lifecycle.h$a
            r6.<init>(r7)
            r0 = r8
            r1 = r7
            r2 = r11
            r3 = r9
            r0.<init>(r1, r2, r3, r5, r6)
            r7.f2498m = r8
            return
    }

    @Override // androidx.lifecycle.C0433b0, androidx.lifecycle.LiveData
    /* renamed from: h */
    public void mo4h() {
            r9 = this;
            super.mo4h()
            androidx.lifecycle.e<T> r0 = r9.f2498m
            if (r0 == 0) goto L27
            vh.b1 r1 = r0.f2483b
            r2 = 0
            if (r1 == 0) goto Lf
            r1.mo13553d0(r2)
        Lf:
            r0.f2483b = r2
            vh.b1 r1 = r0.f2482a
            if (r1 == 0) goto L16
            goto L27
        L16:
            vh.b0 r3 = r0.f2487f
            r4 = 0
            androidx.lifecycle.d r6 = new androidx.lifecycle.d
            r6.<init>(r0, r2)
            r7 = 3
            r8 = 0
            r5 = 0
            vh.b1 r1 = p101fh.C2174f.m5728r(r3, r4, r5, r6, r7, r8)
            r0.f2482a = r1
        L27:
            return
    }

    @Override // androidx.lifecycle.C0433b0, androidx.lifecycle.LiveData
    /* renamed from: i */
    public void mo5i() {
            r8 = this;
            super.mo5i()
            androidx.lifecycle.e<T> r0 = r8.f2498m
            if (r0 == 0) goto L31
            vh.b1 r1 = r0.f2483b
            if (r1 != 0) goto L25
            vh.b0 r2 = r0.f2487f
            vh.z r1 = p379vh.C6716l0.f26007a
            vh.k1 r1 = p459zh.C7346l.f28106a
            vh.k1 r3 = r1.mo13640z0()
            androidx.lifecycle.c r5 = new androidx.lifecycle.c
            r1 = 0
            r5.<init>(r0, r1)
            r6 = 2
            r7 = 0
            r4 = 0
            vh.b1 r1 = p101fh.C2174f.m5728r(r2, r3, r4, r5, r6, r7)
            r0.f2483b = r1
            goto L31
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cancel call cannot happen without a maybeRun"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L31:
            return
    }

    /* renamed from: n */
    public final java.lang.Object m1434n(p101fh.InterfaceC2172d<? super ch.C0985l> r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.C0444h.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.h$b r0 = (androidx.lifecycle.C0444h.b) r0
            int r1 = r0.f2501c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2501c0 = r1
            goto L18
        L13:
            androidx.lifecycle.h$b r0 = new androidx.lifecycle.h$b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2500b0
            int r1 = r0.f2501c0
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.Object r0 = r0.f2503e0
            androidx.lifecycle.h r0 = (androidx.lifecycle.C0444h) r0
            p074e9.C1805a.m4540y(r5)
            goto L35
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p074e9.C1805a.m4540y(r5)
            r0 = r4
        L35:
            java.util.Objects.requireNonNull(r0)
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}
