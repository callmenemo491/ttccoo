package p036c6;

/* renamed from: c6.g0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0886g0 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f4762Y;

    /* renamed from: Z */
    public final /* synthetic */ com.google.android.gms.cast.BinderC1059c f4763Z;

    /* renamed from: a0 */
    public final /* synthetic */ int f4764a0;

    public /* synthetic */ RunnableC0886g0(com.google.android.gms.cast.BinderC1059c r2, int r3, int r4) {
            r1 = this;
            r1.f4762Y = r4
            r0 = 1
            if (r4 == r0) goto L23
            r0 = 2
            if (r4 == r0) goto L1b
            r0 = 3
            if (r4 == r0) goto L13
            r1.<init>()
            r1.f4763Z = r2
            r1.f4764a0 = r3
            return
        L13:
            r1.<init>()
            r1.f4763Z = r2
            r1.f4764a0 = r3
            return
        L1b:
            r1.<init>()
            r1.f4763Z = r2
            r1.f4764a0 = r3
            return
        L23:
            r1.<init>()
            r1.f4763Z = r2
            r1.f4764a0 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f4762Y
            r1 = 1
            switch(r0) {
                case 0: goto Lac;
                case 1: goto L54;
                case 2: goto L8;
                default: goto L6;
            }
        L6:
            goto Lb8
        L8:
            com.google.android.gms.cast.c r0 = r7.f4763Z
            int r2 = r7.f4764a0
            com.google.android.gms.cast.d r3 = r0.f5411a
            r4 = -1
            r3.f5432w = r4
            r3.f5433x = r4
            r4 = 0
            r3.f5428s = r4
            r3.f5429t = r4
            r5 = 0
            r3.f5430u = r5
            r3.m2968n()
            r5 = 0
            r3.f5431v = r5
            r3.f5434y = r4
            com.google.android.gms.cast.d r3 = r0.f5411a
            r3.f5418E = r1
            java.util.List<c6.a1> r3 = r3.f5417D
            monitor-enter(r3)
            com.google.android.gms.cast.d r1 = r0.f5411a     // Catch: java.lang.Throwable -> L51
            java.util.List<c6.a1> r1 = r1.f5417D     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L51
        L33:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L43
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L51
            c6.a1 r4 = (p036c6.C0873a1) r4     // Catch: java.lang.Throwable -> L51
            r4.mo2595d(r2)     // Catch: java.lang.Throwable -> L51
            goto L33
        L43:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.cast.d r1 = r0.f5411a
            r1.m2964j()
            com.google.android.gms.cast.d r0 = r0.f5411a
            com.google.android.gms.cast.c r1 = r0.f5419j
            r0.m2962h(r1)
            return
        L51:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            throw r0
        L54:
            com.google.android.gms.cast.c r0 = r7.f4763Z
            int r2 = r7.f4764a0
            if (r2 != 0) goto L83
            com.google.android.gms.cast.d r2 = r0.f5411a
            r3 = 2
            r2.f5418E = r3
            r2.f5421l = r1
            r2.f5422m = r1
            java.util.List<c6.a1> r3 = r2.f5417D
            monitor-enter(r3)
            com.google.android.gms.cast.d r0 = r0.f5411a     // Catch: java.lang.Throwable -> L80
            java.util.List<c6.a1> r0 = r0.f5417D     // Catch: java.lang.Throwable -> L80
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L80
        L6e:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L80
            c6.a1 r1 = (p036c6.C0873a1) r1     // Catch: java.lang.Throwable -> L80
            r1.mo2592a()     // Catch: java.lang.Throwable -> L80
            goto L6e
        L7e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L80
            goto La8
        L80:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L80
            throw r0
        L83:
            com.google.android.gms.cast.d r3 = r0.f5411a
            r3.f5418E = r1
            java.util.List<c6.a1> r1 = r3.f5417D
            monitor-enter(r1)
            com.google.android.gms.cast.d r3 = r0.f5411a     // Catch: java.lang.Throwable -> La9
            java.util.List<c6.a1> r3 = r3.f5417D     // Catch: java.lang.Throwable -> La9
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> La9
        L92:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto La2
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> La9
            c6.a1 r4 = (p036c6.C0873a1) r4     // Catch: java.lang.Throwable -> La9
            r4.mo2593b(r2)     // Catch: java.lang.Throwable -> La9
            goto L92
        La2:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La9
            com.google.android.gms.cast.d r0 = r0.f5411a
            r0.m2964j()
        La8:
            return
        La9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La9
            throw r0
        Lac:
            com.google.android.gms.cast.c r0 = r7.f4763Z
            int r1 = r7.f4764a0
            com.google.android.gms.cast.d r0 = r0.f5411a
            com.google.android.gms.cast.a$c r0 = r0.f5416C
            r0.mo2936b(r1)
            return
        Lb8:
            com.google.android.gms.cast.c r0 = r7.f4763Z
            int r1 = r7.f4764a0
            com.google.android.gms.cast.d r2 = r0.f5411a
            r3 = 3
            r2.f5418E = r3
            java.util.List<c6.a1> r2 = r2.f5417D
            monitor-enter(r2)
            com.google.android.gms.cast.d r0 = r0.f5411a     // Catch: java.lang.Throwable -> Lde
            java.util.List<c6.a1> r0 = r0.f5417D     // Catch: java.lang.Throwable -> Lde
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lde
        Lcc:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> Lde
            if (r3 == 0) goto Ldc
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> Lde
            c6.a1 r3 = (p036c6.C0873a1) r3     // Catch: java.lang.Throwable -> Lde
            r3.mo2594c(r1)     // Catch: java.lang.Throwable -> Lde
            goto Lcc
        Ldc:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lde
            return
        Lde:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lde
            throw r0
    }
}
