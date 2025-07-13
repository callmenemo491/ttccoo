package p377vd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.home.HomeViewModel$refreshAsync$1", m7452f = "HomeViewModel.kt", m7453l = {176}, m7454m = "invokeSuspend")
/* renamed from: vd.r */
/* loaded from: classes.dex */
public final class C6649r extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends ch.C0985l>>, java.lang.Object> {

    /* renamed from: c0 */
    public java.lang.Object f25853c0;

    /* renamed from: d0 */
    public int f25854d0;

    /* renamed from: e0 */
    public /* synthetic */ java.lang.Object f25855e0;

    /* renamed from: f0 */
    public final /* synthetic */ p377vd.C6648q f25856f0;

    public C6649r(p377vd.C6648q r1, p101fh.InterfaceC2172d<? super p377vd.C6649r> r2) {
            r0 = this;
            r0.f25856f0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
            r2 = this;
            vd.r r0 = new vd.r
            vd.q r1 = r2.f25856f0
            r0.<init>(r1, r4)
            r0.f25855e0 = r3
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends ch.C0985l>> r4) {
            r2 = this;
            vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
            fh.d r4 = (p101fh.InterfaceC2172d) r4
            vd.r r0 = new vd.r
            vd.q r1 = r2.f25856f0
            r0.<init>(r1, r4)
            r0.f25855e0 = r3
            ch.l r3 = ch.C0985l.f5061a
            java.lang.Object r3 = r0.mo123o(r3)
            return r3
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r10) {
            r9 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r9.f25854d0
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r9.f25853c0
            vd.q r0 = (p377vd.C6648q) r0
            java.lang.Object r1 = r9.f25855e0
            vd.q r1 = (p377vd.C6648q) r1
            p074e9.C1805a.m4540y(r10)     // Catch: java.lang.Throwable -> Lb3
            goto La8
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            p074e9.C1805a.m4540y(r10)
            java.lang.Object r10 = r9.f25855e0
            vh.b0 r10 = (p379vh.InterfaceC6686b0) r10
            vd.q r10 = r9.f25856f0
            java.util.Objects.requireNonNull(r10)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)     // Catch: java.lang.Throwable -> Lb3
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)     // Catch: java.lang.Throwable -> Lb3
            r3 = 11
            r4 = 0
            r1.set(r3, r4)     // Catch: java.lang.Throwable -> Lb3
            r3 = 12
            r1.set(r3, r4)     // Catch: java.lang.Throwable -> Lb3
            r3 = 13
            r1.set(r3, r4)     // Catch: java.lang.Throwable -> Lb3
            r3 = 14
            r1.set(r3, r4)     // Catch: java.lang.Throwable -> Lb3
            long r5 = r1.getTimeInMillis()     // Catch: java.lang.Throwable -> Lb3
            r1 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r1     // Catch: java.lang.Throwable -> Lb3
            long r5 = r5 / r7
            ch.e<? extends java.util.List<md.g>, java.lang.Long> r1 = r10.f25850p     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto L63
            B r1 = r1.f5051Z     // Catch: java.lang.Throwable -> Lb3
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> Lb3
            long r7 = r1.longValue()     // Catch: java.lang.Throwable -> Lb3
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L63
            r1 = 1
            goto L64
        L63:
            r1 = 0
        L64:
            if (r1 == 0) goto L98
            ch.e<? extends java.util.List<md.g>, java.lang.Long> r1 = r10.f25850p     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto L96
            A r1 = r1.f5050Y     // Catch: java.lang.Throwable -> Lb3
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto L96
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb3
        L74:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lb3
            r7 = r3
            md.g r7 = (md.C4553g) r7     // Catch: java.lang.Throwable -> Lb3
            int r7 = r7.getVerified()     // Catch: java.lang.Throwable -> Lb3
            if (r7 != 0) goto L89
            r7 = 1
            goto L8a
        L89:
            r7 = 0
        L8a:
            if (r7 == 0) goto L74
            goto L8e
        L8d:
            r3 = 0
        L8e:
            if (r3 == 0) goto L92
            r1 = 1
            goto L93
        L92:
            r1 = 0
        L93:
            if (r1 != r2) goto L96
            r4 = 1
        L96:
            if (r4 == 0) goto Lad
        L98:
            r9.f25855e0 = r10     // Catch: java.lang.Throwable -> Lb3
            r9.f25853c0 = r10     // Catch: java.lang.Throwable -> Lb3
            r9.f25854d0 = r2     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r1 = p377vd.C6648q.m13494d(r10, r5, r9)     // Catch: java.lang.Throwable -> Lb3
            if (r1 != r0) goto La5
            return r0
        La5:
            r0 = r10
            r10 = r1
            r1 = r0
        La8:
            ch.e r10 = (ch.C0978e) r10     // Catch: java.lang.Throwable -> Lb3
            r0.f25850p = r10     // Catch: java.lang.Throwable -> Lb3
            r10 = r1
        Lad:
            r10.m13495e()     // Catch: java.lang.Throwable -> Lb3
            ch.l r10 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> Lb3
            goto Lb8
        Lb3:
            r10 = move-exception
            java.lang.Object r10 = p074e9.C1805a.m4520e(r10)
        Lb8:
            ch.f r0 = new ch.f
            r0.<init>(r10)
            return r0
    }
}
