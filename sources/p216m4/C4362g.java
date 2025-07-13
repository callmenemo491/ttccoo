package p216m4;

/* renamed from: m4.g */
/* loaded from: classes.dex */
public final class C4362g implements p216m4.InterfaceC4369n {

    /* renamed from: Y */
    public static final int[] f17903Y = null;

    /* renamed from: Z */
    public static final p216m4.C4362g.a f17904Z = null;

    /* renamed from: m4.g$a */
    public static final class a {

        /* renamed from: a */
        public final java.util.concurrent.atomic.AtomicBoolean f17905a;

        /* renamed from: b */
        public java.lang.reflect.Constructor<? extends p216m4.InterfaceC4364i> f17906b;

        public a() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 0
                r0.<init>(r1)
                r2.f17905a = r0
                return
        }
    }

    static {
            r0 = 14
            int[] r0 = new int[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14} // fill-array
            p216m4.C4362g.f17903Y = r0
            m4.g$a r0 = new m4.g$a
            r0.<init>()
            p216m4.C4362g.f17904Z = r0
            return
    }

    public C4362g() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final void m9802a(int r9, java.util.List<p216m4.InterfaceC4364i> r10) {
            r8 = this;
            r0 = 1
            r1 = 0
            switch(r9) {
                case 0: goto Le2;
                case 1: goto Ldc;
                case 2: goto Ld6;
                case 3: goto Ld0;
                case 4: goto L51;
                case 5: goto L4a;
                case 6: goto L43;
                case 7: goto L3c;
                case 8: goto L2d;
                case 9: goto L26;
                case 10: goto L1f;
                case 11: goto L15;
                case 12: goto Le;
                case 13: goto L5;
                case 14: goto L7;
                default: goto L5;
            }
        L5:
            goto Lea
        L7:
            q4.a r9 = new q4.a
            r9.<init>()
            goto Le7
        Le:
            w4.a r9 = new w4.a
            r9.<init>()
            goto Le7
        L15:
            v4.c0 r9 = new v4.c0
            r2 = 112800(0x1b8a0, float:1.58066E-40)
            r9.<init>(r0, r1, r2)
            goto Le7
        L1f:
            v4.w r9 = new v4.w
            r9.<init>()
            goto Le7
        L26:
            u4.c r9 = new u4.c
            r9.<init>()
            goto Le7
        L2d:
            t4.e r9 = new t4.e
            r9.<init>(r1)
            r10.add(r9)
            t4.h r9 = new t4.h
            r9.<init>(r1)
            goto Le7
        L3c:
            s4.d r9 = new s4.d
            r9.<init>(r1)
            goto Le7
        L43:
            r4.e r9 = new r4.e
            r9.<init>(r1)
            goto Le7
        L4a:
            p4.b r9 = new p4.b
            r9.<init>()
            goto Le7
        L51:
            m4.g$a r9 = p216m4.C4362g.f17904Z
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.f17905a
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r3 = r9.f17905a     // Catch: java.lang.Throwable -> Lcd
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> Lcd
            r4 = 0
            if (r3 == 0) goto L60
            goto La3
        L60:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            java.lang.String r5 = "com.google.android.exoplayer2.ext.flac.FlacLibrary"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            java.lang.String r6 = "isAvailable"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            java.lang.Object r5 = r5.invoke(r4, r6)     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            if (r3 == 0) goto L9e
            java.lang.String r3 = "com.google.android.exoplayer2.ext.flac.FlacExtractor"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            java.lang.Class<m4.i> r5 = p216m4.InterfaceC4364i.class
            java.lang.Class r3 = r3.asSubclass(r5)     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            r5[r1] = r6     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            java.lang.reflect.Constructor r3 = r3.getConstructor(r5)     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            r9.f17906b = r3     // Catch: java.lang.Exception -> L95 java.lang.ClassNotFoundException -> L9e java.lang.Throwable -> Lcd
            goto L9e
        L95:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "Error instantiating FLAC extension"
            r10.<init>(r0, r9)     // Catch: java.lang.Throwable -> Lcd
            throw r10     // Catch: java.lang.Throwable -> Lcd
        L9e:
            java.util.concurrent.atomic.AtomicBoolean r3 = r9.f17905a     // Catch: java.lang.Throwable -> Lcd
            r3.set(r0)     // Catch: java.lang.Throwable -> Lcd
        La3:
            java.lang.reflect.Constructor<? extends m4.i> r9 = r9.f17906b     // Catch: java.lang.Throwable -> Lcd
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcd
            if (r9 != 0) goto La9
            goto Lb8
        La9:
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> Lc4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lc4
            r0[r1] = r2     // Catch: java.lang.Exception -> Lc4
            java.lang.Object r9 = r9.newInstance(r0)     // Catch: java.lang.Exception -> Lc4
            r4 = r9
            m4.i r4 = (p216m4.InterfaceC4364i) r4     // Catch: java.lang.Exception -> Lc4
        Lb8:
            if (r4 == 0) goto Lbe
            r10.add(r4)
            goto Lea
        Lbe:
            o4.b r9 = new o4.b
            r9.<init>(r1)
            goto Le7
        Lc4:
            r9 = move-exception
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected error creating FLAC extractor"
            r10.<init>(r0, r9)
            throw r10
        Lcd:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcd
            throw r9
        Ld0:
            n4.a r9 = new n4.a
            r9.<init>(r1)
            goto Le7
        Ld6:
            v4.e r9 = new v4.e
            r9.<init>(r1)
            goto Le7
        Ldc:
            v4.c r9 = new v4.c
            r9.<init>()
            goto Le7
        Le2:
            v4.a r9 = new v4.a
            r9.<init>()
        Le7:
            r10.add(r9)
        Lea:
            return
    }

    @Override // p216m4.InterfaceC4369n
    /* renamed from: f */
    public synchronized p216m4.InterfaceC4364i[] mo2147f() {
            r2 = this;
            monitor-enter(r2)
            android.net.Uri r0 = android.net.Uri.EMPTY     // Catch: java.lang.Throwable -> Le
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r1.<init>()     // Catch: java.lang.Throwable -> Le
            m4.i[] r0 = r2.mo2152l(r0, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // p216m4.InterfaceC4369n
    /* renamed from: l */
    public synchronized com.google.android.exoplayer2.extractor.Extractor[] mo2152l(android.net.Uri r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            r1 = 14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            int r7 = p371v5.C6570t.m13389a(r7)     // Catch: java.lang.Throwable -> L3d
            r1 = -1
            if (r7 == r1) goto L12
            r5.m9802a(r7, r0)     // Catch: java.lang.Throwable -> L3d
        L12:
            int r6 = p371v5.C6570t.m13390b(r6)     // Catch: java.lang.Throwable -> L3d
            if (r6 == r1) goto L1d
            if (r6 == r7) goto L1d
            r5.m9802a(r6, r0)     // Catch: java.lang.Throwable -> L3d
        L1d:
            int[] r1 = p216m4.C4362g.f17903Y     // Catch: java.lang.Throwable -> L3d
            int r2 = r1.length     // Catch: java.lang.Throwable -> L3d
            r3 = 0
        L21:
            if (r3 >= r2) goto L2f
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L3d
            if (r4 == r7) goto L2c
            if (r4 == r6) goto L2c
            r5.m9802a(r4, r0)     // Catch: java.lang.Throwable -> L3d
        L2c:
            int r3 = r3 + 1
            goto L21
        L2f:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L3d
            m4.i[] r6 = new p216m4.InterfaceC4364i[r6]     // Catch: java.lang.Throwable -> L3d
            java.lang.Object[] r6 = r0.toArray(r6)     // Catch: java.lang.Throwable -> L3d
            m4.i[] r6 = (p216m4.InterfaceC4364i[]) r6     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)
            return r6
        L3d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
