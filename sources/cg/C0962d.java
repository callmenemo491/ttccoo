package cg;

/* renamed from: cg.d */
/* loaded from: classes.dex */
public final class C0962d extends p313rd.AbstractC5814a {

    /* renamed from: b0 */
    public final p238nd.C4732c1 f4975b0;

    /* renamed from: c0 */
    public java.util.List<android.support.v4.media.MediaMetadataCompat> f4976c0;

    /* renamed from: d0 */
    public volatile boolean f4977d0;

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.player.MyJsonSource", m7452f = "MyJsonSource.kt", m7453l = {62}, m7454m = "reload")
    /* renamed from: cg.d$a */
    public static final class a extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public java.lang.Object f4978b0;

        /* renamed from: c0 */
        public java.lang.Object f4979c0;

        /* renamed from: d0 */
        public /* synthetic */ java.lang.Object f4980d0;

        /* renamed from: e0 */
        public final /* synthetic */ cg.C0962d f4981e0;

        /* renamed from: f0 */
        public int f4982f0;

        public a(cg.C0962d r1, p101fh.InterfaceC2172d<? super cg.C0962d.a> r2) {
                r0 = this;
                r0.f4981e0 = r1
                r0.<init>(r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f4980d0 = r2
                int r2 = r1.f4982f0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f4982f0 = r2
                cg.d r2 = r1.f4981e0
                java.lang.Object r2 = r2.mo2679R(r1)
                return r2
        }
    }

    public C0962d(p238nd.C4732c1 r1) {
            r0 = this;
            r0.<init>()
            r0.f4975b0 = r1
            dh.k r1 = p062dh.C1475k.f7237Y
            r0.f4976c0 = r1
            r1 = 2
            r0.m12189a(r1)
            return
    }

    @Override // p313rd.InterfaceC5816c
    /* renamed from: R */
    public java.lang.Object mo2679R(p101fh.InterfaceC2172d<? super ch.C0985l> r9) {
            r8 = this;
            boolean r0 = r9 instanceof cg.C0962d.a
            if (r0 == 0) goto L13
            r0 = r9
            cg.d$a r0 = (cg.C0962d.a) r0
            int r1 = r0.f4982f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4982f0 = r1
            goto L18
        L13:
            cg.d$a r0 = new cg.d$a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f4980d0
            gh.a r1 = gh.EnumC2389a.f10764Y
            int r2 = r0.f4982f0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f4979c0
            cg.d r1 = (cg.C0962d) r1
            java.lang.Object r0 = r0.f4978b0
            cg.d r0 = (cg.C0962d) r0
            p074e9.C1805a.m4540y(r9)     // Catch: java.lang.Throwable -> L30
            goto L5d
        L30:
            r9 = move-exception
            goto L96
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            p074e9.C1805a.m4540y(r9)
            boolean r9 = r8.f4977d0
            if (r9 == 0) goto L44
            ch.l r9 = ch.C0985l.f5061a
            return r9
        L44:
            r8.f4977d0 = r3
            r0.f4978b0 = r8     // Catch: java.lang.Throwable -> L94
            r0.f4979c0 = r8     // Catch: java.lang.Throwable -> L94
            r0.f4982f0 = r3     // Catch: java.lang.Throwable -> L94
            vh.z r9 = p379vh.C6716l0.f26008b     // Catch: java.lang.Throwable -> L94
            cg.e r2 = new cg.e     // Catch: java.lang.Throwable -> L94
            r5 = 0
            r2.<init>(r8, r5)     // Catch: java.lang.Throwable -> L94
            java.lang.Object r9 = p101fh.C2174f.m5710A(r9, r2, r0)     // Catch: java.lang.Throwable -> L94
            if (r9 != r1) goto L5b
            return r1
        L5b:
            r0 = r8
            r1 = r0
        L5d:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto L99
            r1.f4976c0 = r9     // Catch: java.lang.Throwable -> L30
            int r9 = r1.f22533Y     // Catch: java.lang.Throwable -> L30
            r2 = 3
            if (r9 == r2) goto L6b
            r1.m12189a(r2)     // Catch: java.lang.Throwable -> L30
        L6b:
            java.util.List<mh.l<java.lang.Boolean, ch.l>> r9 = r1.f22535a0     // Catch: java.lang.Throwable -> L30
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L30
            java.util.List<mh.l<java.lang.Boolean, ch.l>> r5 = r1.f22535a0     // Catch: java.lang.Throwable -> L91
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L91
        L74:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r6 == 0) goto L8f
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L91
            mh.l r6 = (mh.InterfaceC4620l) r6     // Catch: java.lang.Throwable -> L91
            int r7 = r1.f22533Y     // Catch: java.lang.Throwable -> L91
            if (r7 != r2) goto L86
            r7 = 1
            goto L87
        L86:
            r7 = 0
        L87:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L91
            r6.mo107b(r7)     // Catch: java.lang.Throwable -> L91
            goto L74
        L8f:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            goto L99
        L91:
            r1 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            throw r1     // Catch: java.lang.Throwable -> L30
        L94:
            r9 = move-exception
            r0 = r8
        L96:
            p074e9.C1805a.m4520e(r9)
        L99:
            r0.f4977d0 = r4
            ch.l r9 = ch.C0985l.f5061a
            return r9
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<android.support.v4.media.MediaMetadataCompat> iterator() {
            r1 = this;
            java.util.List<android.support.v4.media.MediaMetadataCompat> r0 = r1.f4976c0
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
