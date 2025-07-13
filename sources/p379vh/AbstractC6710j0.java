package p379vh;

/* renamed from: vh.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC6710j0<T> extends ai.AbstractRunnableC0109i {

    /* renamed from: a0 */
    public int f26003a0;

    public AbstractC6710j0(int r1) {
            r0 = this;
            r0.<init>()
            r0.f26003a0 = r1
            return
    }

    /* renamed from: a */
    public void mo13622a(java.lang.Object r1, java.lang.Throwable r2) {
            r0 = this;
            return
    }

    /* renamed from: b */
    public abstract p101fh.InterfaceC2172d<T> mo13623b();

    /* renamed from: e */
    public java.lang.Throwable mo13624e(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p379vh.C6739t
            r1 = 0
            if (r0 == 0) goto L8
            vh.t r3 = (p379vh.C6739t) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 != 0) goto Lc
            goto Le
        Lc:
            java.lang.Throwable r1 = r3.f26037a
        Le:
            return r1
    }

    /* renamed from: g */
    public <T> T mo13625g(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    /* renamed from: h */
    public final void m13638h(java.lang.Throwable r3, java.lang.Throwable r4) {
            r2 = this;
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            return
        L5:
            if (r3 == 0) goto Lc
            if (r4 == 0) goto Lc
            p185k7.C3836i.m8616a(r3, r4)
        Lc:
            if (r3 != 0) goto Lf
            r3 = r4
        Lf:
            vh.c0 r4 = new vh.c0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fatal exception in coroutines machinery for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p214m2.C4339q.m9704i(r3)
            r4.<init>(r0, r3)
            fh.d r3 = r2.mo13623b()
            fh.g r3 = r3.mo5706c()
            gh.C2390b.m6122l(r3, r4)
            return
    }

    /* renamed from: i */
    public abstract java.lang.Object mo13626i();

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            ai.j r0 = r10.f370Z
            fh.d r1 = r10.mo13623b()     // Catch: java.lang.Throwable -> L90
            zh.e r1 = (p459zh.C7339e) r1     // Catch: java.lang.Throwable -> L90
            fh.d<T> r2 = r1.f28086c0     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r1.f28088e0     // Catch: java.lang.Throwable -> L90
            fh.g r3 = r2.mo5706c()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = p459zh.C7352r.m14437b(r3, r1)     // Catch: java.lang.Throwable -> L90
            zh.p r4 = p459zh.C7352r.f28111a     // Catch: java.lang.Throwable -> L90
            r5 = 0
            if (r1 == r4) goto L1e
            vh.u1 r4 = p379vh.C6751x.m13669b(r2, r3, r1)     // Catch: java.lang.Throwable -> L90
            goto L1f
        L1e:
            r4 = r5
        L1f:
            fh.g r6 = r2.mo5706c()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r10.mo13626i()     // Catch: java.lang.Throwable -> L40
            java.lang.Throwable r8 = r10.mo13624e(r7)     // Catch: java.lang.Throwable -> L40
            if (r8 != 0) goto L42
            int r9 = r10.f26003a0     // Catch: java.lang.Throwable -> L40
            boolean r9 = p101fh.C2174f.m5727q(r9)     // Catch: java.lang.Throwable -> L40
            if (r9 == 0) goto L42
            int r9 = p379vh.InterfaceC6687b1.f25957X     // Catch: java.lang.Throwable -> L40
            vh.b1$b r9 = p379vh.InterfaceC6687b1.b.f25958Y     // Catch: java.lang.Throwable -> L40
            fh.g$a r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L40
            vh.b1 r6 = (p379vh.InterfaceC6687b1) r6     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r2 = move-exception
            goto L84
        L42:
            r6 = r5
        L43:
            if (r6 == 0) goto L5a
            boolean r9 = r6.mo13544a()     // Catch: java.lang.Throwable -> L40
            if (r9 != 0) goto L5a
            java.util.concurrent.CancellationException r6 = r6.mo13551S()     // Catch: java.lang.Throwable -> L40
            r10.mo13622a(r7, r6)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r6 = p074e9.C1805a.m4520e(r6)     // Catch: java.lang.Throwable -> L40
        L56:
            r2.mo5707k(r6)     // Catch: java.lang.Throwable -> L40
            goto L66
        L5a:
            if (r8 == 0) goto L61
            java.lang.Object r6 = p074e9.C1805a.m4520e(r8)     // Catch: java.lang.Throwable -> L40
            goto L56
        L61:
            java.lang.Object r6 = r10.mo13625g(r7)     // Catch: java.lang.Throwable -> L40
            goto L56
        L66:
            ch.l r2 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L70
            boolean r4 = r4.m13667b0()     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L73
        L70:
            p459zh.C7352r.m14436a(r3, r1)     // Catch: java.lang.Throwable -> L90
        L73:
            r0.mo157l()     // Catch: java.lang.Throwable -> L77
            goto L7c
        L77:
            r0 = move-exception
            java.lang.Object r2 = p074e9.C1805a.m4520e(r0)
        L7c:
            java.lang.Throwable r0 = ch.C0979f.m2690b(r2)
            r10.m13638h(r5, r0)
            goto La3
        L84:
            if (r4 == 0) goto L8c
            boolean r4 = r4.m13667b0()     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L8f
        L8c:
            p459zh.C7352r.m14436a(r3, r1)     // Catch: java.lang.Throwable -> L90
        L8f:
            throw r2     // Catch: java.lang.Throwable -> L90
        L90:
            r1 = move-exception
            r0.mo157l()     // Catch: java.lang.Throwable -> L97
            ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L97
            goto L9c
        L97:
            r0 = move-exception
            java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
        L9c:
            java.lang.Throwable r0 = ch.C0979f.m2690b(r0)
            r10.m13638h(r1, r0)
        La3:
            return
    }
}
