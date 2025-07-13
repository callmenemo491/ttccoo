package p412xa;

/* renamed from: xa.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7009b implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f27309Y;

    /* renamed from: Z */
    public final /* synthetic */ p412xa.C7010c f27310Z;

    /* renamed from: a0 */
    public final /* synthetic */ boolean f27311a0;

    public /* synthetic */ RunnableC7009b(p412xa.C7010c r1, boolean r2, int r3) {
            r0 = this;
            r0.f27309Y = r3
            r0.<init>()
            r0.f27310Z = r1
            r0.f27311a0 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f27309Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            xa.c r0 = r7.f27310Z
            boolean r1 = r7.f27311a0
            r0.m14155b(r1)
            return
        Le:
            xa.c r0 = r7.f27310Z
            boolean r1 = r7.f27311a0
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r2 = p412xa.C7010c.f27312m
            monitor-enter(r2)
            o9.d r3 = r0.f27314a     // Catch: java.lang.Throwable -> Lf3
            r3.m11497a()     // Catch: java.lang.Throwable -> Lf3
            android.content.Context r3 = r3.f20312a     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r4 = "generatefid.lock"
            androidx.appcompat.widget.x r3 = androidx.appcompat.widget.C0311x.m808f(r3, r4)     // Catch: java.lang.Throwable -> Lf3
            za.c r4 = r0.f27316c     // Catch: java.lang.Throwable -> Lec
            za.d r4 = r4.m14356b()     // Catch: java.lang.Throwable -> Lec
            if (r3 == 0) goto L30
            r3.m825p()     // Catch: java.lang.Throwable -> Lf3
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf3
            boolean r3 = r4.m14357h()     // Catch: p412xa.C7012e -> L56
            r5 = 1
            if (r3 != 0) goto L59
            r3 = r4
            za.a r3 = (za.C7265a) r3     // Catch: p412xa.C7012e -> L56
            za.c$a r3 = r3.f27875c     // Catch: p412xa.C7012e -> L56
            za.c$a r6 = za.C7267c.a.f27895a0     // Catch: p412xa.C7012e -> L56
            if (r3 != r6) goto L43
            r3 = 1
            goto L44
        L43:
            r3 = 0
        L44:
            if (r3 == 0) goto L47
            goto L59
        L47:
            if (r1 != 0) goto L51
            xa.j r1 = r0.f27317d     // Catch: p412xa.C7012e -> L56
            boolean r1 = r1.m14172d(r4)     // Catch: p412xa.C7012e -> L56
            if (r1 == 0) goto Leb
        L51:
            za.d r1 = r0.m14156c(r4)     // Catch: p412xa.C7012e -> L56
            goto L5d
        L56:
            r1 = move-exception
            goto Le8
        L59:
            za.d r1 = r0.m14162j(r4)     // Catch: p412xa.C7012e -> L56
        L5d:
            monitor-enter(r2)
            o9.d r3 = r0.f27314a     // Catch: java.lang.Throwable -> Le5
            r3.m11497a()     // Catch: java.lang.Throwable -> Le5
            android.content.Context r3 = r3.f20312a     // Catch: java.lang.Throwable -> Le5
            java.lang.String r6 = "generatefid.lock"
            androidx.appcompat.widget.x r3 = androidx.appcompat.widget.C0311x.m808f(r3, r6)     // Catch: java.lang.Throwable -> Le5
            za.c r6 = r0.f27316c     // Catch: java.lang.Throwable -> Lde
            r6.m14355a(r1)     // Catch: java.lang.Throwable -> Lde
            if (r3 == 0) goto L75
            r3.m825p()     // Catch: java.lang.Throwable -> Le5
        L75:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le5
            monitor-enter(r0)
            java.util.Set<ya.a> r2 = r0.f27324k     // Catch: java.lang.Throwable -> Ldb
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Ldb
            if (r2 == 0) goto La9
            za.a r4 = (za.C7265a) r4     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = r4.f27874b     // Catch: java.lang.Throwable -> Ldb
            r3 = r1
            za.a r3 = (za.C7265a) r3     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = r3.f27874b     // Catch: java.lang.Throwable -> Ldb
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ldb
            if (r2 != 0) goto La9
            java.util.Set<ya.a> r2 = r0.f27324k     // Catch: java.lang.Throwable -> Ldb
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ldb
        L94:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Ldb
            if (r3 == 0) goto La9
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Ldb
            ya.a r3 = (p433ya.InterfaceC7153a) r3     // Catch: java.lang.Throwable -> Ldb
            r4 = r1
            za.a r4 = (za.C7265a) r4     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = r4.f27874b     // Catch: java.lang.Throwable -> Ldb
            r3.m14266a(r4)     // Catch: java.lang.Throwable -> Ldb
            goto L94
        La9:
            monitor-exit(r0)
            boolean r2 = r1.m14359j()
            if (r2 == 0) goto Lbd
            r2 = r1
            za.a r2 = (za.C7265a) r2
            java.lang.String r2 = r2.f27874b
            monitor-enter(r0)
            r0.f27323j = r2     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r0)
            goto Lbd
        Lba:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lbd:
            boolean r2 = r1.m14357h()
            if (r2 == 0) goto Lc9
            xa.e r1 = new xa.e
            r1.<init>(r5)
            goto Le8
        Lc9:
            boolean r2 = r1.m14358i()
            if (r2 == 0) goto Ld7
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            goto Le8
        Ld7:
            r0.m14164l(r1)
            goto Leb
        Ldb:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lde:
            r0 = move-exception
            if (r3 == 0) goto Le4
            r3.m825p()     // Catch: java.lang.Throwable -> Le5
        Le4:
            throw r0     // Catch: java.lang.Throwable -> Le5
        Le5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le5
            throw r0
        Le8:
            r0.m14163k(r1)
        Leb:
            return
        Lec:
            r0 = move-exception
            if (r3 == 0) goto Lf2
            r3.m825p()     // Catch: java.lang.Throwable -> Lf3
        Lf2:
            throw r0     // Catch: java.lang.Throwable -> Lf3
        Lf3:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf3
            throw r0
    }
}
