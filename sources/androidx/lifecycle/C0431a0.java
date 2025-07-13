package androidx.lifecycle;

/* renamed from: androidx.lifecycle.a0 */
/* loaded from: classes.dex */
public final class C0431a0<T> implements androidx.lifecycle.InterfaceC0475z<T> {

    /* renamed from: a */
    public final p101fh.InterfaceC2175g f2466a;

    /* renamed from: b */
    public androidx.lifecycle.C0444h<T> f2467b;

    @p134hh.InterfaceC3044e(m7451c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m7452f = "CoroutineLiveData.kt", m7453l = {98}, m7454m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.a0$a */
    public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public int f2468c0;

        /* renamed from: d0 */
        public final /* synthetic */ androidx.lifecycle.C0431a0 f2469d0;

        /* renamed from: e0 */
        public final /* synthetic */ java.lang.Object f2470e0;

        public a(androidx.lifecycle.C0431a0 r1, java.lang.Object r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f2469d0 = r1
                r0.f2470e0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                java.lang.String r3 = "completion"
                p214m2.C4339q.m9706k(r4, r3)
                androidx.lifecycle.a0$a r3 = new androidx.lifecycle.a0$a
                androidx.lifecycle.a0 r0 = r2.f2469d0
                java.lang.Object r1 = r2.f2470e0
                r3.<init>(r0, r1, r4)
                return r3
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public final java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                java.lang.String r3 = "completion"
                p214m2.C4339q.m9706k(r4, r3)
                androidx.lifecycle.a0$a r3 = new androidx.lifecycle.a0$a
                androidx.lifecycle.a0 r0 = r2.f2469d0
                java.lang.Object r1 = r2.f2470e0
                r3.<init>(r0, r1, r4)
                ch.l r4 = ch.C0985l.f5061a
                java.lang.Object r3 = r3.mo123o(r4)
                return r3
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r4) {
                r3 = this;
                gh.a r0 = gh.EnumC2389a.f10764Y
                int r1 = r3.f2468c0
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                p074e9.C1805a.m4540y(r4)
                goto L25
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L15:
                p074e9.C1805a.m4540y(r4)
                androidx.lifecycle.a0 r4 = r3.f2469d0
                androidx.lifecycle.h<T> r4 = r4.f2467b
                r3.f2468c0 = r2
                java.lang.Object r4 = r4.m1434n(r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                androidx.lifecycle.a0 r4 = r3.f2469d0
                androidx.lifecycle.h<T> r4 = r4.f2467b
                java.lang.Object r0 = r3.f2470e0
                r4.mo7l(r0)
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    public C0431a0(androidx.lifecycle.C0444h<T> r2, p101fh.InterfaceC2175g r3) {
            r1 = this;
            java.lang.String r0 = "target"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f2467b = r2
            vh.z r2 = p379vh.C6716l0.f26007a
            vh.k1 r2 = p459zh.C7346l.f28106a
            vh.k1 r2 = r2.mo13640z0()
            fh.g r2 = r3.plus(r2)
            r1.f2466a = r2
            return
    }

    @Override // androidx.lifecycle.InterfaceC0475z
    /* renamed from: a */
    public java.lang.Object mo1427a(T r4, p101fh.InterfaceC2172d<? super ch.C0985l> r5) {
            r3 = this;
            fh.g r0 = r3.f2466a
            androidx.lifecycle.a0$a r1 = new androidx.lifecycle.a0$a
            r2 = 0
            r1.<init>(r3, r4, r2)
            java.lang.Object r4 = p101fh.C2174f.m5710A(r0, r1, r5)
            gh.a r5 = gh.EnumC2389a.f10764Y
            if (r4 != r5) goto L11
            return r4
        L11:
            ch.l r4 = ch.C0985l.f5061a
            return r4
    }
}
