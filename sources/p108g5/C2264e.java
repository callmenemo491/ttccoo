package p108g5;

/* renamed from: g5.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C2264e implements android.os.Handler.Callback {

    /* renamed from: Y */
    public final /* synthetic */ int f10328Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f10329Z;

    public /* synthetic */ C2264e(p108g5.C2266f r2) {
            r1 = this;
            r0 = 0
            r1.f10328Y = r0
            r1.<init>()
            r1.f10329Z = r2
            return
    }

    public /* synthetic */ C2264e(p337t5.C6173c r2) {
            r1 = this;
            r0 = 1
            r1.f10328Y = r0
            r1.<init>()
            r1.f10329Z = r2
            return
    }

    public /* synthetic */ C2264e(p371v5.C6564n r2) {
            r1 = this;
            r0 = 2
            r1.f10328Y = r0
            r1.<init>()
            r1.f10329Z = r2
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r9) {
            r8 = this;
            int r0 = r8.f10328Y
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L37;
                case 1: goto L9;
                default: goto L7;
            }
        L7:
            goto L14c
        L9:
            java.lang.Object r0 = r8.f10329Z
            t5.c r0 = (p337t5.C6173c) r0
            java.util.Objects.requireNonNull(r0)
            int r3 = r9.what
            if (r3 == 0) goto L2e
            if (r3 == r1) goto L18
            r1 = 0
            goto L36
        L18:
            f4.x0 r2 = r0.f23933r
            if (r2 == 0) goto L36
            boolean r3 = r0.f23934s
            if (r3 == 0) goto L36
            int r3 = r0.f23935t
            int r4 = r9.arg1
            if (r3 != r4) goto L36
            java.lang.Object r9 = r9.obj
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            r0.m12740e(r2, r9)
            goto L36
        L2e:
            f4.x0 r9 = r0.f23933r
            if (r9 == 0) goto L36
            r2 = 0
            r0.m12740e(r9, r2)
        L36:
            return r1
        L37:
            java.lang.Object r0 = r8.f10329Z
            g5.f r0 = (p108g5.C2266f) r0
            java.util.Objects.requireNonNull(r0)
            int r2 = r9.what
            if (r2 == 0) goto L125
            if (r2 == r1) goto Ld5
            r3 = 2
            if (r2 == r3) goto L74
            r3 = 3
            if (r2 == r3) goto L66
            r3 = 4
            if (r2 == r3) goto L61
            r3 = 5
            if (r2 != r3) goto L5b
            java.lang.Object r9 = r9.obj
            int r2 = p371v5.C6552b0.f25624a
            java.util.Set r9 = (java.util.Set) r9
            r0.m6005B(r9)
            goto L14b
        L5b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L61:
            r0.m6008E()
            goto L14b
        L66:
            java.lang.Object r9 = r9.obj
            int r2 = p371v5.C6552b0.f25624a
            g5.f$f r9 = (p108g5.C2266f.f) r9
            T r2 = r9.f10360b
            g5.e0 r2 = (p108g5.InterfaceC2265e0) r2
            r0.f10343s = r2
            goto L146
        L74:
            java.lang.Object r9 = r9.obj
            int r2 = p371v5.C6552b0.f25624a
            g5.f$f r9 = (p108g5.C2266f.f) r9
            g5.e0 r2 = r0.f10343s
            int r3 = r9.f10359a
            int r4 = r3 + 1
            g5.e0 r2 = r2.mo5997b(r3, r4)
            r0.f10343s = r2
            T r3 = r9.f10360b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            g5.e0 r2 = r2.mo5999d(r3, r1)
            r0.f10343s = r2
            int r2 = r9.f10359a
            T r3 = r9.f10360b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = java.lang.Math.min(r2, r3)
            int r5 = java.lang.Math.max(r2, r3)
            java.util.List<g5.f$e> r6 = r0.f10337m
            java.lang.Object r6 = r6.get(r4)
            g5.f$e r6 = (p108g5.C2266f.e) r6
            int r6 = r6.f10357e
            java.util.List<g5.f$e> r7 = r0.f10337m
            java.lang.Object r2 = r7.remove(r2)
            g5.f$e r2 = (p108g5.C2266f.e) r2
            r7.add(r3, r2)
        Lbb:
            if (r4 > r5) goto L146
            java.util.List<g5.f$e> r2 = r0.f10337m
            java.lang.Object r2 = r2.get(r4)
            g5.f$e r2 = (p108g5.C2266f.e) r2
            r2.f10356d = r4
            r2.f10357e = r6
            g5.m r2 = r2.f10353a
            g5.m$a r2 = r2.f10399n
            int r2 = r2.mo5180q()
            int r6 = r6 + r2
            int r4 = r4 + 1
            goto Lbb
        Ld5:
            java.lang.Object r9 = r9.obj
            int r2 = p371v5.C6552b0.f25624a
            g5.f$f r9 = (p108g5.C2266f.f) r9
            int r2 = r9.f10359a
            T r3 = r9.f10360b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r2 != 0) goto Lf6
            g5.e0 r4 = r0.f10343s
            int r4 = r4.mo5996a()
            if (r3 != r4) goto Lf6
            g5.e0 r4 = r0.f10343s
            g5.e0 r4 = r4.mo6003h()
            goto Lfc
        Lf6:
            g5.e0 r4 = r0.f10343s
            g5.e0 r4 = r4.mo5997b(r2, r3)
        Lfc:
            r0.f10343s = r4
            int r3 = r3 - r1
        Lff:
            if (r3 < r2) goto L146
            java.util.List<g5.f$e> r4 = r0.f10337m
            java.lang.Object r4 = r4.remove(r3)
            g5.f$e r4 = (p108g5.C2266f.e) r4
            java.util.Map<java.lang.Object, g5.f$e> r5 = r0.f10339o
            java.lang.Object r6 = r4.f10354b
            r5.remove(r6)
            g5.m r5 = r4.f10353a
            g5.m$a r5 = r5.f10399n
            int r5 = r5.mo5180q()
            int r5 = -r5
            r6 = -1
            r0.m6014z(r3, r6, r5)
            r4.f10358f = r1
            r0.m6006C(r4)
            int r3 = r3 + (-1)
            goto Lff
        L125:
            java.lang.Object r9 = r9.obj
            int r2 = p371v5.C6552b0.f25624a
            g5.f$f r9 = (p108g5.C2266f.f) r9
            g5.e0 r2 = r0.f10343s
            int r3 = r9.f10359a
            T r4 = r9.f10360b
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            g5.e0 r2 = r2.mo5999d(r3, r4)
            r0.f10343s = r2
            int r2 = r9.f10359a
            T r3 = r9.f10360b
            java.util.Collection r3 = (java.util.Collection) r3
            r0.m6012x(r2, r3)
        L146:
            g5.f$d r9 = r9.f10361c
            r0.m6007D(r9)
        L14b:
            return r1
        L14c:
            java.lang.Object r9 = r8.f10329Z
            v5.n r9 = (p371v5.C6564n) r9
            java.util.concurrent.CopyOnWriteArraySet<v5.n$c<T>> r0 = r9.f25662d
            java.util.Iterator r0 = r0.iterator()
        L156:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L188
            java.lang.Object r3 = r0.next()
            v5.n$c r3 = (p371v5.C6564n.c) r3
            v5.n$b<T> r4 = r9.f25661c
            boolean r5 = r3.f25669d
            if (r5 != 0) goto L180
            boolean r5 = r3.f25668c
            if (r5 == 0) goto L180
            v5.k$b r5 = r3.f25667b
            v5.k r5 = r5.m13349b()
            v5.k$b r6 = new v5.k$b
            r6.<init>()
            r3.f25667b = r6
            r3.f25668c = r2
            T r3 = r3.f25666a
            r4.mo4927j(r3, r5)
        L180:
            v5.m r3 = r9.f25660b
            boolean r3 = r3.mo13353a(r2)
            if (r3 == 0) goto L156
        L188:
            return r1
    }
}
