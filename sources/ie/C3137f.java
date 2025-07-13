package ie;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.splash.SplashViewModel$init$1", m7452f = "SplashViewModel.kt", m7453l = {50, 61, 67}, m7454m = "invokeSuspend")
/* renamed from: ie.f */
/* loaded from: classes.dex */
public final class C3137f extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public int f12577c0;

    /* renamed from: d0 */
    public /* synthetic */ java.lang.Object f12578d0;

    /* renamed from: e0 */
    public final /* synthetic */ ie.C3136e f12579e0;

    /* renamed from: f0 */
    public final /* synthetic */ java.lang.String f12580f0;

    public C3137f(ie.C3136e r1, java.lang.String r2, p101fh.InterfaceC2172d<? super ie.C3137f> r3) {
            r0 = this;
            r0.f12579e0 = r1
            r0.f12580f0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
            r3 = this;
            ie.f r0 = new ie.f
            ie.e r1 = r3.f12579e0
            java.lang.String r2 = r3.f12580f0
            r0.<init>(r1, r2, r5)
            r0.f12578d0 = r4
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0985l> r5) {
            r3 = this;
            vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
            fh.d r5 = (p101fh.InterfaceC2172d) r5
            ie.f r0 = new ie.f
            ie.e r1 = r3.f12579e0
            java.lang.String r2 = r3.f12580f0
            r0.<init>(r1, r2, r5)
            r0.f12578d0 = r4
            ch.l r4 = ch.C0985l.f5061a
            java.lang.Object r4 = r0.mo123o(r4)
            return r4
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r8) {
            r7 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r7.f12577c0
            r2 = 0
            r3 = 1
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L28
            if (r1 == r3) goto L22
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            p074e9.C1805a.m4540y(r8)
            goto Ldc
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            p074e9.C1805a.m4540y(r8)
            goto Lab
        L22:
            p074e9.C1805a.m4540y(r8)     // Catch: java.lang.Throwable -> L26
            goto L5e
        L26:
            r8 = move-exception
            goto L61
        L28:
            p074e9.C1805a.m4540y(r8)
            java.lang.Object r8 = r7.f12578d0
            vh.b0 r8 = (p379vh.InterfaceC6686b0) r8
            ie.e r8 = r7.f12579e0
            ch.d r8 = r8.f12575i
            java.lang.Object r8 = r8.getValue()
            com.google.firebase.auth.FirebaseAuth r8 = (com.google.firebase.auth.FirebaseAuth) r8
            v9.o r8 = r8.f6584f
            if (r8 == 0) goto L3f
            r8 = 1
            goto L40
        L3f:
            r8 = 0
        L40:
            if (r8 != 0) goto L81
            ie.e r8 = r7.f12579e0
            ch.d r8 = r8.f12575i     // Catch: java.lang.Throwable -> L26
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L26
            com.google.firebase.auth.FirebaseAuth r8 = (com.google.firebase.auth.FirebaseAuth) r8     // Catch: java.lang.Throwable -> L26
            s7.i r8 = r8.m3631a()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "auth.signInAnonymously()"
            p214m2.C4339q.m9705j(r8, r1)     // Catch: java.lang.Throwable -> L26
            r7.f12577c0 = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r8 = vg.C6665f.m13513a(r8, r7)     // Catch: java.lang.Throwable -> L26
            if (r8 != r0) goto L5e
            return r0
        L5e:
            v9.d r8 = (p375v9.InterfaceC6592d) r8     // Catch: java.lang.Throwable -> L26
            goto L65
        L61:
            java.lang.Object r8 = p074e9.C1805a.m4520e(r8)
        L65:
            boolean r1 = r8 instanceof ch.C0979f.a
            r6 = 0
            if (r1 == 0) goto L6b
            r8 = r6
        L6b:
            v9.d r8 = (p375v9.InterfaceC6592d) r8
            if (r8 == 0) goto L73
            v9.o r6 = r8.mo13457H()
        L73:
            if (r6 != 0) goto L81
            ie.e r8 = r7.f12579e0
            androidx.lifecycle.d0<vg.b<ch.l>> r8 = r8.f12574h
            vg.b r0 = new vg.b
            ch.l r1 = ch.C0985l.f5061a
            r0.<init>(r1)
            goto Lb6
        L81:
            ie.e r8 = r7.f12579e0
            android.app.Application r8 = r8.f12569c
            io.tacocrypto.app.TacoApplication r8 = (io.tacocrypto.app.TacoApplication) r8
            nd.b0 r8 = r8.m7708c()
            androidx.lifecycle.LiveData<java.util.List<id.b>> r8 = r8.f18925u
            java.lang.Object r8 = r8.m1411d()
            java.util.List r8 = (java.util.List) r8
            java.lang.String r1 = r7.f12580f0
            if (r1 == 0) goto Lba
            id.b r8 = new id.b
            od.v0 r2 = p255od.EnumC5234v0.ANCHOR
            r8.<init>(r1, r2)
            ie.e r1 = r7.f12579e0
            nd.b0 r1 = r1.f12570d
            r7.f12577c0 = r5
            java.lang.Object r8 = r1.m10799l(r8, r7)
            if (r8 != r0) goto Lab
            return r0
        Lab:
            ie.e r8 = r7.f12579e0
            androidx.lifecycle.d0<vg.b<ch.l>> r8 = r8.f12572f
            vg.b r0 = new vg.b
            ch.l r1 = ch.C0985l.f5061a
            r0.<init>(r1)
        Lb6:
            r8.mo7l(r0)
            return r1
        Lba:
            if (r8 == 0) goto Lc2
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto Lc3
        Lc2:
            r2 = 1
        Lc3:
            if (r2 == 0) goto Lde
            ie.e r8 = r7.f12579e0
            android.app.Application r8 = r8.f12569c
            io.tacocrypto.app.TacoApplication r8 = (io.tacocrypto.app.TacoApplication) r8
            io.tacocrypto.app.database.AppDatabase r8 = r8.m7706a()
            hd.d r8 = r8.mo7713p()
            r7.f12577c0 = r4
            java.lang.Object r8 = r8.mo7445e(r7)
            if (r8 != r0) goto Ldc
            return r0
        Ldc:
            java.util.List r8 = (java.util.List) r8
        Lde:
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto Lf0
            ie.e r8 = r7.f12579e0
            androidx.lifecycle.d0<vg.b<ch.l>> r8 = r8.f12573g
            vg.b r0 = new vg.b
            ch.l r1 = ch.C0985l.f5061a
            r0.<init>(r1)
            goto Lfb
        Lf0:
            ie.e r8 = r7.f12579e0
            androidx.lifecycle.d0<vg.b<ch.l>> r8 = r8.f12572f
            vg.b r0 = new vg.b
            ch.l r1 = ch.C0985l.f5061a
            r0.<init>(r1)
        Lfb:
            r8.mo7l(r0)
            ch.l r8 = ch.C0985l.f5061a
            return r8
    }
}
