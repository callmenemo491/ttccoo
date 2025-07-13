package p379vh;

/* JADX WARN: Unexpected interfaces in signature: [vh.b0] */
/* renamed from: vh.a */
/* loaded from: classes.dex */
public abstract class AbstractC6682a<T> extends p379vh.C6702g1 implements p379vh.InterfaceC6687b1, p101fh.InterfaceC2172d<T> {

    /* renamed from: Z */
    public final p101fh.InterfaceC2175g f25952Z;

    public AbstractC6682a(p101fh.InterfaceC2175g r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            if (r2 == 0) goto L10
            vh.b1$b r2 = p379vh.InterfaceC6687b1.b.f25958Y
            fh.g$a r2 = r1.get(r2)
            vh.b1 r2 = (p379vh.InterfaceC6687b1) r2
            r0.m13575F(r2)
        L10:
            fh.g r1 = r1.plus(r0)
            r0.f25952Z = r1
            return
    }

    @Override // p379vh.C6702g1
    /* renamed from: E */
    public final void mo13540E(java.lang.Throwable r2) {
            r1 = this;
            fh.g r0 = r1.f25952Z
            gh.C2390b.m6122l(r0, r2)
            return
    }

    @Override // p379vh.C6702g1
    /* renamed from: I */
    public java.lang.String mo13541I() {
            r1 = this;
            boolean r0 = p379vh.C6751x.f26048a
            java.lang.String r0 = super.mo13541I()
            return r0
    }

    @Override // p379vh.C6702g1
    /* renamed from: M */
    public final void mo13542M(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p379vh.C6739t
            if (r0 == 0) goto Lb
            vh.t r2 = (p379vh.C6739t) r2
            java.lang.Throwable r0 = r2.f26037a
            r2.m13666a()
        Lb:
            return
    }

    /* renamed from: Y */
    public void mo13543Y(java.lang.Object r1) {
            r0 = this;
            r0.mo13589e(r1)
            return
    }

    @Override // p379vh.C6702g1, p379vh.InterfaceC6687b1
    /* renamed from: a */
    public boolean mo13544a() {
            r1 = this;
            boolean r0 = super.mo13544a()
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(Ljava/lang/Object;TR;Lmh/p<-TR;-Lfh/d<-TT;>;+Ljava/lang/Object;>;)V */
    /* renamed from: a0 */
    public final void m13545a0(int r4, java.lang.Object r5, mh.InterfaceC4624p r6) {
            r3 = this;
            int r4 = p365v.C6480g.m13148b(r4)
            r0 = 0
            if (r4 == 0) goto L58
            r1 = 1
            if (r4 == r1) goto L5c
            r1 = 2
            if (r4 == r1) goto L45
            r2 = 3
            if (r4 != r2) goto L3f
            fh.g r4 = r3.f25952Z     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = p459zh.C7352r.m14437b(r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L2b
            p239nh.C4840t.m10855a(r6, r1)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r6.mo122l(r5, r3)     // Catch: java.lang.Throwable -> L29
            p459zh.C7352r.m14436a(r4, r0)     // Catch: java.lang.Throwable -> L27
            gh.a r4 = gh.EnumC2389a.f10764Y
            if (r5 == r4) goto L5c
            goto L3b
        L27:
            r4 = move-exception
            goto L37
        L29:
            r5 = move-exception
            goto L33
        L2b:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L29
            throw r5     // Catch: java.lang.Throwable -> L29
        L33:
            p459zh.C7352r.m14436a(r4, r0)     // Catch: java.lang.Throwable -> L27
            throw r5     // Catch: java.lang.Throwable -> L27
        L37:
            java.lang.Object r5 = p074e9.C1805a.m4520e(r4)
        L3b:
            r3.mo5707k(r5)
            goto L5c
        L3f:
            e7.y7 r4 = new e7.y7
            r4.<init>(r1)
            throw r4
        L45:
            java.lang.String r4 = "<this>"
            p214m2.C4339q.m9706k(r6, r4)
            fh.d r4 = gh.C2390b.m6113c(r6, r5, r3)
            fh.d r4 = gh.C2390b.m6127q(r4)
            ch.l r5 = ch.C0985l.f5061a
            r4.mo5707k(r5)
            goto L5c
        L58:
            r4 = 4
            p209lh.C4304a.m9602H(r6, r5, r3, r0, r4)
        L5c:
            return
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: c */
    public final p101fh.InterfaceC2175g mo5706c() {
            r1 = this;
            fh.g r0 = r1.f25952Z
            return r0
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: k */
    public final void mo5707k(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = p209lh.C4304a.m9604J(r2, r0)
            java.lang.Object r2 = r1.m13577H(r2)
            zh.p r0 = p379vh.C6705h1.f25989b
            if (r2 != r0) goto Le
            return
        Le:
            r1.mo13543Y(r2)
            return
    }

    /* renamed from: l */
    public p101fh.InterfaceC2175g m13546l() {
            r1 = this;
            fh.g r0 = r1.f25952Z
            return r0
    }

    @Override // p379vh.C6702g1
    /* renamed from: s */
    public java.lang.String mo13547s() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = " was cancelled"
            java.lang.String r0 = p214m2.C4339q.m9711u(r0, r1)
            return r0
    }
}
