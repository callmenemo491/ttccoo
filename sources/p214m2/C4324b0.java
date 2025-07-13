package p214m2;

/* renamed from: m2.b0 */
/* loaded from: classes.dex */
public class C4324b0 implements p214m2.InterfaceC4329g, p214m2.InterfaceC4329g.a {

    /* renamed from: Y */
    public final p214m2.C4330h<?> f17625Y;

    /* renamed from: Z */
    public final p214m2.InterfaceC4329g.a f17626Z;

    /* renamed from: a0 */
    public int f17627a0;

    /* renamed from: b0 */
    public p214m2.C4326d f17628b0;

    /* renamed from: c0 */
    public java.lang.Object f17629c0;

    /* renamed from: d0 */
    public volatile p282q2.InterfaceC5556m.a<?> f17630d0;

    /* renamed from: e0 */
    public p214m2.C4327e f17631e0;

    public C4324b0(p214m2.C4330h<?> r1, p214m2.InterfaceC4329g.a r2) {
            r0 = this;
            r0.<init>()
            r0.f17625Y = r1
            r0.f17626Z = r2
            return
    }

    @Override // p214m2.InterfaceC4329g
    /* renamed from: a */
    public boolean mo9655a() {
            r11 = this;
            java.lang.Object r0 = r11.f17629c0
            r1 = 0
            if (r0 == 0) goto L91
            r11.f17629c0 = r1
            java.lang.String r2 = "SourceGenerator"
            int r3 = p106g3.C2234f.f10203b
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            m2.h<?> r5 = r11.f17625Y     // Catch: java.lang.Throwable -> L88
            k2.a r5 = r5.m9663e(r0)     // Catch: java.lang.Throwable -> L88
            m2.f r6 = new m2.f     // Catch: java.lang.Throwable -> L88
            m2.h<?> r7 = r11.f17625Y     // Catch: java.lang.Throwable -> L88
            k2.e r7 = r7.f17654i     // Catch: java.lang.Throwable -> L88
            r6.<init>(r5, r0, r7)     // Catch: java.lang.Throwable -> L88
            m2.e r7 = new m2.e     // Catch: java.lang.Throwable -> L88
            q2.m$a<?> r8 = r11.f17630d0     // Catch: java.lang.Throwable -> L88
            k2.c r8 = r8.f21624a     // Catch: java.lang.Throwable -> L88
            m2.h<?> r9 = r11.f17625Y     // Catch: java.lang.Throwable -> L88
            k2.c r10 = r9.f17659n     // Catch: java.lang.Throwable -> L88
            r7.<init>(r8, r10)     // Catch: java.lang.Throwable -> L88
            r11.f17631e0 = r7     // Catch: java.lang.Throwable -> L88
            o2.a r7 = r9.m9660b()     // Catch: java.lang.Throwable -> L88
            m2.e r8 = r11.f17631e0     // Catch: java.lang.Throwable -> L88
            r7.mo11025b(r8, r6)     // Catch: java.lang.Throwable -> L88
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r2, r6)     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L6f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r6.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = "Finished encoding source to cache, key: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L88
            m2.e r7 = r11.f17631e0     // Catch: java.lang.Throwable -> L88
            r6.append(r7)     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = ", data: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L88
            r6.append(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = ", encoder: "
            r6.append(r0)     // Catch: java.lang.Throwable -> L88
            r6.append(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = ", duration: "
            r6.append(r0)     // Catch: java.lang.Throwable -> L88
            double r3 = p106g3.C2234f.m5833a(r3)     // Catch: java.lang.Throwable -> L88
            r6.append(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L88
            android.util.Log.v(r2, r0)     // Catch: java.lang.Throwable -> L88
        L6f:
            q2.m$a<?> r0 = r11.f17630d0
            com.bumptech.glide.load.data.d<Data> r0 = r0.f21626c
            r0.mo2789b()
            m2.d r0 = new m2.d
            q2.m$a<?> r2 = r11.f17630d0
            k2.c r2 = r2.f21624a
            java.util.List r2 = java.util.Collections.singletonList(r2)
            m2.h<?> r3 = r11.f17625Y
            r0.<init>(r2, r3, r11)
            r11.f17628b0 = r0
            goto L91
        L88:
            r0 = move-exception
            q2.m$a<?> r1 = r11.f17630d0
            com.bumptech.glide.load.data.d<Data> r1 = r1.f21626c
            r1.mo2789b()
            throw r0
        L91:
            m2.d r0 = r11.f17628b0
            r2 = 1
            if (r0 == 0) goto L9d
            boolean r0 = r0.mo9655a()
            if (r0 == 0) goto L9d
            return r2
        L9d:
            r11.f17628b0 = r1
            r11.f17630d0 = r1
            r0 = 0
            r1 = 0
        La3:
            if (r1 != 0) goto L106
            int r3 = r11.f17627a0
            m2.h<?> r4 = r11.f17625Y
            java.util.List r4 = r4.m9661c()
            int r4 = r4.size()
            if (r3 >= r4) goto Lb5
            r3 = 1
            goto Lb6
        Lb5:
            r3 = 0
        Lb6:
            if (r3 == 0) goto L106
            m2.h<?> r3 = r11.f17625Y
            java.util.List r3 = r3.m9661c()
            int r4 = r11.f17627a0
            int r5 = r4 + 1
            r11.f17627a0 = r5
            java.lang.Object r3 = r3.get(r4)
            q2.m$a r3 = (p282q2.InterfaceC5556m.a) r3
            r11.f17630d0 = r3
            q2.m$a<?> r3 = r11.f17630d0
            if (r3 == 0) goto La3
            m2.h<?> r3 = r11.f17625Y
            m2.k r3 = r3.f17661p
            q2.m$a<?> r4 = r11.f17630d0
            com.bumptech.glide.load.data.d<Data> r4 = r4.f21626c
            com.bumptech.glide.load.a r4 = r4.mo2792e()
            boolean r3 = r3.mo9682c(r4)
            if (r3 != 0) goto Lf2
            m2.h<?> r3 = r11.f17625Y
            q2.m$a<?> r4 = r11.f17630d0
            com.bumptech.glide.load.data.d<Data> r4 = r4.f21626c
            java.lang.Class r4 = r4.mo2786a()
            boolean r3 = r3.m9665g(r4)
            if (r3 == 0) goto La3
        Lf2:
            q2.m$a<?> r1 = r11.f17630d0
            q2.m$a<?> r3 = r11.f17630d0
            com.bumptech.glide.load.data.d<Data> r3 = r3.f21626c
            m2.h<?> r4 = r11.f17625Y
            com.bumptech.glide.g r4 = r4.f17660o
            m2.a0 r5 = new m2.a0
            r5.<init>(r11, r1)
            r3.mo2793f(r4, r5)
            r1 = 1
            goto La3
        L106:
            return r1
    }

    @Override // p214m2.InterfaceC4329g
    public void cancel() {
            r1 = this;
            q2.m$a<?> r0 = r1.f17630d0
            if (r0 == 0) goto L9
            com.bumptech.glide.load.data.d<Data> r0 = r0.f21626c
            r0.cancel()
        L9:
            return
    }

    @Override // p214m2.InterfaceC4329g.a
    /* renamed from: e */
    public void mo9656e() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // p214m2.InterfaceC4329g.a
    /* renamed from: g */
    public void mo9657g(p180k2.InterfaceC3671c r2, java.lang.Exception r3, com.bumptech.glide.load.data.InterfaceC1016d<?> r4, com.bumptech.glide.load.EnumC1008a r5) {
            r1 = this;
            m2.g$a r5 = r1.f17626Z
            q2.m$a<?> r0 = r1.f17630d0
            com.bumptech.glide.load.data.d<Data> r0 = r0.f21626c
            com.bumptech.glide.load.a r0 = r0.mo2792e()
            r5.mo9657g(r2, r3, r4, r0)
            return
    }

    @Override // p214m2.InterfaceC4329g.a
    /* renamed from: h */
    public void mo9658h(p180k2.InterfaceC3671c r7, java.lang.Object r8, com.bumptech.glide.load.data.InterfaceC1016d<?> r9, com.bumptech.glide.load.EnumC1008a r10, p180k2.InterfaceC3671c r11) {
            r6 = this;
            m2.g$a r0 = r6.f17626Z
            q2.m$a<?> r10 = r6.f17630d0
            com.bumptech.glide.load.data.d<Data> r10 = r10.f21626c
            com.bumptech.glide.load.a r4 = r10.mo2792e()
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r7
            r0.mo9658h(r1, r2, r3, r4, r5)
            return
    }
}
