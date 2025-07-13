package androidx.lifecycle;

@p134hh.InterfaceC3044e(m7451c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m7452f = "FlowLiveData.kt", m7453l = {149}, m7454m = "invokeSuspend")
/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public final class C0452l extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<androidx.lifecycle.InterfaceC0475z<java.lang.Object>, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public /* synthetic */ java.lang.Object f2529c0;

    /* renamed from: d0 */
    public int f2530d0;

    /* renamed from: e0 */
    public final /* synthetic */ p419xh.InterfaceC7073a f2531e0;

    /* renamed from: androidx.lifecycle.l$a */
    public static final class a implements p419xh.InterfaceC7074b<java.lang.Object> {

        /* renamed from: Y */
        public final /* synthetic */ androidx.lifecycle.InterfaceC0475z f2532Y;

        public a(androidx.lifecycle.InterfaceC0475z r1) {
                r0 = this;
                r0.f2532Y = r1
                r0.<init>()
                return
        }

        @Override // p419xh.InterfaceC7074b
        /* renamed from: a */
        public java.lang.Object mo1443a(java.lang.Object r2, p101fh.InterfaceC2172d r3) {
                r1 = this;
                androidx.lifecycle.z r0 = r1.f2532Y
                java.lang.Object r2 = r0.mo1427a(r2, r3)
                gh.a r3 = gh.EnumC2389a.f10764Y
                if (r2 != r3) goto Lb
                return r2
            Lb:
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    public C0452l(p419xh.InterfaceC7073a r1, p101fh.InterfaceC2172d r2) {
            r0 = this;
            r0.f2531e0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
            r2 = this;
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r4, r0)
            androidx.lifecycle.l r0 = new androidx.lifecycle.l
            xh.a r1 = r2.f2531e0
            r0.<init>(r1, r4)
            r0.f2529c0 = r3
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public final java.lang.Object mo122l(androidx.lifecycle.InterfaceC0475z<java.lang.Object> r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
            r2 = this;
            fh.d r4 = (p101fh.InterfaceC2172d) r4
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r4, r0)
            androidx.lifecycle.l r0 = new androidx.lifecycle.l
            xh.a r1 = r2.f2531e0
            r0.<init>(r1, r4)
            r0.f2529c0 = r3
            ch.l r3 = ch.C0985l.f5061a
            java.lang.Object r3 = r0.mo123o(r3)
            return r3
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r5) {
            r4 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r4.f2530d0
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p074e9.C1805a.m4540y(r5)
            goto L2c
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            p074e9.C1805a.m4540y(r5)
            java.lang.Object r5 = r4.f2529c0
            androidx.lifecycle.z r5 = (androidx.lifecycle.InterfaceC0475z) r5
            xh.a r1 = r4.f2531e0
            androidx.lifecycle.l$a r3 = new androidx.lifecycle.l$a
            r3.<init>(r5)
            r4.f2530d0 = r2
            java.lang.Object r5 = r1.mo14181b(r3, r4)
            if (r5 != r0) goto L2c
            return r0
        L2c:
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}
